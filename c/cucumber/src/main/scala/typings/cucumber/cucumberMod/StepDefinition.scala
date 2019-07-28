package typings.cucumber.cucumberMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StepDefinition extends js.Object {
  // tslint:disable-next-line ban-types
  var code: js.Function
  var line: Double
  var pattern: js.Any
  var uri: String
}

object StepDefinition {
  @scala.inline
  def apply(code: js.Function, line: Double, pattern: js.Any, uri: String): StepDefinition = {
    val __obj = js.Dynamic.literal(code = code, line = line, pattern = pattern, uri = uri)
  
    __obj.asInstanceOf[StepDefinition]
  }
}

