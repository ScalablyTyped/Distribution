package typings.betterScroll.mod

import typings.std.Element
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("better-scroll", JSImport.Default)
@js.native
class default protected () extends BScroll {
  def this(element: String) = this()
  def this(element: Element) = this()
  def this(element: String, options: Partial[BsOption]) = this()
  def this(element: Element, options: Partial[BsOption]) = this()
}

