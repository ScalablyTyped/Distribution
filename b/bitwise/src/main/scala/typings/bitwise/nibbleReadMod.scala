package typings.bitwise

import typings.bitwise.typesMod.Bit
import typings.bitwise.typesMod.UInt4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nibbleReadMod {
  
  @JSImport("bitwise/esm/nibble/read", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(nibble: UInt4): js.Tuple4[Bit, Bit, Bit, Bit] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(nibble.asInstanceOf[js.Any]).asInstanceOf[js.Tuple4[Bit, Bit, Bit, Bit]]
}
