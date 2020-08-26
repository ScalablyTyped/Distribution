package typings.azureSb.mod.Azure.ServiceBus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<azure-sb.azure-sb.Azure.ServiceBus.ICreateRuleOptions> */
@js.native
trait CreateRuleOptions extends js.Object {
  var correlationIdFilter: js.UndefOr[String] = js.native
  var falseFilter: js.UndefOr[String] = js.native
  var sqlExpressionFilter: js.UndefOr[String] = js.native
  var sqlRuleAction: js.UndefOr[String] = js.native
  var trueFilter: js.UndefOr[String] = js.native
}

object CreateRuleOptions {
  @scala.inline
  def apply(): CreateRuleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateRuleOptions]
  }
  @scala.inline
  implicit class CreateRuleOptionsOps[Self <: CreateRuleOptions] (val x: Self) extends AnyVal {
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
    def deleteCorrelationIdFilter: Self = this.set("correlationIdFilter", js.undefined)
    @scala.inline
    def setFalseFilter(value: String): Self = this.set("falseFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFalseFilter: Self = this.set("falseFilter", js.undefined)
    @scala.inline
    def setSqlExpressionFilter(value: String): Self = this.set("sqlExpressionFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSqlExpressionFilter: Self = this.set("sqlExpressionFilter", js.undefined)
    @scala.inline
    def setSqlRuleAction(value: String): Self = this.set("sqlRuleAction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSqlRuleAction: Self = this.set("sqlRuleAction", js.undefined)
    @scala.inline
    def setTrueFilter(value: String): Self = this.set("trueFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrueFilter: Self = this.set("trueFilter", js.undefined)
  }
  
}

