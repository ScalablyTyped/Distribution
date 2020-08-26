package typings.classValidator.validationSchemaMod

import org.scalablytyped.runtime.StringDictionary
import typings.classValidator.anon.Always
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidationSchema extends js.Object {
  /**
    * Schema name. This is required, because we tell validator to validate by this schema using its name.
    */
  var name: String = js.native
  /**
    * Validated properties.
    */
  var properties: /**
    * Name of the object's property to be validated which holds an array of validation constraints.
    */
  StringDictionary[js.Array[Always]] = js.native
}

object ValidationSchema {
  @scala.inline
  def apply(
    name: String,
    properties: /**
    * Name of the object's property to be validated which holds an array of validation constraints.
    */
  StringDictionary[js.Array[Always]]
  ): ValidationSchema = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationSchema]
  }
  @scala.inline
  implicit class ValidationSchemaOps[Self <: ValidationSchema] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setProperties(
      value: /**
      * Name of the object's property to be validated which holds an array of validation constraints.
      */
    StringDictionary[js.Array[Always]]
    ): Self = this.set("properties", value.asInstanceOf[js.Any])
  }
  
}

