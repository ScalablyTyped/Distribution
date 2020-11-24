package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSchemaVersionsDiffInput extends js.Object {
  
  /**
    * The first of the two schema versions to be compared.
    */
  var FirstSchemaVersionNumber: SchemaVersionNumber = js.native
  
  /**
    * Refers to SYNTAX_DIFF, which is the currently supported diff type.
    */
  var SchemaDiffType: typings.awsSdk.glueMod.SchemaDiffType = js.native
  
  /**
    * This is a wrapper structure to contain schema identity fields. The structure contains:   SchemaId$SchemaArn: The Amazon Resource Name (ARN) of the schema. One of SchemaArn or SchemaName has to be provided.   SchemaId$SchemaName: The name of the schema. One of SchemaArn or SchemaName has to be provided.  
    */
  var SchemaId: typings.awsSdk.glueMod.SchemaId = js.native
  
  /**
    * The second of the two schema versions to be compared.
    */
  var SecondSchemaVersionNumber: SchemaVersionNumber = js.native
}
object GetSchemaVersionsDiffInput {
  
  @scala.inline
  def apply(
    FirstSchemaVersionNumber: SchemaVersionNumber,
    SchemaDiffType: SchemaDiffType,
    SchemaId: SchemaId,
    SecondSchemaVersionNumber: SchemaVersionNumber
  ): GetSchemaVersionsDiffInput = {
    val __obj = js.Dynamic.literal(FirstSchemaVersionNumber = FirstSchemaVersionNumber.asInstanceOf[js.Any], SchemaDiffType = SchemaDiffType.asInstanceOf[js.Any], SchemaId = SchemaId.asInstanceOf[js.Any], SecondSchemaVersionNumber = SecondSchemaVersionNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSchemaVersionsDiffInput]
  }
  
  @scala.inline
  implicit class GetSchemaVersionsDiffInputOps[Self <: GetSchemaVersionsDiffInput] (val x: Self) extends AnyVal {
    
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
    def setFirstSchemaVersionNumber(value: SchemaVersionNumber): Self = this.set("FirstSchemaVersionNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaDiffType(value: SchemaDiffType): Self = this.set("SchemaDiffType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaId(value: SchemaId): Self = this.set("SchemaId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondSchemaVersionNumber(value: SchemaVersionNumber): Self = this.set("SecondSchemaVersionNumber", value.asInstanceOf[js.Any])
  }
}
