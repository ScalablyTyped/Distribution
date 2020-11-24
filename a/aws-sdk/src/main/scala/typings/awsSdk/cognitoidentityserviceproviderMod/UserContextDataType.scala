package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserContextDataType extends js.Object {
  
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
  implicit class UserContextDataTypeOps[Self <: UserContextDataType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEncodedData(value: StringType): Self = this.set("EncodedData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncodedData: Self = this.set("EncodedData", js.undefined)
  }
}
