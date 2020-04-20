package typings.classValidator.validationSchemaMod

import org.scalablytyped.runtime.StringDictionary
import typings.classValidator.AnonAlways
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidationSchema extends js.Object {
  /**
    * Schema name. This is required, because we tell validator to validate by this schema using its name.
    */
  var name: String
  /**
    * Validated properties.
    */
  var properties: /**
    * Name of the object's property to be validated which holds an array of validation constraints.
    */
  StringDictionary[js.Array[AnonAlways]]
}

object ValidationSchema {
  @scala.inline
  def apply(
    name: String,
    properties: /**
    * Name of the object's property to be validated which holds an array of validation constraints.
    */
  StringDictionary[js.Array[AnonAlways]]
  ): ValidationSchema = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationSchema]
  }
}

