package typings.cassandraDriver.metadataMod.metadata

import typings.cassandraDriver.mod.Host
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientState extends js.Object {
  
  def getConnectedHosts(): js.Array[Host] = js.native
  
  def getInFlightQueries(host: Host): Double = js.native
  
  def getOpenConnections(host: Host): Double = js.native
}
object ClientState {
  
  @scala.inline
  def apply(
    getConnectedHosts: () => js.Array[Host],
    getInFlightQueries: Host => Double,
    getOpenConnections: Host => Double
  ): ClientState = {
    val __obj = js.Dynamic.literal(getConnectedHosts = js.Any.fromFunction0(getConnectedHosts), getInFlightQueries = js.Any.fromFunction1(getInFlightQueries), getOpenConnections = js.Any.fromFunction1(getOpenConnections))
    __obj.asInstanceOf[ClientState]
  }
  
  @scala.inline
  implicit class ClientStateOps[Self <: ClientState] (val x: Self) extends AnyVal {
    
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
    def setGetConnectedHosts(value: () => js.Array[Host]): Self = this.set("getConnectedHosts", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetInFlightQueries(value: Host => Double): Self = this.set("getInFlightQueries", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetOpenConnections(value: Host => Double): Self = this.set("getOpenConnections", js.Any.fromFunction1(value))
  }
}
