package typings.cassandraDashDriver.cassandraDashDriverMod.metadata

import typings.cassandraDashDriver.Anon_Activity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryTrace extends js.Object {
  var clientAddress: js.Any
  var coordinator: js.Any
  var duration: js.Any
  var events: js.Array[Anon_Activity]
  var parameters: js.Any
  var requestType: js.Any
  var startedAt: js.Any
}

object QueryTrace {
  @scala.inline
  def apply(
    clientAddress: js.Any,
    coordinator: js.Any,
    duration: js.Any,
    events: js.Array[Anon_Activity],
    parameters: js.Any,
    requestType: js.Any,
    startedAt: js.Any
  ): QueryTrace = {
    val __obj = js.Dynamic.literal(clientAddress = clientAddress, coordinator = coordinator, duration = duration, events = events, parameters = parameters, requestType = requestType, startedAt = startedAt)
  
    __obj.asInstanceOf[QueryTrace]
  }
}

