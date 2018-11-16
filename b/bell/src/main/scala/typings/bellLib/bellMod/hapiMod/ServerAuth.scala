package typings
package bellLib.bellMod.hapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerAuth extends js.Object {
  def strategy(
    name: java.lang.String,
    scheme: bellLib.bellLibStrings.bell,
    mode: bellLib.bellLibStrings.`try`,
    options: bellLib.bellMod.BellOptions
  ): scala.Unit = js.native
  def strategy(
    name: java.lang.String,
    scheme: bellLib.bellLibStrings.bell,
    mode: bellLib.bellLibStrings.optional,
    options: bellLib.bellMod.BellOptions
  ): scala.Unit = js.native
  def strategy(
    name: java.lang.String,
    scheme: bellLib.bellLibStrings.bell,
    mode: bellLib.bellLibStrings.required,
    options: bellLib.bellMod.BellOptions
  ): scala.Unit = js.native
  @JSName("strategy")
  def strategy_bell(
    name: java.lang.String,
    scheme: bellLib.bellLibStrings.bell,
    mode: scala.Boolean,
    options: bellLib.bellMod.BellOptions
  ): scala.Unit = js.native
  @JSName("strategy")
  def strategy_bell(name: java.lang.String, scheme: bellLib.bellLibStrings.bell, options: bellLib.bellMod.BellOptions): scala.Unit = js.native
}

