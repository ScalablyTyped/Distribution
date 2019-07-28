package typings.bser.bserMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bser", "Accumulator")
@js.native
class Accumulator () extends js.Object {
  def this(initsize: Double) = this()
  var buf: Buffer = js.native
  var readOffset: Double = js.native
  var writeOffset: Double = js.native
  def append(buf: InputWrapper): Unit = js.native
  def assertReadableSize(size: Double): Unit = js.native
  def peekDouble(): Double = js.native
  def peekInt(size: Double): IntWrapper = js.native
  def peekString(size: Double): String = js.native
  def readAdvance(size: Double): Unit = js.native
  def readAvail(): Double = js.native
  def readDouble(): Double = js.native
  // replace "IntWrapper" with "number"?
  def readInt(bytes: Double): IntWrapper = js.native
  def readString(size: Double): String = js.native
  def reserve(size: Double): Unit = js.native
  def writeAvail(): Double = js.native
  def writeByte(value: Double): Unit = js.native
  def writeDouble(value: Double): Unit = js.native
  def writeInt(value: Double, size: Double): Unit = js.native
}

