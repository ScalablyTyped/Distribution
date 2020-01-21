package typings.cypress.Chai_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Property extends js.Object {
  def apply(name: String): Assertion = js.native
  def apply(name: String, message: String): Assertion = js.native
  def apply(name: String, value: js.Any): Assertion = js.native
  def apply(name: String, value: js.Any, message: String): Assertion = js.native
}

