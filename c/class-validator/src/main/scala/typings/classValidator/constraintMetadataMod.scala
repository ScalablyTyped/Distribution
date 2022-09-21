package typings.classValidator

import typings.classValidator.validatorConstraintInterfaceMod.ValidatorConstraintInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object constraintMetadataMod {
  
  @JSImport("class-validator/types/metadata/ConstraintMetadata", "ConstraintMetadata")
  @js.native
  open class ConstraintMetadata protected () extends StObject {
    def this(target: js.Function) = this()
    def this(target: js.Function, name: String) = this()
    def this(target: js.Function, name: String, async: Boolean) = this()
    def this(target: js.Function, name: Unit, async: Boolean) = this()
    
    /**
      * Indicates if this validation is asynchronous or not.
      */
    var async: Boolean = js.native
    
    /**
      * Instance of the target custom validation class which performs validation.
      */
    def instance: ValidatorConstraintInterface = js.native
    
    /**
      * Custom validation's name, that will be used as validation error type.
      */
    var name: String = js.native
    
    /**
      * Target class which performs validation.
      */
    var target: js.Function = js.native
  }
}
