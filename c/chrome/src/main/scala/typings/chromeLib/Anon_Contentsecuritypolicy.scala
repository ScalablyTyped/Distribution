package typings
package chromeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Contentsecuritypolicy extends js.Object {
  var content_security_policy: js.UndefOr[java.lang.String] = js.undefined
  var pages: js.Array[java.lang.String]
}

object Anon_Contentsecuritypolicy {
  @scala.inline
  def apply(pages: js.Array[java.lang.String], content_security_policy: java.lang.String = null): Anon_Contentsecuritypolicy = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("pages")(pages)
    if (content_security_policy != null) __obj.updateDynamic("content_security_policy")(content_security_policy)
    __obj.asInstanceOf[Anon_Contentsecuritypolicy]
  }
}

