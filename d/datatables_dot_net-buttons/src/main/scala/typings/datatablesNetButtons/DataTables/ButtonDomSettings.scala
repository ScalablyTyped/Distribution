package typings.datatablesNetButtons.DataTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonDomSettings extends js.Object {
  var button: js.UndefOr[ButtonDomButtomButton] = js.undefined
  var buttonContainer: js.UndefOr[ButtonDomButtomCommon] = js.undefined
  var buttonLiner: js.UndefOr[ButtonDomButtomCommon] = js.undefined
  var collection: js.UndefOr[ButtonDomButtomCommon] = js.undefined
  var container: js.UndefOr[ButtonDomButtomCommon] = js.undefined
}

object ButtonDomSettings {
  @scala.inline
  def apply(
    button: ButtonDomButtomButton = null,
    buttonContainer: ButtonDomButtomCommon = null,
    buttonLiner: ButtonDomButtomCommon = null,
    collection: ButtonDomButtomCommon = null,
    container: ButtonDomButtomCommon = null
  ): ButtonDomSettings = {
    val __obj = js.Dynamic.literal()
    if (button != null) __obj.updateDynamic("button")(button.asInstanceOf[js.Any])
    if (buttonContainer != null) __obj.updateDynamic("buttonContainer")(buttonContainer.asInstanceOf[js.Any])
    if (buttonLiner != null) __obj.updateDynamic("buttonLiner")(buttonLiner.asInstanceOf[js.Any])
    if (collection != null) __obj.updateDynamic("collection")(collection.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonDomSettings]
  }
}

