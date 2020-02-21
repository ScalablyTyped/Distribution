package typings.awsSdk.kafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KafkaVersion extends js.Object {
  var Status: js.UndefOr[KafkaVersionStatus] = js.native
  var Version: js.UndefOr[string] = js.native
}

object KafkaVersion {
  @scala.inline
  def apply(Status: KafkaVersionStatus = null, Version: string = null): KafkaVersion = {
    val __obj = js.Dynamic.literal()
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (Version != null) __obj.updateDynamic("Version")(Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[KafkaVersion]
  }
}

