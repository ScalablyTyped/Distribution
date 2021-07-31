package typings.awsSdk.snsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreatePlatformEndpointInput extends StObject {
  
  /**
    * For a list of attributes, see SetEndpointAttributes.
    */
  var Attributes: js.UndefOr[MapStringToString] = js.undefined
  
  /**
    * Arbitrary user data to associate with the endpoint. Amazon SNS does not use this data. The data must be in UTF-8 format and less than 2KB.
    */
  var CustomUserData: js.UndefOr[String] = js.undefined
  
  /**
    * PlatformApplicationArn returned from CreatePlatformApplication is used to create a an endpoint.
    */
  var PlatformApplicationArn: String
  
  /**
    * Unique identifier created by the notification service for an app on a device. The specific name for Token will vary, depending on which notification service is being used. For example, when using APNS as the notification service, you need the device token. Alternatively, when using GCM (Firebase Cloud Messaging) or ADM, the device token equivalent is called the registration ID.
    */
  var Token: String
}
object CreatePlatformEndpointInput {
  
  @scala.inline
  def apply(PlatformApplicationArn: String, Token: String): CreatePlatformEndpointInput = {
    val __obj = js.Dynamic.literal(PlatformApplicationArn = PlatformApplicationArn.asInstanceOf[js.Any], Token = Token.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePlatformEndpointInput]
  }
  
  @scala.inline
  implicit class CreatePlatformEndpointInputMutableBuilder[Self <: CreatePlatformEndpointInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: MapStringToString): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
    
    @scala.inline
    def setCustomUserData(value: String): Self = StObject.set(x, "CustomUserData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomUserDataUndefined: Self = StObject.set(x, "CustomUserData", js.undefined)
    
    @scala.inline
    def setPlatformApplicationArn(value: String): Self = StObject.set(x, "PlatformApplicationArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToken(value: String): Self = StObject.set(x, "Token", value.asInstanceOf[js.Any])
  }
}
