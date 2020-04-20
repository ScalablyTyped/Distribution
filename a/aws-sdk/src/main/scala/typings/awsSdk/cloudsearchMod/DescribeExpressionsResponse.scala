package typings.awsSdk.cloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeExpressionsResponse extends js.Object {
  /**
    * The expressions configured for the domain.
    */
  var Expressions: ExpressionStatusList = js.native
}

object DescribeExpressionsResponse {
  @scala.inline
  def apply(Expressions: ExpressionStatusList): DescribeExpressionsResponse = {
    val __obj = js.Dynamic.literal(Expressions = Expressions.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeExpressionsResponse]
  }
}

