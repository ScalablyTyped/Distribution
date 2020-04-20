package typings.awsSdk.cloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteExpressionResponse extends js.Object {
  /**
    * The status of the expression being deleted.
    */
  var Expression: ExpressionStatus = js.native
}

object DeleteExpressionResponse {
  @scala.inline
  def apply(Expression: ExpressionStatus): DeleteExpressionResponse = {
    val __obj = js.Dynamic.literal(Expression = Expression.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteExpressionResponse]
  }
}

