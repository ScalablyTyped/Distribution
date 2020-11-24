package typings.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeConnectionAliasesRequest extends js.Object {
  
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
  implicit class DescribeConnectionAliasesRequestOps[Self <: DescribeConnectionAliasesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAliasIdsVarargs(value: ConnectionAliasId*): Self = this.set("AliasIds", js.Array(value :_*))
    
    @scala.inline
    def setAliasIds(value: ConnectionAliasIdList): Self = this.set("AliasIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAliasIds: Self = this.set("AliasIds", js.undefined)
    
    @scala.inline
    def setLimit(value: Limit): Self = this.set("Limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimit: Self = this.set("Limit", js.undefined)
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setResourceId(value: NonEmptyString): Self = this.set("ResourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceId: Self = this.set("ResourceId", js.undefined)
  }
}
