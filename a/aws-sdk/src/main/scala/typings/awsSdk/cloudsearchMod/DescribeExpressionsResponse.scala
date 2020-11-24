package typings.awsSdk.cloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  @scala.inline
  implicit class DescribeExpressionsResponseOps[Self <: DescribeExpressionsResponse] (val x: Self) extends AnyVal {
    
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
    def setExpressionsVarargs(value: ExpressionStatus*): Self = this.set("Expressions", js.Array(value :_*))
    
    @scala.inline
    def setExpressions(value: ExpressionStatusList): Self = this.set("Expressions", value.asInstanceOf[js.Any])
  }
}
