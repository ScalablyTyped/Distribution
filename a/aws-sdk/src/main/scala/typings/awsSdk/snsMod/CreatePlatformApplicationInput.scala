package typings.awsSdk.snsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreatePlatformApplicationInput extends StObject {
  
  /**
    * For a list of attributes, see SetPlatformApplicationAttributes 
    */
  var Attributes: MapStringToString
  
  /**
    * Application names must be made up of only uppercase and lowercase ASCII letters, numbers, underscores, hyphens, and periods, and must be between 1 and 256 characters long.
    */
  var Name: String
  
  /**
    * The following platforms are supported: ADM (Amazon Device Messaging), APNS (Apple Push Notification Service), APNS_SANDBOX, and GCM (Firebase Cloud Messaging).
    */
  var Platform: String
}
object CreatePlatformApplicationInput {
  
  @scala.inline
  def apply(Attributes: MapStringToString, Name: String, Platform: String): CreatePlatformApplicationInput = {
    val __obj = js.Dynamic.literal(Attributes = Attributes.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Platform = Platform.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePlatformApplicationInput]
  }
  
  @scala.inline
  implicit class CreatePlatformApplicationInputMutableBuilder[Self <: CreatePlatformApplicationInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: MapStringToString): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatform(value: String): Self = StObject.set(x, "Platform", value.asInstanceOf[js.Any])
  }
}
