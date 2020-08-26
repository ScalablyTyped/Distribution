package typings.classValidator.validationArgumentsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidationArguments extends js.Object {
  /**
    * Constraints set by this validation type.
    */
  var constraints: js.Array[_] = js.native
  /**
    * Object that is being validated.
    */
  var `object`: js.Object = js.native
  /**
    * Name of the object's property being validated.
    */
  var property: String = js.native
  /**
    * Name of the target that is being validated.
    */
  var targetName: String = js.native
  /**
    * Validating value.
    */
  var value: js.Any = js.native
}

object ValidationArguments {
  @scala.inline
  def apply(constraints: js.Array[_], `object`: js.Object, property: String, targetName: String, value: js.Any): ValidationArguments = {
    val __obj = js.Dynamic.literal(constraints = constraints.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any], targetName = targetName.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationArguments]
  }
  @scala.inline
  implicit class ValidationArgumentsOps[Self <: ValidationArguments] (val x: Self) extends AnyVal {
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
    def setConstraintsVarargs(value: js.Any*): Self = this.set("constraints", js.Array(value :_*))
    @scala.inline
    def setConstraints(value: js.Array[_]): Self = this.set("constraints", value.asInstanceOf[js.Any])
    @scala.inline
    def setObject(value: js.Object): Self = this.set("object", value.asInstanceOf[js.Any])
    @scala.inline
    def setProperty(value: String): Self = this.set("property", value.asInstanceOf[js.Any])
    @scala.inline
    def setTargetName(value: String): Self = this.set("targetName", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

