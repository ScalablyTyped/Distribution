package typings.ckeditor.CKEDITOR

import typings.ckeditor.CKEDITOR.dom.domObject
import typings.ckeditor.CKEDITOR.dom.element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait focusManager extends StObject {
  
  def add(element: element, isCapture: Boolean): Unit = js.native
  
  def blur(): Unit = js.native
  def blur(noDelay: Boolean): Unit = js.native
  
  var currentActive: domObject = js.native
  
  def focus(): Unit = js.native
  def focus(currentActive: element): Unit = js.native
  
  var hasFocus: Boolean = js.native
  
  def lock(): Unit = js.native
  
  def remove(element: element): Unit = js.native
  
  def unlock(): Unit = js.native
}
