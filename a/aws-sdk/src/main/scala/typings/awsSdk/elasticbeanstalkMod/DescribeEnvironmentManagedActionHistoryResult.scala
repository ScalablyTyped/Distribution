package typings.awsSdk.elasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeEnvironmentManagedActionHistoryResult extends StObject {
  
  /**
    * A list of completed and failed managed actions.
    */
  var ManagedActionHistoryItems: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.ManagedActionHistoryItems] = js.undefined
  
  /**
    * A pagination token that you pass to DescribeEnvironmentManagedActionHistory to get the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object DescribeEnvironmentManagedActionHistoryResult {
  
  inline def apply(): DescribeEnvironmentManagedActionHistoryResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEnvironmentManagedActionHistoryResult]
  }
  
  extension [Self <: DescribeEnvironmentManagedActionHistoryResult](x: Self) {
    
    inline def setManagedActionHistoryItems(value: ManagedActionHistoryItems): Self = StObject.set(x, "ManagedActionHistoryItems", value.asInstanceOf[js.Any])
    
    inline def setManagedActionHistoryItemsUndefined: Self = StObject.set(x, "ManagedActionHistoryItems", js.undefined)
    
    inline def setManagedActionHistoryItemsVarargs(value: ManagedActionHistoryItem*): Self = StObject.set(x, "ManagedActionHistoryItems", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
