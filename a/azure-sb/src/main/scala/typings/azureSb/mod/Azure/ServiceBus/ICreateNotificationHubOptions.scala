package typings.azureSb.mod.Azure.ServiceBus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICreateNotificationHubOptions extends js.Object {
  var apns: Dictionary[String]
  var gcm: Dictionary[String]
  var mpns: Dictionary[String]
  var wns: Dictionary[String]
}

object ICreateNotificationHubOptions {
  @scala.inline
  def apply(
    apns: Dictionary[String],
    gcm: Dictionary[String],
    mpns: Dictionary[String],
    wns: Dictionary[String]
  ): ICreateNotificationHubOptions = {
    val __obj = js.Dynamic.literal(apns = apns.asInstanceOf[js.Any], gcm = gcm.asInstanceOf[js.Any], mpns = mpns.asInstanceOf[js.Any], wns = wns.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ICreateNotificationHubOptions]
  }
}

