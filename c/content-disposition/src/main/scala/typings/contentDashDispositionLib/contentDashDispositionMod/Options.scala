package typings
package contentDashDispositionLib.contentDashDispositionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var fallback: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object Options {
  @scala.inline
  def apply(fallback: java.lang.String | scala.Boolean = null, `type`: java.lang.String = null): Options = {
    val __obj = js.Dynamic.literal()
    if (fallback != null) __obj.updateDynamic("fallback")(fallback.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Options]
  }
}

