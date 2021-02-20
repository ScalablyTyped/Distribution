package typings.awsSdk.workspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeConnectionAliasesRequest extends StObject {
  
  /**
    * The identifiers of the connection aliases to describe.
    */
  var AliasIds: js.UndefOr[ConnectionAliasIdList] = js.native
  
  /**
    * The maximum number of connection aliases to return.
    */
  var Limit: js.UndefOr[typings.awsSdk.workspacesMod.Limit] = js.native
  
  /**
    * If you received a NextToken from a previous call that was paginated, provide this token to receive the next set of results. 
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
  
  /**
    * The identifier of the directory associated with the connection alias.
    */
  var ResourceId: js.UndefOr[NonEmptyString] = js.native
}
object DescribeConnectionAliasesRequest {
  
  @scala.inline
  def apply(): DescribeConnectionAliasesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeConnectionAliasesRequest]
  }
  
  @scala.inline
  implicit class DescribeConnectionAliasesRequestMutableBuilder[Self <: DescribeConnectionAliasesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAliasIds(value: ConnectionAliasIdList): Self = StObject.set(x, "AliasIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAliasIdsUndefined: Self = StObject.set(x, "AliasIds", js.undefined)
    
    @scala.inline
    def setAliasIdsVarargs(value: ConnectionAliasId*): Self = StObject.set(x, "AliasIds", js.Array(value :_*))
    
    @scala.inline
    def setLimit(value: Limit): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setResourceId(value: NonEmptyString): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceIdUndefined: Self = StObject.set(x, "ResourceId", js.undefined)
  }
}
