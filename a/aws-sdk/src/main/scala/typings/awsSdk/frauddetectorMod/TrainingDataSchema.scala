package typings.awsSdk.frauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrainingDataSchema extends StObject {
  
  var labelSchema: LabelSchema
  
  /**
    * The training data schema variables.
    */
  var modelVariables: ListOfStrings
}
object TrainingDataSchema {
  
  inline def apply(labelSchema: LabelSchema, modelVariables: ListOfStrings): TrainingDataSchema = {
    val __obj = js.Dynamic.literal(labelSchema = labelSchema.asInstanceOf[js.Any], modelVariables = modelVariables.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrainingDataSchema]
  }
  
  extension [Self <: TrainingDataSchema](x: Self) {
    
    inline def setLabelSchema(value: LabelSchema): Self = StObject.set(x, "labelSchema", value.asInstanceOf[js.Any])
    
    inline def setModelVariables(value: ListOfStrings): Self = StObject.set(x, "modelVariables", value.asInstanceOf[js.Any])
    
    inline def setModelVariablesVarargs(value: String*): Self = StObject.set(x, "modelVariables", js.Array(value :_*))
  }
}
