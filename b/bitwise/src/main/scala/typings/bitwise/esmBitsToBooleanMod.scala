package typings.bitwise

import typings.bitwise.esmTypesMod.Bits
import typings.bitwise.esmTypesMod.BooleanBits
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmBitsToBooleanMod {
  
  @JSImport("bitwise/esm/bits/to-boolean", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(bits: Bits): BooleanBits = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(bits.asInstanceOf[js.Any]).asInstanceOf[BooleanBits]
}
