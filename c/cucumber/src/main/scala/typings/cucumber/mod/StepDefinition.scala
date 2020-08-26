package typings.cucumber.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StepDefinition extends js.Object {
  // tslint:disable:ban-types
  var code: js.Function = js.native
  // tslint:enable:ban-types
  var line: Double = js.native
  var pattern: js.Any = js.native
  var unwrappedCode: js.UndefOr[js.Function] = js.native
  var uri: String = js.native
}

object StepDefinition {
  @scala.inline
  def apply(code: js.Function, line: Double, pattern: js.Any, uri: String): StepDefinition = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[StepDefinition]
  }
  @scala.inline
  implicit class StepDefinitionOps[Self <: StepDefinition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCode(value: js.Function): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def setLine(value: Double): Self = this.set("line", value.asInstanceOf[js.Any])
    @scala.inline
    def setPattern(value: js.Any): Self = this.set("pattern", value.asInstanceOf[js.Any])
    @scala.inline
    def setUri(value: String): Self = this.set("uri", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnwrappedCode(value: js.Function): Self = this.set("unwrappedCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnwrappedCode: Self = this.set("unwrappedCode", js.undefined)
  }
  
}

