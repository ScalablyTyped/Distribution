package typings
package bodyDashParserLib.bodyDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("body-parser", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  // for docs go to https://github.com/expressjs/body-parser/tree/1.16.0#body-parser
  // @deprecated
  def apply(): connectLib.connectMod.NextHandleFunction = js.native
  def apply(options: OptionsJson with OptionsText with OptionsUrlencoded): connectLib.connectMod.NextHandleFunction = js.native
  def json(): connectLib.connectMod.NextHandleFunction = js.native
  def json(options: OptionsJson): connectLib.connectMod.NextHandleFunction = js.native
  def raw(): connectLib.connectMod.NextHandleFunction = js.native
  def raw(options: Options): connectLib.connectMod.NextHandleFunction = js.native
  def text(): connectLib.connectMod.NextHandleFunction = js.native
  def text(options: OptionsText): connectLib.connectMod.NextHandleFunction = js.native
  def urlencoded(): connectLib.connectMod.NextHandleFunction = js.native
  def urlencoded(options: OptionsUrlencoded): connectLib.connectMod.NextHandleFunction = js.native
}

