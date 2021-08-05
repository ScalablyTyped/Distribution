package typings.awsSdk.cloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTypesOutput extends StObject {
  
  /**
    * If the request doesn't return all of the remaining results, NextToken is set to a token. To retrieve the next set of results, call this action again and assign that token to the request object's NextToken parameter. If the request returns all results, NextToken is set to null.
    */
  var NextToken: js.UndefOr[typings.awsSdk.cloudformationMod.NextToken] = js.undefined
  
  /**
    * A list of TypeSummary structures that contain information about the specified types.
    */
  var TypeSummaries: js.UndefOr[typings.awsSdk.cloudformationMod.TypeSummaries] = js.undefined
}
object ListTypesOutput {
  
  inline def apply(): ListTypesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTypesOutput]
  }
  
  extension [Self <: ListTypesOutput](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setTypeSummaries(value: TypeSummaries): Self = StObject.set(x, "TypeSummaries", value.asInstanceOf[js.Any])
    
    inline def setTypeSummariesUndefined: Self = StObject.set(x, "TypeSummaries", js.undefined)
    
    inline def setTypeSummariesVarargs(value: TypeSummary*): Self = StObject.set(x, "TypeSummaries", js.Array(value :_*))
  }
}
