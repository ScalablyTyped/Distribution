package typings.bitwise

import typings.bitwise.typesMod.Bit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bitsToBooleanMod {
  
  @JSImport("bitwise/esm/bits/to-boolean", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(bits: js.Array[Bit]): js.Array[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(bits.asInstanceOf[js.Any]).asInstanceOf[js.Array[Boolean]]
}
