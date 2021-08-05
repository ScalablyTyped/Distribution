package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListV2LoggingLevelsRequest extends StObject {
  
  /**
    * The maximum number of results to return at one time.
    */
  var maxResults: js.UndefOr[SkyfallMaxResults] = js.undefined
  
  /**
    * To retrieve the next set of results, the nextToken value from a previous response; otherwise null to receive the first set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * The type of resource for which you are configuring logging. Must be THING_Group.
    */
  var targetType: js.UndefOr[LogTargetType] = js.undefined
}
object ListV2LoggingLevelsRequest {
  
  inline def apply(): ListV2LoggingLevelsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListV2LoggingLevelsRequest]
  }
  
  extension [Self <: ListV2LoggingLevelsRequest](x: Self) {
    
    inline def setMaxResults(value: SkyfallMaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setTargetType(value: LogTargetType): Self = StObject.set(x, "targetType", value.asInstanceOf[js.Any])
    
    inline def setTargetTypeUndefined: Self = StObject.set(x, "targetType", js.undefined)
  }
}
