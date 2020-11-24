package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateSchemaInput extends js.Object {
  
  /**
    * The new compatibility setting for the schema.
    */
  var Compatibility: js.UndefOr[typings.awsSdk.glueMod.Compatibility] = js.native
  
  /**
    * The new description for the schema.
    */
  var Description: js.UndefOr[DescriptionString] = js.native
  
  /**
    * This is a wrapper structure to contain schema identity fields. The structure contains:   SchemaId$SchemaArn: The Amazon Resource Name (ARN) of the schema. One of SchemaArn or SchemaName has to be provided.   SchemaId$SchemaName: The name of the schema. One of SchemaArn or SchemaName has to be provided.  
    */
  var SchemaId: typings.awsSdk.glueMod.SchemaId = js.native
  
  /**
    * Version number required for check pointing. One of VersionNumber or Compatibility has to be provided.
    */
  var SchemaVersionNumber: js.UndefOr[typings.awsSdk.glueMod.SchemaVersionNumber] = js.native
}
object UpdateSchemaInput {
  
  @scala.inline
  def apply(SchemaId: SchemaId): UpdateSchemaInput = {
    val __obj = js.Dynamic.literal(SchemaId = SchemaId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSchemaInput]
  }
  
  @scala.inline
  implicit class UpdateSchemaInputOps[Self <: UpdateSchemaInput] (val x: Self) extends AnyVal {
    
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
    def setSchemaId(value: SchemaId): Self = this.set("SchemaId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompatibility(value: Compatibility): Self = this.set("Compatibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompatibility: Self = this.set("Compatibility", js.undefined)
    
    @scala.inline
    def setDescription(value: DescriptionString): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setSchemaVersionNumber(value: SchemaVersionNumber): Self = this.set("SchemaVersionNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchemaVersionNumber: Self = this.set("SchemaVersionNumber", js.undefined)
  }
}
