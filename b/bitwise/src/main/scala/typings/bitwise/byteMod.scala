package typings.bitwise

import typings.bitwise.bitwiseTypesMod.Bit
import typings.bitwise.bitwiseTypesMod.UInt8
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object byteMod {
  
  @JSImport("bitwise/byte", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object default {
    
    @JSImport("bitwise/byte", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def read(byte: UInt8): js.Tuple8[Bit, Bit, Bit, Bit, Bit, Bit, Bit, Bit] = ^.asInstanceOf[js.Dynamic].applyDynamic("read")(byte.asInstanceOf[js.Any]).asInstanceOf[js.Tuple8[Bit, Bit, Bit, Bit, Bit, Bit, Bit, Bit]]
    
    @scala.inline
    def write(byte: js.Tuple8[Bit, Bit, Bit, Bit, Bit, Bit, Bit, Bit]): UInt8 = ^.asInstanceOf[js.Dynamic].applyDynamic("write")(byte.asInstanceOf[js.Any]).asInstanceOf[UInt8]
  }
  
  @scala.inline
  def read(byte: UInt8): js.Tuple8[Bit, Bit, Bit, Bit, Bit, Bit, Bit, Bit] = ^.asInstanceOf[js.Dynamic].applyDynamic("read")(byte.asInstanceOf[js.Any]).asInstanceOf[js.Tuple8[Bit, Bit, Bit, Bit, Bit, Bit, Bit, Bit]]
  
  @scala.inline
  def write(byte: js.Tuple8[Bit, Bit, Bit, Bit, Bit, Bit, Bit, Bit]): UInt8 = ^.asInstanceOf[js.Dynamic].applyDynamic("write")(byte.asInstanceOf[js.Any]).asInstanceOf[UInt8]
}
