package typings.cucumber.cucumberMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StepDefinition extends js.Object {
  // tslint:disable:ban-types
  var code: js.Function
  // tslint:enable:ban-types
  var line: Double
  var pattern: js.Any
  var unwrappedCode: js.UndefOr[js.Function] = js.undefined
  var uri: String
}

object StepDefinition {
  @scala.inline
  def apply(code: js.Function, line: Double, pattern: js.Any, uri: String, unwrappedCode: js.Function = null): StepDefinition = {
    val __obj = js.Dynamic.literal(code = code, line = line, pattern = pattern, uri = uri)
    if (unwrappedCode != null) __obj.updateDynamic("unwrappedCode")(unwrappedCode)
    __obj.asInstanceOf[StepDefinition]
  }
}

