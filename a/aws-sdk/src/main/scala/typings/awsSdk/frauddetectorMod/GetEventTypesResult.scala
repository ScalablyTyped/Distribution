package typings.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetEventTypesResult extends js.Object {
  /**
    * An array of event types.
    */
  var eventTypes: js.UndefOr[eventTypeList] = js.native
  /**
    * The next page token.
    */
  var nextToken: js.UndefOr[String] = js.native
}

object GetEventTypesResult {
  @scala.inline
  def apply(): GetEventTypesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetEventTypesResult]
  }
  @scala.inline
  implicit class GetEventTypesResultOps[Self <: GetEventTypesResult] (val x: Self) extends AnyVal {
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
    def setEventTypesVarargs(value: EventType*): Self = this.set("eventTypes", js.Array(value :_*))
    @scala.inline
    def setEventTypes(value: eventTypeList): Self = this.set("eventTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventTypes: Self = this.set("eventTypes", js.undefined)
    @scala.inline
    def setNextToken(value: String): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
  
}

