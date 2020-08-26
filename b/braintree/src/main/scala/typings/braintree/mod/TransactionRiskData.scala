package typings.braintree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransactionRiskData extends js.Object {
  var decision: String = js.native
  var deviceDataCaptured: Boolean = js.native
  var fraudServiceProvider: String = js.native
  var id: String = js.native
}

object TransactionRiskData {
  @scala.inline
  def apply(decision: String, deviceDataCaptured: Boolean, fraudServiceProvider: String, id: String): TransactionRiskData = {
    val __obj = js.Dynamic.literal(decision = decision.asInstanceOf[js.Any], deviceDataCaptured = deviceDataCaptured.asInstanceOf[js.Any], fraudServiceProvider = fraudServiceProvider.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransactionRiskData]
  }
  @scala.inline
  implicit class TransactionRiskDataOps[Self <: TransactionRiskData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDecision(value: String): Self = this.set("decision", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeviceDataCaptured(value: Boolean): Self = this.set("deviceDataCaptured", value.asInstanceOf[js.Any])
    @scala.inline
    def setFraudServiceProvider(value: String): Self = this.set("fraudServiceProvider", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
  }
  
}

