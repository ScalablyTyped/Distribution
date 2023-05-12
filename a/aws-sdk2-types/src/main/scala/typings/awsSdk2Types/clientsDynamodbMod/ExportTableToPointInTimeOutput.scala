package typings.awsSdk2Types.clientsDynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportTableToPointInTimeOutput extends StObject {
  
  /**
    * Contains a description of the table export.
    */
  var ExportDescription: js.UndefOr[typings.awsSdk2Types.clientsDynamodbMod.ExportDescription] = js.undefined
}
object ExportTableToPointInTimeOutput {
  
  inline def apply(): ExportTableToPointInTimeOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportTableToPointInTimeOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExportTableToPointInTimeOutput] (val x: Self) extends AnyVal {
    
    inline def setExportDescription(value: ExportDescription): Self = StObject.set(x, "ExportDescription", value.asInstanceOf[js.Any])
    
    inline def setExportDescriptionUndefined: Self = StObject.set(x, "ExportDescription", js.undefined)
  }
}
