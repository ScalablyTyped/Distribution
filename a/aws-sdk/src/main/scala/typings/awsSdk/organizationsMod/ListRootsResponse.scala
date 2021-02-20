package typings.awsSdk.organizationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListRootsResponse extends StObject {
  
  /**
    * If present, indicates that more output is available than is included in the current response. Use this value in the NextToken request parameter in a subsequent call to the operation to get the next part of the output. You should repeat this until the NextToken response element comes back as null.
    */
  var NextToken: js.UndefOr[typings.awsSdk.organizationsMod.NextToken] = js.native
  
  /**
    * A list of roots that are defined in an organization.
    */
  var Roots: js.UndefOr[typings.awsSdk.organizationsMod.Roots] = js.native
}
object ListRootsResponse {
  
  @scala.inline
  def apply(): ListRootsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRootsResponse]
  }
  
  @scala.inline
  implicit class ListRootsResponseMutableBuilder[Self <: ListRootsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setRoots(value: Roots): Self = StObject.set(x, "Roots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootsUndefined: Self = StObject.set(x, "Roots", js.undefined)
    
    @scala.inline
    def setRootsVarargs(value: Root*): Self = StObject.set(x, "Roots", js.Array(value :_*))
  }
}
