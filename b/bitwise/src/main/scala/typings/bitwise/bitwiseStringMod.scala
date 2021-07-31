package typings.bitwise

import typings.bitwise.bitwiseTypesMod.Bit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bitwiseStringMod {
  
  @JSImport("bitwise/string", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object default {
    
    @JSImport("bitwise/string", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def toBits(string: String): js.Array[Bit] = ^.asInstanceOf[js.Dynamic].applyDynamic("toBits")(string.asInstanceOf[js.Any]).asInstanceOf[js.Array[Bit]]
  }
  
  @scala.inline
  def toBits(string: String): js.Array[Bit] = ^.asInstanceOf[js.Dynamic].applyDynamic("toBits")(string.asInstanceOf[js.Any]).asInstanceOf[js.Array[Bit]]
}
