package typings.bitwise

import typings.bitwise.typesMod.Bit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object integerSetBitMod {
  
  @JSImport("bitwise/integer/set-bit", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(int32: Double, position: Double, value: Bit): Bit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(int32.asInstanceOf[js.Any], position.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Bit]
}
