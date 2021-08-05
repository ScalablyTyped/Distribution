package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserContextDataType extends StObject {
  
  /**
    * Contextual data such as the user's device fingerprint, IP address, or location used for evaluating the risk of an unexpected event by Amazon Cognito advanced security.
    */
  var EncodedData: js.UndefOr[StringType] = js.undefined
}
object UserContextDataType {
  
  inline def apply(): UserContextDataType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserContextDataType]
  }
  
  extension [Self <: UserContextDataType](x: Self) {
    
    inline def setEncodedData(value: StringType): Self = StObject.set(x, "EncodedData", value.asInstanceOf[js.Any])
    
    inline def setEncodedDataUndefined: Self = StObject.set(x, "EncodedData", js.undefined)
  }
}
