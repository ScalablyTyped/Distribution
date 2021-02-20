package typings.awsSdk.sesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListIdentitiesRequest extends StObject {
  
  /**
    * The type of the identities to list. Possible values are "EmailAddress" and "Domain". If this parameter is omitted, then all identities will be listed.
    */
  var IdentityType: js.UndefOr[typings.awsSdk.sesMod.IdentityType] = js.native
  
  /**
    * The maximum number of identities per page. Possible values are 1-1000 inclusive.
    */
  var MaxItems: js.UndefOr[typings.awsSdk.sesMod.MaxItems] = js.native
  
  /**
    * The token to use for pagination.
    */
  var NextToken: js.UndefOr[typings.awsSdk.sesMod.NextToken] = js.native
}
object ListIdentitiesRequest {
  
  @scala.inline
  def apply(): ListIdentitiesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListIdentitiesRequest]
  }
  
  @scala.inline
  implicit class ListIdentitiesRequestMutableBuilder[Self <: ListIdentitiesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIdentityType(value: IdentityType): Self = StObject.set(x, "IdentityType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentityTypeUndefined: Self = StObject.set(x, "IdentityType", js.undefined)
    
    @scala.inline
    def setMaxItems(value: MaxItems): Self = StObject.set(x, "MaxItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxItemsUndefined: Self = StObject.set(x, "MaxItems", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
