package typings.bitwise

import typings.bitwise.esmTypesMod.Bits
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmBitsCircularShiftRightMod {
  
  @JSImport("bitwise/esm/bits/circular-shift-right", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(bits: Bits, amount: Double): Bits = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(bits.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[Bits]
}
