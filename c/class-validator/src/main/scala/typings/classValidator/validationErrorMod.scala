package typings.classValidator

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("class-validator/validation/ValidationError", JSImport.Namespace)
@js.native
object validationErrorMod extends js.Object {
  @js.native
  class ValidationError () extends js.Object {
    /**
      * Contains all nested validation errors of the property.
      */
    var children: js.Array[ValidationError] = js.native
    /**
      * Constraints that failed validation with error messages.
      */
    var constraints: StringDictionary[String] = js.native
    var contexts: js.UndefOr[StringDictionary[js.Any]] = js.native
    /**
      * Object's property that haven't pass validation.
      */
    var property: String = js.native
    /**
      * Object that was validated.
      *
      * OPTIONAL - configurable via the ValidatorOptions.validationError.target option
      */
    var target: js.UndefOr[js.Object] = js.native
    /**
      * Value that haven't pass a validation.
      *
      * OPTIONAL - configurable via the ValidatorOptions.validationError.value option
      */
    var value: js.UndefOr[js.Any] = js.native
    def toString(shouldDecorate: Boolean): String = js.native
    def toString(shouldDecorate: Boolean, hasParent: Boolean): String = js.native
    def toString(shouldDecorate: Boolean, hasParent: Boolean, parentPath: String): String = js.native
  }
  
}

