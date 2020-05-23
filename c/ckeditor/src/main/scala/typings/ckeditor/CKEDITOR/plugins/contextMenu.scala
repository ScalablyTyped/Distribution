package typings.ckeditor.CKEDITOR.plugins

import typings.ckeditor.CKEDITOR.dom.element
import typings.ckeditor.CKEDITOR.menu
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait contextMenu extends menu {
  def addTarget(element: element): Unit = js.native
  def addTarget(element: element, nativeContextMenuOnCtrl: Boolean): Unit = js.native
  def open(offsetParent: element): Unit = js.native
  def open(offsetParent: element, corner: Double): Unit = js.native
  def open(offsetParent: element, corner: Double, offsetX: Double): Unit = js.native
  def open(offsetParent: element, corner: Double, offsetX: Double, offsetY: Double): Unit = js.native
}

