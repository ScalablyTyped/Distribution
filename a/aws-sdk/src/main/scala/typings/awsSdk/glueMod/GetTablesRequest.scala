package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTablesRequest extends js.Object {
  /**
    * The ID of the Data Catalog where the tables reside. If none is provided, the AWS account ID is used by default.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.native
  /**
    * The database in the catalog whose tables to list. For Hive compatibility, this name is entirely lowercase.
    */
  var DatabaseName: NameString = js.native
  /**
    * A regular expression pattern. If present, only those tables whose names match the pattern are returned.
    */
  var Expression: js.UndefOr[FilterString] = js.native
  /**
    * The maximum number of tables to return in a single response.
    */
  var MaxResults: js.UndefOr[PageSize] = js.native
  /**
    * A continuation token, included if this is a continuation call.
    */
  var NextToken: js.UndefOr[Token] = js.native
}

object GetTablesRequest {
  @scala.inline
  def apply(DatabaseName: NameString): GetTablesRequest = {
    val __obj = js.Dynamic.literal(DatabaseName = DatabaseName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTablesRequest]
  }
  @scala.inline
  implicit class GetTablesRequestOps[Self <: GetTablesRequest] (val x: Self) extends AnyVal {
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
    def setDatabaseName(value: NameString): Self = this.set("DatabaseName", value.asInstanceOf[js.Any])
    @scala.inline
    def setCatalogId(value: CatalogIdString): Self = this.set("CatalogId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCatalogId: Self = this.set("CatalogId", js.undefined)
    @scala.inline
    def setExpression(value: FilterString): Self = this.set("Expression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpression: Self = this.set("Expression", js.undefined)
    @scala.inline
    def setMaxResults(value: PageSize): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNextToken(value: Token): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

