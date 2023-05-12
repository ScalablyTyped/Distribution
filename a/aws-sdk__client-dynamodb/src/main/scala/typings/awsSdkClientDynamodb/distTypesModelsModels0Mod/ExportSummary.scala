package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportSummary extends StObject {
  
  /**
    * <p>The Amazon Resource Name (ARN) of the export.</p>
    */
  var ExportArn: js.UndefOr[String] = js.undefined
  
  /**
    * <p>Export can be in one of the following states: IN_PROGRESS, COMPLETED, or
    *             FAILED.</p>
    */
  var ExportStatus: js.UndefOr[typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.ExportStatus | String] = js.undefined
}
object ExportSummary {
  
  inline def apply(): ExportSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExportSummary] (val x: Self) extends AnyVal {
    
    inline def setExportArn(value: String): Self = StObject.set(x, "ExportArn", value.asInstanceOf[js.Any])
    
    inline def setExportArnUndefined: Self = StObject.set(x, "ExportArn", js.undefined)
    
    inline def setExportStatus(value: ExportStatus | String): Self = StObject.set(x, "ExportStatus", value.asInstanceOf[js.Any])
    
    inline def setExportStatusUndefined: Self = StObject.set(x, "ExportStatus", js.undefined)
  }
}
