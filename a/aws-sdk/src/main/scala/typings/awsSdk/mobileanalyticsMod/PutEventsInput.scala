package typings.awsSdk.mobileanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutEventsInput extends js.Object {
  
  /**
    * The client context including the client ID, app title, app version and package name.
    */
  var clientContext: String = js.native
  
  /**
    * The encoding used for the client context.
    */
  var clientContextEncoding: js.UndefOr[String] = js.native
  
  /**
    * An array of Event JSON objects
    */
  var events: EventListDefinition = js.native
}
object PutEventsInput {
  
  @scala.inline
  def apply(clientContext: String, events: EventListDefinition): PutEventsInput = {
    val __obj = js.Dynamic.literal(clientContext = clientContext.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutEventsInput]
  }
  
  @scala.inline
  implicit class PutEventsInputOps[Self <: PutEventsInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClientContext(value: String): Self = this.set("clientContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventsVarargs(value: Event*): Self = this.set("events", js.Array(value :_*))
    
    @scala.inline
    def setEvents(value: EventListDefinition): Self = this.set("events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientContextEncoding(value: String): Self = this.set("clientContextEncoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientContextEncoding: Self = this.set("clientContextEncoding", js.undefined)
  }
}
