package typings.intlMessageformatGJXgwETY

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorDTsMod {
  
  @js.native
  sealed trait ErrorCode extends StObject
  @JSImport(".intl-messageformat-GJXgwETY/lib/src/error.d.ts", "ErrorCode")
  @js.native
  object ErrorCode extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ErrorCode & String] = js.native
    
    @js.native
    sealed trait INVALID_VALUE
      extends StObject
         with ErrorCode
    /* "INVALID_VALUE" */ val INVALID_VALUE: typings.intlMessageformatGJXgwETY.errorDTsMod.ErrorCode.INVALID_VALUE & String = js.native
    
    @js.native
    sealed trait MISSING_INTL_API
      extends StObject
         with ErrorCode
    /* "MISSING_INTL_API" */ val MISSING_INTL_API: typings.intlMessageformatGJXgwETY.errorDTsMod.ErrorCode.MISSING_INTL_API & String = js.native
    
    @js.native
    sealed trait MISSING_VALUE
      extends StObject
         with ErrorCode
    /* "MISSING_VALUE" */ val MISSING_VALUE: typings.intlMessageformatGJXgwETY.errorDTsMod.ErrorCode.MISSING_VALUE & String = js.native
  }
  
  @JSImport(".intl-messageformat-GJXgwETY/lib/src/error.d.ts", "FormatError")
  @js.native
  open class FormatError protected ()
    extends StObject
       with Error {
    def this(msg: String, code: ErrorCode) = this()
    def this(msg: String, code: ErrorCode, originalMessage: String) = this()
    
    val code: ErrorCode = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    /**
      * Original message we're trying to format
      * `undefined` if we're only dealing w/ AST
      *
      * @type {(string | undefined)}
      * @memberof FormatError
      */
    val originalMessage: js.UndefOr[String] = js.native
  }
  
  @JSImport(".intl-messageformat-GJXgwETY/lib/src/error.d.ts", "InvalidValueError")
  @js.native
  open class InvalidValueError protected () extends FormatError {
    def this(variableId: String, value: Any, options: js.Array[String]) = this()
    def this(variableId: String, value: Any, options: js.Array[String], originalMessage: String) = this()
  }
  
  @JSImport(".intl-messageformat-GJXgwETY/lib/src/error.d.ts", "InvalidValueTypeError")
  @js.native
  open class InvalidValueTypeError protected () extends FormatError {
    def this(value: Any, `type`: String) = this()
    def this(value: Any, `type`: String, originalMessage: String) = this()
  }
  
  @JSImport(".intl-messageformat-GJXgwETY/lib/src/error.d.ts", "MissingValueError")
  @js.native
  open class MissingValueError protected () extends FormatError {
    def this(variableId: String) = this()
    def this(variableId: String, originalMessage: String) = this()
  }
}
