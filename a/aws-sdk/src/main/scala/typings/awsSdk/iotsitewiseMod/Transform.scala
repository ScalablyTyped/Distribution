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
}

