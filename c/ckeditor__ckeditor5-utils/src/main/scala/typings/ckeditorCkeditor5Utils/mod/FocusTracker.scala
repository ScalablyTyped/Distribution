package typings.ckeditorCkeditor5Utils.mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ckeditor/ckeditor5-utils", "FocusTracker")
@js.native
class FocusTracker () extends Observable {
  
  def add(element: HTMLElement): Unit = js.native
  
  val focusedElement: HTMLElement = js.native
  
  val isFocused: Boolean = js.native
  
  def remove(element: HTMLElement): Unit = js.native
}
