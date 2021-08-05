package typings.bitwise

import typings.bitwise.typesMod.Bit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stringMod {
  
  @JSImport("bitwise/esm/string", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object default {
    
    @JSImport("bitwise/esm/string", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def toBits(string: String): js.Array[Bit] = ^.asInstanceOf[js.Dynamic].applyDynamic("toBits")(string.asInstanceOf[js.Any]).asInstanceOf[js.Array[Bit]]
  }
  
  inline def toBits(string: String): js.Array[Bit] = ^.asInstanceOf[js.Dynamic].applyDynamic("toBits")(string.asInstanceOf[js.Any]).asInstanceOf[js.Array[Bit]]
}
