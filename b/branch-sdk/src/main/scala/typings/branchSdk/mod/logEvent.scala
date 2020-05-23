package typings.branchSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("branch-sdk", "logEvent")
@js.native
object logEvent extends js.Object {
  def apply(event: String): Unit = js.native
  def apply(event: String, event_data_and_custom_data: js.Object): Unit = js.native
  def apply(event: String, event_data_and_custom_data: js.Object, content_items: js.Array[js.Object]): Unit = js.native
  def apply(
    event: String,
    event_data_and_custom_data: js.Object,
    content_items: js.Array[js.Object],
    customer_event_alias: String
  ): Unit = js.native
  def apply(
    event: String,
    event_data_and_custom_data: js.Object,
    content_items: js.Array[js.Object],
    customer_event_alias: String,
    callback: js.Function1[/* err */ BranchError, Unit]
  ): Unit = js.native
}

