package typings.ckeditor.CKEDITOR.plugins.balloontoolbar

import typings.ckeditor.CKEDITOR.dom.element
import typings.ckeditor.CKEDITOR.ui.balloonToolbar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait context extends js.Object {
  
  def destroy(): Unit = js.native
  
  var editor: typings.ckeditor.CKEDITOR.editor = js.native
  
  def hide(): Unit = js.native
  
  var options: contextDefinition = js.native
  
  def refresh(): Unit = js.native
  
  def show(): Unit = js.native
  def show(pointedElement: element): Unit = js.native
  
  var toolbar: balloonToolbar = js.native
}
