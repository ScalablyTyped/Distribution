package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListIndicesResponse extends js.Object {
  /**
    * The index names.
    */
  var indexNames: js.UndefOr[IndexNamesList] = js.native
  /**
    * The token used to get the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object ListIndicesResponse {
  @scala.inline
  def apply(): ListIndicesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListIndicesResponse]
  }
  @scala.inline
  implicit class ListIndicesResponseOps[Self <: ListIndicesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIndexNamesVarargs(value: IndexName*): Self = this.set("indexNames", js.Array(value :_*))
    @scala.inline
    def setIndexNames(value: IndexNamesList): Self = this.set("indexNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndexNames: Self = this.set("indexNames", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
  
}

