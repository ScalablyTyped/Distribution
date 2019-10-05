package typings.ckeditor.CKEDITOR.plugins.balloontoolbar

import typings.ckeditor.CKEDITOR.dom.element
import typings.ckeditor.CKEDITOR.dom.elementPath
import typings.ckeditor.CKEDITOR.dom.selection
import typings.ckeditor.CKEDITOR.editor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait contextDefinition extends js.Object {
  var cssSelector: js.UndefOr[String] = js.undefined
  var priority: js.UndefOr[Double] = js.undefined
  var refresh: js.UndefOr[
    js.Function3[/* editor */ editor, /* path */ elementPath, /* selection */ selection, element]
  ] = js.undefined
  var widgets: js.UndefOr[js.Array[String] | String] = js.undefined
}

object contextDefinition {
  @scala.inline
  def apply(
    cssSelector: String = null,
    priority: Int | Double = null,
    refresh: (/* editor */ editor, /* path */ elementPath, /* selection */ selection) => element = null,
    widgets: js.Array[String] | String = null
  ): contextDefinition = {
    val __obj = js.Dynamic.literal()
    if (cssSelector != null) __obj.updateDynamic("cssSelector")(cssSelector)
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (refresh != null) __obj.updateDynamic("refresh")(js.Any.fromFunction3(refresh))
    if (widgets != null) __obj.updateDynamic("widgets")(widgets.asInstanceOf[js.Any])
    __obj.asInstanceOf[contextDefinition]
  }
}

