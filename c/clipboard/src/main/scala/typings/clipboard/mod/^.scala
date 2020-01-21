package typings.clipboard.mod

import typings.std.Element
import typings.std.NodeListOf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("clipboard", JSImport.Namespace)
@js.native
class ^ protected () extends ClipboardJS {
  def this(selector: String) = this()
  def this(selector: Element) = this()
  def this(selector: NodeListOf[Element]) = this()
  def this(selector: String, options: Options) = this()
  def this(selector: Element, options: Options) = this()
  def this(selector: NodeListOf[Element], options: Options) = this()
}

@JSImport("clipboard", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Checks if clipboard.js is supported
    */
  def isSupported(): Boolean = js.native
}

