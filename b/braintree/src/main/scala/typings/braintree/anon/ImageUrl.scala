package typings.braintree.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageUrl extends js.Object {
  var imageUrl: String
  var sourceDescription: String
  var token: String
  var username: String
  var venmoUserId: String
}

object ImageUrl {
  @scala.inline
  def apply(imageUrl: String, sourceDescription: String, token: String, username: String, venmoUserId: String): ImageUrl = {
    val __obj = js.Dynamic.literal(imageUrl = imageUrl.asInstanceOf[js.Any], sourceDescription = sourceDescription.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any], venmoUserId = venmoUserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageUrl]
  }
}

