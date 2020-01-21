package typings.cypress

import typings.cypress.cypressMod.Cypress.ObjectLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBody extends js.Object {
  var body: String | ObjectLike
  var headers: ObjectLike
}

object AnonBody {
  @scala.inline
  def apply(body: String | ObjectLike, headers: ObjectLike): AnonBody = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBody]
  }
}

