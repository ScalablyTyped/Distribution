package typings.bitwise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GetBit extends js.Object {
  def getBit(int32: Double, position: Double): js.Any
  def setBit(
    int32: Double,
    position: Double,
    value: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_bitwise/types.Bit */ js.Any
  ): js.Any
  def toggleBit(int32: Double, position: Double): Double
}

object Anon_GetBit {
  @scala.inline
  def apply(
    getBit: (Double, Double) => js.Any,
    setBit: (Double, Double, /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_bitwise/types.Bit */ js.Any) => js.Any,
    toggleBit: (Double, Double) => Double
  ): Anon_GetBit = {
    val __obj = js.Dynamic.literal(getBit = js.Any.fromFunction2(getBit), setBit = js.Any.fromFunction3(setBit), toggleBit = js.Any.fromFunction2(toggleBit))
  
    __obj.asInstanceOf[Anon_GetBit]
  }
}

