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
  def apply(ElasticsearchVersions: ElasticsearchVersionList = null, NextToken: NextToken = null): ListElasticsearchVersionsResponse = {
    val __obj = js.Dynamic.literal()
    if (ElasticsearchVersions != null) __obj.updateDynamic("ElasticsearchVersions")(ElasticsearchVersions.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListElasticsearchVersionsResponse]
  }
}

