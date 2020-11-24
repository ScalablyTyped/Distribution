package typings.azureSb.mod.Azure.ServiceBus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICreateRuleOptions extends js.Object {
  
  var correlationIdFilter: String = js.native
  
  var falseFilter: String = js.native
  
  var sqlExpressionFilter: String = js.native
  
  var sqlRuleAction: String = js.native
  
  var trueFilter: String = js.native
}
object ICreateRuleOptions {
  
  @scala.inline
  def apply(
    correlationIdFilter: String,
    falseFilter: String,
    sqlExpressionFilter: String,
    sqlRuleAction: String,
    trueFilter: String
  ): ICreateRuleOptions = {
    val __obj = js.Dynamic.literal(correlationIdFilter = correlationIdFilter.asInstanceOf[js.Any], falseFilter = falseFilter.asInstanceOf[js.Any], sqlExpressionFilter = sqlExpressionFilter.asInstanceOf[js.Any], sqlRuleAction = sqlRuleAction.asInstanceOf[js.Any], trueFilter = trueFilter.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICreateRuleOptions]
  }
  
  @scala.inline
  implicit class ICreateRuleOptionsOps[Self <: ICreateRuleOptions] (val x: Self) extends AnyVal {
    
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
    def setCorrelationIdFilter(value: String): Self = this.set("correlationIdFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFalseFilter(value: String): Self = this.set("falseFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSqlExpressionFilter(value: String): Self = this.set("sqlExpressionFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSqlRuleAction(value: String): Self = this.set("sqlRuleAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrueFilter(value: String): Self = this.set("trueFilter", value.asInstanceOf[js.Any])
  }
}
