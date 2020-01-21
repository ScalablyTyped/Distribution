package typings.businessRulesEngine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Utils")
@js.native
object Utils extends js.Object {
  @js.native
  class NumberFce () extends js.Object
  
  @js.native
  class StringFce () extends js.Object
  
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

