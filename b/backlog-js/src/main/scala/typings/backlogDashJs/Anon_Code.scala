package typings.backlogDashJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Code extends js.Object {
  var code: String
  var host: String
  var redirectUri: js.UndefOr[String] = js.undefined
}

object Anon_Code {
  @scala.inline
  def apply(code: String, host: String, redirectUri: String = null): Anon_Code = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any])
    if (redirectUri != null) __obj.updateDynamic("redirectUri")(redirectUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Code]
  }
}

