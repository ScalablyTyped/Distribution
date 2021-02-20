package typings.awsSdk.sesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListIdentitiesResponse extends StObject {
  
  /**
    * A list of identities.
    */
  var Identities: IdentityList = js.native
  
  /**
    * The token used for pagination.
    */
  var NextToken: js.UndefOr[typings.awsSdk.sesMod.NextToken] = js.native
}
object ListIdentitiesResponse {
  
  @scala.inline
  def apply(Identities: IdentityList): ListIdentitiesResponse = {
    val __obj = js.Dynamic.literal(Identities = Identities.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListIdentitiesResponse]
  }
  
  @scala.inline
  implicit class ListIdentitiesResponseMutableBuilder[Self <: ListIdentitiesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIdentities(value: IdentityList): Self = StObject.set(x, "Identities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentitiesVarargs(value: Identity*): Self = StObject.set(x, "Identities", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
