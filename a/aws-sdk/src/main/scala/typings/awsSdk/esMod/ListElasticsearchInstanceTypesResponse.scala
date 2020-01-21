package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListElasticsearchInstanceTypesResponse extends js.Object {
  /**
    *  List of instance types supported by Amazon Elasticsearch service for given  ElasticsearchVersion  
    */
  var ElasticsearchInstanceTypes: js.UndefOr[ElasticsearchInstanceTypeList] = js.native
  /**
    * In case if there are more results available NextToken would be present, make further request to the same API with received NextToken to paginate remaining results. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.esMod.NextToken] = js.native
}

object ListElasticsearchInstanceTypesResponse {
  @scala.inline
  def apply(ElasticsearchInstanceTypes: ElasticsearchInstanceTypeList = null, NextToken: NextToken = null): ListElasticsearchInstanceTypesResponse = {
    val __obj = js.Dynamic.literal()
    if (ElasticsearchInstanceTypes != null) __obj.updateDynamic("ElasticsearchInstanceTypes")(ElasticsearchInstanceTypes.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListElasticsearchInstanceTypesResponse]
  }
}

