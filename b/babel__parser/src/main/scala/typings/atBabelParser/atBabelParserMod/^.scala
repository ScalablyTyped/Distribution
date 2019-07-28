package typings.atBabelParser.atBabelParserMod

import typings.atBabelTypes.atBabelTypesMod.Expression
import typings.atBabelTypes.atBabelTypesMod.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@babel/parser", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def parse(input: String): File = js.native
  def parse(input: String, options: ParserOptions): File = js.native
  def parseExpression(input: String): Expression = js.native
  def parseExpression(input: String, options: ParserOptions): Expression = js.native
}

