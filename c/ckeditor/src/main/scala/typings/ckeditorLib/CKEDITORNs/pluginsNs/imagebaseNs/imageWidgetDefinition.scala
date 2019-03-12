package typings
package ckeditorLib.CKEDITORNs.pluginsNs.imagebaseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait imageWidgetDefinition
  extends ckeditorLib.CKEDITORNs.pluginsNs.widgetNs.definition {
  var features: js.Array[java.lang.String]
  @JSName("upcast")
  var upcast_imageWidgetDefinition: java.lang.String
}

object imageWidgetDefinition {
  @scala.inline
  def apply(
    features: js.Array[java.lang.String],
    upcast: java.lang.String,
    allowedContent: ckeditorLib.CKEDITORNs.filterNs.allowedContentRules = null,
    button: java.lang.String = null,
    contentForms: js.Any = null,
    contentTransformations: js.Any = null,
    data: /* evt */ ckeditorLib.CKEDITORNs.eventInfo => scala.Unit = null,
    defaults: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    dialog: java.lang.String = null,
    downcast: java.lang.String | (js.Function1[/* element */ ckeditorLib.CKEDITORNs.htmlParserNs.element, scala.Unit]) = null,
    downcasts: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    draggable: js.UndefOr[scala.Boolean] = js.undefined,
    edit: () => scala.Unit = null,
    editables: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    getLabel: () => _ = null,
    init: () => scala.Unit = null,
    `inline`: js.UndefOr[scala.Boolean] = js.undefined,
    insert: () => scala.Unit = null,
    mask: js.UndefOr[scala.Boolean] = js.undefined,
    name: java.lang.String = null,
    parts: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    pathName: java.lang.String = null,
    requiredContent: java.lang.String | ckeditorLib.CKEDITORNs.style = null,
    styleToAllowedContentRules: /* style */ ckeditorLib.CKEDITORNs.style => ckeditorLib.CKEDITORNs.filterNs.allowedContentRules = null,
    styleableElements: java.lang.String = null,
    template: java.lang.String | ckeditorLib.CKEDITORNs.template = null,
    toFeature: () => ckeditorLib.CKEDITORNs.feature = null,
    upcastPriority: scala.Int | scala.Double = null,
    upcasts: org.scalablytyped.runtime.StringDictionary[js.Any] = null
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

