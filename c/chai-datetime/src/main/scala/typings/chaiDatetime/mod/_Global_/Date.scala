package typings.chaiDatetime.mod._Global_

import typings.chaiDatetime.mod._Global_.Chai.Assertion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Date extends js.Object {
  var should: Assertion
}

object Date {
  @scala.inline
  def apply(should: Assertion): Date = {
    val __obj = js.Dynamic.literal(should = should.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Date]
  }
}

