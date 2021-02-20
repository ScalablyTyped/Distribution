package typings.awsSdk.organizationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListChildrenResponse extends StObject {
  
  /**
    * The list of children of the specified parent container.
    */
  var Children: js.UndefOr[typings.awsSdk.organizationsMod.Children] = js.native
  
  /**
    * If present, indicates that more output is available than is included in the current response. Use this value in the NextToken request parameter in a subsequent call to the operation to get the next part of the output. You should repeat this until the NextToken response element comes back as null.
    */
  var NextToken: js.UndefOr[typings.awsSdk.organizationsMod.NextToken] = js.native
}
object ListChildrenResponse {
  
  @scala.inline
  def apply(): ListChildrenResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListChildrenResponse]
  }
  
  @scala.inline
  implicit class ListChildrenResponseMutableBuilder[Self <: ListChildrenResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: Children): Self = StObject.set(x, "Children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "Children", js.undefined)
    
    @scala.inline
    def setChildrenVarargs(value: Child*): Self = StObject.set(x, "Children", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
