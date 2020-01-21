package typings.classValidator

import typings.classValidator.validatorConstraintInterfaceMod.ValidatorConstraintInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("class-validator/metadata/ConstraintMetadata", JSImport.Namespace)
@js.native
object constraintMetadataMod extends js.Object {
  @js.native
  class ConstraintMetadata protected () extends js.Object {
    def this(target: js.Function) = this()
    def this(target: js.Function, name: String) = this()
    def this(target: js.Function, name: String, async: Boolean) = this()
    /**
      * Indicates if this validation is asynchronous or not.
      */
    var async: Boolean = js.native
    /**
      * Instance of the target custom validation class which performs validation.
      */
    val instance: ValidatorConstraintInterface = js.native
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

