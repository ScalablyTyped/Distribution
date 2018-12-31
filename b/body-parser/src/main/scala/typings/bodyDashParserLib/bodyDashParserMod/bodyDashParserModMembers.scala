package typings
package bodyDashParserLib.bodyDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("body-parser", JSImport.Namespace)
@js.native
object bodyDashParserModMembers extends js.Object {
  // for docs go to https://github.com/expressjs/body-parser/tree/1.16.0#body-parser
  // @deprecated
  def apply(): connectLib.connectMod.createServerNs.NextHandleFunction = js.native
  def apply(
    options: bodyDashParserLib.bodyDashParserMod.bodyParserNs.OptionsJson with bodyDashParserLib.bodyDashParserMod.bodyParserNs.OptionsText with bodyDashParserLib.bodyDashParserMod.bodyParserNs.OptionsUrlencoded
  ): connectLib.connectMod.createServerNs.NextHandleFunction = js.native
  def json(): connectLib.connectMod.createServerNs.NextHandleFunction = js.native
  def json(options: bodyDashParserLib.bodyDashParserMod.bodyParserNs.OptionsJson): connectLib.connectMod.createServerNs.NextHandleFunction = js.native
  def raw(): connectLib.connectMod.createServerNs.NextHandleFunction = js.native
  def raw(options: bodyDashParserLib.bodyDashParserMod.bodyParserNs.Options): connectLib.connectMod.createServerNs.NextHandleFunction = js.native
  def text(): connectLib.connectMod.createServerNs.NextHandleFunction = js.native
  def text(options: bodyDashParserLib.bodyDashParserMod.bodyParserNs.OptionsText): connectLib.connectMod.createServerNs.NextHandleFunction = js.native
  def urlencoded(): connectLib.connectMod.createServerNs.NextHandleFunction = js.native
  def urlencoded(options: bodyDashParserLib.bodyDashParserMod.bodyParserNs.OptionsUrlencoded): connectLib.connectMod.createServerNs.NextHandleFunction = js.native
}

