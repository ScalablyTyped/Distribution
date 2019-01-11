package typings
package cssLib.cssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("css", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def parse(code: java.lang.String): cssLib.cssMod.Stylesheet = js.native
  def parse(code: java.lang.String, options: cssLib.cssMod.ParserOptions): cssLib.cssMod.Stylesheet = js.native
  def stringify(stylesheet: cssLib.cssMod.Stylesheet): java.lang.String = js.native
  def stringify(stylesheet: cssLib.cssMod.Stylesheet, options: cssLib.cssMod.StringifyOptions): java.lang.String = js.native
}

