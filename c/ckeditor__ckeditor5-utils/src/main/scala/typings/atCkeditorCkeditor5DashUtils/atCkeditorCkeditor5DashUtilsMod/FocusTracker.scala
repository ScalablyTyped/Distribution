package typings.atCkeditorCkeditor5DashUtils.atCkeditorCkeditor5DashUtilsMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ckeditor/ckeditor5-utils", "FocusTracker")
@js.native
class FocusTracker () extends Observable {
  val focusedElement: HTMLElement = js.native
  val isFocused: Boolean = js.native
  def add(element: HTMLElement): Unit = js.native
  def remove(element: HTMLElement): Unit = js.native
}

