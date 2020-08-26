package typings.awsSdk.schemasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateSchemaResponse extends js.Object {
  /**
    * The description of the schema.
    */
  var Description: js.UndefOr[string] = js.native
  /**
    * The date and time that schema was modified.
    */
  var LastModified: js.UndefOr[timestampIso8601] = js.native
  /**
    * The ARN of the schema.
    */
  var SchemaArn: js.UndefOr[string] = js.native
  /**
    * The name of the schema.
    */
  var SchemaName: js.UndefOr[string] = js.native
  /**
    * The version number of the schema
    */
  var SchemaVersion: js.UndefOr[string] = js.native
  var Tags: js.UndefOr[typings.awsSdk.schemasMod.Tags] = js.native
  /**
    * The type of the schema.
    */
  var Type: js.UndefOr[string] = js.native
  /**
    * The date the schema version was created.
    */
  var VersionCreatedDate: js.UndefOr[timestampIso8601] = js.native
}

object CreateSchemaResponse {
  @scala.inline
  def apply(): CreateSchemaResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSchemaResponse]
  }
  @scala.inline
  implicit class CreateSchemaResponseOps[Self <: CreateSchemaResponse] (val x: Self) extends AnyVal {
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
    def setDescription(value: string): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setLastModified(value: timestampIso8601): Self = this.set("LastModified", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModified: Self = this.set("LastModified", js.undefined)
    @scala.inline
    def setSchemaArn(value: string): Self = this.set("SchemaArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSchemaArn: Self = this.set("SchemaArn", js.undefined)
    @scala.inline
    def setSchemaName(value: string): Self = this.set("SchemaName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSchemaName: Self = this.set("SchemaName", js.undefined)
    @scala.inline
    def setSchemaVersion(value: string): Self = this.set("SchemaVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSchemaVersion: Self = this.set("SchemaVersion", js.undefined)
    @scala.inline
    def setTags(value: Tags): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
    @scala.inline
    def setType(value: string): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
    @scala.inline
    def setVersionCreatedDate(value: timestampIso8601): Self = this.set("VersionCreatedDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersionCreatedDate: Self = this.set("VersionCreatedDate", js.undefined)
  }
  
}

