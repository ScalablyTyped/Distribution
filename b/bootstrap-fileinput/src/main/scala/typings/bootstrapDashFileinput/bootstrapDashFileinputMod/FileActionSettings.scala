package typings.bootstrapDashFileinput.bootstrapDashFileinputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileActionSettings extends js.Object {
  /**
    an indicator (HTML markup) for error in upload displayed in each file thumbnail.
    */
  var indicatorError: String
  /**
    title to display on hover of indicator for error in upload in each file thumbnail.
    */
  var indicatorErrorTitle: String
  /**
    an indicator (HTML markup) for ongoing upload displayed in each file thumbnail.
    */
  var indicatorLoading: String
  /**
    title to display on hover of indicator for ongoing upload in each file thumbnail.
    */
  var indicatorLoadingTitle: String
  /**
    an indicator (HTML markup) for new pending upload displayed in each file thumbnail.
    */
  var indicatorNew: String
  /**
    title to display on hover of indicator for new pending upload in each file thumbnail.
    */
  var indicatorNewTitle: String
  /**
    an indicator (HTML markup) for successful upload displayed in each file thumbnail.
    */
  var indicatorSuccess: String
  /**
    title to display on hover of indicator for successful in each file thumbnail.
    */
  var indicatorSuccessTitle: String
  /**
    CSS class for the remove button in each file thumbnail.
    */
  var removeClass: String
  /**
    icon for remove button to be displayed in each file thumbnail.
    */
  var removeIcon: String
  /**
    title for remove button in each file thumbnail.
    */
  var removeTitle: String
  /**
    CSS class for the remove button in each file thumbnail.
    */
  var uploadClass: String
  /**
    icon for upload button to be displayed in each file thumbnail.
    */
  var uploadIcon: String
  /**
    title for remove button in each file thumbnail.
    */
  var uploadTitle: String
}

object FileActionSettings {
  @scala.inline
  def apply(
    indicatorError: String,
    indicatorErrorTitle: String,
    indicatorLoading: String,
    indicatorLoadingTitle: String,
    indicatorNew: String,
    indicatorNewTitle: String,
    indicatorSuccess: String,
    indicatorSuccessTitle: String,
    removeClass: String,
    removeIcon: String,
    removeTitle: String,
    uploadClass: String,
    uploadIcon: String,
    uploadTitle: String
  ): FileActionSettings = {
    val __obj = js.Dynamic.literal(indicatorError = indicatorError, indicatorErrorTitle = indicatorErrorTitle, indicatorLoading = indicatorLoading, indicatorLoadingTitle = indicatorLoadingTitle, indicatorNew = indicatorNew, indicatorNewTitle = indicatorNewTitle, indicatorSuccess = indicatorSuccess, indicatorSuccessTitle = indicatorSuccessTitle, removeClass = removeClass, removeIcon = removeIcon, removeTitle = removeTitle, uploadClass = uploadClass, uploadIcon = uploadIcon, uploadTitle = uploadTitle)
  
    __obj.asInstanceOf[FileActionSettings]
  }
}

