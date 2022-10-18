package typings.bitwise

import typings.bitwise.typesMod.Bits
import typings.bitwise.typesMod.BooleanBits
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bitsToBooleanMod {
  
  @JSImport("bitwise/bits/to-boolean", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(bits: Bits): BooleanBits = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(bits.asInstanceOf[js.Any]).asInstanceOf[BooleanBits]
}
