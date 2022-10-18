package typings.bitwise

import typings.bitwise.typesMod.Bits
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bitsNotMod {
  
  @JSImport("bitwise/bits/not", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(bits: Bits): Bits = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(bits.asInstanceOf[js.Any]).asInstanceOf[Bits]
}
