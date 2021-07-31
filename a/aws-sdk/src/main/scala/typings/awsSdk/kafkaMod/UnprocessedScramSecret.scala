package typings.awsSdk.kafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnprocessedScramSecret extends StObject {
  
  /**
    * 
    Error code for associate/disassociate failure.
    
    */
  var ErrorCode: js.UndefOr[string] = js.undefined
  
  /**
    * 
    Error message for associate/disassociate failure.
    
    */
  var ErrorMessage: js.UndefOr[string] = js.undefined
  
  /**
    * 
    AWS Secrets Manager secret ARN.
    
    */
  var SecretArn: js.UndefOr[string] = js.undefined
}
object UnprocessedScramSecret {
  
  @scala.inline
  def apply(): UnprocessedScramSecret = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnprocessedScramSecret]
  }
  
  @scala.inline
  implicit class UnprocessedScramSecretMutableBuilder[Self <: UnprocessedScramSecret] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorCode(value: string): Self = StObject.set(x, "ErrorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorCodeUndefined: Self = StObject.set(x, "ErrorCode", js.undefined)
    
    @scala.inline
    def setErrorMessage(value: string): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessageUndefined: Self = StObject.set(x, "ErrorMessage", js.undefined)
    
    @scala.inline
    def setSecretArn(value: string): Self = StObject.set(x, "SecretArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecretArnUndefined: Self = StObject.set(x, "SecretArn", js.undefined)
  }
}
