package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Transform extends js.Object {
  /**
    * The mathematical expression that defines the transformation function. You can specify up to 10 variables per expression. You can specify up to 10 functions per expression.  For more information, see Quotas in the AWS IoT SiteWise User Guide.
    */
  var expression: Expression = js.native
  /**
    * The list of variables used in the expression.
    */
  var variables: ExpressionVariables = js.native
}

object Transform {
  @scala.inline
  def apply(expression: Expression, variables: ExpressionVariables): Transform = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transform]
  }
  @scala.inline
  implicit class TransformOps[Self <: Transform] (val x: Self) extends AnyVal {
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
    def setExpression(value: Expression): Self = this.set("expression", value.asInstanceOf[js.Any])
    @scala.inline
    def setVariablesVarargs(value: ExpressionVariable*): Self = this.set("variables", js.Array(value :_*))
    @scala.inline
    def setVariables(value: ExpressionVariables): Self = this.set("variables", value.asInstanceOf[js.Any])
  }
  
}

