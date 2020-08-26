package typings.awsSdk.schemasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListSchemaVersionsResponse extends js.Object {
  /**
    * The token that specifies the next page of results to return. To request the first page, leave NextToken empty. The token will expire in 24 hours, and cannot be shared with other accounts.
    */
  var NextToken: js.UndefOr[string] = js.native
  /**
    * An array of schema version summaries.
    */
  var SchemaVersions: js.UndefOr[listOfSchemaVersionSummary] = js.native
}

object ListSchemaVersionsResponse {
  @scala.inline
  def apply(): ListSchemaVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSchemaVersionsResponse]
  }
  @scala.inline
  implicit class ListSchemaVersionsResponseOps[Self <: ListSchemaVersionsResponse] (val x: Self) extends AnyVal {
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
    def setNextToken(value: string): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setSchemaVersionsVarargs(value: SchemaVersionSummary*): Self = this.set("SchemaVersions", js.Array(value :_*))
    @scala.inline
    def setSchemaVersions(value: listOfSchemaVersionSummary): Self = this.set("SchemaVersions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSchemaVersions: Self = this.set("SchemaVersions", js.undefined)
  }
  
}

