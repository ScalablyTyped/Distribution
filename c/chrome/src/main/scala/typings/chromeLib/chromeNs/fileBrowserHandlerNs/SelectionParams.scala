package typings
package chromeLib.chromeNs.fileBrowserHandlerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectionParams extends js.Object {
  /**
    * Optional.
    * List of file extensions that the selected file can have. The list is also used to specify what files to be shown in the select file dialog. Files with the listed extensions are only shown in the dialog. Extensions should not include the leading '.'. Example: ['jpg', 'png']
    * Since Chrome 23.
    */
  var allowedFileExtensions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Suggested name for the file. */
  var suggestedName: java.lang.String
}

object SelectionParams {
  @scala.inline
  def apply(suggestedName: java.lang.String, allowedFileExtensions: js.Array[java.lang.String] = null): SelectionParams = {
    val __obj = js.Dynamic.literal(suggestedName = suggestedName)
    if (allowedFileExtensions != null) __obj.updateDynamic("allowedFileExtensions")(allowedFileExtensions)
    __obj.asInstanceOf[SelectionParams]
  }
}

