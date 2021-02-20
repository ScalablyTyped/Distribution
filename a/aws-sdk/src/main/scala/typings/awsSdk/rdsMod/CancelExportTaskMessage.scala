package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CancelExportTaskMessage extends StObject {
  
  /**
    * The identifier of the snapshot export task to cancel.
    */
  var ExportTaskIdentifier: String = js.native
}
object CancelExportTaskMessage {
  
  @scala.inline
  def apply(ExportTaskIdentifier: String): CancelExportTaskMessage = {
    val __obj = js.Dynamic.literal(ExportTaskIdentifier = ExportTaskIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelExportTaskMessage]
  }
  
  @scala.inline
  implicit class CancelExportTaskMessageMutableBuilder[Self <: CancelExportTaskMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExportTaskIdentifier(value: String): Self = StObject.set(x, "ExportTaskIdentifier", value.asInstanceOf[js.Any])
  }
}
