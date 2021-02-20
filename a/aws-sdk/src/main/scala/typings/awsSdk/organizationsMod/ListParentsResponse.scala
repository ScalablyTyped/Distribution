package typings.awsSdk.organizationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListParentsResponse extends StObject {
  
  /**
    * If present, indicates that more output is available than is included in the current response. Use this value in the NextToken request parameter in a subsequent call to the operation to get the next part of the output. You should repeat this until the NextToken response element comes back as null.
    */
  var NextToken: js.UndefOr[typings.awsSdk.organizationsMod.NextToken] = js.native
  
  /**
    * A list of parents for the specified child account or OU.
    */
  var Parents: js.UndefOr[typings.awsSdk.organizationsMod.Parents] = js.native
}
object ListParentsResponse {
  
  @scala.inline
  def apply(): ListParentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListParentsResponse]
  }
  
  @scala.inline
  implicit class ListParentsResponseMutableBuilder[Self <: ListParentsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setParents(value: Parents): Self = StObject.set(x, "Parents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentsUndefined: Self = StObject.set(x, "Parents", js.undefined)
    
    @scala.inline
    def setParentsVarargs(value: Parent*): Self = StObject.set(x, "Parents", js.Array(value :_*))
  }
}
