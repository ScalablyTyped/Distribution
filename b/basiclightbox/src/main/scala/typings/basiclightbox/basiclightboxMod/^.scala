package typings.basiclightbox.basiclightboxMod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("basiclightbox", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def create(content: String): BasicLightBox = js.native
  def create(content: String, options: BasicLightBoxOptions): BasicLightBox = js.native
  def create(content: Element): BasicLightBox = js.native
  def create(content: Element, options: BasicLightBoxOptions): BasicLightBox = js.native
  def visible(): Boolean = js.native
}

