package typings.classValidator

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("class-validator/types/validation/ValidationError", JSImport.Namespace)
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
    var constraints: js.UndefOr[StringDictionary[String]] = js.native
    
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
    
    def toString(
      shouldDecorate: js.UndefOr[scala.Nothing],
      hasParent: js.UndefOr[scala.Nothing],
      parentPath: String
    ): String = js.native
    def toString(shouldDecorate: js.UndefOr[scala.Nothing], hasParent: Boolean): String = js.native
    def toString(shouldDecorate: js.UndefOr[scala.Nothing], hasParent: Boolean, parentPath: String): String = js.native
    def toString(shouldDecorate: Boolean): String = js.native
    def toString(shouldDecorate: Boolean, hasParent: js.UndefOr[scala.Nothing], parentPath: String): String = js.native
    def toString(shouldDecorate: Boolean, hasParent: Boolean): String = js.native
    def toString(shouldDecorate: Boolean, hasParent: Boolean, parentPath: String): String = js.native
    
    /**
      * Value that haven't pass a validation.
      *
      * OPTIONAL - configurable via the ValidatorOptions.validationError.value option
      */
    var value: js.UndefOr[js.Any] = js.native
  }
}
