package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModelClientConfig extends js.Object {
  
  /**
    * The maximum number of retries when invocation requests are failing.
    */
  var InvocationsMaxRetries: js.UndefOr[typings.awsSdk.sagemakerMod.InvocationsMaxRetries] = js.native
  
  /**
    * The timeout value in seconds for an invocation request.
    */
  var InvocationsTimeoutInSeconds: js.UndefOr[typings.awsSdk.sagemakerMod.InvocationsTimeoutInSeconds] = js.native
}
object ModelClientConfig {
  
  @scala.inline
  def apply(): ModelClientConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModelClientConfig]
  }
  
  @scala.inline
  implicit class ModelClientConfigOps[Self <: ModelClientConfig] (val x: Self) extends AnyVal {
    
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
    def setInvocationsMaxRetries(value: InvocationsMaxRetries): Self = this.set("InvocationsMaxRetries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvocationsMaxRetries: Self = this.set("InvocationsMaxRetries", js.undefined)
    
    @scala.inline
    def setInvocationsTimeoutInSeconds(value: InvocationsTimeoutInSeconds): Self = this.set("InvocationsTimeoutInSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvocationsTimeoutInSeconds: Self = this.set("InvocationsTimeoutInSeconds", js.undefined)
  }
}
