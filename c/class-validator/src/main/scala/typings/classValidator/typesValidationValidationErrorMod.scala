package typings.classValidator

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesValidationValidationErrorMod {
  
  @JSImport("class-validator/types/validation/ValidationError", "ValidationError")
  @js.native
  open class ValidationError () extends StObject {
    
    /**
      * Contains all nested validation errors of the property.
      */
    var children: js.UndefOr[js.Array[ValidationError]] = js.native
    
    /**
      * Constraints that failed validation with error messages.
      */
    var constraints: js.UndefOr[StringDictionary[String]] = js.native
    
    var contexts: js.UndefOr[StringDictionary[Any]] = js.native
    
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
    
    def toString(shouldDecorate: Boolean): String = js.native
    def toString(shouldDecorate: Boolean, hasParent: Boolean): String = js.native
    def toString(shouldDecorate: Boolean, hasParent: Boolean, parentPath: String): String = js.native
    def toString(shouldDecorate: Boolean, hasParent: Boolean, parentPath: String, showConstraintMessages: Boolean): String = js.native
    def toString(shouldDecorate: Boolean, hasParent: Boolean, parentPath: Unit, showConstraintMessages: Boolean): String = js.native
    def toString(shouldDecorate: Boolean, hasParent: Unit, parentPath: String): String = js.native
    def toString(shouldDecorate: Boolean, hasParent: Unit, parentPath: String, showConstraintMessages: Boolean): String = js.native
    def toString(shouldDecorate: Boolean, hasParent: Unit, parentPath: Unit, showConstraintMessages: Boolean): String = js.native
    def toString(shouldDecorate: Unit, hasParent: Boolean): String = js.native
    def toString(shouldDecorate: Unit, hasParent: Boolean, parentPath: String): String = js.native
    def toString(shouldDecorate: Unit, hasParent: Boolean, parentPath: String, showConstraintMessages: Boolean): String = js.native
    def toString(shouldDecorate: Unit, hasParent: Boolean, parentPath: Unit, showConstraintMessages: Boolean): String = js.native
    def toString(shouldDecorate: Unit, hasParent: Unit, parentPath: String): String = js.native
    def toString(shouldDecorate: Unit, hasParent: Unit, parentPath: String, showConstraintMessages: Boolean): String = js.native
    def toString(shouldDecorate: Unit, hasParent: Unit, parentPath: Unit, showConstraintMessages: Boolean): String = js.native
    
    /**
      * Value that haven't pass a validation.
      *
      * OPTIONAL - configurable via the ValidatorOptions.validationError.value option
      */
    var value: js.UndefOr[Any] = js.native
  }
}
