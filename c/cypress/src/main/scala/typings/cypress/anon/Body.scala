package typings.cypress.anon

import typings.cypress.Cypress.ObjectLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Body extends js.Object {
  var body: String | ObjectLike
  var headers: ObjectLike
}

object Body {
  @scala.inline
  def apply(body: String | ObjectLike, headers: ObjectLike): Body = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Body]
  }
}

