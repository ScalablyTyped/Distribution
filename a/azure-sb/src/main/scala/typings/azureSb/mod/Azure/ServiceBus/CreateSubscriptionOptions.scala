package typings.azureSb.mod.Azure.ServiceBus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<azure-sb.azure-sb.Azure.ServiceBus.ICreateSubscriptionOptions> */
@js.native
trait CreateSubscriptionOptions extends js.Object {
  
  var DefaultMessageTimeToLive: js.UndefOr[String] = js.native
  
  var EnableDeadLetteringOnFilterEvaluationExceptions: js.UndefOr[Boolean] = js.native
  
  var EnableDeadLetteringOnMessageExpiration: js.UndefOr[Boolean] = js.native
  
  var LockDuration: js.UndefOr[String] = js.native
  
  var RequiresSession: js.UndefOr[Boolean] = js.native
}
object CreateSubscriptionOptions {
  
  @scala.inline
  def apply(): CreateSubscriptionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSubscriptionOptions]
  }
  
  @scala.inline
  implicit class CreateSubscriptionOptionsOps[Self <: CreateSubscriptionOptions] (val x: Self) extends AnyVal {
    
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
    def setDefaultMessageTimeToLive(value: String): Self = this.set("DefaultMessageTimeToLive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultMessageTimeToLive: Self = this.set("DefaultMessageTimeToLive", js.undefined)
    
    @scala.inline
    def setEnableDeadLetteringOnFilterEvaluationExceptions(value: Boolean): Self = this.set("EnableDeadLetteringOnFilterEvaluationExceptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableDeadLetteringOnFilterEvaluationExceptions: Self = this.set("EnableDeadLetteringOnFilterEvaluationExceptions", js.undefined)
    
    @scala.inline
    def setEnableDeadLetteringOnMessageExpiration(value: Boolean): Self = this.set("EnableDeadLetteringOnMessageExpiration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableDeadLetteringOnMessageExpiration: Self = this.set("EnableDeadLetteringOnMessageExpiration", js.undefined)
    
    @scala.inline
    def setLockDuration(value: String): Self = this.set("LockDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLockDuration: Self = this.set("LockDuration", js.undefined)
    
    @scala.inline
    def setRequiresSession(value: Boolean): Self = this.set("RequiresSession", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequiresSession: Self = this.set("RequiresSession", js.undefined)
  }
}
