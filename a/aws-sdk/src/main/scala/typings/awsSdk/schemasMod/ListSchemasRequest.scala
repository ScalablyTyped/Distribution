package typings.awsSdk.schemasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListSchemasRequest extends js.Object {
  var Limit: js.UndefOr[integer] = js.native
  var NextToken: js.UndefOr[string] = js.native
  var RegistryName: string = js.native
  var SchemaNamePrefix: js.UndefOr[string] = js.native
}

object ListSchemasRequest {
  @scala.inline
  def apply(
    RegistryName: string,
    Limit: Int | Double = null,
    NextToken: string = null,
    SchemaNamePrefix: string = null
  ): ListSchemasRequest = {
    val __obj = js.Dynamic.literal(RegistryName = RegistryName.asInstanceOf[js.Any])
    if (Limit != null) __obj.updateDynamic("Limit")(Limit.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (SchemaNamePrefix != null) __obj.updateDynamic("SchemaNamePrefix")(SchemaNamePrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSchemasRequest]
  }
}

