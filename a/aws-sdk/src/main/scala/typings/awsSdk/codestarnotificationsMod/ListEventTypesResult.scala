package typings.awsSdk.codestarnotificationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListEventTypesResult extends js.Object {
  /**
    * Information about each event, including service name, resource type, event ID, and event name.
    */
  var EventTypes: js.UndefOr[EventTypeBatch] = js.native
  /**
    * An enumeration token that can be used in a request to return the next batch of the results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.codestarnotificationsMod.NextToken] = js.native
}

object ListEventTypesResult {
  @scala.inline
  def apply(): ListEventTypesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListEventTypesResult]
  }
  @scala.inline
  implicit class ListEventTypesResultOps[Self <: ListEventTypesResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEventTypesVarargs(value: EventTypeSummary*): Self = this.set("EventTypes", js.Array(value :_*))
    @scala.inline
    def setEventTypes(value: EventTypeBatch): Self = this.set("EventTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventTypes: Self = this.set("EventTypes", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

