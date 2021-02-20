package typings.awsSdk.lexmodelbuildingserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetExportResponse extends StObject {
  
  /**
    * The status of the export.     IN_PROGRESS - The export is in progress.    READY - The export is complete.    FAILED - The export could not be completed.  
    */
  var exportStatus: js.UndefOr[ExportStatus] = js.native
  
  /**
    * The format of the exported data.
    */
  var exportType: js.UndefOr[ExportType] = js.native
  
  /**
    * If status is FAILED, Amazon Lex provides the reason that it failed to export the resource.
    */
  var failureReason: js.UndefOr[String] = js.native
  
  /**
    * The name of the bot being exported.
    */
  var name: js.UndefOr[Name] = js.native
  
  /**
    * The type of the exported resource.
    */
  var resourceType: js.UndefOr[ResourceType] = js.native
  
  /**
    * An S3 pre-signed URL that provides the location of the exported resource. The exported resource is a ZIP archive that contains the exported resource in JSON format. The structure of the archive may change. Your code should not rely on the archive structure.
    */
  var url: js.UndefOr[String] = js.native
  
  /**
    * The version of the bot being exported.
    */
  var version: js.UndefOr[NumericalVersion] = js.native
}
object GetExportResponse {
  
  @scala.inline
  def apply(): GetExportResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetExportResponse]
  }
  
  @scala.inline
  implicit class GetExportResponseMutableBuilder[Self <: GetExportResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExportStatus(value: ExportStatus): Self = StObject.set(x, "exportStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportStatusUndefined: Self = StObject.set(x, "exportStatus", js.undefined)
    
    @scala.inline
    def setExportType(value: ExportType): Self = StObject.set(x, "exportType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportTypeUndefined: Self = StObject.set(x, "exportType", js.undefined)
    
    @scala.inline
    def setFailureReason(value: String): Self = StObject.set(x, "failureReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureReasonUndefined: Self = StObject.set(x, "failureReason", js.undefined)
    
    @scala.inline
    def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setResourceType(value: ResourceType): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    @scala.inline
    def setVersion(value: NumericalVersion): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
