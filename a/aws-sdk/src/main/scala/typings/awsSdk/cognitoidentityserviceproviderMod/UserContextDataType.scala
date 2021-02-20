package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserContextDataType extends StObject {
  
  /**
    * Contextual data such as the user's device fingerprint, IP address, or location used for evaluating the risk of an unexpected event by Amazon Cognito advanced security.
    */
  var EncodedData: js.UndefOr[StringType] = js.native
}
object UserContextDataType {
  
  @scala.inline
  def apply(): UserContextDataType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserContextDataType]
  }
  
  @scala.inline
  implicit class UserContextDataTypeMutableBuilder[Self <: UserContextDataType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEncodedData(value: StringType): Self = StObject.set(x, "EncodedData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodedDataUndefined: Self = StObject.set(x, "EncodedData", js.undefined)
  }
}
