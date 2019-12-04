package typings.baseui.paginationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Labels extends js.Object {
  var nextButton: js.UndefOr[String] = js.undefined
  var preposition: js.UndefOr[String] = js.undefined
  var prevButton: js.UndefOr[String] = js.undefined
}

object Labels {
  @scala.inline
  def apply(nextButton: String = null, preposition: String = null, prevButton: String = null): Labels = {
    val __obj = js.Dynamic.literal()
    if (nextButton != null) __obj.updateDynamic("nextButton")(nextButton.asInstanceOf[js.Any])
    if (preposition != null) __obj.updateDynamic("preposition")(preposition.asInstanceOf[js.Any])
    if (prevButton != null) __obj.updateDynamic("prevButton")(prevButton.asInstanceOf[js.Any])
    __obj.asInstanceOf[Labels]
  }
}

