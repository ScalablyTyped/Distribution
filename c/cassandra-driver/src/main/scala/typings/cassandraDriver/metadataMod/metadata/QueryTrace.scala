package typings.cassandraDriver.metadataMod.metadata

import org.scalablytyped.runtime.StringDictionary
import typings.cassandraDriver.anon.Activity
import typings.cassandraDriver.typesMod.types.InetAddress
import typings.cassandraDriver.typesMod.types.Long
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryTrace extends js.Object {
  var clientAddress: String = js.native
  var coordinator: InetAddress = js.native
  var duration: Double = js.native
  var events: js.Array[Activity] = js.native
  var parameters: StringDictionary[js.Any] = js.native
  var requestType: String = js.native
  var startedAt: Double | Long = js.native
}

object QueryTrace {
  @scala.inline
  def apply(
    clientAddress: String,
    coordinator: InetAddress,
    duration: Double,
    events: js.Array[Activity],
    parameters: StringDictionary[js.Any],
    requestType: String,
    startedAt: Double | Long
  ): QueryTrace = {
    val __obj = js.Dynamic.literal(clientAddress = clientAddress.asInstanceOf[js.Any], coordinator = coordinator.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], requestType = requestType.asInstanceOf[js.Any], startedAt = startedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryTrace]
  }
  @scala.inline
  implicit class QueryTraceOps[Self <: QueryTrace] (val x: Self) extends AnyVal {
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
    def setClientAddress(value: String): Self = this.set("clientAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def setCoordinator(value: InetAddress): Self = this.set("coordinator", value.asInstanceOf[js.Any])
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def setEventsVarargs(value: Activity*): Self = this.set("events", js.Array(value :_*))
    @scala.inline
    def setEvents(value: js.Array[Activity]): Self = this.set("events", value.asInstanceOf[js.Any])
    @scala.inline
    def setParameters(value: StringDictionary[js.Any]): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequestType(value: String): Self = this.set("requestType", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartedAt(value: Double | Long): Self = this.set("startedAt", value.asInstanceOf[js.Any])
  }
  
}

