package typings.awsSdk.schemasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteSchemaVersionRequest extends js.Object {
  var RegistryName: string = js.native
  var SchemaName: string = js.native
  var SchemaVersion: string = js.native
}

object DeleteSchemaVersionRequest {
  @scala.inline
  def apply(RegistryName: string, SchemaName: string, SchemaVersion: string): DeleteSchemaVersionRequest = {
    val __obj = js.Dynamic.literal(RegistryName = RegistryName.asInstanceOf[js.Any], SchemaName = SchemaName.asInstanceOf[js.Any], SchemaVersion = SchemaVersion.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteSchemaVersionRequest]
  }
}

