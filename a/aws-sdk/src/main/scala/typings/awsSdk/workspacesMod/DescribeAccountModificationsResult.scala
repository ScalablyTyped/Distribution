package typings.awsSdk.workspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeAccountModificationsResult extends StObject {
  
  /**
    * The list of modifications to the configuration of BYOL.
    */
  var AccountModifications: js.UndefOr[AccountModificationList] = js.native
  
  /**
    * The token to use to retrieve the next set of results, or null if no more results are available.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
}
object DescribeAccountModificationsResult {
  
  @scala.inline
  def apply(): DescribeAccountModificationsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAccountModificationsResult]
  }
  
  @scala.inline
  implicit class DescribeAccountModificationsResultMutableBuilder[Self <: DescribeAccountModificationsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountModifications(value: AccountModificationList): Self = StObject.set(x, "AccountModifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountModificationsUndefined: Self = StObject.set(x, "AccountModifications", js.undefined)
    
    @scala.inline
    def setAccountModificationsVarargs(value: AccountModification*): Self = StObject.set(x, "AccountModifications", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
