package typings.awsSdk.codestarnotificationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTargetsResult extends StObject {
  
  /**
    * An enumeration token that can be used in a request to return the next batch of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.codestarnotificationsMod.NextToken] = js.undefined
  
  /**
    * The list of notification rule targets. 
    */
  var Targets: js.UndefOr[TargetsBatch] = js.undefined
}
object ListTargetsResult {
  
  inline def apply(): ListTargetsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTargetsResult]
  }
  
  extension [Self <: ListTargetsResult](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setTargets(value: TargetsBatch): Self = StObject.set(x, "Targets", value.asInstanceOf[js.Any])
    
    inline def setTargetsUndefined: Self = StObject.set(x, "Targets", js.undefined)
    
    inline def setTargetsVarargs(value: TargetSummary*): Self = StObject.set(x, "Targets", js.Array(value*))
  }
}
