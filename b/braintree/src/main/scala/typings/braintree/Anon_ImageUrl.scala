package typings.braintree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ImageUrl extends js.Object {
  var imageUrl: String
  var sourceDescription: String
  var token: String
  var username: String
  var venmoUserId: String
}

object Anon_ImageUrl {
  @scala.inline
  def apply(imageUrl: String, sourceDescription: String, token: String, username: String, venmoUserId: String): Anon_ImageUrl = {
    val __obj = js.Dynamic.literal(imageUrl = imageUrl, sourceDescription = sourceDescription, token = token, username = username, venmoUserId = venmoUserId)
  
    __obj.asInstanceOf[Anon_ImageUrl]
  }
}

