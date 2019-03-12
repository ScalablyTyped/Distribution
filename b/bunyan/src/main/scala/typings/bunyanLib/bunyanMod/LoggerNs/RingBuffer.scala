package typings
package bunyanLib.bunyanMod.LoggerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RingBuffer
  extends nodeLib.eventsMod.EventEmitter {
  var records: js.Array[_] = js.native
  var writable: scala.Boolean = js.native
  def destroy(): scala.Unit = js.native
  def destroySoon(): scala.Unit = js.native
  def end(): scala.Unit = js.native
  def end(record: js.Any): scala.Unit = js.native
  def write(record: js.Any): scala.Boolean = js.native
}

