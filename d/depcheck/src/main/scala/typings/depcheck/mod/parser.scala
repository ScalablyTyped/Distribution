package typings.depcheck.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("depcheck", "parser")
@js.native
object parser extends js.Object {
  
  def coffee(content: String, filePath: String, deps: js.Array[String], rootDir: String): Node = js.native
  @JSName("coffee")
  var coffee_Original: Parser_ = js.native
  
  def es6(content: String, filePath: String, deps: js.Array[String], rootDir: String): Node = js.native
  @JSName("es6")
  var es6_Original: Parser_ = js.native
  
  def es7(content: String, filePath: String, deps: js.Array[String], rootDir: String): Node = js.native
  @JSName("es7")
  var es7_Original: Parser_ = js.native
  
  def jsx(content: String, filePath: String, deps: js.Array[String], rootDir: String): Node = js.native
  @JSName("jsx")
  var jsx_Original: Parser_ = js.native
  
  def sass(content: String, filePath: String, deps: js.Array[String], rootDir: String): Node = js.native
  @JSName("sass")
  var sass_Original: Parser_ = js.native
  
  def typescript(content: String, filePath: String, deps: js.Array[String], rootDir: String): Node = js.native
  @JSName("typescript")
  var typescript_Original: Parser_ = js.native
  
  def vue(content: String, filePath: String, deps: js.Array[String], rootDir: String): Node = js.native
  @JSName("vue")
  var vue_Original: Parser_ = js.native
}
