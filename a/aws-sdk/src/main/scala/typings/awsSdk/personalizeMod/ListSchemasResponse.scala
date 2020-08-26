package typings.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListSchemasResponse extends js.Object {
  /**
    * A token used to get the next set of schemas (if they exist).
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * A list of schemas.
    */
  var schemas: js.UndefOr[Schemas] = js.native
}

object ListSchemasResponse {
  @scala.inline
  def apply(): ListSchemasResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSchemasResponse]
  }
  @scala.inline
  implicit class ListSchemasResponseOps[Self <: ListSchemasResponse] (val x: Self) extends AnyVal {
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
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    @scala.inline
    def setSchemasVarargs(value: DatasetSchemaSummary*): Self = this.set("schemas", js.Array(value :_*))
    @scala.inline
    def setSchemas(value: Schemas): Self = this.set("schemas", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSchemas: Self = this.set("schemas", js.undefined)
  }
  
}

