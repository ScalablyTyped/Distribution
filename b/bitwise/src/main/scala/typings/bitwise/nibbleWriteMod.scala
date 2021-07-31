package typings.bitwise

import typings.bitwise.typesMod.Bit
import typings.bitwise.typesMod.UInt4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nibbleWriteMod {
  
  @JSImport("bitwise/esm/nibble/write", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(nibble: js.Tuple4[Bit, Bit, Bit, Bit]): UInt4 = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(nibble.asInstanceOf[js.Any]).asInstanceOf[UInt4]
}
