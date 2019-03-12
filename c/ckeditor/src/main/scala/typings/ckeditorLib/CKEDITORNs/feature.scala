package typings
package ckeditorLib.CKEDITORNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait feature extends js.Object {
  var allowedContent: js.UndefOr[ckeditorLib.CKEDITORNs.filterNs.allowedContentRules] = js.undefined
  var contentForms: js.UndefOr[js.Any] = js.undefined
  var contentTransformations: js.UndefOr[js.Any] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var requiredContent: js.UndefOr[java.lang.String | style] = js.undefined
  var toFeature: js.UndefOr[js.Function0[feature]] = js.undefined
}

object feature {
  @scala.inline
  def apply(
    allowedContent: ckeditorLib.CKEDITORNs.filterNs.allowedContentRules = null,
    contentForms: js.Any = null,
    contentTransformations: js.Any = null,
    name: java.lang.String = null,
    requiredContent: java.lang.String | style = null,
    toFeature: () => feature = null
  ): feature = {
    val __obj = js.Dynamic.literal()
    if (allowedContent != null) __obj.updateDynamic("allowedContent")(allowedContent.asInstanceOf[js.Any])
    if (contentForms != null) __obj.updateDynamic("contentForms")(contentForms)
    if (contentTransformations != null) __obj.updateDynamic("contentTransformations")(contentTransformations)
    if (name != null) __obj.updateDynamic("name")(name)
    if (requiredContent != null) __obj.updateDynamic("requiredContent")(requiredContent.asInstanceOf[js.Any])
    if (toFeature != null) __obj.updateDynamic("toFeature")(js.Any.fromFunction0(toFeature))
    __obj.asInstanceOf[feature]
  }
}

