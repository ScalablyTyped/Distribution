package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribePrefixListsResult extends StObject {
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * All available prefix lists.
    */
  var PrefixLists: js.UndefOr[PrefixListSet] = js.undefined
}
object DescribePrefixListsResult {
  
  inline def apply(): DescribePrefixListsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribePrefixListsResult]
  }
  
  extension [Self <: DescribePrefixListsResult](x: Self) {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setPrefixLists(value: PrefixListSet): Self = StObject.set(x, "PrefixLists", value.asInstanceOf[js.Any])
    
    inline def setPrefixListsUndefined: Self = StObject.set(x, "PrefixLists", js.undefined)
    
    inline def setPrefixListsVarargs(value: PrefixList*): Self = StObject.set(x, "PrefixLists", js.Array(value :_*))
  }
}
