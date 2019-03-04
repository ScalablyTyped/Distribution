package typings
package backlogDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Host extends js.Object {
  var host: java.lang.String
  var redirectUri: js.UndefOr[java.lang.String] = js.undefined
  var state: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Host {
  @scala.inline
  def apply(host: java.lang.String, redirectUri: java.lang.String = null, state: java.lang.String = null): Anon_Host = {
    val __obj = js.Dynamic.literal(host = host)
    if (redirectUri != null) __obj.updateDynamic("redirectUri")(redirectUri)
    if (state != null) __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[Anon_Host]
  }
}

