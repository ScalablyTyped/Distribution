package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutRemediationExceptionsRequest extends StObject {
  
  /**
    * The name of the AWS Config rule for which you want to create remediation exception.
    */
  var ConfigRuleName: typings.awsSdk.configserviceMod.ConfigRuleName
  
  /**
    * The exception is automatically deleted after the expiration date.
    */
  var ExpirationTime: js.UndefOr[Date] = js.undefined
  
  /**
    * The message contains an explanation of the exception.
    */
  var Message: js.UndefOr[StringWithCharLimit1024] = js.undefined
  
  /**
    * An exception list of resource exception keys to be processed with the current request. AWS Config adds exception for each resource key. For example, AWS Config adds 3 exceptions for 3 resource keys. 
    */
  var ResourceKeys: RemediationExceptionResourceKeys
}
object PutRemediationExceptionsRequest {
  
  @scala.inline
  def apply(ConfigRuleName: ConfigRuleName, ResourceKeys: RemediationExceptionResourceKeys): PutRemediationExceptionsRequest = {
    val __obj = js.Dynamic.literal(ConfigRuleName = ConfigRuleName.asInstanceOf[js.Any], ResourceKeys = ResourceKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutRemediationExceptionsRequest]
  }
  
  @scala.inline
  implicit class PutRemediationExceptionsRequestMutableBuilder[Self <: PutRemediationExceptionsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigRuleName(value: ConfigRuleName): Self = StObject.set(x, "ConfigRuleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirationTime(value: Date): Self = StObject.set(x, "ExpirationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirationTimeUndefined: Self = StObject.set(x, "ExpirationTime", js.undefined)
    
    @scala.inline
    def setMessage(value: StringWithCharLimit1024): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    
    @scala.inline
    def setResourceKeys(value: RemediationExceptionResourceKeys): Self = StObject.set(x, "ResourceKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceKeysVarargs(value: RemediationExceptionResourceKey*): Self = StObject.set(x, "ResourceKeys", js.Array(value :_*))
  }
}
