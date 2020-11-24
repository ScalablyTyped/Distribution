package typings.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TrainingDataSchema extends js.Object {
  
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
  implicit class TrainingDataSchemaOps[Self <: TrainingDataSchema] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLabelSchema(value: LabelSchema): Self = this.set("labelSchema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelVariablesVarargs(value: String*): Self = this.set("modelVariables", js.Array(value :_*))
    
    @scala.inline
    def setModelVariables(value: ListOfStrings): Self = this.set("modelVariables", value.asInstanceOf[js.Any])
  }
}
