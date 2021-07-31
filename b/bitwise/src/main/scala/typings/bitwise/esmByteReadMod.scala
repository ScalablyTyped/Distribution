package typings.bitwise

import typings.bitwise.typesMod.Bit
import typings.bitwise.typesMod.UInt8
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmByteReadMod {
  
  @JSImport("bitwise/esm/byte/read", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(byte: UInt8): js.Tuple8[Bit, Bit, Bit, Bit, Bit, Bit, Bit, Bit] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(byte.asInstanceOf[js.Any]).asInstanceOf[js.Tuple8[Bit, Bit, Bit, Bit, Bit, Bit, Bit, Bit]]
}
