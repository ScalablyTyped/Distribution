package typings.ckeditor.CKEDITOR.style

import typings.ckeditor.CKEDITOR.dom.element
import typings.ckeditor.CKEDITOR.editor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.style.customHandlers")
@js.native
object customHandlers extends js.Object {
  @js.native
  class widget ()
    extends typings.ckeditor.CKEDITOR.style {
    var group: js.Array[_] = js.native
    var widget: String = js.native
    def checkElement(element: element): Boolean = js.native
    def getClassesArray(): js.Array[String] = js.native
    def removeStylesFromSameGroup(editor: editor): Boolean = js.native
  }
  
}

