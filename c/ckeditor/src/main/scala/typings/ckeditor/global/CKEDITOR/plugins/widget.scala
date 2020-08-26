package typings.ckeditor.global.CKEDITOR.plugins

import typings.ckeditor.CKEDITOR.dom.element
import typings.ckeditor.CKEDITOR.dom.node
import typings.ckeditor.anon.Filter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.plugins.widget")
@js.native
class widget protected ()
  extends typings.ckeditor.CKEDITOR.plugins.widget {
  def this(
    widgetsRepo: typings.ckeditor.CKEDITOR.plugins.widget.repository,
    id: Double,
    element: typings.ckeditor.CKEDITOR.dom.element,
    widgetDef: typings.ckeditor.CKEDITOR.plugins.widget.definition
  ) = this()
  def this(
    widgetsRepo: typings.ckeditor.CKEDITOR.plugins.widget.repository,
    id: Double,
    element: typings.ckeditor.CKEDITOR.dom.element,
    widgetDef: typings.ckeditor.CKEDITOR.plugins.widget.definition,
    starupData: js.Any
  ) = this()
}

@JSGlobal("CKEDITOR.plugins.widget")
@js.native
object widget extends js.Object {
  @js.native
  class nestedEditable protected ()
    extends typings.ckeditor.CKEDITOR.plugins.widget.nestedEditable {
    def this(
      editor: typings.ckeditor.CKEDITOR.editor,
      element: typings.ckeditor.CKEDITOR.dom.element,
      config: Filter
    ) = this()
  }
  
  @js.native
  class repository ()
    extends typings.ckeditor.CKEDITOR.plugins.widget.repository
  
  @js.native
  class widgetselection ()
    extends typings.ckeditor.CKEDITOR.plugins.widget.widgetselection
  
  var WRAPPER_CLASS_PREFIX: String = js.native
  def getNestedEditable(guard: element, node: node): element = js.native
  def isDomDragHandler(node: node): Boolean = js.native
  def isDomDragHandlerContainer(node: node): Boolean = js.native
  def isDomNestedEditable(node: node): Boolean = js.native
  def isDomWidget(node: node): Boolean = js.native
  def isDomWidgetElement(node: node): Boolean = js.native
  def isDomWidgetWrapper(node: node): Boolean = js.native
  def isParserWidgetElement(node: node): Boolean = js.native
  def isParserWidgetWrapper(node: node): Boolean = js.native
}

