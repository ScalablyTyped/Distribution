package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ElasticsearchClusterConfigStatus extends js.Object {
  /**
    *  Specifies the cluster configuration for the specified Elasticsearch domain.
    */
  var Options: ElasticsearchClusterConfig = js.native
  /**
    *  Specifies the status of the configuration for the specified Elasticsearch domain.
    */
  var Status: OptionStatus = js.native
}

object ElasticsearchClusterConfigStatus {
  @scala.inline
  def apply(Options: ElasticsearchClusterConfig, Status: OptionStatus): ElasticsearchClusterConfigStatus = {
    val __obj = js.Dynamic.literal(Options = Options.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElasticsearchClusterConfigStatus]
  }
}

