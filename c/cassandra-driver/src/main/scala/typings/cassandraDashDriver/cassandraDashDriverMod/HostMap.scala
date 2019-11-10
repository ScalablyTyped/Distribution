package typings.cassandraDashDriver.cassandraDashDriverMod

import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HostMap extends EventEmitter {
  var length: Double = js.native
  def forEach(callback: js.Function2[/* value */ Host, /* key */ String, Unit]): Unit = js.native
  def get(key: String): Host = js.native
  def keys(): js.Array[String] = js.native
  def values(): js.Array[Host] = js.native
}

