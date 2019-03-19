package typings
package bserLib.bserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bser", "BunserBuf")
@js.native
class BunserBuf ()
  extends nodeLib.eventsMod.EventEmitter {
  var buf: Accumulator = js.native
  // replace "IntWrapper" with "number"?
  var pduLen: js.UndefOr[bserLib.bserLibNumbers.`false` | IntWrapper] = js.native
  var state: bserLib.bserLibNumbers.`0` | bserLib.bserLibNumbers.`1` = js.native
  def append(buf: InputWrapper): js.UndefOr[AnyWrapper | js.Array[AnyWrapper]] = js.native
  def append(buf: InputWrapper, synchronous: bserLib.bserLibNumbers.`false`): js.UndefOr[AnyWrapper | js.Array[AnyWrapper]] = js.native
  def append(buf: InputWrapper, synchronous: bserLib.bserLibNumbers.`true`): scala.Unit = js.native
  def decodeAny(): AnyWrapper | js.Array[AnyWrapper] = js.native
  def decodeArray(): js.Array[AnyWrapper] = js.native
  // replace "IntWrapper" with "number"?
  def decodeInt(): bserLib.bserLibNumbers.`false` | IntWrapper = js.native
  def decodeInt(relaxSizeAsserts: scala.Boolean): bserLib.bserLibNumbers.`false` | IntWrapper = js.native
  def decodeObject(): js.Object = js.native
  def decodeString(): java.lang.String = js.native
  def decodeTemplate(): js.Array[AnyWrapper] = js.native
  def expectCode(expected: scala.Double): scala.Unit = js.native
  def process(): js.UndefOr[AnyWrapper | js.Array[AnyWrapper]] = js.native
  def process(synchronous: bserLib.bserLibNumbers.`false`): js.UndefOr[AnyWrapper | js.Array[AnyWrapper]] = js.native
  def process(synchronous: bserLib.bserLibNumbers.`true`): scala.Unit = js.native
  def processLater(): scala.Unit = js.native
  def raise(reason: java.lang.String): scala.Unit = js.native
}

