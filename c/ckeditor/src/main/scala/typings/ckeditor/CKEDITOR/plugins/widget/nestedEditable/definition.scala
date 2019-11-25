package typings.ckeditor.CKEDITOR.plugins.widget.nestedEditable

import typings.ckeditor.CKEDITOR.filter.allowedContentRules
import typings.ckeditor.CKEDITOR.filter.disallowedContentRules
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait definition extends js.Object {
  var allowedContent: js.UndefOr[allowedContentRules] = js.undefined
  var disallowedContent: js.UndefOr[disallowedContentRules] = js.undefined
  var pathName: js.UndefOr[String] = js.undefined
  var selector: js.UndefOr[String] = js.undefined
}

object definition {
  @scala.inline
  def apply(
    allowedContent: allowedContentRules = null,
    disallowedContent: disallowedContentRules = null,
    pathName: String = null,
    selector: String = null
  ): definition = {
    val __obj = js.Dynamic.literal()
    if (allowedContent != null) __obj.updateDynamic("allowedContent")(allowedContent.asInstanceOf[js.Any])
    if (disallowedContent != null) __obj.updateDynamic("disallowedContent")(disallowedContent.asInstanceOf[js.Any])
    if (pathName != null) __obj.updateDynamic("pathName")(pathName.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[definition]
  }
}

