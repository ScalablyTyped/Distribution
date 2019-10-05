package typings.chaiDashDatetime.chaiDashDatetimeMod.Global

import typings.chaiDashDatetime.chaiDashDatetimeMod.Global.Chai.Assertion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Date extends js.Object {
  var should: Assertion
}

object Date {
  @scala.inline
  def apply(should: Assertion): Date = {
    val __obj = js.Dynamic.literal(should = should)
  
    __obj.asInstanceOf[Date]
  }
}

