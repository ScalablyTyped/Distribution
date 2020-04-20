package typings.awsSdk.schemasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteSchemaRequest extends js.Object {
  var RegistryName: string = js.native
  var SchemaName: string = js.native
}

object DeleteSchemaRequest {
  @scala.inline
  def apply(RegistryName: string, SchemaName: string): DeleteSchemaRequest = {
    val __obj = js.Dynamic.literal(RegistryName = RegistryName.asInstanceOf[js.Any], SchemaName = SchemaName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSchemaRequest]
  }
}

