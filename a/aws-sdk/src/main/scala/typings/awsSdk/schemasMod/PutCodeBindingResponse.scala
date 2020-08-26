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
  def apply(): PutCodeBindingResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutCodeBindingResponse]
  }
  @scala.inline
  implicit class PutCodeBindingResponseOps[Self <: PutCodeBindingResponse] (val x: Self) extends AnyVal {
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
    def setCreationDate(value: timestampIso8601): Self = this.set("CreationDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationDate: Self = this.set("CreationDate", js.undefined)
    @scala.inline
    def setLastModified(value: timestampIso8601): Self = this.set("LastModified", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModified: Self = this.set("LastModified", js.undefined)
    @scala.inline
    def setSchemaVersion(value: string): Self = this.set("SchemaVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSchemaVersion: Self = this.set("SchemaVersion", js.undefined)
    @scala.inline
    def setStatus(value: CodeGenerationStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
  
}

