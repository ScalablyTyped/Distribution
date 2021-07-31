package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemediationException extends StObject {
  
  /**
    * The name of the AWS Config rule.
    */
  var ConfigRuleName: typings.awsSdk.configserviceMod.ConfigRuleName
  
  /**
    * The time when the remediation exception will be deleted.
    */
  var ExpirationTime: js.UndefOr[Date] = js.undefined
  
  /**
    * An explanation of an remediation exception.
    */
  var Message: js.UndefOr[StringWithCharLimit1024] = js.undefined
  
  /**
    * The ID of the resource (for example., sg-xxxxxx).
    */
  var ResourceId: StringWithCharLimit1024
  
  /**
    * The type of a resource.
    */
  var ResourceType: StringWithCharLimit256
}
object RemediationException {
  
  @scala.inline
  def apply(
    ConfigRuleName: ConfigRuleName,
    ResourceId: StringWithCharLimit1024,
    ResourceType: StringWithCharLimit256
  ): RemediationException = {
    val __obj = js.Dynamic.literal(ConfigRuleName = ConfigRuleName.asInstanceOf[js.Any], ResourceId = ResourceId.asInstanceOf[js.Any], ResourceType = ResourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemediationException]
  }
  
  @scala.inline
  implicit class RemediationExceptionMutableBuilder[Self <: RemediationException] (val x: Self) extends AnyVal {
    
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
    def setResourceId(value: StringWithCharLimit1024): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceType(value: StringWithCharLimit256): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
  }
}
