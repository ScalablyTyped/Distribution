package typings.awsSdk.schemasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeSchemaRequest extends js.Object {
  var RegistryName: string = js.native
  var SchemaName: string = js.native
  var SchemaVersion: js.UndefOr[string] = js.native
}

object DescribeSchemaRequest {
  @scala.inline
  def apply(RegistryName: string, SchemaName: string, SchemaVersion: string = null): DescribeSchemaRequest = {
    val __obj = js.Dynamic.literal(RegistryName = RegistryName.asInstanceOf[js.Any], SchemaName = SchemaName.asInstanceOf[js.Any])
    if (SchemaVersion != null) __obj.updateDynamic("SchemaVersion")(SchemaVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeSchemaRequest]
  }
}

