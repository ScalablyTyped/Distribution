package typings.azureDashSb.azureDashSbMod.Azure.ServiceBus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBrokerPropertiesResponse extends js.Object {
  val DeliveryCount: Double
  val LockToken: String
  val LockedUntil: DateString
  val SequenceNumber: Double
}

object IBrokerPropertiesResponse {
  @scala.inline
  def apply(DeliveryCount: Double, LockToken: String, LockedUntil: DateString, SequenceNumber: Double): IBrokerPropertiesResponse = {
    val __obj = js.Dynamic.literal(DeliveryCount = DeliveryCount, LockToken = LockToken, LockedUntil = LockedUntil, SequenceNumber = SequenceNumber)
  
    __obj.asInstanceOf[IBrokerPropertiesResponse]
  }
}

