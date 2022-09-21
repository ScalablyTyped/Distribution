package typings.classValidator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object validationTypesMod {
  
  @JSImport("class-validator/types/validation/ValidationTypes", "ValidationTypes")
  @js.native
  open class ValidationTypes () extends StObject
  /* static members */
  object ValidationTypes {
    
    @JSImport("class-validator/types/validation/ValidationTypes", "ValidationTypes")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("class-validator/types/validation/ValidationTypes", "ValidationTypes.CONDITIONAL_VALIDATION")
    @js.native
    def CONDITIONAL_VALIDATION: String = js.native
    inline def CONDITIONAL_VALIDATION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CONDITIONAL_VALIDATION")(x.asInstanceOf[js.Any])
    
    @JSImport("class-validator/types/validation/ValidationTypes", "ValidationTypes.CUSTOM_VALIDATION")
    @js.native
    def CUSTOM_VALIDATION: String = js.native
    inline def CUSTOM_VALIDATION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CUSTOM_VALIDATION")(x.asInstanceOf[js.Any])
    
    @JSImport("class-validator/types/validation/ValidationTypes", "ValidationTypes.IS_DEFINED")
    @js.native
    def IS_DEFINED: String = js.native
    inline def IS_DEFINED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IS_DEFINED")(x.asInstanceOf[js.Any])
    
    @JSImport("class-validator/types/validation/ValidationTypes", "ValidationTypes.NESTED_VALIDATION")
    @js.native
    def NESTED_VALIDATION: String = js.native
    inline def NESTED_VALIDATION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NESTED_VALIDATION")(x.asInstanceOf[js.Any])
    
    @JSImport("class-validator/types/validation/ValidationTypes", "ValidationTypes.PROMISE_VALIDATION")
    @js.native
    def PROMISE_VALIDATION: String = js.native
    inline def PROMISE_VALIDATION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PROMISE_VALIDATION")(x.asInstanceOf[js.Any])
    
    @JSImport("class-validator/types/validation/ValidationTypes", "ValidationTypes.WHITELIST")
    @js.native
    def WHITELIST: String = js.native
    inline def WHITELIST_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WHITELIST")(x.asInstanceOf[js.Any])
    
    /**
      * Checks if validation type is valid.
      */
    inline def isValid(`type`: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValid")(`type`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
}
