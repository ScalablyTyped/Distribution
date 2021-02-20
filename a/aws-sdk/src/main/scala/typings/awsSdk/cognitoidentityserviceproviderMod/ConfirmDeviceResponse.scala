package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfirmDeviceResponse extends StObject {
  
  /**
    * Indicates whether the user confirmation is necessary to confirm the device response.
    */
  var UserConfirmationNecessary: js.UndefOr[BooleanType] = js.native
}
object ConfirmDeviceResponse {
  
  @scala.inline
  def apply(): ConfirmDeviceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfirmDeviceResponse]
  }
  
  @scala.inline
  implicit class ConfirmDeviceResponseMutableBuilder[Self <: ConfirmDeviceResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUserConfirmationNecessary(value: BooleanType): Self = StObject.set(x, "UserConfirmationNecessary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserConfirmationNecessaryUndefined: Self = StObject.set(x, "UserConfirmationNecessary", js.undefined)
  }
}
