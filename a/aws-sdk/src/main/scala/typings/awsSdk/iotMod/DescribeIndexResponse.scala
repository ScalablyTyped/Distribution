package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeIndexResponse extends js.Object {
  /**
    * The index name.
    */
  var indexName: js.UndefOr[IndexName] = js.native
  /**
    * The index status.
    */
  var indexStatus: js.UndefOr[IndexStatus] = js.native
  /**
    * Contains a value that specifies the type of indexing performed. Valid values are:   REGISTRY – Your thing index contains only registry data.   REGISTRY_AND_SHADOW - Your thing index contains registry data and shadow data.   REGISTRY_AND_CONNECTIVITY_STATUS - Your thing index contains registry data and thing connectivity status data.   REGISTRY_AND_SHADOW_AND_CONNECTIVITY_STATUS - Your thing index contains registry data, shadow data, and thing connectivity status data.  
    */
  var schema: js.UndefOr[IndexSchema] = js.native
}

object DescribeIndexResponse {
  @scala.inline
  def apply(indexName: IndexName = null, indexStatus: IndexStatus = null, schema: IndexSchema = null): DescribeIndexResponse = {
    val __obj = js.Dynamic.literal()
    if (indexName != null) __obj.updateDynamic("indexName")(indexName.asInstanceOf[js.Any])
    if (indexStatus != null) __obj.updateDynamic("indexStatus")(indexStatus.asInstanceOf[js.Any])
    if (schema != null) __obj.updateDynamic("schema")(schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeIndexResponse]
  }
}

