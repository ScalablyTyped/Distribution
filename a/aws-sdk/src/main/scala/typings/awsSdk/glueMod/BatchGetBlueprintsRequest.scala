package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetBlueprintsRequest extends StObject {
  
  /**
    * Specifies whether or not to include the blueprint in the response.
    */
  var IncludeBlueprint: js.UndefOr[NullableBoolean] = js.undefined
  
  /**
    * Specifies whether or not to include the parameters, as a JSON string, for the blueprint in the response.
    */
  var IncludeParameterSpec: js.UndefOr[NullableBoolean] = js.undefined
  
  /**
    * A list of blueprint names.
    */
  var Names: BatchGetBlueprintNames
}
object BatchGetBlueprintsRequest {
  
  inline def apply(Names: BatchGetBlueprintNames): BatchGetBlueprintsRequest = {
    val __obj = js.Dynamic.literal(Names = Names.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetBlueprintsRequest]
  }
  
  extension [Self <: BatchGetBlueprintsRequest](x: Self) {
    
    inline def setIncludeBlueprint(value: NullableBoolean): Self = StObject.set(x, "IncludeBlueprint", value.asInstanceOf[js.Any])
    
    inline def setIncludeBlueprintUndefined: Self = StObject.set(x, "IncludeBlueprint", js.undefined)
    
    inline def setIncludeParameterSpec(value: NullableBoolean): Self = StObject.set(x, "IncludeParameterSpec", value.asInstanceOf[js.Any])
    
    inline def setIncludeParameterSpecUndefined: Self = StObject.set(x, "IncludeParameterSpec", js.undefined)
    
    inline def setNames(value: BatchGetBlueprintNames): Self = StObject.set(x, "Names", value.asInstanceOf[js.Any])
    
    inline def setNamesVarargs(value: OrchestrationNameString*): Self = StObject.set(x, "Names", js.Array(value*))
  }
}
