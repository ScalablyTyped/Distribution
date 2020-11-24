package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyUsageLimitMessage extends js.Object {
  
  /**
    * The new limit amount. For more information about this parameter, see UsageLimit. 
    */
  var Amount: js.UndefOr[LongOptional] = js.native
  
  /**
    * The new action that Amazon Redshift takes when the limit is reached. For more information about this parameter, see UsageLimit. 
    */
  var BreachAction: js.UndefOr[UsageLimitBreachAction] = js.native
  
  /**
    * The identifier of the usage limit to modify.
    */
  var UsageLimitId: String = js.native
}
object ModifyUsageLimitMessage {
  
  @scala.inline
  def apply(UsageLimitId: String): ModifyUsageLimitMessage = {
    val __obj = js.Dynamic.literal(UsageLimitId = UsageLimitId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyUsageLimitMessage]
  }
  
  @scala.inline
  implicit class ModifyUsageLimitMessageOps[Self <: ModifyUsageLimitMessage] (val x: Self) extends AnyVal {
    
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
    def setUsageLimitId(value: String): Self = this.set("UsageLimitId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmount(value: LongOptional): Self = this.set("Amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAmount: Self = this.set("Amount", js.undefined)
    
    @scala.inline
    def setBreachAction(value: UsageLimitBreachAction): Self = this.set("BreachAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBreachAction: Self = this.set("BreachAction", js.undefined)
  }
}
