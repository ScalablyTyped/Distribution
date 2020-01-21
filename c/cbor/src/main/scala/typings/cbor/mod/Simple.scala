package typings.cbor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cbor", "Simple")
@js.native
class Simple protected () extends js.Object {
  def this(value: Double) = this()
  def encodeCBOR(gen: Encoder): Boolean = js.native
}

/* static members */
@JSImport("cbor", "Simple")
@js.native
object Simple extends js.Object {
  def decode(`val`: Double): js.UndefOr[Null | Boolean | js.Symbol | Simple] = js.native
  def decode(`val`: Double, has_parent: Boolean): js.UndefOr[Null | Boolean | js.Symbol | Simple] = js.native
  def decode(`val`: Double, has_parent: Boolean, parent_indefinite: Boolean): js.UndefOr[Null | Boolean | js.Symbol | Simple] = js.native
  def isSimple(obj: js.Any): Boolean = js.native
}

