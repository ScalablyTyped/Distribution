package typings.awsSdk.kafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnprocessedScramSecret extends js.Object {
  
  /**
    * 
    Error code for associate/disassociate failure.
    
    */
  var ErrorCode: js.UndefOr[string] = js.native
  
  /**
    * 
    Error message for associate/disassociate failure.
    
    */
  var ErrorMessage: js.UndefOr[string] = js.native
  
  /**
    * 
    AWS Secrets Manager secret ARN.
    
    */
  var SecretArn: js.UndefOr[string] = js.native
}
object UnprocessedScramSecret {
  
  @scala.inline
  def apply(): UnprocessedScramSecret = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnprocessedScramSecret]
  }
  
  @scala.inline
  implicit class UnprocessedScramSecretOps[Self <: UnprocessedScramSecret] (val x: Self) extends AnyVal {
    
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
    def setErrorCode(value: string): Self = this.set("ErrorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorCode: Self = this.set("ErrorCode", js.undefined)
    
    @scala.inline
    def setErrorMessage(value: string): Self = this.set("ErrorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorMessage: Self = this.set("ErrorMessage", js.undefined)
    
    @scala.inline
    def setSecretArn(value: string): Self = this.set("SecretArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecretArn: Self = this.set("SecretArn", js.undefined)
  }
}
