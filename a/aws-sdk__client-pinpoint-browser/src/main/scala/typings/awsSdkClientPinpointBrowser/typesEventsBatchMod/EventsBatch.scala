package typings.awsSdkClientPinpointBrowser.typesEventsBatchMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientPinpointBrowser.typesEventMod.Event
import typings.awsSdkClientPinpointBrowser.typesPublicEndpointMod.PublicEndpoint
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventsBatch extends js.Object {
  
  /**
    * The PublicEndpoint attached to the EndpointId from the request.
    */
  var Endpoint: js.UndefOr[PublicEndpoint] = js.native
  
  /**
    * An object that contains a set of events associated with the endpoint.
    */
  var Events: js.UndefOr[StringDictionary[Event] | (Iterable[js.Tuple2[String, Event]])] = js.native
}
object EventsBatch {
  
  @scala.inline
  def apply(): EventsBatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventsBatch]
  }
  
  @scala.inline
  implicit class EventsBatchOps[Self <: EventsBatch] (val x: Self) extends AnyVal {
    
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
    def setEndpoint(value: PublicEndpoint): Self = this.set("Endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndpoint: Self = this.set("Endpoint", js.undefined)
    
    @scala.inline
    def setEvents(value: StringDictionary[Event] | (Iterable[js.Tuple2[String, Event]])): Self = this.set("Events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvents: Self = this.set("Events", js.undefined)
  }
}
