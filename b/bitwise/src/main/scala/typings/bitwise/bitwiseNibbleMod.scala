package typings.bitwise

import typings.bitwise.bitwiseTypesMod.Nibble
import typings.bitwise.bitwiseTypesMod.UInt4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bitwiseNibbleMod {
  
  @JSImport("bitwise/nibble", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object default {
    
    @JSImport("bitwise/nibble", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def read(nibble: UInt4): Nibble = ^.asInstanceOf[js.Dynamic].applyDynamic("read")(nibble.asInstanceOf[js.Any]).asInstanceOf[Nibble]
    
    inline def write(nibble: Nibble): UInt4 = ^.asInstanceOf[js.Dynamic].applyDynamic("write")(nibble.asInstanceOf[js.Any]).asInstanceOf[UInt4]
  }
  
  inline def read(nibble: UInt4): Nibble = ^.asInstanceOf[js.Dynamic].applyDynamic("read")(nibble.asInstanceOf[js.Any]).asInstanceOf[Nibble]
  
  inline def write(nibble: Nibble): UInt4 = ^.asInstanceOf[js.Dynamic].applyDynamic("write")(nibble.asInstanceOf[js.Any]).asInstanceOf[UInt4]
}
