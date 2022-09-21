package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateContactMethodRequest extends StObject {
  
  /**
    * The destination of the contact method, such as an email address or a mobile phone number. Use the E.164 format when specifying a mobile phone number. E.164 is a standard for the phone number structure used for international telecommunication. Phone numbers that follow this format can have a maximum of 15 digits, and they are prefixed with the plus character (+) and the country code. For example, a U.S. phone number in E.164 format would be specified as +1XXX5550100. For more information, see E.164 on Wikipedia.
    */
  var contactEndpoint: StringMax256
  
  /**
    * The protocol of the contact method, such as Email or SMS (text messaging). The SMS protocol is supported only in the following Amazon Web Services Regions.   US East (N. Virginia) (us-east-1)   US West (Oregon) (us-west-2)   Europe (Ireland) (eu-west-1)   Asia Pacific (Tokyo) (ap-northeast-1)   Asia Pacific (Singapore) (ap-southeast-1)   Asia Pacific (Sydney) (ap-southeast-2)   For a list of countries/regions where SMS text messages can be sent, and the latest Amazon Web Services Regions where SMS text messaging is supported, see Supported Regions and Countries in the Amazon SNS Developer Guide. For more information about notifications in Amazon Lightsail, see Notifications in Amazon Lightsail.
    */
  var protocol: ContactProtocol
}
object CreateContactMethodRequest {
  
  inline def apply(contactEndpoint: StringMax256, protocol: ContactProtocol): CreateContactMethodRequest = {
    val __obj = js.Dynamic.literal(contactEndpoint = contactEndpoint.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateContactMethodRequest]
  }
  
  extension [Self <: CreateContactMethodRequest](x: Self) {
    
    inline def setContactEndpoint(value: StringMax256): Self = StObject.set(x, "contactEndpoint", value.asInstanceOf[js.Any])
    
    inline def setProtocol(value: ContactProtocol): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
  }
}
