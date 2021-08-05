package typings.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportTableToPointInTimeOutput extends StObject {
  
  /**
    * Contains a description of the table export.
    */
  var ExportDescription: js.UndefOr[typings.awsSdk.dynamodbMod.ExportDescription] = js.undefined
}
object ExportTableToPointInTimeOutput {
  
  inline def apply(): ExportTableToPointInTimeOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportTableToPointInTimeOutput]
  }
  
  extension [Self <: ExportTableToPointInTimeOutput](x: Self) {
    
    inline def setExportDescription(value: ExportDescription): Self = StObject.set(x, "ExportDescription", value.asInstanceOf[js.Any])
    
    inline def setExportDescriptionUndefined: Self = StObject.set(x, "ExportDescription", js.undefined)
  }
}
