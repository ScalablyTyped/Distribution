package typings.awsSdk.mqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteBrokerResponse extends js.Object {
  /**
    * The unique ID that Amazon MQ generates for the broker.
    */
  var BrokerId: js.UndefOr[string] = js.native
}

object DeleteBrokerResponse {
  @scala.inline
  def apply(BrokerId: string = null): DeleteBrokerResponse = {
    val __obj = js.Dynamic.literal()
    if (BrokerId != null) __obj.updateDynamic("BrokerId")(BrokerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteBrokerResponse]
  }
}

