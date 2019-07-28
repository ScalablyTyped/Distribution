package typings.css.cssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("css", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def parse(code: String): Stylesheet = js.native
  def parse(code: String, options: ParserOptions): Stylesheet = js.native
  def stringify(stylesheet: Stylesheet): String = js.native
  def stringify(stylesheet: Stylesheet, options: StringifyOptions): String = js.native
}

