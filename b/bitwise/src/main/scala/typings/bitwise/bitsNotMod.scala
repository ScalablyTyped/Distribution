package typings.bitwise

import typings.bitwise.typesMod.Bit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bitsNotMod {
  
  @JSImport("bitwise/esm/bits/not", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(bits: js.Array[Bit]): js.Array[Bit] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(bits.asInstanceOf[js.Any]).asInstanceOf[js.Array[Bit]]
}
