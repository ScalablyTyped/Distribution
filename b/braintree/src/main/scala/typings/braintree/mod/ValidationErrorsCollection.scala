package typings.braintree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidationErrorsCollection extends js.Object {
  def deepErrors(): js.Array[ValidationError] = js.native
  def `for`(name: String): ValidationErrorsCollection = js.native
  def forIndex(index: Double): ValidationErrorsCollection = js.native
  def on(name: String): ValidationError = js.native
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
  @scala.inline
  implicit class ValidationErrorsCollectionOps[Self <: ValidationErrorsCollection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDeepErrors(value: () => js.Array[ValidationError]): Self = this.set("deepErrors", js.Any.fromFunction0(value))
    @scala.inline
    def setFor(value: String => ValidationErrorsCollection): Self = this.set("for", js.Any.fromFunction1(value))
    @scala.inline
    def setForIndex(value: Double => ValidationErrorsCollection): Self = this.set("forIndex", js.Any.fromFunction1(value))
    @scala.inline
    def setOn(value: String => ValidationError): Self = this.set("on", js.Any.fromFunction1(value))
  }
  
}

