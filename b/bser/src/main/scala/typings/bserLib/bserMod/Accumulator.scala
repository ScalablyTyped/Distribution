package typings
package bserLib.bserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bser", "Accumulator")
@js.native
class Accumulator () extends js.Object {
  def this(initsize: scala.Double) = this()
  var buf: nodeLib.Buffer = js.native
  var readOffset: scala.Double = js.native
  var writeOffset: scala.Double = js.native
  def append(buf: InputWrapper): scala.Unit = js.native
  def assertReadableSize(size: scala.Double): scala.Unit = js.native
  def peekDouble(): scala.Double = js.native
  def peekInt(size: scala.Double): IntWrapper = js.native
  def peekString(size: scala.Double): java.lang.String = js.native
  def readAdvance(size: scala.Double): scala.Unit = js.native
  def readAvail(): scala.Double = js.native
  def readDouble(): scala.Double = js.native
  // replace "IntWrapper" with "number"?
  def readInt(bytes: scala.Double): IntWrapper = js.native
  def readString(size: scala.Double): java.lang.String = js.native
  def reserve(size: scala.Double): scala.Unit = js.native
  def writeAvail(): scala.Double = js.native
  def writeByte(value: scala.Double): scala.Unit = js.native
  def writeDouble(value: scala.Double): scala.Unit = js.native
  def writeInt(value: scala.Double, size: scala.Double): scala.Unit = js.native
}

