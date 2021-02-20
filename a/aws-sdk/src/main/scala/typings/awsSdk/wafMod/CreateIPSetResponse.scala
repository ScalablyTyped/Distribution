package typings.awsSdk.wafMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateIPSetResponse extends StObject {
  
  /**
    * The ChangeToken that you used to submit the CreateIPSet request. You can also use this value to query the status of the request. For more information, see GetChangeTokenStatus.
    */
  var ChangeToken: js.UndefOr[typings.awsSdk.wafMod.ChangeToken] = js.native
  
  /**
    * The IPSet returned in the CreateIPSet response.
    */
  var IPSet: js.UndefOr[typings.awsSdk.wafMod.IPSet] = js.native
}
object CreateIPSetResponse {
  
  @scala.inline
  def apply(): CreateIPSetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateIPSetResponse]
  }
  
  @scala.inline
  implicit class CreateIPSetResponseMutableBuilder[Self <: CreateIPSetResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChangeToken(value: ChangeToken): Self = StObject.set(x, "ChangeToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeTokenUndefined: Self = StObject.set(x, "ChangeToken", js.undefined)
    
    @scala.inline
    def setIPSet(value: IPSet): Self = StObject.set(x, "IPSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIPSetUndefined: Self = StObject.set(x, "IPSet", js.undefined)
  }
}
