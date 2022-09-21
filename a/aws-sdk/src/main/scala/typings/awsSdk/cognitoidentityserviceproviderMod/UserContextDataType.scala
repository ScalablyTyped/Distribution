package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserContextDataType extends StObject {
  
  /**
    * Encoded device-fingerprint details that your app collected with the Amazon Cognito context data collection library. For more information, see Adding user device and session data to API requests.
    */
  var EncodedData: js.UndefOr[StringType] = js.undefined
  
  /**
    * The source IP address of your user's device.
    */
  var IpAddress: js.UndefOr[StringType] = js.undefined
}
object UserContextDataType {
  
  inline def apply(): UserContextDataType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserContextDataType]
  }
  
  extension [Self <: UserContextDataType](x: Self) {
    
    inline def setEncodedData(value: StringType): Self = StObject.set(x, "EncodedData", value.asInstanceOf[js.Any])
    
    inline def setEncodedDataUndefined: Self = StObject.set(x, "EncodedData", js.undefined)
    
    inline def setIpAddress(value: StringType): Self = StObject.set(x, "IpAddress", value.asInstanceOf[js.Any])
    
    inline def setIpAddressUndefined: Self = StObject.set(x, "IpAddress", js.undefined)
  }
}
