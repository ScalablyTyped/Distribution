package typings.ckeditor.CKEDITOR.ui.dialog.definitions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait iframeElement extends js.Object {
  var height: String
  var onContentLoad: js.UndefOr[js.Function0[Unit]] = js.undefined
  var src: String
  var width: String
}

object iframeElement {
  @scala.inline
  def apply(height: String, src: String, width: String, onContentLoad: () => Unit = null): iframeElement = {
    val __obj = js.Dynamic.literal(height = height, src = src, width = width)
    if (onContentLoad != null) __obj.updateDynamic("onContentLoad")(js.Any.fromFunction0(onContentLoad))
    __obj.asInstanceOf[iframeElement]
  }
}

