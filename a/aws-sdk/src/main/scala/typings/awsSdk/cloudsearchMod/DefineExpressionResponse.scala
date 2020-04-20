package typings.awsSdk.cloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefineExpressionResponse extends js.Object {
  var Expression: ExpressionStatus = js.native
}

object DefineExpressionResponse {
  @scala.inline
  def apply(Expression: ExpressionStatus): DefineExpressionResponse = {
    val __obj = js.Dynamic.literal(Expression = Expression.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefineExpressionResponse]
  }
}

