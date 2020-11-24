package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegisterSchemaVersionInput extends js.Object {
  
  /**
    * The schema definition using the DataFormat setting for the SchemaName.
    */
  var SchemaDefinition: SchemaDefinitionString = js.native
  
  /**
    * This is a wrapper structure to contain schema identity fields. The structure contains:   SchemaId$SchemaArn: The Amazon Resource Name (ARN) of the schema. Either SchemaArn or SchemaName and RegistryName has to be provided.   SchemaId$SchemaName: The name of the schema. Either SchemaArn or SchemaName and RegistryName has to be provided.  
    */
  var SchemaId: typings.awsSdk.glueMod.SchemaId = js.native
}
object RegisterSchemaVersionInput {
  
  @scala.inline
  def apply(SchemaDefinition: SchemaDefinitionString, SchemaId: SchemaId): RegisterSchemaVersionInput = {
    val __obj = js.Dynamic.literal(SchemaDefinition = SchemaDefinition.asInstanceOf[js.Any], SchemaId = SchemaId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterSchemaVersionInput]
  }
  
  @scala.inline
  implicit class RegisterSchemaVersionInputOps[Self <: RegisterSchemaVersionInput] (val x: Self) extends AnyVal {
    
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
    def setSchemaDefinition(value: SchemaDefinitionString): Self = this.set("SchemaDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaId(value: SchemaId): Self = this.set("SchemaId", value.asInstanceOf[js.Any])
  }
}
