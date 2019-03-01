package typings
package ckeditorLib.CKEDITORNs.uiNs.balloonPanelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait definition extends js.Object {
  var content: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object definition {
  @scala.inline
  def apply(content: java.lang.String = null, title: java.lang.String = null): definition = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[definition]
  }
}

