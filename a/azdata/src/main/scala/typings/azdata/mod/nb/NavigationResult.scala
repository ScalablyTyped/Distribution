package typings.azdata.mod.nb

import typings.vscode.mod.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationResult extends js.Object {
  var hasNavigation: Boolean
  var next: js.UndefOr[Uri] = js.undefined
  var previous: js.UndefOr[Uri] = js.undefined
}

object NavigationResult {
  @scala.inline
  def apply(hasNavigation: Boolean, next: Uri = null, previous: Uri = null): NavigationResult = {
    val __obj = js.Dynamic.literal(hasNavigation = hasNavigation.asInstanceOf[js.Any])
    if (next != null) __obj.updateDynamic("next")(next.asInstanceOf[js.Any])
    if (previous != null) __obj.updateDynamic("previous")(previous.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationResult]
  }
}

