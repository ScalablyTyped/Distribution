package typings.bitwise

import typings.bitwise.typesMod.Bit
import typings.bitwise.typesMod.UInt8
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object byteWriteMod {
  
  @JSImport("bitwise/esm/byte/write", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(byte: js.Tuple8[Bit, Bit, Bit, Bit, Bit, Bit, Bit, Bit]): UInt8 = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(byte.asInstanceOf[js.Any]).asInstanceOf[UInt8]
}
