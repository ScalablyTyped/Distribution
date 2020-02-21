package typings.awsSdk.kafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListKafkaVersionsResponse extends js.Object {
  var KafkaVersions: js.UndefOr[listOfKafkaVersion] = js.native
  var NextToken: js.UndefOr[string] = js.native
}

object ListKafkaVersionsResponse {
  @scala.inline
  def apply(KafkaVersions: listOfKafkaVersion = null, NextToken: string = null): ListKafkaVersionsResponse = {
    val __obj = js.Dynamic.literal()
    if (KafkaVersions != null) __obj.updateDynamic("KafkaVersions")(KafkaVersions.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListKafkaVersionsResponse]
  }
}

