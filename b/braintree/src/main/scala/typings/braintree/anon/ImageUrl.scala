package typings.braintree.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageUrl extends js.Object {
  var imageUrl: String = js.native
  var sourceDescription: String = js.native
  var token: String = js.native
  var username: String = js.native
  var venmoUserId: String = js.native
}

object ImageUrl {
  @scala.inline
  def apply(imageUrl: String, sourceDescription: String, token: String, username: String, venmoUserId: String): ImageUrl = {
    val __obj = js.Dynamic.literal(imageUrl = imageUrl.asInstanceOf[js.Any], sourceDescription = sourceDescription.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any], venmoUserId = venmoUserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageUrl]
  }
  @scala.inline
  implicit class ImageUrlOps[Self <: ImageUrl] (val x: Self) extends AnyVal {
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
    def setImageUrl(value: String): Self = this.set("imageUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceDescription(value: String): Self = this.set("sourceDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def setToken(value: String): Self = this.set("token", value.asInstanceOf[js.Any])
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    @scala.inline
    def setVenmoUserId(value: String): Self = this.set("venmoUserId", value.asInstanceOf[js.Any])
  }
  
}

