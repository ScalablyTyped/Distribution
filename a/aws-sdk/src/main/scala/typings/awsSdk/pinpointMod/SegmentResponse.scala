package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SegmentResponse extends StObject {
  
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
  implicit class SegmentResponseMutableBuilder[Self <: SegmentResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationId(value: string): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArn(value: string): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDate(value: string): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimensions(value: SegmentDimensions): Self = StObject.set(x, "Dimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimensionsUndefined: Self = StObject.set(x, "Dimensions", js.undefined)
    
    @scala.inline
    def setId(value: string): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportDefinition(value: SegmentImportResource): Self = StObject.set(x, "ImportDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportDefinitionUndefined: Self = StObject.set(x, "ImportDefinition", js.undefined)
    
    @scala.inline
    def setLastModifiedDate(value: string): Self = StObject.set(x, "LastModifiedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedDateUndefined: Self = StObject.set(x, "LastModifiedDate", js.undefined)
    
    @scala.inline
    def setName(value: string): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setSegmentGroups(value: SegmentGroupList): Self = StObject.set(x, "SegmentGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegmentGroupsUndefined: Self = StObject.set(x, "SegmentGroups", js.undefined)
    
    @scala.inline
    def setSegmentType(value: SegmentType): Self = StObject.set(x, "SegmentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: MapOfString): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setVersion(value: integer): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
  }
}
