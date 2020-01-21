package typings.bunyan.mod

import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bunyan", "RingBuffer")
@js.native
class RingBuffer protected () extends EventEmitter {
  def this(options: RingBufferOptions) = this()
  var records: js.Array[_] = js.native
  var writable: Boolean = js.native
  def destroy(): Unit = js.native
  def destroySoon(): Unit = js.native
  def end(): Unit = js.native
  def end(record: js.Any): Unit = js.native
  def write(record: js.Any): Boolean = js.native
}

