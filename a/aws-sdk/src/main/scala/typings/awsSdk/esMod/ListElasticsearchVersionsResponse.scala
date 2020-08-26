package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListElasticsearchVersionsResponse extends js.Object {
  var ElasticsearchVersions: js.UndefOr[ElasticsearchVersionList] = js.native
  var NextToken: js.UndefOr[typings.awsSdk.esMod.NextToken] = js.native
}

object ListElasticsearchVersionsResponse {
  @scala.inline
  def apply(): ListElasticsearchVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListElasticsearchVersionsResponse]
  }
  @scala.inline
  implicit class ListElasticsearchVersionsResponseOps[Self <: ListElasticsearchVersionsResponse] (val x: Self) extends AnyVal {
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
    def setElasticsearchVersionsVarargs(value: ElasticsearchVersionString*): Self = this.set("ElasticsearchVersions", js.Array(value :_*))
    @scala.inline
    def setElasticsearchVersions(value: ElasticsearchVersionList): Self = this.set("ElasticsearchVersions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElasticsearchVersions: Self = this.set("ElasticsearchVersions", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

