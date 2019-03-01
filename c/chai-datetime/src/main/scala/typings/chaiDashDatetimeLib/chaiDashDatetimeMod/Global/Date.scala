package typings
package chaiDashDatetimeLib.chaiDashDatetimeMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Date extends js.Object {
  var should: chaiDashDatetimeLib.chaiDashDatetimeMod.Global.ChaiNs.Assertion
}

object Date {
  @scala.inline
  def apply(should: chaiDashDatetimeLib.chaiDashDatetimeMod.Global.ChaiNs.Assertion): Date = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("should")(should)
    __obj.asInstanceOf[Date]
  }
}

