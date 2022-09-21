package typings.awsSdk.workspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeConnectionAliasesResult extends StObject {
  
  /**
    * Information about the specified connection aliases.
    */
  var ConnectionAliases: js.UndefOr[ConnectionAliasList] = js.undefined
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return. 
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
}
object DescribeConnectionAliasesResult {
  
  inline def apply(): DescribeConnectionAliasesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeConnectionAliasesResult]
  }
  
  extension [Self <: DescribeConnectionAliasesResult](x: Self) {
    
    inline def setConnectionAliases(value: ConnectionAliasList): Self = StObject.set(x, "ConnectionAliases", value.asInstanceOf[js.Any])
    
    inline def setConnectionAliasesUndefined: Self = StObject.set(x, "ConnectionAliases", js.undefined)
    
    inline def setConnectionAliasesVarargs(value: ConnectionAlias*): Self = StObject.set(x, "ConnectionAliases", js.Array(value*))
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
