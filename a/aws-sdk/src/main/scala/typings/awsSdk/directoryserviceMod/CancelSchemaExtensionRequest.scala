package typings.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelSchemaExtensionRequest extends js.Object {
  /**
    * The identifier of the directory whose schema extension will be canceled.
    */
  var DirectoryId: typings.awsSdk.directoryserviceMod.DirectoryId = js.native
  /**
    * The identifier of the schema extension that will be canceled.
    */
  var SchemaExtensionId: typings.awsSdk.directoryserviceMod.SchemaExtensionId = js.native
}

object CancelSchemaExtensionRequest {
  @scala.inline
  def apply(DirectoryId: DirectoryId, SchemaExtensionId: SchemaExtensionId): CancelSchemaExtensionRequest = {
    val __obj = js.Dynamic.literal(DirectoryId = DirectoryId.asInstanceOf[js.Any], SchemaExtensionId = SchemaExtensionId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CancelSchemaExtensionRequest]
  }
}

