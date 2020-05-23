package typings.businessRulesEngine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  object Utils extends js.Object {
    @js.native
    class NumberFce ()
      extends typings.businessRulesEngine.Utils.NumberFce
    
    @js.native
    class StringFce ()
      extends typings.businessRulesEngine.Utils.StringFce
    
    /* static members */
    @js.native
    object NumberFce extends js.Object {
      def GetNegDigits(value: String): Double = js.native
    }
    
    /* static members */
    @js.native
    object StringFce extends js.Object {
      def format(s: String, args: js.Any): String = js.native
    }
    
  }
  
}

