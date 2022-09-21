package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetBlueprintsResponse extends StObject {
  
  /**
    * Returns a list of blueprint as a Blueprints object.
    */
  var Blueprints: js.UndefOr[typings.awsSdk.glueMod.Blueprints] = js.undefined
  
  /**
    * Returns a list of BlueprintNames that were not found.
    */
  var MissingBlueprints: js.UndefOr[BlueprintNames] = js.undefined
}
object BatchGetBlueprintsResponse {
  
  inline def apply(): BatchGetBlueprintsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetBlueprintsResponse]
  }
  
  extension [Self <: BatchGetBlueprintsResponse](x: Self) {
    
    inline def setBlueprints(value: Blueprints): Self = StObject.set(x, "Blueprints", value.asInstanceOf[js.Any])
    
    inline def setBlueprintsUndefined: Self = StObject.set(x, "Blueprints", js.undefined)
    
    inline def setBlueprintsVarargs(value: Blueprint*): Self = StObject.set(x, "Blueprints", js.Array(value*))
    
    inline def setMissingBlueprints(value: BlueprintNames): Self = StObject.set(x, "MissingBlueprints", value.asInstanceOf[js.Any])
    
    inline def setMissingBlueprintsUndefined: Self = StObject.set(x, "MissingBlueprints", js.undefined)
    
    inline def setMissingBlueprintsVarargs(value: OrchestrationNameString*): Self = StObject.set(x, "MissingBlueprints", js.Array(value*))
  }
}
