package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeManagedPrefixListsResult extends StObject {
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[typings.awsSdk.ec2Mod.NextToken] = js.undefined
  
  /**
    * Information about the prefix lists.
    */
  var PrefixLists: js.UndefOr[ManagedPrefixListSet] = js.undefined
}
object DescribeManagedPrefixListsResult {
  
  inline def apply(): DescribeManagedPrefixListsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeManagedPrefixListsResult]
  }
  
  extension [Self <: DescribeManagedPrefixListsResult](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setPrefixLists(value: ManagedPrefixListSet): Self = StObject.set(x, "PrefixLists", value.asInstanceOf[js.Any])
    
    inline def setPrefixListsUndefined: Self = StObject.set(x, "PrefixLists", js.undefined)
    
    inline def setPrefixListsVarargs(value: ManagedPrefixList*): Self = StObject.set(x, "PrefixLists", js.Array(value :_*))
  }
}
