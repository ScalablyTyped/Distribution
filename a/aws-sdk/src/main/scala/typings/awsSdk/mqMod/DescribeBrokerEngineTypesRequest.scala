package typings.awsSdk.mqMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeBrokerEngineTypesRequest extends StObject {
  
  /**
    * Filter response by engine type.
    */
  var EngineType: js.UndefOr[string] = js.undefined
  
  /**
    * The maximum number of engine types that Amazon MQ can return per page (20 by default). This value must be an integer from 5 to 100.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.mqMod.MaxResults] = js.undefined
  
  /**
    * The token that specifies the next page of results Amazon MQ should return. To request the first page, leave nextToken empty.
    */
  var NextToken: js.UndefOr[string] = js.undefined
}
object DescribeBrokerEngineTypesRequest {
  
  inline def apply(): DescribeBrokerEngineTypesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeBrokerEngineTypesRequest]
  }
  
  extension [Self <: DescribeBrokerEngineTypesRequest](x: Self) {
    
    inline def setEngineType(value: string): Self = StObject.set(x, "EngineType", value.asInstanceOf[js.Any])
    
    inline def setEngineTypeUndefined: Self = StObject.set(x, "EngineType", js.undefined)
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
