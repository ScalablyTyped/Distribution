package typings
package cypressLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Body extends js.Object {
  var body: java.lang.String | cypressLib.CypressNs.ObjectLike
  var headers: cypressLib.CypressNs.ObjectLike
}

object Anon_Body {
  @scala.inline
  def apply(body: java.lang.String | cypressLib.CypressNs.ObjectLike, headers: cypressLib.CypressNs.ObjectLike): Anon_Body = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    __obj.updateDynamic("headers")(headers)
    __obj.asInstanceOf[Anon_Body]
  }
}

