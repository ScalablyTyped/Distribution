package typings.awsSdk.workspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeConnectionAliasesResult extends StObject {
  
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
  implicit class DescribeConnectionAliasesResultMutableBuilder[Self <: DescribeConnectionAliasesResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnectionAliases(value: ConnectionAliasList): Self = StObject.set(x, "ConnectionAliases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionAliasesUndefined: Self = StObject.set(x, "ConnectionAliases", js.undefined)
    
    @scala.inline
    def setConnectionAliasesVarargs(value: ConnectionAlias*): Self = StObject.set(x, "ConnectionAliases", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
