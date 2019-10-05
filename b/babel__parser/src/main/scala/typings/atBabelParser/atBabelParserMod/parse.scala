package typings.atBabelParser.atBabelParserMod

import typings.atBabelTypes.atBabelTypesMod.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@babel/parser", "parse")
@js.native
object parse extends js.Object {
  def apply(input: String): File = js.native
  def apply(input: String, options: ParserOptions): File = js.native
}

