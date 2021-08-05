package typings.awsSdk.snsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSubscriptionsInput extends StObject {
  
  /**
    * Token returned by the previous ListSubscriptions request.
    */
  var NextToken: js.UndefOr[nextToken] = js.undefined
}
object ListSubscriptionsInput {
  
  inline def apply(): ListSubscriptionsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSubscriptionsInput]
  }
  
  extension [Self <: ListSubscriptionsInput](x: Self) {
    
    inline def setNextToken(value: nextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
