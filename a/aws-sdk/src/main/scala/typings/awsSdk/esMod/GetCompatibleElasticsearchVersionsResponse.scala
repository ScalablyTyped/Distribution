package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCompatibleElasticsearchVersionsResponse extends js.Object {
  /**
    *  A map of compatible Elasticsearch versions returned as part of the  GetCompatibleElasticsearchVersions  operation. 
    */
  var CompatibleElasticsearchVersions: js.UndefOr[CompatibleElasticsearchVersionsList] = js.native
}

object GetCompatibleElasticsearchVersionsResponse {
  @scala.inline
  def apply(CompatibleElasticsearchVersions: CompatibleElasticsearchVersionsList = null): GetCompatibleElasticsearchVersionsResponse = {
    val __obj = js.Dynamic.literal()
    if (CompatibleElasticsearchVersions != null) __obj.updateDynamic("CompatibleElasticsearchVersions")(CompatibleElasticsearchVersions.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCompatibleElasticsearchVersionsResponse]
  }
}

