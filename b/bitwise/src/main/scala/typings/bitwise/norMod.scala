package typings.bitwise

import typings.bitwise.bitwiseTypesMod.Bit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object norMod {
  
  @JSImport("bitwise/bits/nor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(bits1: js.Array[Bit], bits2: js.Array[Bit]): js.Array[Bit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(bits1.asInstanceOf[js.Any], bits2.asInstanceOf[js.Any])).asInstanceOf[js.Array[Bit]]
}
