package typings.businessRulesEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeUtilsMod {
  
  @JSImport("node-utils", "NumberFce")
  @js.native
  class NumberFce ()
    extends typings.businessRulesEngine.Utils.NumberFce
  object NumberFce {
    
    /* static member */
    @JSImport("node-utils", "NumberFce.GetNegDigits")
    @js.native
    def GetNegDigits(value: String): Double = js.native
  }
  
  @JSImport("node-utils", "StringFce")
  @js.native
  class StringFce ()
    extends typings.businessRulesEngine.Utils.StringFce
  object StringFce {
    
    /* static member */
    @JSImport("node-utils", "StringFce.format")
    @js.native
    def format(s: String, args: js.Any): String = js.native
  }
}
