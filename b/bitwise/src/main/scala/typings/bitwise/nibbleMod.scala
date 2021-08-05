package typings.bitwise

import typings.bitwise.typesMod.Bit
import typings.bitwise.typesMod.UInt4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nibbleMod {
  
  @JSImport("bitwise/esm/nibble", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object default {
    
    @JSImport("bitwise/esm/nibble", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def read(nibble: UInt4): js.Tuple4[Bit, Bit, Bit, Bit] = ^.asInstanceOf[js.Dynamic].applyDynamic("read")(nibble.asInstanceOf[js.Any]).asInstanceOf[js.Tuple4[Bit, Bit, Bit, Bit]]
    
    inline def write(nibble: js.Tuple4[Bit, Bit, Bit, Bit]): UInt4 = ^.asInstanceOf[js.Dynamic].applyDynamic("write")(nibble.asInstanceOf[js.Any]).asInstanceOf[UInt4]
  }
  
  inline def read(nibble: UInt4): js.Tuple4[Bit, Bit, Bit, Bit] = ^.asInstanceOf[js.Dynamic].applyDynamic("read")(nibble.asInstanceOf[js.Any]).asInstanceOf[js.Tuple4[Bit, Bit, Bit, Bit]]
  
  inline def write(nibble: js.Tuple4[Bit, Bit, Bit, Bit]): UInt4 = ^.asInstanceOf[js.Dynamic].applyDynamic("write")(nibble.asInstanceOf[js.Any]).asInstanceOf[UInt4]
}
