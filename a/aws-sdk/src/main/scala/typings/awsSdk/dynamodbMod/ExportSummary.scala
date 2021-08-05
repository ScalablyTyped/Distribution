package typings.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportSummary extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the export.
    */
  var ExportArn: js.UndefOr[typings.awsSdk.dynamodbMod.ExportArn] = js.undefined
  
  /**
    * Export can be in one of the following states: IN_PROGRESS, COMPLETED, or FAILED.
    */
  var ExportStatus: js.UndefOr[typings.awsSdk.dynamodbMod.ExportStatus] = js.undefined
}
object ExportSummary {
  
  inline def apply(): ExportSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportSummary]
  }
  
  extension [Self <: ExportSummary](x: Self) {
    
    inline def setExportArn(value: ExportArn): Self = StObject.set(x, "ExportArn", value.asInstanceOf[js.Any])
    
    inline def setExportArnUndefined: Self = StObject.set(x, "ExportArn", js.undefined)
    
    inline def setExportStatus(value: ExportStatus): Self = StObject.set(x, "ExportStatus", value.asInstanceOf[js.Any])
    
    inline def setExportStatusUndefined: Self = StObject.set(x, "ExportStatus", js.undefined)
  }
}
