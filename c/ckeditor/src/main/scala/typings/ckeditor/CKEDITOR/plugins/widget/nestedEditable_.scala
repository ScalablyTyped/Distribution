package typings.ckeditor.CKEDITOR.plugins.widget

import typings.ckeditor.CKEDITOR.dom.element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait nestedEditable_ extends element {
  
  val editor: typings.ckeditor.CKEDITOR.editor = js.native
  
  val enterMode: Double = js.native
  
  val filter: typings.ckeditor.CKEDITOR.filter = js.native
  
  def getData(): String = js.native
  
  def setData(data: String): Unit = js.native
  
  val shiftEnterMode: Double = js.native
}
