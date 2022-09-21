package typings.awsSdk.codebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReportGroup extends StObject {
  
  /**
    * The ARN of the ReportGroup. 
    */
  var arn: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The date and time this ReportGroup was created. 
    */
  var created: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Information about the destination where the raw data of this ReportGroup is exported. 
    */
  var exportConfig: js.UndefOr[ReportExportConfig] = js.undefined
  
  /**
    * The date and time this ReportGroup was last modified. 
    */
  var lastModified: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the ReportGroup. 
    */
  var name: js.UndefOr[ReportGroupName] = js.undefined
  
  /**
    * The status of the report group. This property is read-only. This can be one of the following values:  ACTIVE  The report group is active.  DELETING  The report group is in the process of being deleted.  
    */
  var status: js.UndefOr[ReportGroupStatusType] = js.undefined
  
  /**
    * A list of tag key and value pairs associated with this report group.  These tags are available for use by Amazon Web Services services that support CodeBuild report group tags.
    */
  var tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The type of the ReportGroup. This can be one of the following values:  CODE_COVERAGE  The report group contains code coverage reports.  TEST  The report group contains test reports.  
    */
  var `type`: js.UndefOr[ReportType] = js.undefined
}
object ReportGroup {
  
  inline def apply(): ReportGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReportGroup]
  }
  
  extension [Self <: ReportGroup](x: Self) {
    
    inline def setArn(value: NonEmptyString): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setCreated(value: js.Date): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    inline def setExportConfig(value: ReportExportConfig): Self = StObject.set(x, "exportConfig", value.asInstanceOf[js.Any])
    
    inline def setExportConfigUndefined: Self = StObject.set(x, "exportConfig", js.undefined)
    
    inline def setLastModified(value: js.Date): Self = StObject.set(x, "lastModified", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedUndefined: Self = StObject.set(x, "lastModified", js.undefined)
    
    inline def setName(value: ReportGroupName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setStatus(value: ReportGroupStatusType): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setType(value: ReportType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
