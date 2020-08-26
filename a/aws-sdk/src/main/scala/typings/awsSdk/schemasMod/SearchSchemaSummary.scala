package typings.awsSdk.schemasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchSchemaSummary extends js.Object {
  /**
    * The name of the registry.
    */
  var RegistryName: js.UndefOr[string] = js.native
  /**
    * The ARN of the schema.
    */
  var SchemaArn: js.UndefOr[string] = js.native
  /**
    * The name of the schema.
    */
  var SchemaName: js.UndefOr[string] = js.native
  /**
    * An array of schema version summaries.
    */
  var SchemaVersions: js.UndefOr[listOfSearchSchemaVersionSummary] = js.native
}

object SearchSchemaSummary {
  @scala.inline
  def apply(): SearchSchemaSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchSchemaSummary]
  }
  @scala.inline
  implicit class SearchSchemaSummaryOps[Self <: SearchSchemaSummary] (val x: Self) extends AnyVal {
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
    def deleteRegistryName: Self = this.set("RegistryName", js.undefined)
    @scala.inline
    def setSchemaArn(value: string): Self = this.set("SchemaArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSchemaArn: Self = this.set("SchemaArn", js.undefined)
    @scala.inline
    def setSchemaName(value: string): Self = this.set("SchemaName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSchemaName: Self = this.set("SchemaName", js.undefined)
    @scala.inline
    def setSchemaVersionsVarargs(value: SearchSchemaVersionSummary*): Self = this.set("SchemaVersions", js.Array(value :_*))
    @scala.inline
    def setSchemaVersions(value: listOfSearchSchemaVersionSummary): Self = this.set("SchemaVersions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSchemaVersions: Self = this.set("SchemaVersions", js.undefined)
  }
  
}

