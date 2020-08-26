package typings.carbonComponents.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShouldBeExpanded extends js.Object {
  var shouldBeExpanded: js.Any = js.native
  var shouldFocusOnOpen: js.Any = js.native
}

object ShouldBeExpanded {
  @scala.inline
  def apply(shouldBeExpanded: js.Any, shouldFocusOnOpen: js.Any): ShouldBeExpanded = {
    val __obj = js.Dynamic.literal(shouldBeExpanded = shouldBeExpanded.asInstanceOf[js.Any], shouldFocusOnOpen = shouldFocusOnOpen.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShouldBeExpanded]
  }
  @scala.inline
  implicit class ShouldBeExpandedOps[Self <: ShouldBeExpanded] (val x: Self) extends AnyVal {
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
    def setShouldBeExpanded(value: js.Any): Self = this.set("shouldBeExpanded", value.asInstanceOf[js.Any])
    @scala.inline
    def setShouldFocusOnOpen(value: js.Any): Self = this.set("shouldFocusOnOpen", value.asInstanceOf[js.Any])
  }
  
}

