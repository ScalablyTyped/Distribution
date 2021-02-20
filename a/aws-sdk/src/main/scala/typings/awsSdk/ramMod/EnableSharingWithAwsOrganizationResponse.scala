package typings.awsSdk.ramMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnableSharingWithAwsOrganizationResponse extends StObject {
  
  /**
    * Indicates whether the request succeeded.
    */
  var returnValue: js.UndefOr[Boolean] = js.native
}
object EnableSharingWithAwsOrganizationResponse {
  
  @scala.inline
  def apply(): EnableSharingWithAwsOrganizationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnableSharingWithAwsOrganizationResponse]
  }
  
  @scala.inline
  implicit class EnableSharingWithAwsOrganizationResponseMutableBuilder[Self <: EnableSharingWithAwsOrganizationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReturnValue(value: Boolean): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnValueUndefined: Self = StObject.set(x, "returnValue", js.undefined)
  }
}
