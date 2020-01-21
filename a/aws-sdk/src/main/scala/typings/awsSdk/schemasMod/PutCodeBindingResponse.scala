package typings.awsSdk.schemasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutCodeBindingResponse extends js.Object {
  /**
    * The time and date that the code binding was created.
    */
  var CreationDate: js.UndefOr[timestampIso8601] = js.native
  /**
    * The date and time that code bindings were modified.
    */
  var LastModified: js.UndefOr[timestampIso8601] = js.native
  /**
    * The version number of the schema.
    */
  var SchemaVersion: js.UndefOr[string] = js.native
  /**
    * The current status of code binding generation.
    */
  var Status: js.UndefOr[CodeGenerationStatus] = js.native
}

object PutCodeBindingResponse {
  @scala.inline
  def apply(
    CreationDate: timestampIso8601 = null,
    LastModified: timestampIso8601 = null,
    SchemaVersion: string = null,
    Status: CodeGenerationStatus = null
  ): PutCodeBindingResponse = {
    val __obj = js.Dynamic.literal()
    if (CreationDate != null) __obj.updateDynamic("CreationDate")(CreationDate.asInstanceOf[js.Any])
    if (LastModified != null) __obj.updateDynamic("LastModified")(LastModified.asInstanceOf[js.Any])
    if (SchemaVersion != null) __obj.updateDynamic("SchemaVersion")(SchemaVersion.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutCodeBindingResponse]
  }
}

