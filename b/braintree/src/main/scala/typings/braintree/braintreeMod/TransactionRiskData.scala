package typings.braintree.braintreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransactionRiskData extends js.Object {
  var decision: String
  var deviceDataCaptured: Boolean
  var fraudServiceProvider: String
  var id: String
}

object TransactionRiskData {
  @scala.inline
  def apply(decision: String, deviceDataCaptured: Boolean, fraudServiceProvider: String, id: String): TransactionRiskData = {
    val __obj = js.Dynamic.literal(decision = decision.asInstanceOf[js.Any], deviceDataCaptured = deviceDataCaptured.asInstanceOf[js.Any], fraudServiceProvider = fraudServiceProvider.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TransactionRiskData]
  }
}

