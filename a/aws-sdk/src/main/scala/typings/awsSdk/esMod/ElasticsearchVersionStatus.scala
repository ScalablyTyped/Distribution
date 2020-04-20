package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ElasticsearchVersionStatus extends js.Object {
  /**
    *  Specifies the Elasticsearch version for the specified Elasticsearch domain.
    */
  var Options: ElasticsearchVersionString = js.native
  /**
    *  Specifies the status of the Elasticsearch version options for the specified Elasticsearch domain.
    */
  var Status: OptionStatus = js.native
}

object ElasticsearchVersionStatus {
  @scala.inline
  def apply(Options: ElasticsearchVersionString, Status: OptionStatus): ElasticsearchVersionStatus = {
    val __obj = js.Dynamic.literal(Options = Options.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElasticsearchVersionStatus]
  }
}

