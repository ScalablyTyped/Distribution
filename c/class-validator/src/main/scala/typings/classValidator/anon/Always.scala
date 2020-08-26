package typings.classValidator.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Always extends js.Object {
  /**
    * Indicates if validation must be performed always, no matter of validation groups used.
    */
  var always: js.UndefOr[Boolean] = js.native
  /**
    * Constraints set by validation type.
    */
  var constraints: js.UndefOr[js.Array[_]] = js.native
  /**
    * Specifies if validated value is an array and each of its item must be validated.
    */
  var each: js.UndefOr[Boolean] = js.native
  /**
    * Validation groups used for this validation.
    */
  var groups: js.UndefOr[js.Array[String]] = js.native
  /**
    * Error message used to be used on validation fail.
    * You can use "$value" to use value that was failed by validation.
    * You can use "$constraint1" and "$constraint2" keys in the message string,
    * and they will be replaced with constraint values if they exist.
    * Message can be either string, either a function that returns a string.
    * Second option allows to use values and custom messages depend of them.
    */
  var message: js.UndefOr[
    String | (js.Function3[
      /* value */ js.UndefOr[js.Any], 
      /* constraint1 */ js.UndefOr[js.Any], 
      /* constraint2 */ js.UndefOr[js.Any], 
      String
    ])
  ] = js.native
  /**
    * Specific validation type options.
    */
  var options: js.UndefOr[js.Any] = js.native
  /**
    * Validation type. Should be one of the ValidationTypes value.
    */
  var `type`: String = js.native
}

object Always {
  @scala.inline
  def apply(`type`: String): Always = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Always]
  }
  @scala.inline
  implicit class AlwaysOps[Self <: Always] (val x: Self) extends AnyVal {
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
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setAlways(value: Boolean): Self = this.set("always", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlways: Self = this.set("always", js.undefined)
    @scala.inline
    def setConstraintsVarargs(value: js.Any*): Self = this.set("constraints", js.Array(value :_*))
    @scala.inline
    def setConstraints(value: js.Array[_]): Self = this.set("constraints", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConstraints: Self = this.set("constraints", js.undefined)
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
    def setMessageFunction3(
      value: (/* value */ js.UndefOr[js.Any], /* constraint1 */ js.UndefOr[js.Any], /* constraint2 */ js.UndefOr[js.Any]) => String
    ): Self = this.set("message", js.Any.fromFunction3(value))
    @scala.inline
    def setMessage(
      value: String | (js.Function3[
          /* value */ js.UndefOr[js.Any], 
          /* constraint1 */ js.UndefOr[js.Any], 
          /* constraint2 */ js.UndefOr[js.Any], 
          String
        ])
    ): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    @scala.inline
    def setOptions(value: js.Any): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
  }
  
}

