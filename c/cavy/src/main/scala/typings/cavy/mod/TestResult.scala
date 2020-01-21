package typings.cavy.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestResult extends js.Object {
  var message: String
  var passed: Boolean
}

object TestResult {
  @scala.inline
  def apply(message: String, passed: Boolean): TestResult = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], passed = passed.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TestResult]
  }
}

