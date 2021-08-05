package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetOpsSummaryResult extends StObject {
  
  /**
    * The list of aggregated and filtered OpsItems.
    */
  var Entities: js.UndefOr[OpsEntityList] = js.undefined
  
  /**
    * The token for the next set of items to return. Use this token to get the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.ssmMod.NextToken] = js.undefined
}
object GetOpsSummaryResult {
  
  inline def apply(): GetOpsSummaryResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetOpsSummaryResult]
  }
  
  extension [Self <: GetOpsSummaryResult](x: Self) {
    
    inline def setEntities(value: OpsEntityList): Self = StObject.set(x, "Entities", value.asInstanceOf[js.Any])
    
    inline def setEntitiesUndefined: Self = StObject.set(x, "Entities", js.undefined)
    
    inline def setEntitiesVarargs(value: OpsEntity*): Self = StObject.set(x, "Entities", js.Array(value :_*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
