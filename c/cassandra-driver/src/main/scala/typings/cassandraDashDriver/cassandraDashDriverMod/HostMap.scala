package typings.cassandraDashDriver.cassandraDashDriverMod

import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HostMap extends EventEmitter {
  var length: Double = js.native
  def clear(): js.Array[Host] = js.native
  def forEach(callback: Callback): Unit = js.native
  def get(key: String): Host = js.native
  def keys(): js.Array[String] = js.native
  def remove(key: String): Unit = js.native
  def removeMultiple(keys: js.Array[String]): Unit = js.native
  def set(key: String, value: Host): Unit = js.native
  def values(): js.Array[Host] = js.native
}

