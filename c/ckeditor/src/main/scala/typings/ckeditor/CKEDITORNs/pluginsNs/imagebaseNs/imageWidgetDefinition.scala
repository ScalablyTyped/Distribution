package typings.ckeditor.CKEDITORNs.pluginsNs.imagebaseNs

import org.scalablytyped.runtime.StringDictionary
import typings.ckeditor.CKEDITORNs.eventInfo
import typings.ckeditor.CKEDITORNs.feature
import typings.ckeditor.CKEDITORNs.filterNs.allowedContentRules
import typings.ckeditor.CKEDITORNs.htmlParserNs.element
import typings.ckeditor.CKEDITORNs.pluginsNs.widgetNs.definition
import typings.ckeditor.CKEDITORNs.style
import typings.ckeditor.CKEDITORNs.template
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait imageWidgetDefinition extends definition {
  var features: js.Array[String]
  @JSName("upcast")
  var upcast_imageWidgetDefinition: String
}

object imageWidgetDefinition {
  @scala.inline
  def apply(
    features: js.Array[String],
    upcast: String,
    allowedContent: allowedContentRules = null,
    button: String = null,
    contentForms: js.Any = null,
    contentTransformations: js.Any = null,
    data: /* evt */ eventInfo => Unit = null,
    defaults: StringDictionary[js.Any] = null,
    dialog: String = null,
    downcast: String | (js.Function1[/* element */ element, Unit]) = null,
    downcasts: StringDictionary[js.Any] = null,
    draggable: js.UndefOr[Boolean] = js.undefined,
    edit: () => Unit = null,
    editables: StringDictionary[js.Any] = null,
    getLabel: () => _ = null,
    init: () => Unit = null,
    `inline`: js.UndefOr[Boolean] = js.undefined,
    insert: () => Unit = null,
    mask: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    parts: StringDictionary[js.Any] = null,
    pathName: String = null,
    requiredContent: String | style = null,
    styleToAllowedContentRules: /* style */ style => allowedContentRules = null,
    styleableElements: String = null,
    template: String | template = null,
    toFeature: () => feature = null,
    upcastPriority: Int | Double = null,
    upcasts: StringDictionary[js.Any] = null
  ): imageWidgetDefinition = {
    val __obj = js.Dynamic.literal(features = features, upcast = upcast)
    if (allowedContent != null) __obj.updateDynamic("allowedContent")(allowedContent.asInstanceOf[js.Any])
    if (button != null) __obj.updateDynamic("button")(button)
    if (contentForms != null) __obj.updateDynamic("contentForms")(contentForms)
    if (contentTransformations != null) __obj.updateDynamic("contentTransformations")(contentTransformations)
    if (data != null) __obj.updateDynamic("data")(js.Any.fromFunction1(data))
    if (defaults != null) __obj.updateDynamic("defaults")(defaults)
    if (dialog != null) __obj.updateDynamic("dialog")(dialog)
    if (downcast != null) __obj.updateDynamic("downcast")(downcast.asInstanceOf[js.Any])
    if (downcasts != null) __obj.updateDynamic("downcasts")(downcasts)
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable)
    if (edit != null) __obj.updateDynamic("edit")(js.Any.fromFunction0(edit))
    if (editables != null) __obj.updateDynamic("editables")(editables)
    if (getLabel != null) __obj.updateDynamic("getLabel")(js.Any.fromFunction0(getLabel))
    if (init != null) __obj.updateDynamic("init")(js.Any.fromFunction0(init))
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`)
    if (insert != null) __obj.updateDynamic("insert")(js.Any.fromFunction0(insert))
    if (!js.isUndefined(mask)) __obj.updateDynamic("mask")(mask)
    if (name != null) __obj.updateDynamic("name")(name)
    if (parts != null) __obj.updateDynamic("parts")(parts)
    if (pathName != null) __obj.updateDynamic("pathName")(pathName)
    if (requiredContent != null) __obj.updateDynamic("requiredContent")(requiredContent.asInstanceOf[js.Any])
    if (styleToAllowedContentRules != null) __obj.updateDynamic("styleToAllowedContentRules")(js.Any.fromFunction1(styleToAllowedContentRules))
    if (styleableElements != null) __obj.updateDynamic("styleableElements")(styleableElements)
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (toFeature != null) __obj.updateDynamic("toFeature")(js.Any.fromFunction0(toFeature))
    if (upcastPriority != null) __obj.updateDynamic("upcastPriority")(upcastPriority.asInstanceOf[js.Any])
    if (upcasts != null) __obj.updateDynamic("upcasts")(upcasts)
    __obj.asInstanceOf[imageWidgetDefinition]
  }
}

