package typings.cassandraDashDriver.libMetadataMod.metadata

import org.scalablytyped.runtime.StringDictionary
import typings.cassandraDashDriver.Anon_Activity
import typings.cassandraDashDriver.libTypesMod.types.InetAddress
import typings.cassandraDashDriver.libTypesMod.types.Long
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryTrace extends js.Object {
  var clientAddress: String
  var coordinator: InetAddress
  var duration: Double
  var events: js.Array[Anon_Activity]
  var parameters: StringDictionary[js.Any]
  var requestType: String
  var startedAt: Double | Long
}

object QueryTrace {
  @scala.inline
  def apply(
    clientAddress: String,
    coordinator: InetAddress,
    duration: Double,
    events: js.Array[Anon_Activity],
    parameters: StringDictionary[js.Any],
    requestType: String,
    startedAt: Double | Long
  ): QueryTrace = {
    val __obj = js.Dynamic.literal(clientAddress = clientAddress, coordinator = coordinator, duration = duration, events = events, parameters = parameters, requestType = requestType, startedAt = startedAt.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[QueryTrace]
  }
}

