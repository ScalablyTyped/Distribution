package typings.awsSdkClientPinpointBrowser.typesEventsBatchMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientPinpointBrowser.typesEventMod.UnmarshalledEvent
import typings.awsSdkClientPinpointBrowser.typesPublicEndpointMod.UnmarshalledPublicEndpoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledEventsBatch extends EventsBatch {
  /**
    * The PublicEndpoint attached to the EndpointId from the request.
    */
  @JSName("Endpoint")
  var Endpoint_UnmarshalledEventsBatch: js.UndefOr[UnmarshalledPublicEndpoint] = js.native
  /**
    * An object that contains a set of events associated with the endpoint.
    */
  @JSName("Events")
  var Events_UnmarshalledEventsBatch: js.UndefOr[StringDictionary[UnmarshalledEvent]] = js.native
}

object UnmarshalledEventsBatch {
  @scala.inline
  def apply(): UnmarshalledEventsBatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledEventsBatch]
  }
  @scala.inline
  implicit class UnmarshalledEventsBatchOps[Self <: UnmarshalledEventsBatch] (val x: Self) extends AnyVal {
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
    def setEndpoint(value: UnmarshalledPublicEndpoint): Self = this.set("Endpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndpoint: Self = this.set("Endpoint", js.undefined)
    @scala.inline
    def setEvents(value: StringDictionary[UnmarshalledEvent]): Self = this.set("Events", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvents: Self = this.set("Events", js.undefined)
  }
  
}

