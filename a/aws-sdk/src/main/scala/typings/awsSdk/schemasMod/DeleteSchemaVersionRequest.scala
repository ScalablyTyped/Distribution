package typings.awsSdk.schemasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteSchemaVersionRequest extends js.Object {
  
  /**
    * The name of the registry.
    */
  var RegistryName: string = js.native
  
  /**
    * The name of the schema.
    */
  var SchemaName: string = js.native
  
  /**
    * The version number of the schema
    */
  var SchemaVersion: string = js.native
}
object DeleteSchemaVersionRequest {
  
  @scala.inline
  def apply(RegistryName: string, SchemaName: string, SchemaVersion: string): DeleteSchemaVersionRequest = {
    val __obj = js.Dynamic.literal(RegistryName = RegistryName.asInstanceOf[js.Any], SchemaName = SchemaName.asInstanceOf[js.Any], SchemaVersion = SchemaVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSchemaVersionRequest]
  }
  
  @scala.inline
  implicit class DeleteSchemaVersionRequestOps[Self <: DeleteSchemaVersionRequest] (val x: Self) extends AnyVal {
    
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
    def setRegistryName(value: string): Self = this.set("RegistryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaName(value: string): Self = this.set("SchemaName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaVersion(value: string): Self = this.set("SchemaVersion", value.asInstanceOf[js.Any])
  }
}
