package typings.bitwise

import typings.bitwise.bitwiseTypesMod.Bit
import typings.bitwise.bitwiseTypesMod.UInt4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bitwiseNibbleMod {
  
  object default {
    
    @JSImport("bitwise/nibble", "default.read")
    @js.native
    def read(nibble: UInt4): js.Tuple4[Bit, Bit, Bit, Bit] = js.native
    
    @JSImport("bitwise/nibble", "default.write")
    @js.native
    def write(nibble: js.Tuple4[Bit, Bit, Bit, Bit]): UInt4 = js.native
  }
  
  @JSImport("bitwise/nibble", "read")
  @js.native
  def read(nibble: UInt4): js.Tuple4[Bit, Bit, Bit, Bit] = js.native
  
  @JSImport("bitwise/nibble", "write")
  @js.native
  def write(nibble: js.Tuple4[Bit, Bit, Bit, Bit]): UInt4 = js.native
}
