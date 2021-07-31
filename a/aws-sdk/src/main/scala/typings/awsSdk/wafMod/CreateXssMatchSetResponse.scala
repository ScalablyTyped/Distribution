package typings.awsSdk.wafMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateXssMatchSetResponse extends StObject {
  
  /**
    * The ChangeToken that you used to submit the CreateXssMatchSet request. You can also use this value to query the status of the request. For more information, see GetChangeTokenStatus.
    */
  var ChangeToken: js.UndefOr[typings.awsSdk.wafMod.ChangeToken] = js.undefined
  
  /**
    * An XssMatchSet.
    */
  var XssMatchSet: js.UndefOr[typings.awsSdk.wafMod.XssMatchSet] = js.undefined
}
object CreateXssMatchSetResponse {
  
  @scala.inline
  def apply(): CreateXssMatchSetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateXssMatchSetResponse]
  }
  
  @scala.inline
  implicit class CreateXssMatchSetResponseMutableBuilder[Self <: CreateXssMatchSetResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChangeToken(value: ChangeToken): Self = StObject.set(x, "ChangeToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeTokenUndefined: Self = StObject.set(x, "ChangeToken", js.undefined)
    
    @scala.inline
    def setXssMatchSet(value: XssMatchSet): Self = StObject.set(x, "XssMatchSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXssMatchSetUndefined: Self = StObject.set(x, "XssMatchSet", js.undefined)
  }
}
