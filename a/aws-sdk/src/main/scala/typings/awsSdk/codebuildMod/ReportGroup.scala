package typings.awsSdk.codebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReportGroup extends StObject {
  
  /**
    *  The ARN of a ReportGroup. 
    */
  var arn: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    *  The date and time this ReportGroup was created. 
    */
  var created: js.UndefOr[Timestamp] = js.undefined
  
  /**
    *  Information about the destination where the raw data of this ReportGroup is exported. 
    */
  var exportConfig: js.UndefOr[ReportExportConfig] = js.undefined
  
  /**
    *  The date and time this ReportGroup was last modified. 
    */
  var lastModified: js.UndefOr[Timestamp] = js.undefined
  
  /**
    *  The name of a ReportGroup. 
    */
  var name: js.UndefOr[ReportGroupName] = js.undefined
  
  var status: js.UndefOr[ReportGroupStatusType] = js.undefined
  
  /**
    *  A list of tag key and value pairs associated with this report group.  These tags are available for use by AWS services that support AWS CodeBuild report group tags.
    */
  var tags: js.UndefOr[TagList] = js.undefined
  
  /**
    *  The type of the ReportGroup. The one valid value is TEST. 
    */
  var `type`: js.UndefOr[ReportType] = js.undefined
}
object ReportGroup {
  
  @scala.inline
  def apply(): ReportGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReportGroup]
  }
  
  @scala.inline
  implicit class ReportGroupMutableBuilder[Self <: ReportGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: NonEmptyString): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    @scala.inline
    def setCreated(value: Timestamp): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    @scala.inline
    def setExportConfig(value: ReportExportConfig): Self = StObject.set(x, "exportConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportConfigUndefined: Self = StObject.set(x, "exportConfig", js.undefined)
    
    @scala.inline
    def setLastModified(value: Timestamp): Self = StObject.set(x, "lastModified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedUndefined: Self = StObject.set(x, "lastModified", js.undefined)
    
    @scala.inline
    def setName(value: ReportGroupName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setStatus(value: ReportGroupStatusType): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value :_*))
    
    @scala.inline
    def setType(value: ReportType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
