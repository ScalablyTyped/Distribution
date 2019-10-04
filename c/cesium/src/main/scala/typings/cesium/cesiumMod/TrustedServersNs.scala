package typings.cesium.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "TrustedServers")
@js.native
object TrustedServersNs extends js.Object {
  def add(host: String, port: Double): Unit = js.native
  def clear(): Unit = js.native
  def contains(contains: String): Boolean = js.native
  def remove(host: String, port: Double): Unit = js.native
}

