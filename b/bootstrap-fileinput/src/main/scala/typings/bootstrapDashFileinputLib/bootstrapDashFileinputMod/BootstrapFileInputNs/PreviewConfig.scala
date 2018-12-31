package typings
package bootstrapDashFileinputLib.bootstrapDashFileinputMod.BootstrapFileInputNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PreviewConfig extends js.Object {
  /**
    the caption or filename to display for each initial preview item content.
    */
  var caption: java.lang.String
  /**
    the extra data that will be passed as data to the initial preview delete url / AJAX server call via POST.This will default to deleteExtraData if not set.
    */
  var extra: js.Object | js.Function
  /**
    the additional frame css class to set for the file's thumbnail frame.
    */
  var frameClass: java.lang.String
  /**
    the key that will be passed as data to the url via AJAX POST.
    */
  var key: java.lang.String | js.Object
  /**
    the URL for deleting the image/ content in the initial preview via AJAX post response.This will default to deleteUrl if not set.
    */
  var url: java.lang.String
  /**
    the CSS width of the image/ content displayed.
    */
  var width: java.lang.String
}

