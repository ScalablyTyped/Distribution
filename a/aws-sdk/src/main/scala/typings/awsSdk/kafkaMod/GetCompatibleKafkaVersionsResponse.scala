package typings.awsSdk.kafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCompatibleKafkaVersionsResponse extends js.Object {
  /**
    * 
    A list of CompatibleKafkaVersion objects.
    
    */
  var CompatibleKafkaVersions: js.UndefOr[listOfCompatibleKafkaVersion] = js.native
}

object GetCompatibleKafkaVersionsResponse {
  @scala.inline
  def apply(CompatibleKafkaVersions: listOfCompatibleKafkaVersion = null): GetCompatibleKafkaVersionsResponse = {
    val __obj = js.Dynamic.literal()
    if (CompatibleKafkaVersions != null) __obj.updateDynamic("CompatibleKafkaVersions")(CompatibleKafkaVersions.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCompatibleKafkaVersionsResponse]
  }
}

