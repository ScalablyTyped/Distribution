package typings
package chaiDashFsLib.chaiDashFsMod.Global.ChaiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LanguageChains extends js.Object {
  var json: Assertion
  var using: Assertion
}

object LanguageChains {
  @scala.inline
  def apply(json: Assertion, using: Assertion): LanguageChains = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("json")(json)
    __obj.updateDynamic("using")(using)
    __obj.asInstanceOf[LanguageChains]
  }
}

