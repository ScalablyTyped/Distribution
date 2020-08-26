package typings.cronParser.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StringResult extends js.Object {
  var errors: StringDictionary[String] = js.native
  var expressions: js.Array[CronExpression] = js.native
  var variables: StringDictionary[String] = js.native
}

object StringResult {
  @scala.inline
  def apply(
    errors: StringDictionary[String],
    expressions: js.Array[CronExpression],
    variables: StringDictionary[String]
  ): StringResult = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], expressions = expressions.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[StringResult]
  }
  @scala.inline
  implicit class StringResultOps[Self <: StringResult] (val x: Self) extends AnyVal {
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
    def setErrors(value: StringDictionary[String]): Self = this.set("errors", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpressionsVarargs(value: CronExpression*): Self = this.set("expressions", js.Array(value :_*))
    @scala.inline
    def setExpressions(value: js.Array[CronExpression]): Self = this.set("expressions", value.asInstanceOf[js.Any])
    @scala.inline
    def setVariables(value: StringDictionary[String]): Self = this.set("variables", value.asInstanceOf[js.Any])
  }
  
}

