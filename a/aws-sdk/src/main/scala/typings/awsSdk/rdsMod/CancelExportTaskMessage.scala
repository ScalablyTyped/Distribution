package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelExportTaskMessage extends js.Object {
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
}

