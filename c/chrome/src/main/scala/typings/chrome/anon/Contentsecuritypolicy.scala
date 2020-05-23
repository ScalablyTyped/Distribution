package typings.chrome.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Contentsecuritypolicy extends js.Object {
  var content_security_policy: js.UndefOr[String] = js.undefined
  var pages: js.Array[String]
}

object Contentsecuritypolicy {
  @scala.inline
  def apply(pages: js.Array[String], content_security_policy: String = null): Contentsecuritypolicy = {
    val __obj = js.Dynamic.literal(pages = pages.asInstanceOf[js.Any])
    if (content_security_policy != null) __obj.updateDynamic("content_security_policy")(content_security_policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Contentsecuritypolicy]
  }
}

