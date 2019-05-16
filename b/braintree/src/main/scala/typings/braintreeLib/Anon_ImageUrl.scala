package typings
package braintreeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ImageUrl extends js.Object {
  var imageUrl: java.lang.String
  var sourceDescription: java.lang.String
  var token: java.lang.String
  var username: java.lang.String
  var venmoUserId: java.lang.String
}

object Anon_ImageUrl {
  @scala.inline
  def apply(
    imageUrl: java.lang.String,
    sourceDescription: java.lang.String,
    token: java.lang.String,
    username: java.lang.String,
    venmoUserId: java.lang.String
  ): Anon_ImageUrl = {
    val __obj = js.Dynamic.literal(imageUrl = imageUrl, sourceDescription = sourceDescription, token = token, username = username, venmoUserId = venmoUserId)
  
    __obj.asInstanceOf[Anon_ImageUrl]
  }
}

