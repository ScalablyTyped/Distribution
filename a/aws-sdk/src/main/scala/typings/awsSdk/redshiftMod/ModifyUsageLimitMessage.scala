package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyUsageLimitMessage extends StObject {
  
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
  implicit class ModifyUsageLimitMessageMutableBuilder[Self <: ModifyUsageLimitMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmount(value: LongOptional): Self = StObject.set(x, "Amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmountUndefined: Self = StObject.set(x, "Amount", js.undefined)
    
    @scala.inline
    def setBreachAction(value: UsageLimitBreachAction): Self = StObject.set(x, "BreachAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBreachActionUndefined: Self = StObject.set(x, "BreachAction", js.undefined)
    
    @scala.inline
    def setUsageLimitId(value: String): Self = StObject.set(x, "UsageLimitId", value.asInstanceOf[js.Any])
  }
}
