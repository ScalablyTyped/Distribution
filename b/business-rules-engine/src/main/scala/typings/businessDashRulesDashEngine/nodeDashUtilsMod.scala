package typings.businessDashRulesDashEngine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-utils", JSImport.Namespace)
@js.native
object nodeDashUtilsMod extends js.Object {
  @js.native
  class NumberFce ()
    extends typings.businessDashRulesDashEngine.Utils.NumberFce
  
  @js.native
  class StringFce ()
    extends typings.businessDashRulesDashEngine.Utils.StringFce
  
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

