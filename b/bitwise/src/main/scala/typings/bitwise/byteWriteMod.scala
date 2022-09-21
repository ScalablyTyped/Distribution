package typings.bitwise

import typings.bitwise.typesMod.Byte
import typings.bitwise.typesMod.UInt8
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object byteWriteMod {
  
  @JSImport("bitwise/esm/byte/write", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(byte: Byte): UInt8 = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(byte.asInstanceOf[js.Any]).asInstanceOf[UInt8]
}
