package typings.d3.mod

import typings.std.Document
import typings.std.Element
import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3", "window")
@js.native
object window extends js.Object {
  def apply(DOMNode: Document): Window = js.native
  def apply(DOMNode: Element): Window = js.native
  def apply(DOMNode: Window): Window = js.native
}

