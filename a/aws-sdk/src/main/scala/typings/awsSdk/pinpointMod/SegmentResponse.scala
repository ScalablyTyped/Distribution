package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SegmentResponse extends js.Object {
  
  /**
    * The unique identifier for the application that the segment is associated with.
    */
  var ApplicationId: string = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the segment.
    */
  var Arn: string = js.native
  
  /**
    * The date and time when the segment was created.
    */
  var CreationDate: string = js.native
  
  /**
    * The dimension settings for the segment.
    */
  var Dimensions: js.UndefOr[SegmentDimensions] = js.native
  
  /**
    * The unique identifier for the segment.
    */
  var Id: string = js.native
  
  /**
    * The settings for the import job that's associated with the segment.
    */
  var ImportDefinition: js.UndefOr[SegmentImportResource] = js.native
  
  /**
    * The date and time when the segment was last modified.
    */
  var LastModifiedDate: js.UndefOr[string] = js.native
  
  /**
    * The name of the segment.
    */
  var Name: js.UndefOr[string] = js.native
  
  /**
    * A list of one or more segment groups that apply to the segment. Each segment group consists of zero or more base segments and the dimensions that are applied to those base segments.
    */
  var SegmentGroups: js.UndefOr[SegmentGroupList] = js.native
  
  /**
    * The segment type. Valid values are: DIMENSIONAL - A dynamic segment, which is a segment that uses selection criteria that you specify and is based on endpoint data that's reported by your app. Dynamic segments can change over time. IMPORT - A static segment, which is a segment that uses selection criteria that you specify and is based on endpoint definitions that you import from a file. Imported segments are static; they don't change over time.
    */
  var SegmentType: typings.awsSdk.pinpointMod.SegmentType = js.native
  
  /**
    * The version number of the segment.
    */
  var Version: js.UndefOr[integer] = js.native
  
  /**
    * A string-to-string map of key-value pairs that identifies the tags that are associated with the segment. Each tag consists of a required tag key and an associated tag value.
    */
  var tags: js.UndefOr[MapOfString] = js.native
}
object SegmentResponse {
  
  @scala.inline
  def apply(ApplicationId: string, Arn: string, CreationDate: string, Id: string, SegmentType: SegmentType): SegmentResponse = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], Arn = Arn.asInstanceOf[js.Any], CreationDate = CreationDate.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], SegmentType = SegmentType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SegmentResponse]
  }
  
  @scala.inline
  implicit class SegmentResponseOps[Self <: SegmentResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setApplicationId(value: string): Self = this.set("ApplicationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArn(value: string): Self = this.set("Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDate(value: string): Self = this.set("CreationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: string): Self = this.set("Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegmentType(value: SegmentType): Self = this.set("SegmentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimensions(value: SegmentDimensions): Self = this.set("Dimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDimensions: Self = this.set("Dimensions", js.undefined)
    
    @scala.inline
    def setImportDefinition(value: SegmentImportResource): Self = this.set("ImportDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImportDefinition: Self = this.set("ImportDefinition", js.undefined)
    
    @scala.inline
    def setLastModifiedDate(value: string): Self = this.set("LastModifiedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastModifiedDate: Self = this.set("LastModifiedDate", js.undefined)
    
    @scala.inline
    def setName(value: string): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setSegmentGroups(value: SegmentGroupList): Self = this.set("SegmentGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSegmentGroups: Self = this.set("SegmentGroups", js.undefined)
    
    @scala.inline
    def setVersion(value: integer): Self = this.set("Version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("Version", js.undefined)
    
    @scala.inline
    def setTags(value: MapOfString): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
