package typings.depcheck.depcheckMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("depcheck", "special")
@js.native
object special extends js.Object {
  @JSName("babel")
  var babel_Original: Parser = js.native
  @JSName("bin")
  var bin_Original: Parser = js.native
  @JSName("commitizen")
  var commitizen_Original: Parser = js.native
  @JSName("eslint")
  var eslint_Original: Parser = js.native
  @JSName("feross-standard")
  var `feross-standard_Original`: Parser = js.native
  @JSName("gatsby")
  var gatsby_Original: Parser = js.native
  @JSName("gulp-load-plugins")
  var `gulp-load-plugins_Original`: Parser = js.native
  @JSName("jest")
  var jest_Original: Parser = js.native
  @JSName("karma")
  var karma_Original: Parser = js.native
  @JSName("mocha")
  var mocha_Original: Parser = js.native
  @JSName("tslint")
  var tslint_Original: Parser = js.native
  @JSName("webpack")
  var webpack_Original: Parser = js.native
  def babel(content: String, filePath: String, deps: js.Array[String], rootDir: String): Node = js.native
  def bin(content: String, filePath: String, deps: js.Array[String], rootDir: String): Node = js.native
  def commitizen(content: String, filePath: String, deps: js.Array[String], rootDir: String): Node = js.native
  def eslint(content: String, filePath: String, deps: js.Array[String], rootDir: String): Node = js.native
  def `feross-standard`(content: String, filePath: String, deps: js.Array[String], rootDir: String): Node = js.native
  def gatsby(content: String, filePath: String, deps: js.Array[String], rootDir: String): Node = js.native
  def `gulp-load-plugins`(content: String, filePath: String, deps: js.Array[String], rootDir: String): Node = js.native
  def jest(content: String, filePath: String, deps: js.Array[String], rootDir: String): Node = js.native
  def karma(content: String, filePath: String, deps: js.Array[String], rootDir: String): Node = js.native
  def mocha(content: String, filePath: String, deps: js.Array[String], rootDir: String): Node = js.native
  def tslint(content: String, filePath: String, deps: js.Array[String], rootDir: String): Node = js.native
  def webpack(content: String, filePath: String, deps: js.Array[String], rootDir: String): Node = js.native
}

