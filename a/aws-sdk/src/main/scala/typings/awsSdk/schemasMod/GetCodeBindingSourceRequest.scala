package typings.awsSdk.schemasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCodeBindingSourceRequest extends js.Object {
  /**
    * The language of the code binding.
    */
  var Language: string = js.native
  /**
    * The name of the registry.
    */
  var RegistryName: string = js.native
  /**
    * The name of the schema.
    */
  var SchemaName: string = js.native
  /**
    * Specifying this limits the results to only this schema version.
    */
  var SchemaVersion: js.UndefOr[string] = js.native
}

object GetCodeBindingSourceRequest {
  @scala.inline
  def apply(Language: string, RegistryName: string, SchemaName: string, SchemaVersion: string = null): GetCodeBindingSourceRequest = {
    val __obj = js.Dynamic.literal(Language = Language.asInstanceOf[js.Any], RegistryName = RegistryName.asInstanceOf[js.Any], SchemaName = SchemaName.asInstanceOf[js.Any])
    if (SchemaVersion != null) __obj.updateDynamic("SchemaVersion")(SchemaVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCodeBindingSourceRequest]
  }
}

