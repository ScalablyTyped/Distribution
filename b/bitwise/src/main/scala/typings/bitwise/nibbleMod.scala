package typings.bitwise

import typings.bitwise.typesMod.Bit
import typings.bitwise.typesMod.UInt4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nibbleMod {
  
  object default {
    
    @JSImport("bitwise/esm/nibble", "default.read")
    @js.native
    def read(nibble: UInt4): js.Tuple4[Bit, Bit, Bit, Bit] = js.native
    
    @JSImport("bitwise/esm/nibble", "default.write")
    @js.native
    def write(nibble: js.Tuple4[Bit, Bit, Bit, Bit]): UInt4 = js.native
  }
  
  @JSImport("bitwise/esm/nibble", "read")
  @js.native
  def read(nibble: UInt4): js.Tuple4[Bit, Bit, Bit, Bit] = js.native
  
  @JSImport("bitwise/esm/nibble", "write")
  @js.native
  def write(nibble: js.Tuple4[Bit, Bit, Bit, Bit]): UInt4 = js.native
}
