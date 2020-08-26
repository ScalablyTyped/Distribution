package typings.awsSdkClientPinpointBrowser.typesEventMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientPinpointBrowser.typesSessionMod.UnmarshalledSession
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledEvent extends Event {
  /**
    * Custom attributes that are associated with the event you're adding or updating.
    */
  @JSName("Attributes")
  var Attributes_UnmarshalledEvent: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * Custom metrics related to the event.
    */
  @JSName("Metrics")
  var Metrics_UnmarshalledEvent: js.UndefOr[StringDictionary[Double]] = js.native
  /**
    * Information about the session in which the event occurred.
    */
  @JSName("Session")
  var Session_UnmarshalledEvent: js.UndefOr[UnmarshalledSession] = js.native
}

object UnmarshalledEvent {
  @scala.inline
  def apply(): UnmarshalledEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledEvent]
  }
  @scala.inline
  implicit class UnmarshalledEventOps[Self <: UnmarshalledEvent] (val x: Self) extends AnyVal {
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
    def setAttributes(value: StringDictionary[String]): Self = this.set("Attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributes: Self = this.set("Attributes", js.undefined)
    @scala.inline
    def setMetrics(value: StringDictionary[Double]): Self = this.set("Metrics", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetrics: Self = this.set("Metrics", js.undefined)
    @scala.inline
    def setSession(value: UnmarshalledSession): Self = this.set("Session", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSession: Self = this.set("Session", js.undefined)
  }
  
}

