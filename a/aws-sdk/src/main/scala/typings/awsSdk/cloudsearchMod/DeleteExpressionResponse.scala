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
  @scala.inline
  implicit class DeleteExpressionResponseOps[Self <: DeleteExpressionResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setExpression(value: ExpressionStatus): Self = this.set("Expression", value.asInstanceOf[js.Any])
  }
  
}

