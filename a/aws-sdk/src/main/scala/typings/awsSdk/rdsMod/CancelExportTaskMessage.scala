package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelExportTaskMessage extends StObject {
  
  /**
    * The identifier of the snapshot export task to cancel.
    */
  var ExportTaskIdentifier: String
}
object CancelExportTaskMessage {
  
  inline def apply(ExportTaskIdentifier: String): CancelExportTaskMessage = {
    val __obj = js.Dynamic.literal(ExportTaskIdentifier = ExportTaskIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelExportTaskMessage]
  }
  
  extension [Self <: CancelExportTaskMessage](x: Self) {
    
    inline def setExportTaskIdentifier(value: String): Self = StObject.set(x, "ExportTaskIdentifier", value.asInstanceOf[js.Any])
  }
}
