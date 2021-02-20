package typings.awsSdk.wafregionalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateWebACLResponse extends StObject {
  
  /**
    * The ChangeToken that you used to submit the UpdateWebACL request. You can also use this value to query the status of the request. For more information, see GetChangeTokenStatus.
    */
  var ChangeToken: js.UndefOr[typings.awsSdk.wafregionalMod.ChangeToken] = js.native
}
object UpdateWebACLResponse {
  
  @scala.inline
  def apply(): UpdateWebACLResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateWebACLResponse]
  }
  
  @scala.inline
  implicit class UpdateWebACLResponseMutableBuilder[Self <: UpdateWebACLResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChangeToken(value: ChangeToken): Self = StObject.set(x, "ChangeToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeTokenUndefined: Self = StObject.set(x, "ChangeToken", js.undefined)
  }
}
