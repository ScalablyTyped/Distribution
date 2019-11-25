package typings.classDashValidator.validationValidationArgumentsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidationArguments extends js.Object {
  /**
    * Constraints set by this validation type.
    */
  var constraints: js.Array[_]
  /**
    * Object that is being validated.
    */
  var `object`: js.Object
  /**
    * Name of the object's property being validated.
    */
  var property: String
  /**
    * Name of the target that is being validated.
    */
  var targetName: String
  /**
    * Validating value.
    */
  var value: js.Any
}

object ValidationArguments {
  @scala.inline
  def apply(constraints: js.Array[_], `object`: js.Object, property: String, targetName: String, value: js.Any): ValidationArguments = {
    val __obj = js.Dynamic.literal(constraints = constraints.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any], targetName = targetName.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationArguments]
  }
}

