package typings.classDashValidator.validationDashSchemaValidationSchemaMod

import org.scalablytyped.runtime.StringDictionary
import typings.classDashValidator.Anon_Always
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
  StringDictionary[js.Array[Anon_Always]]
}

object ValidationSchema {
  @scala.inline
  def apply(
    name: String,
    properties: /**
    * Name of the object's property to be validated which holds an array of validation constraints.
    */
  StringDictionary[js.Array[Anon_Always]]
  ): ValidationSchema = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ValidationSchema]
  }
}

