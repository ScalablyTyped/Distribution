package typings.carbonComponents.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MatchesNavSubmenu extends js.Object {
  var matchesNavSubmenu: js.Any = js.native
  var shouldBeCollapsed: js.Any = js.native
}

object MatchesNavSubmenu {
  @scala.inline
  def apply(matchesNavSubmenu: js.Any, shouldBeCollapsed: js.Any): MatchesNavSubmenu = {
    val __obj = js.Dynamic.literal(matchesNavSubmenu = matchesNavSubmenu.asInstanceOf[js.Any], shouldBeCollapsed = shouldBeCollapsed.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatchesNavSubmenu]
  }
  @scala.inline
  implicit class MatchesNavSubmenuOps[Self <: MatchesNavSubmenu] (val x: Self) extends AnyVal {
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
    def setMatchesNavSubmenu(value: js.Any): Self = this.set("matchesNavSubmenu", value.asInstanceOf[js.Any])
    @scala.inline
    def setShouldBeCollapsed(value: js.Any): Self = this.set("shouldBeCollapsed", value.asInstanceOf[js.Any])
  }
  
}

