package typings
package cassandraDashDriverLib.cassandraDashDriverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HostMap
  extends nodeLib.eventsMod.EventEmitter {
  var length: scala.Double = js.native
  def clear(): js.Array[Host] = js.native
  def forEach(callback: Callback): scala.Unit = js.native
  def get(key: java.lang.String): Host = js.native
  def keys(): js.Array[java.lang.String] = js.native
  def remove(key: java.lang.String): scala.Unit = js.native
  def removeMultiple(keys: js.Array[java.lang.String]): scala.Unit = js.native
  def set(key: java.lang.String, value: Host): scala.Unit = js.native
  def values(): js.Array[Host] = js.native
}

