package typings.awsSdk.sesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListEmailIdentitiesResponse extends StObject {
  
  /**
    * An array that includes all of the email identities associated with your AWS account.
    */
  var EmailIdentities: js.UndefOr[IdentityInfoList] = js.native
  
  /**
    * A token that indicates that there are additional configuration sets to list. To view additional configuration sets, issue another request to ListEmailIdentities, and pass this token in the NextToken parameter.
    */
  var NextToken: js.UndefOr[typings.awsSdk.sesv2Mod.NextToken] = js.native
}
object ListEmailIdentitiesResponse {
  
  @scala.inline
  def apply(): ListEmailIdentitiesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListEmailIdentitiesResponse]
  }
  
  @scala.inline
  implicit class ListEmailIdentitiesResponseMutableBuilder[Self <: ListEmailIdentitiesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmailIdentities(value: IdentityInfoList): Self = StObject.set(x, "EmailIdentities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailIdentitiesUndefined: Self = StObject.set(x, "EmailIdentities", js.undefined)
    
    @scala.inline
    def setEmailIdentitiesVarargs(value: IdentityInfo*): Self = StObject.set(x, "EmailIdentities", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
