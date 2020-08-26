package typings.classValidator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("class-validator/types/validation/ValidationTypes", JSImport.Namespace)
@js.native
object validationTypesMod extends js.Object {
  @js.native
  class ValidationTypes () extends js.Object
  
  /* static members */
  @js.native
  object ValidationTypes extends js.Object {
    var CONDITIONAL_VALIDATION: String = js.native
    var CUSTOM_VALIDATION: String = js.native
    var IS_DEFINED: String = js.native
    var NESTED_VALIDATION: String = js.native
    var PROMISE_VALIDATION: String = js.native
    var WHITELIST: String = js.native
    /**
      * Checks if validation type is valid.
      */
    def isValid(`type`: String): Boolean = js.native
  }
  
}

