package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CheckSchemaVersionValidityInput extends js.Object {
  
  /**
    * The data format of the schema definition. Currently only AVRO is supported.
    */
  var DataFormat: typings.awsSdk.glueMod.DataFormat = js.native
  
  /**
    * The definition of the schema that has to be validated.
    */
  var SchemaDefinition: SchemaDefinitionString = js.native
}
object CheckSchemaVersionValidityInput {
  
  @scala.inline
  def apply(DataFormat: DataFormat, SchemaDefinition: SchemaDefinitionString): CheckSchemaVersionValidityInput = {
    val __obj = js.Dynamic.literal(DataFormat = DataFormat.asInstanceOf[js.Any], SchemaDefinition = SchemaDefinition.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckSchemaVersionValidityInput]
  }
  
  @scala.inline
  implicit class CheckSchemaVersionValidityInputOps[Self <: CheckSchemaVersionValidityInput] (val x: Self) extends AnyVal {
    
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
    def setDataFormat(value: DataFormat): Self = this.set("DataFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaDefinition(value: SchemaDefinitionString): Self = this.set("SchemaDefinition", value.asInstanceOf[js.Any])
  }
}
