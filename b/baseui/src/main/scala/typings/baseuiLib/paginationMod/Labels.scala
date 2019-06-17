package typings
package baseuiLib.paginationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Labels extends js.Object {
  var nextButton: js.UndefOr[java.lang.String] = js.undefined
  var preposition: js.UndefOr[java.lang.String] = js.undefined
  var prevButton: js.UndefOr[java.lang.String] = js.undefined
}

object Labels {
  @scala.inline
  def apply(
    nextButton: java.lang.String = null,
    preposition: java.lang.String = null,
    prevButton: java.lang.String = null
  ): Labels = {
    val __obj = js.Dynamic.literal()
    if (nextButton != null) __obj.updateDynamic("nextButton")(nextButton)
    if (preposition != null) __obj.updateDynamic("preposition")(preposition)
    if (prevButton != null) __obj.updateDynamic("prevButton")(prevButton)
    __obj.asInstanceOf[Labels]
  }
}

