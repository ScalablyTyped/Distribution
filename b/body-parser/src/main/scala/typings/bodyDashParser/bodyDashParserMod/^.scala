package typings.bodyDashParser.bodyDashParserMod

import typings.connect.connectMod.NextHandleFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("body-parser", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  // for docs go to https://github.com/expressjs/body-parser/tree/1.16.0#body-parser
  // @deprecated
  def apply(): NextHandleFunction = js.native
  def apply(options: OptionsJson with OptionsText with OptionsUrlencoded): NextHandleFunction = js.native
  def json(): NextHandleFunction = js.native
  def json(options: OptionsJson): NextHandleFunction = js.native
  def raw(): NextHandleFunction = js.native
  def raw(options: Options): NextHandleFunction = js.native
  def text(): NextHandleFunction = js.native
  def text(options: OptionsText): NextHandleFunction = js.native
  def urlencoded(): NextHandleFunction = js.native
  def urlencoded(options: OptionsUrlencoded): NextHandleFunction = js.native
}

