package typings.backlogJs.mod.Option.Notification

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetNotificationsCountParams extends js.Object {
  var alreadyRead: Boolean
  var resourceAlreadyRead: Boolean
}

object GetNotificationsCountParams {
  @scala.inline
  def apply(alreadyRead: Boolean, resourceAlreadyRead: Boolean): GetNotificationsCountParams = {
    val __obj = js.Dynamic.literal(alreadyRead = alreadyRead.asInstanceOf[js.Any], resourceAlreadyRead = resourceAlreadyRead.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetNotificationsCountParams]
  }
}

