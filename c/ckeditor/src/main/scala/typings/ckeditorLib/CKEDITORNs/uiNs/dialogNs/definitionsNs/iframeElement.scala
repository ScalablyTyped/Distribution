package typings
package ckeditorLib.CKEDITORNs.uiNs.dialogNs.definitionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait iframeElement extends js.Object {
  var height: java.lang.String
  var onContentLoad: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var src: java.lang.String
  var width: java.lang.String
}

object iframeElement {
  @scala.inline
  def apply(
    height: java.lang.String,
    src: java.lang.String,
    width: java.lang.String,
    onContentLoad: js.Function0[scala.Unit] = null
  ): iframeElement = {
    val __obj = js.Dynamic.literal(height = height, src = src, width = width)
    if (onContentLoad != null) __obj.updateDynamic("onContentLoad")(onContentLoad)
    __obj.asInstanceOf[iframeElement]
  }
}

