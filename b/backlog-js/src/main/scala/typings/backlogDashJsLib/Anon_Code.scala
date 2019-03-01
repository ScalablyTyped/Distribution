package typings
package backlogDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Code extends js.Object {
  var code: java.lang.String
  var host: java.lang.String
  var redirectUri: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Code {
  @scala.inline
  def apply(code: java.lang.String, host: java.lang.String, redirectUri: java.lang.String = null): Anon_Code = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("code")(code)
    __obj.updateDynamic("host")(host)
    if (redirectUri != null) __obj.updateDynamic("redirectUri")(redirectUri)
    __obj.asInstanceOf[Anon_Code]
  }
}

