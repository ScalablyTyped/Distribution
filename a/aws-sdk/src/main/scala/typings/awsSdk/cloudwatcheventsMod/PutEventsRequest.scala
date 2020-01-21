package typings.awsSdk.cloudwatcheventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutEventsRequest extends js.Object {
  /**
    * The entry that defines an event in your system. You can specify several parameters for the entry such as the source and type of the event, resources associated with the event, and so on.
    */
  var Entries: PutEventsRequestEntryList = js.native
}

object PutEventsRequest {
  @scala.inline
  def apply(Entries: PutEventsRequestEntryList): PutEventsRequest = {
    val __obj = js.Dynamic.literal(Entries = Entries.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PutEventsRequest]
  }
}

