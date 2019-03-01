package typings
package bootstrapDashFileinputLib.bootstrapDashFileinputMod.BootstrapFileInputNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileActionSettings extends js.Object {
  /**
    an indicator (HTML markup) for error in upload displayed in each file thumbnail.
    */
  var indicatorError: java.lang.String
  /**
    title to display on hover of indicator for error in upload in each file thumbnail.
    */
  var indicatorErrorTitle: java.lang.String
  /**
    an indicator (HTML markup) for ongoing upload displayed in each file thumbnail.
    */
  var indicatorLoading: java.lang.String
  /**
    title to display on hover of indicator for ongoing upload in each file thumbnail.
    */
  var indicatorLoadingTitle: java.lang.String
  /**
    an indicator (HTML markup) for new pending upload displayed in each file thumbnail.
    */
  var indicatorNew: java.lang.String
  /**
    title to display on hover of indicator for new pending upload in each file thumbnail.
    */
  var indicatorNewTitle: java.lang.String
  /**
    an indicator (HTML markup) for successful upload displayed in each file thumbnail.
    */
  var indicatorSuccess: java.lang.String
  /**
    title to display on hover of indicator for successful in each file thumbnail.
    */
  var indicatorSuccessTitle: java.lang.String
  /**
    CSS class for the remove button in each file thumbnail.
    */
  var removeClass: java.lang.String
  /**
    icon for remove button to be displayed in each file thumbnail.
    */
  var removeIcon: java.lang.String
  /**
    title for remove button in each file thumbnail.
    */
  var removeTitle: java.lang.String
  /**
    CSS class for the remove button in each file thumbnail.
    */
  var uploadClass: java.lang.String
  /**
    icon for upload button to be displayed in each file thumbnail.
    */
  var uploadIcon: java.lang.String
  /**
    title for remove button in each file thumbnail.
    */
  var uploadTitle: java.lang.String
}

object FileActionSettings {
  @scala.inline
  def apply(
    indicatorError: java.lang.String,
    indicatorErrorTitle: java.lang.String,
    indicatorLoading: java.lang.String,
    indicatorLoadingTitle: java.lang.String,
    indicatorNew: java.lang.String,
    indicatorNewTitle: java.lang.String,
    indicatorSuccess: java.lang.String,
    indicatorSuccessTitle: java.lang.String,
    removeClass: java.lang.String,
    removeIcon: java.lang.String,
    removeTitle: java.lang.String,
    uploadClass: java.lang.String,
    uploadIcon: java.lang.String,
    uploadTitle: java.lang.String
  ): FileActionSettings = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("indicatorError")(indicatorError)
    __obj.updateDynamic("indicatorErrorTitle")(indicatorErrorTitle)
    __obj.updateDynamic("indicatorLoading")(indicatorLoading)
    __obj.updateDynamic("indicatorLoadingTitle")(indicatorLoadingTitle)
    __obj.updateDynamic("indicatorNew")(indicatorNew)
    __obj.updateDynamic("indicatorNewTitle")(indicatorNewTitle)
    __obj.updateDynamic("indicatorSuccess")(indicatorSuccess)
    __obj.updateDynamic("indicatorSuccessTitle")(indicatorSuccessTitle)
    __obj.updateDynamic("removeClass")(removeClass)
    __obj.updateDynamic("removeIcon")(removeIcon)
    __obj.updateDynamic("removeTitle")(removeTitle)
    __obj.updateDynamic("uploadClass")(uploadClass)
    __obj.updateDynamic("uploadIcon")(uploadIcon)
    __obj.updateDynamic("uploadTitle")(uploadTitle)
    __obj.asInstanceOf[FileActionSettings]
  }
}

