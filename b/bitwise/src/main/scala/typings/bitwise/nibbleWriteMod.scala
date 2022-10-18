package typings.bitwise

import typings.bitwise.typesMod.Nibble
import typings.bitwise.typesMod.UInt4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nibbleWriteMod {
  
  @JSImport("bitwise/nibble/write", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(nibble: Nibble): UInt4 = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(nibble.asInstanceOf[js.Any]).asInstanceOf[UInt4]
}
