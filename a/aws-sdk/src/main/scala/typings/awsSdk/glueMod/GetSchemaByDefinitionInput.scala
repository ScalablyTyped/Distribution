package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSchemaByDefinitionInput extends js.Object {
  
  /**
    * The definition of the schema for which schema details are required.
    */
  var SchemaDefinition: SchemaDefinitionString = js.native
  
  /**
    * This is a wrapper structure to contain schema identity fields. The structure contains:   SchemaId$SchemaArn: The Amazon Resource Name (ARN) of the schema. One of SchemaArn or SchemaName has to be provided.   SchemaId$SchemaName: The name of the schema. One of SchemaArn or SchemaName has to be provided.  
    */
  var SchemaId: typings.awsSdk.glueMod.SchemaId = js.native
}
object GetSchemaByDefinitionInput {
  
  @scala.inline
  def apply(SchemaDefinition: SchemaDefinitionString, SchemaId: SchemaId): GetSchemaByDefinitionInput = {
    val __obj = js.Dynamic.literal(SchemaDefinition = SchemaDefinition.asInstanceOf[js.Any], SchemaId = SchemaId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSchemaByDefinitionInput]
  }
  
  @scala.inline
  implicit class GetSchemaByDefinitionInputOps[Self <: GetSchemaByDefinitionInput] (val x: Self) extends AnyVal {
    
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
