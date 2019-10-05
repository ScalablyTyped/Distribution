package typings.cypress

import typings.cypress.Cypress.ObjectLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Body extends js.Object {
  var body: String | ObjectLike
  var headers: ObjectLike
}

object Anon_Body {
  @scala.inline
  def apply(body: String | ObjectLike, headers: ObjectLike): Anon_Body = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers)
  
    __obj.asInstanceOf[Anon_Body]
  }
}

