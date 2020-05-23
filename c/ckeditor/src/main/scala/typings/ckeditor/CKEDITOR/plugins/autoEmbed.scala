package typings.ckeditor.CKEDITOR.plugins

import typings.ckeditor.CKEDITOR.editor
import typings.ckeditor.CKEDITOR.plugins.widget.definition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait autoEmbed extends js.Object {
  def getWidgetDefinition(editor: editor, url: String): definition
}

object autoEmbed {
  @scala.inline
  def apply(getWidgetDefinition: (editor, String) => definition): autoEmbed = {
    val __obj = js.Dynamic.literal(getWidgetDefinition = js.Any.fromFunction2(getWidgetDefinition))
    __obj.asInstanceOf[autoEmbed]
  }
}

