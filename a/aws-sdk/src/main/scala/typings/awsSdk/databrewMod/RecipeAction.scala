package typings.awsSdk.databrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecipeAction extends StObject {
  
  /**
    * The name of a valid DataBrew transformation to be performed on the data.
    */
  var Operation: typings.awsSdk.databrewMod.Operation
  
  /**
    * Contextual parameters for the transformation.
    */
  var Parameters: js.UndefOr[ParameterMap] = js.undefined
}
object RecipeAction {
  
  inline def apply(Operation: Operation): RecipeAction = {
    val __obj = js.Dynamic.literal(Operation = Operation.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecipeAction]
  }
  
  extension [Self <: RecipeAction](x: Self) {
    
    inline def setOperation(value: Operation): Self = StObject.set(x, "Operation", value.asInstanceOf[js.Any])
    
    inline def setParameters(value: ParameterMap): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "Parameters", js.undefined)
  }
}
