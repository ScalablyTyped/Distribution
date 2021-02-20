package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteRemediationExceptionsRequest extends StObject {
  
  /**
    * The name of the AWS Config rule for which you want to delete remediation exception configuration.
    */
  var ConfigRuleName: typings.awsSdk.configserviceMod.ConfigRuleName = js.native
  
  /**
    * An exception list of resource exception keys to be processed with the current request. AWS Config adds exception for each resource key. For example, AWS Config adds 3 exceptions for 3 resource keys. 
    */
  var ResourceKeys: RemediationExceptionResourceKeys = js.native
}
object DeleteRemediationExceptionsRequest {
  
  @scala.inline
  def apply(ConfigRuleName: ConfigRuleName, ResourceKeys: RemediationExceptionResourceKeys): DeleteRemediationExceptionsRequest = {
    val __obj = js.Dynamic.literal(ConfigRuleName = ConfigRuleName.asInstanceOf[js.Any], ResourceKeys = ResourceKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRemediationExceptionsRequest]
  }
  
  @scala.inline
  implicit class DeleteRemediationExceptionsRequestMutableBuilder[Self <: DeleteRemediationExceptionsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigRuleName(value: ConfigRuleName): Self = StObject.set(x, "ConfigRuleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceKeys(value: RemediationExceptionResourceKeys): Self = StObject.set(x, "ResourceKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceKeysVarargs(value: RemediationExceptionResourceKey*): Self = StObject.set(x, "ResourceKeys", js.Array(value :_*))
  }
}
