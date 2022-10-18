package typings.bitwise

import typings.bitwise.esmTypesMod.Nibble
import typings.bitwise.esmTypesMod.UInt4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmNibbleWriteMod {
  
  @JSImport("bitwise/esm/nibble/write", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(nibble: Nibble): UInt4 = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(nibble.asInstanceOf[js.Any]).asInstanceOf[UInt4]
}
