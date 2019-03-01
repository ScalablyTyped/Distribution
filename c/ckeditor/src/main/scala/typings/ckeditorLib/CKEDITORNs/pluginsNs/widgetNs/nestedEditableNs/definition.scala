package typings
package ckeditorLib.CKEDITORNs.pluginsNs.widgetNs.nestedEditableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait definition extends js.Object {
  var allowedContent: js.UndefOr[ckeditorLib.CKEDITORNs.filterNs.allowedContentRules] = js.undefined
  var disallowedContent: js.UndefOr[ckeditorLib.CKEDITORNs.filterNs.disallowedContentRules] = js.undefined
  var pathName: js.UndefOr[java.lang.String] = js.undefined
  var selector: js.UndefOr[java.lang.String] = js.undefined
}

object definition {
  @scala.inline
  def apply(
    allowedContent: ckeditorLib.CKEDITORNs.filterNs.allowedContentRules = null,
    disallowedContent: ckeditorLib.CKEDITORNs.filterNs.disallowedContentRules = null,
    pathName: java.lang.String = null,
    selector: java.lang.String = null
  ): definition = {
    val __obj = js.Dynamic.literal()
    if (allowedContent != null) __obj.updateDynamic("allowedContent")(allowedContent.asInstanceOf[js.Any])
    if (disallowedContent != null) __obj.updateDynamic("disallowedContent")(disallowedContent.asInstanceOf[js.Any])
    if (pathName != null) __obj.updateDynamic("pathName")(pathName)
    if (selector != null) __obj.updateDynamic("selector")(selector)
    __obj.asInstanceOf[definition]
  }
}

