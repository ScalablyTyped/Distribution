package typings.awsSdk.frauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TrainingDataSchema extends StObject {
  
  var labelSchema: LabelSchema = js.native
  
  /**
    * The training data schema variables.
    */
  var modelVariables: ListOfStrings = js.native
}
object TrainingDataSchema {
  
  @scala.inline
  def apply(labelSchema: LabelSchema, modelVariables: ListOfStrings): TrainingDataSchema = {
    val __obj = js.Dynamic.literal(labelSchema = labelSchema.asInstanceOf[js.Any], modelVariables = modelVariables.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrainingDataSchema]
  }
  
  @scala.inline
  implicit class TrainingDataSchemaMutableBuilder[Self <: TrainingDataSchema] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabelSchema(value: LabelSchema): Self = StObject.set(x, "labelSchema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelVariables(value: ListOfStrings): Self = StObject.set(x, "modelVariables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelVariablesVarargs(value: String*): Self = StObject.set(x, "modelVariables", js.Array(value :_*))
  }
}
