package typings.awsSdk.cloudwatcheventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPartnerEventSourcesRequest extends StObject {
  
  /**
    * pecifying this limits the number of results returned by this operation. The operation also returns a NextToken which you can use in a subsequent operation to retrieve the next set of results.
    */
  var Limit: js.UndefOr[LimitMax100] = js.undefined
  
  /**
    * If you specify this, the results are limited to only those partner event sources that start with the string you specify.
    */
  var NamePrefix: PartnerEventSourceNamePrefix
  
  /**
    * The token returned by a previous call to this operation. Specifying this retrieves the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.cloudwatcheventsMod.NextToken] = js.undefined
}
object ListPartnerEventSourcesRequest {
  
  inline def apply(NamePrefix: PartnerEventSourceNamePrefix): ListPartnerEventSourcesRequest = {
    val __obj = js.Dynamic.literal(NamePrefix = NamePrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPartnerEventSourcesRequest]
  }
  
  extension [Self <: ListPartnerEventSourcesRequest](x: Self) {
    
    inline def setLimit(value: LimitMax100): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    inline def setNamePrefix(value: PartnerEventSourceNamePrefix): Self = StObject.set(x, "NamePrefix", value.asInstanceOf[js.Any])
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
