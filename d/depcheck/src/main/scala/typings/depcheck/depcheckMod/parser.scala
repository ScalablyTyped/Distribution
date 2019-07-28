package typings.depcheck.depcheckMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("depcheck", "parser")
@js.native
object parser extends js.Object {
  @JSName("coffee")
  var coffee_Original: Parser = js.native
  @JSName("es6")
  var es6_Original: Parser = js.native
  @JSName("es7")
  var es7_Original: Parser = js.native
  @JSName("jsx")
  var jsx_Original: Parser = js.native
  @JSName("sass")
  var sass_Original: Parser = js.native
  @JSName("typescript")
  var typescript_Original: Parser = js.native
  def coffee(content: String, filePath: String, deps: js.Array[String], rootDir: String): Node = js.native
  def es6(content: String, filePath: String, deps: js.Array[String], rootDir: String): Node = js.native
  def es7(content: String, filePath: String, deps: js.Array[String], rootDir: String): Node = js.native
  def jsx(content: String, filePath: String, deps: js.Array[String], rootDir: String): Node = js.native
  def sass(content: String, filePath: String, deps: js.Array[String], rootDir: String): Node = js.native
  def typescript(content: String, filePath: String, deps: js.Array[String], rootDir: String): Node = js.native
}

