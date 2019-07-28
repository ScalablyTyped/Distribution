package typings.bser.bserMod

import typings.bser.bserNumbers.`0`
import typings.bser.bserNumbers.`1`
import typings.bser.bserNumbers.`false`
import typings.bser.bserNumbers.`true`
import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bser", "BunserBuf")
@js.native
class BunserBuf () extends EventEmitter {
  var buf: Accumulator = js.native
  // replace "IntWrapper" with "number"?
  var pduLen: js.UndefOr[`false` | IntWrapper] = js.native
  var state: `0` | `1` = js.native
  def append(buf: InputWrapper): js.UndefOr[AnyWrapper | js.Array[AnyWrapper]] = js.native
  @JSName("append")
  def append_false(buf: InputWrapper, synchronous: `false`): js.UndefOr[AnyWrapper | js.Array[AnyWrapper]] = js.native
  @JSName("append")
  def append_true(buf: InputWrapper, synchronous: `true`): Unit = js.native
  def decodeAny(): AnyWrapper | js.Array[AnyWrapper] = js.native
  def decodeArray(): js.Array[AnyWrapper] = js.native
  // replace "IntWrapper" with "number"?
  def decodeInt(): `false` | IntWrapper = js.native
  def decodeInt(relaxSizeAsserts: Boolean): `false` | IntWrapper = js.native
  def decodeObject(): js.Object = js.native
  def decodeString(): String = js.native
  def decodeTemplate(): js.Array[AnyWrapper] = js.native
  def expectCode(expected: Double): Unit = js.native
  def process(): js.UndefOr[AnyWrapper | js.Array[AnyWrapper]] = js.native
  def processLater(): Unit = js.native
  @JSName("process")
  def process_false(synchronous: `false`): js.UndefOr[AnyWrapper | js.Array[AnyWrapper]] = js.native
  @JSName("process")
  def process_true(synchronous: `true`): Unit = js.native
  def raise(reason: String): Unit = js.native
}

