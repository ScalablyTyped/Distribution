package typings.braintree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonImageUrl extends js.Object {
  var imageUrl: String
  var sourceDescription: String
  var token: String
  var username: String
  var venmoUserId: String
}

object AnonImageUrl {
  @scala.inline
  def apply(imageUrl: String, sourceDescription: String, token: String, username: String, venmoUserId: String): AnonImageUrl = {
    val __obj = js.Dynamic.literal(imageUrl = imageUrl.asInstanceOf[js.Any], sourceDescription = sourceDescription.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any], venmoUserId = venmoUserId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonImageUrl]
  }
}

