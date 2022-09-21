package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBlueprintRunsResponse extends StObject {
  
  /**
    * Returns a list of BlueprintRun objects.
    */
  var BlueprintRuns: js.UndefOr[typings.awsSdk.glueMod.BlueprintRuns] = js.undefined
  
  /**
    * A continuation token, if not all blueprint runs have been returned.
    */
  var NextToken: js.UndefOr[GenericString] = js.undefined
}
object GetBlueprintRunsResponse {
  
  inline def apply(): GetBlueprintRunsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBlueprintRunsResponse]
  }
  
  extension [Self <: GetBlueprintRunsResponse](x: Self) {
    
    inline def setBlueprintRuns(value: BlueprintRuns): Self = StObject.set(x, "BlueprintRuns", value.asInstanceOf[js.Any])
    
    inline def setBlueprintRunsUndefined: Self = StObject.set(x, "BlueprintRuns", js.undefined)
    
    inline def setBlueprintRunsVarargs(value: BlueprintRun*): Self = StObject.set(x, "BlueprintRuns", js.Array(value*))
    
    inline def setNextToken(value: GenericString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
