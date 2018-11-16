package typings
package buffersLib.buffersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Buffers extends js.Object {
  var buffers: js.Array[nodeLib.Buffer] = js.native
  var length: scala.Double = js.native
  def copy(dst: nodeLib.Buffer): scala.Double = js.native
  def copy(dst: nodeLib.Buffer, dstStart: scala.Double): scala.Double = js.native
  def copy(dst: nodeLib.Buffer, dstStart: scala.Double, start: scala.Double): scala.Double = js.native
  def copy(dst: nodeLib.Buffer, dstStart: scala.Double, start: scala.Double, end: scala.Double): scala.Double = js.native
  def get(i: scala.Double): js.Any = js.native
  def indexOf(needle: java.lang.String): scala.Double = js.native
  def indexOf(needle: java.lang.String, offset: scala.Double): scala.Double = js.native
  def indexOf(needle: nodeLib.Buffer): scala.Double = js.native
  def indexOf(needle: nodeLib.Buffer, offset: scala.Double): scala.Double = js.native
  def push(items: nodeLib.Buffer*): scala.Double = js.native
  def set(i: scala.Double, b: js.Any): scala.Unit = js.native
  def slice(): nodeLib.Buffer = js.native
  def slice(i: scala.Double): nodeLib.Buffer = js.native
  def slice(i: scala.Double, j: scala.Double): nodeLib.Buffer = js.native
  def splice(i: scala.Double): Buffers = js.native
  def splice(i: scala.Double, howMany: scala.Double, items: nodeLib.Buffer*): Buffers = js.native
  def toBuffer(): nodeLib.Buffer = js.native
  def toString(encoding: js.Any): java.lang.String = js.native
  def toString(encoding: js.Any, start: scala.Double): java.lang.String = js.native
  def toString(encoding: js.Any, start: scala.Double, end: scala.Double): java.lang.String = js.native
  def unshift(items: nodeLib.Buffer*): scala.Double = js.native
}

