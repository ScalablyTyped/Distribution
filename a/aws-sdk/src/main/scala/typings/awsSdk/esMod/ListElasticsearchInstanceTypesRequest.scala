package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListElasticsearchInstanceTypesRequest extends js.Object {
  /**
    * DomainName represents the name of the Domain that we are trying to modify. This should be present only if we are querying for list of available Elasticsearch instance types when modifying existing domain. 
    */
  var DomainName: js.UndefOr[typings.awsSdk.esMod.DomainName] = js.native
  /**
    * Version of Elasticsearch for which list of supported elasticsearch instance types are needed. 
    */
  var ElasticsearchVersion: ElasticsearchVersionString = js.native
  /**
    *  Set this value to limit the number of results returned. Value provided must be greater than 30 else it wont be honored. 
    */
  var MaxResults: js.UndefOr[typings.awsSdk.esMod.MaxResults] = js.native
  /**
    * NextToken should be sent in case if earlier API call produced result containing NextToken. It is used for pagination. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.esMod.NextToken] = js.native
}

object ListElasticsearchInstanceTypesRequest {
  @scala.inline
  def apply(
    ElasticsearchVersion: ElasticsearchVersionString,
    DomainName: DomainName = null,
    MaxResults: js.UndefOr[MaxResults] = js.undefined,
    NextToken: NextToken = null
  ): ListElasticsearchInstanceTypesRequest = {
    val __obj = js.Dynamic.literal(ElasticsearchVersion = ElasticsearchVersion.asInstanceOf[js.Any])
    if (DomainName != null) __obj.updateDynamic("DomainName")(DomainName.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults.get.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListElasticsearchInstanceTypesRequest]
  }
}

