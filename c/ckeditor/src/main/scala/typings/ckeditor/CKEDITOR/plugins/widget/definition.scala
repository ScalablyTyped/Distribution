package typings.ckeditor.CKEDITOR.plugins.widget

import org.scalablytyped.runtime.StringDictionary
import typings.ckeditor.CKEDITOR.eventInfo
import typings.ckeditor.CKEDITOR.feature
import typings.ckeditor.CKEDITOR.filter.allowedContentRules
import typings.ckeditor.CKEDITOR.htmlParser.element
import typings.ckeditor.CKEDITOR.style
import typings.ckeditor.CKEDITOR.template
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait definition extends feature {
  var button: js.UndefOr[String] = js.undefined
  var data: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.undefined
  var defaults: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var dialog: js.UndefOr[String] = js.undefined
  var downcast: js.UndefOr[String | (js.Function1[/* element */ element, Unit])] = js.undefined
  var downcasts: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var draggable: js.UndefOr[Boolean] = js.undefined
  var edit: js.UndefOr[js.Function0[Unit]] = js.undefined
  var editables: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var getLabel: js.UndefOr[js.Function0[_]] = js.undefined
  var init: js.UndefOr[js.Function0[Unit]] = js.undefined
  var `inline`: js.UndefOr[Boolean] = js.undefined
  var insert: js.UndefOr[js.Function0[Unit]] = js.undefined
  var mask: js.UndefOr[Boolean] = js.undefined
  var parts: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var pathName: js.UndefOr[String] = js.undefined
  var styleToAllowedContentRules: js.UndefOr[js.Function1[/* style */ style, allowedContentRules]] = js.undefined
  var styleableElements: js.UndefOr[String] = js.undefined
  var template: js.UndefOr[String | typings.ckeditor.CKEDITOR.template] = js.undefined
  var upcast: js.UndefOr[String | (js.Function2[/* element */ element, /* data */ js.Any, Boolean])] = js.undefined
  var upcastPriority: js.UndefOr[Double] = js.undefined
  var upcasts: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}

object definition {
  @scala.inline
  def apply(
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
    upcast: String | (js.Function2[/* element */ element, /* data */ js.Any, Boolean]) = null,
    upcastPriority: Int | Double = null,
    upcasts: StringDictionary[js.Any] = null
  ): definition = {
    val __obj = js.Dynamic.literal()
    if (allowedContent != null) __obj.updateDynamic("allowedContent")(allowedContent.asInstanceOf[js.Any])
    if (button != null) __obj.updateDynamic("button")(button.asInstanceOf[js.Any])
    if (contentForms != null) __obj.updateDynamic("contentForms")(contentForms.asInstanceOf[js.Any])
    if (contentTransformations != null) __obj.updateDynamic("contentTransformations")(contentTransformations.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(js.Any.fromFunction1(data))
    if (defaults != null) __obj.updateDynamic("defaults")(defaults.asInstanceOf[js.Any])
    if (dialog != null) __obj.updateDynamic("dialog")(dialog.asInstanceOf[js.Any])
    if (downcast != null) __obj.updateDynamic("downcast")(downcast.asInstanceOf[js.Any])
    if (downcasts != null) __obj.updateDynamic("downcasts")(downcasts.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.asInstanceOf[js.Any])
    if (edit != null) __obj.updateDynamic("edit")(js.Any.fromFunction0(edit))
    if (editables != null) __obj.updateDynamic("editables")(editables.asInstanceOf[js.Any])
    if (getLabel != null) __obj.updateDynamic("getLabel")(js.Any.fromFunction0(getLabel))
    if (init != null) __obj.updateDynamic("init")(js.Any.fromFunction0(init))
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
    if (insert != null) __obj.updateDynamic("insert")(js.Any.fromFunction0(insert))
    if (!js.isUndefined(mask)) __obj.updateDynamic("mask")(mask.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (parts != null) __obj.updateDynamic("parts")(parts.asInstanceOf[js.Any])
    if (pathName != null) __obj.updateDynamic("pathName")(pathName.asInstanceOf[js.Any])
    if (requiredContent != null) __obj.updateDynamic("requiredContent")(requiredContent.asInstanceOf[js.Any])
    if (styleToAllowedContentRules != null) __obj.updateDynamic("styleToAllowedContentRules")(js.Any.fromFunction1(styleToAllowedContentRules))
    if (styleableElements != null) __obj.updateDynamic("styleableElements")(styleableElements.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (toFeature != null) __obj.updateDynamic("toFeature")(js.Any.fromFunction0(toFeature))
    if (upcast != null) __obj.updateDynamic("upcast")(upcast.asInstanceOf[js.Any])
    if (upcastPriority != null) __obj.updateDynamic("upcastPriority")(upcastPriority.asInstanceOf[js.Any])
    if (upcasts != null) __obj.updateDynamic("upcasts")(upcasts.asInstanceOf[js.Any])
    __obj.asInstanceOf[definition]
  }
}

