package typings.browserfsH4gEcI12

import typings.node.bufferMod.global.Buffer
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object apiErrorDTsMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException * / any */ @JSImport(".browserfs-H4gEcI12/dist/node/core/api_error.d.ts", "ApiError")
  @js.native
  open class ApiError protected ()
    extends StObject
       with Error {
    /**
      * Represents a BrowserFS error. Passed back to applications after a failed
      * call to the BrowserFS API.
      *
      * Error codes mirror those returned by regular Unix file operations, which is
      * what Node returns.
      * @constructor ApiError
      * @param type The type of the error.
      * @param [message] A descriptive error message.
      */
    def this(`type`: ErrorCode) = this()
    def this(`type`: ErrorCode, message: String) = this()
    def this(`type`: ErrorCode, message: String, path: String) = this()
    def this(`type`: ErrorCode, message: Unit, path: String) = this()
    
    /**
      * The size of the API error in buffer-form in bytes.
      */
    def bufferSize(): Double = js.native
    
    var code: String = js.native
    
    var errno: ErrorCode = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    var path: js.UndefOr[String] = js.native
    
    var syscall: String = js.native
    
    def toJSON(): Any = js.native
    
    /**
      * Writes the API error into a buffer.
      */
    def writeToBuffer(): Buffer = js.native
    def writeToBuffer(buffer: Unit, i: Double): Buffer = js.native
    def writeToBuffer(buffer: Buffer): Buffer = js.native
    def writeToBuffer(buffer: Buffer, i: Double): Buffer = js.native
  }
  /* static members */
  object ApiError {
    
    @JSImport(".browserfs-H4gEcI12/dist/node/core/api_error.d.ts", "ApiError")
    @js.native
    val ^ : js.Any = js.native
    
    inline def EEXIST(path: String): ApiError = ^.asInstanceOf[js.Dynamic].applyDynamic("EEXIST")(path.asInstanceOf[js.Any]).asInstanceOf[ApiError]
    
    inline def EISDIR(path: String): ApiError = ^.asInstanceOf[js.Dynamic].applyDynamic("EISDIR")(path.asInstanceOf[js.Any]).asInstanceOf[ApiError]
    
    inline def ENOENT(path: String): ApiError = ^.asInstanceOf[js.Dynamic].applyDynamic("ENOENT")(path.asInstanceOf[js.Any]).asInstanceOf[ApiError]
    
    inline def ENOTDIR(path: String): ApiError = ^.asInstanceOf[js.Dynamic].applyDynamic("ENOTDIR")(path.asInstanceOf[js.Any]).asInstanceOf[ApiError]
    
    inline def ENOTEMPTY(path: String): ApiError = ^.asInstanceOf[js.Dynamic].applyDynamic("ENOTEMPTY")(path.asInstanceOf[js.Any]).asInstanceOf[ApiError]
    
    inline def EPERM(path: String): ApiError = ^.asInstanceOf[js.Dynamic].applyDynamic("EPERM")(path.asInstanceOf[js.Any]).asInstanceOf[ApiError]
    
    inline def FileError(code: ErrorCode, p: String): ApiError = (^.asInstanceOf[js.Dynamic].applyDynamic("FileError")(code.asInstanceOf[js.Any], p.asInstanceOf[js.Any])).asInstanceOf[ApiError]
    
    /**
      * Creates an ApiError object from a buffer.
      */
    inline def fromBuffer(buffer: Buffer): ApiError = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBuffer")(buffer.asInstanceOf[js.Any]).asInstanceOf[ApiError]
    inline def fromBuffer(buffer: Buffer, i: Double): ApiError = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBuffer")(buffer.asInstanceOf[js.Any], i.asInstanceOf[js.Any])).asInstanceOf[ApiError]
    
    inline def fromJSON(json: Any): ApiError = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[ApiError]
  }
  
  @js.native
  sealed trait ErrorCode extends StObject
  @JSImport(".browserfs-H4gEcI12/dist/node/core/api_error.d.ts", "ErrorCode")
  @js.native
  object ErrorCode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ErrorCode & Double] = js.native
    
    @js.native
    sealed trait EACCES
      extends StObject
         with ErrorCode
    /* 13 */ val EACCES: typings.browserfsH4gEcI12.apiErrorDTsMod.ErrorCode.EACCES & Double = js.native
    
    @js.native
    sealed trait EBADF
      extends StObject
         with ErrorCode
    /* 9 */ val EBADF: typings.browserfsH4gEcI12.apiErrorDTsMod.ErrorCode.EBADF & Double = js.native
    
    @js.native
    sealed trait EBUSY
      extends StObject
         with ErrorCode
    /* 16 */ val EBUSY: typings.browserfsH4gEcI12.apiErrorDTsMod.ErrorCode.EBUSY & Double = js.native
    
    @js.native
    sealed trait EEXIST
      extends StObject
         with ErrorCode
    /* 17 */ val EEXIST: typings.browserfsH4gEcI12.apiErrorDTsMod.ErrorCode.EEXIST & Double = js.native
    
    @js.native
    sealed trait EFBIG
      extends StObject
         with ErrorCode
    /* 27 */ val EFBIG: typings.browserfsH4gEcI12.apiErrorDTsMod.ErrorCode.EFBIG & Double = js.native
    
    @js.native
    sealed trait EINVAL
      extends StObject
         with ErrorCode
    /* 22 */ val EINVAL: typings.browserfsH4gEcI12.apiErrorDTsMod.ErrorCode.EINVAL & Double = js.native
    
    @js.native
    sealed trait EIO
      extends StObject
         with ErrorCode
    /* 5 */ val EIO: typings.browserfsH4gEcI12.apiErrorDTsMod.ErrorCode.EIO & Double = js.native
    
    @js.native
    sealed trait EISDIR
      extends StObject
         with ErrorCode
    /* 21 */ val EISDIR: typings.browserfsH4gEcI12.apiErrorDTsMod.ErrorCode.EISDIR & Double = js.native
    
    @js.native
    sealed trait ENOENT
      extends StObject
         with ErrorCode
    /* 2 */ val ENOENT: typings.browserfsH4gEcI12.apiErrorDTsMod.ErrorCode.ENOENT & Double = js.native
    
    @js.native
    sealed trait ENOSPC
      extends StObject
         with ErrorCode
    /* 28 */ val ENOSPC: typings.browserfsH4gEcI12.apiErrorDTsMod.ErrorCode.ENOSPC & Double = js.native
    
    @js.native
    sealed trait ENOTDIR
      extends StObject
         with ErrorCode
    /* 20 */ val ENOTDIR: typings.browserfsH4gEcI12.apiErrorDTsMod.ErrorCode.ENOTDIR & Double = js.native
    
    @js.native
    sealed trait ENOTEMPTY
      extends StObject
         with ErrorCode
    /* 39 */ val ENOTEMPTY: typings.browserfsH4gEcI12.apiErrorDTsMod.ErrorCode.ENOTEMPTY & Double = js.native
    
    @js.native
    sealed trait ENOTSUP
      extends StObject
         with ErrorCode
    /* 95 */ val ENOTSUP: typings.browserfsH4gEcI12.apiErrorDTsMod.ErrorCode.ENOTSUP & Double = js.native
    
    @js.native
    sealed trait EPERM
      extends StObject
         with ErrorCode
    /* 1 */ val EPERM: typings.browserfsH4gEcI12.apiErrorDTsMod.ErrorCode.EPERM & Double = js.native
    
    @js.native
    sealed trait EROFS
      extends StObject
         with ErrorCode
    /* 30 */ val EROFS: typings.browserfsH4gEcI12.apiErrorDTsMod.ErrorCode.EROFS & Double = js.native
  }
}
