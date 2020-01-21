package typings.commonmark.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("commonmark", "XmlRenderer")
@js.native
class XmlRenderer () extends js.Object {
  def this(options: XmlRenderingOptions) = this()
  def render(root: Node): String = js.native
}

