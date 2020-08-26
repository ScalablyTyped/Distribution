package typings.classValidator.validationOptionsMod

import typings.classValidator.validationArgumentsMod.ValidationArguments
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidationOptions extends js.Object {
  /**
    * Indicates if validation must be performed always, no matter of validation groups used.
    */
  var always: js.UndefOr[Boolean] = js.native
  var context: js.UndefOr[js.Any] = js.native
  /**
    * Specifies if validated value is an array and each of its items must be validated.
    */
  var each: js.UndefOr[Boolean] = js.native
  /**
    * Validation groups used for this validation.
    */
  var groups: js.UndefOr[js.Array[String]] = js.native
  /**
    * Error message to be used on validation fail.
    * Message can be either string or a function that returns a string.
    */
  var message: js.UndefOr[String | (js.Function1[/* validationArguments */ ValidationArguments, String])] = js.native
}

object ValidationOptions {
  @scala.inline
  def apply(): ValidationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidationOptions]
  }
  @scala.inline
  implicit class ValidationOptionsOps[Self <: ValidationOptions] (val x: Self) extends AnyVal {
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
    def setAlways(value: Boolean): Self = this.set("always", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlways: Self = this.set("always", js.undefined)
    @scala.inline
    def setContext(value: js.Any): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    @scala.inline
    def setEach(value: Boolean): Self = this.set("each", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEach: Self = this.set("each", js.undefined)
    @scala.inline
    def setGroupsVarargs(value: String*): Self = this.set("groups", js.Array(value :_*))
    @scala.inline
    def setGroups(value: js.Array[String]): Self = this.set("groups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroups: Self = this.set("groups", js.undefined)
    @scala.inline
    def setMessageFunction1(value: /* validationArguments */ ValidationArguments => String): Self = this.set("message", js.Any.fromFunction1(value))
    @scala.inline
    def setMessage(value: String | (js.Function1[/* validationArguments */ ValidationArguments, String])): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
  }
  
}

