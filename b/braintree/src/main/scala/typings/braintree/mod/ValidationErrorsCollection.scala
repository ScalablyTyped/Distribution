package typings.braintree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidationErrorsCollection extends js.Object {
  def deepErrors(): js.Array[ValidationError]
  def `for`(name: String): ValidationErrorsCollection
  def forIndex(index: Double): ValidationErrorsCollection
  def on(name: String): ValidationError
}

object ValidationErrorsCollection {
  @scala.inline
  def apply(
    deepErrors: () => js.Array[ValidationError],
    `for`: String => ValidationErrorsCollection,
    forIndex: Double => ValidationErrorsCollection,
    on: String => ValidationError
  ): ValidationErrorsCollection = {
    val __obj = js.Dynamic.literal(deepErrors = js.Any.fromFunction0(deepErrors), forIndex = js.Any.fromFunction1(forIndex), on = js.Any.fromFunction1(on))
    __obj.updateDynamic("for")(js.Any.fromFunction1(`for`))
    __obj.asInstanceOf[ValidationErrorsCollection]
  }
}

