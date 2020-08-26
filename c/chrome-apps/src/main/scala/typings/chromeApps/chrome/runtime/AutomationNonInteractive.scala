package typings.chromeApps.chrome.runtime

import typings.chromeApps.chromeAppsBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutomationNonInteractive extends _AutomationOptions {
  var desktop: js.UndefOr[`false`] = js.native
  var interact: `false` = js.native
  /** Patterns for matching, use chrome url pattern */
  var matches: js.UndefOr[js.Array[String | UrlMatches]] = js.native
}

object AutomationNonInteractive {
  @scala.inline
  def apply(interact: `false`): AutomationNonInteractive = {
    val __obj = js.Dynamic.literal(interact = interact.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutomationNonInteractive]
  }
  @scala.inline
  implicit class AutomationNonInteractiveOps[Self <: AutomationNonInteractive] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setInteract(value: `false`): Self = this.set("interact", value.asInstanceOf[js.Any])
    @scala.inline
    def setDesktop(value: `false`): Self = this.set("desktop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDesktop: Self = this.set("desktop", js.undefined)
    @scala.inline
    def setMatchesVarargs(value: (String | UrlMatches)*): Self = this.set("matches", js.Array(value :_*))
    @scala.inline
    def setMatches(value: js.Array[String | UrlMatches]): Self = this.set("matches", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMatches: Self = this.set("matches", js.undefined)
  }
  
}

