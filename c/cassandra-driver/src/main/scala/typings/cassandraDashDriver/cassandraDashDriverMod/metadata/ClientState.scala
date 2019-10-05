package typings.cassandraDashDriver.cassandraDashDriverMod.metadata

import typings.cassandraDashDriver.cassandraDashDriverMod.Host
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientState extends js.Object {
  def getConnectedHosts(): js.Array[Host]
  def getInFlightQueries(host: Host): Double
  def getOpenConnections(host: Host): Double
}

object ClientState {
  @scala.inline
  def apply(
    getConnectedHosts: () => js.Array[Host],
    getInFlightQueries: Host => Double,
    getOpenConnections: Host => Double,
    toString: () => String
  ): ClientState = {
    val __obj = js.Dynamic.literal(getConnectedHosts = js.Any.fromFunction0(getConnectedHosts), getInFlightQueries = js.Any.fromFunction1(getInFlightQueries), getOpenConnections = js.Any.fromFunction1(getOpenConnections), toString = js.Any.fromFunction0(toString))
  
    __obj.asInstanceOf[ClientState]
  }
}

