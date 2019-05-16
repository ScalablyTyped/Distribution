package typings
package braintreeLib.braintreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransactionRiskData extends js.Object {
  var decision: java.lang.String
  var deviceDataCaptured: scala.Boolean
  var fraudServiceProvider: java.lang.String
  var id: java.lang.String
}

object TransactionRiskData {
  @scala.inline
  def apply(
    decision: java.lang.String,
    deviceDataCaptured: scala.Boolean,
    fraudServiceProvider: java.lang.String,
    id: java.lang.String
  ): TransactionRiskData = {
    val __obj = js.Dynamic.literal(decision = decision, deviceDataCaptured = deviceDataCaptured, fraudServiceProvider = fraudServiceProvider, id = id)
  
    __obj.asInstanceOf[TransactionRiskData]
  }
}

