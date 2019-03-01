package typings
package cucumberLib.cucumberMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StepDefinition extends js.Object {
  // tslint:disable-next-line ban-types
  var code: js.Function
  var line: scala.Double
  var pattern: js.Any
  var uri: java.lang.String
}

object StepDefinition {
  @scala.inline
  def apply(code: js.Function, line: scala.Double, pattern: js.Any, uri: java.lang.String): StepDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("code")(code)
    __obj.updateDynamic("line")(line)
    __obj.updateDynamic("pattern")(pattern)
    __obj.updateDynamic("uri")(uri)
    __obj.asInstanceOf[StepDefinition]
  }
}

