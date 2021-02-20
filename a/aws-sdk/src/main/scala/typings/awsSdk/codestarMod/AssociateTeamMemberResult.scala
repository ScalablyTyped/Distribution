package typings.awsSdk.codestarMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssociateTeamMemberResult extends StObject {
  
  /**
    * The user- or system-generated token from the initial request that can be used to repeat the request.
    */
  var clientRequestToken: js.UndefOr[ClientRequestToken] = js.native
}
object AssociateTeamMemberResult {
  
  @scala.inline
  def apply(): AssociateTeamMemberResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociateTeamMemberResult]
  }
  
  @scala.inline
  implicit class AssociateTeamMemberResultMutableBuilder[Self <: AssociateTeamMemberResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "clientRequestToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientRequestTokenUndefined: Self = StObject.set(x, "clientRequestToken", js.undefined)
  }
}
