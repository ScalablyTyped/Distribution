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
  
  @scala.inline
  def apply(): ExportSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportSummary]
  }
  
  @scala.inline
  implicit class ExportSummaryMutableBuilder[Self <: ExportSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExportArn(value: ExportArn): Self = StObject.set(x, "ExportArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportArnUndefined: Self = StObject.set(x, "ExportArn", js.undefined)
    
    @scala.inline
    def setExportStatus(value: ExportStatus): Self = StObject.set(x, "ExportStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportStatusUndefined: Self = StObject.set(x, "ExportStatus", js.undefined)
  }
}
