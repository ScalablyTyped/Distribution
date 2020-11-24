package typings.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeConnectionAliasesResult extends js.Object {
  
  /**
    * Information about the specified connection aliases.
    */
  var ConnectionAliases: js.UndefOr[ConnectionAliasList] = js.native
  
  /**
    * The token to use to retrieve the next set of results, or null if no more results are available.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
}
object DescribeConnectionAliasesResult {
  
  @scala.inline
  def apply(): DescribeConnectionAliasesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeConnectionAliasesResult]
  }
  
  @scala.inline
  implicit class DescribeConnectionAliasesResultOps[Self <: DescribeConnectionAliasesResult] (val x: Self) extends AnyVal {
    
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
    def setConnectionAliasesVarargs(value: ConnectionAlias*): Self = this.set("ConnectionAliases", js.Array(value :_*))
    
    @scala.inline
    def setConnectionAliases(value: ConnectionAliasList): Self = this.set("ConnectionAliases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectionAliases: Self = this.set("ConnectionAliases", js.undefined)
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
