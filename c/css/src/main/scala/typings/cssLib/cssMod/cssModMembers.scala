package typings
package cssLib.cssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("css", JSImport.Namespace)
@js.native
object cssModMembers extends js.Object {
  def parse(code: java.lang.String): Stylesheet = js.native
  def parse(code: java.lang.String, options: ParserOptions): Stylesheet = js.native
  def stringify(stylesheet: Stylesheet): java.lang.String = js.native
  def stringify(stylesheet: Stylesheet, options: StringifyOptions): java.lang.String = js.native
}

