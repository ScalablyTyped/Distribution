package typings.browserfs

import typings.node.Buffer
import typings.node.NodeJS.ErrnoException
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object apiErrorMod {
  
  @JSImport("browserfs/dist/node/core/api_error", "ApiError")
  @js.native
  class ApiError protected () extends ErrnoException {
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
    def this(`type`: ErrorCode, message: js.UndefOr[scala.Nothing], path: String) = this()
    def this(`type`: ErrorCode, message: String, path: String) = this()
    
    /**
      * The size of the API error in buffer-form in bytes.
      */
    def bufferSize(): Double = js.native
    
    @JSName("code")
    var code_ApiError: String = js.native
    
    @JSName("errno")
    var errno_ApiError: ErrorCode = js.native
    
    @JSName("syscall")
    var syscall_ApiError: String = js.native
    
    def toJSON(): js.Any = js.native
    
    /**
      * Writes the API error into a buffer.
      */
    def writeToBuffer(): Buffer = js.native
    def writeToBuffer(buffer: js.UndefOr[scala.Nothing], i: Double): Buffer = js.native
    def writeToBuffer(buffer: Buffer): Buffer = js.native
    def writeToBuffer(buffer: Buffer, i: Double): Buffer = js.native
  }
  /* static members */
  object ApiError {
    
    @JSImport("browserfs/dist/node/core/api_error", "ApiError.EEXIST")
    @js.native
    def EEXIST(path: String): ApiError = js.native
    
    @JSImport("browserfs/dist/node/core/api_error", "ApiError.EISDIR")
    @js.native
    def EISDIR(path: String): ApiError = js.native
    
    @JSImport("browserfs/dist/node/core/api_error", "ApiError.ENOENT")
    @js.native
    def ENOENT(path: String): ApiError = js.native
    
    @JSImport("browserfs/dist/node/core/api_error", "ApiError.ENOTDIR")
    @js.native
    def ENOTDIR(path: String): ApiError = js.native
    
    @JSImport("browserfs/dist/node/core/api_error", "ApiError.ENOTEMPTY")
    @js.native
    def ENOTEMPTY(path: String): ApiError = js.native
    
    @JSImport("browserfs/dist/node/core/api_error", "ApiError.EPERM")
    @js.native
    def EPERM(path: String): ApiError = js.native
    
    @JSImport("browserfs/dist/node/core/api_error", "ApiError.FileError")
    @js.native
    def FileError(code: ErrorCode, p: String): ApiError = js.native
    
    /**
      * Creates an ApiError object from a buffer.
      */
    @JSImport("browserfs/dist/node/core/api_error", "ApiError.fromBuffer")
    @js.native
    def fromBuffer(buffer: Buffer): ApiError = js.native
    @JSImport("browserfs/dist/node/core/api_error", "ApiError.fromBuffer")
    @js.native
    def fromBuffer(buffer: Buffer, i: Double): ApiError = js.native
    
    @JSImport("browserfs/dist/node/core/api_error", "ApiError.fromJSON")
    @js.native
    def fromJSON(json: js.Any): ApiError = js.native
  }
  
  @js.native
  sealed trait ErrorCode extends StObject
  @JSImport("browserfs/dist/node/core/api_error", "ErrorCode")
  @js.native
  object ErrorCode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ErrorCode with Double] = js.native
    
    @js.native
    sealed trait EACCES extends ErrorCode
    /* 13 */ val EACCES: typings.browserfs.apiErrorMod.ErrorCode.EACCES with Double = js.native
    
    @js.native
    sealed trait EBADF extends ErrorCode
    /* 9 */ val EBADF: typings.browserfs.apiErrorMod.ErrorCode.EBADF with Double = js.native
    
    @js.native
    sealed trait EBUSY extends ErrorCode
    /* 16 */ val EBUSY: typings.browserfs.apiErrorMod.ErrorCode.EBUSY with Double = js.native
    
    @js.native
    sealed trait EEXIST extends ErrorCode
    /* 17 */ val EEXIST: typings.browserfs.apiErrorMod.ErrorCode.EEXIST with Double = js.native
    
    @js.native
    sealed trait EFBIG extends ErrorCode
    /* 27 */ val EFBIG: typings.browserfs.apiErrorMod.ErrorCode.EFBIG with Double = js.native
    
    @js.native
    sealed trait EINVAL extends ErrorCode
    /* 22 */ val EINVAL: typings.browserfs.apiErrorMod.ErrorCode.EINVAL with Double = js.native
    
    @js.native
    sealed trait EIO extends ErrorCode
    /* 5 */ val EIO: typings.browserfs.apiErrorMod.ErrorCode.EIO with Double = js.native
    
    @js.native
    sealed trait EISDIR extends ErrorCode
    /* 21 */ val EISDIR: typings.browserfs.apiErrorMod.ErrorCode.EISDIR with Double = js.native
    
    @js.native
    sealed trait ENOENT extends ErrorCode
    /* 2 */ val ENOENT: typings.browserfs.apiErrorMod.ErrorCode.ENOENT with Double = js.native
    
    @js.native
    sealed trait ENOSPC extends ErrorCode
    /* 28 */ val ENOSPC: typings.browserfs.apiErrorMod.ErrorCode.ENOSPC with Double = js.native
    
    @js.native
    sealed trait ENOTDIR extends ErrorCode
    /* 20 */ val ENOTDIR: typings.browserfs.apiErrorMod.ErrorCode.ENOTDIR with Double = js.native
    
    @js.native
    sealed trait ENOTEMPTY extends ErrorCode
    /* 39 */ val ENOTEMPTY: typings.browserfs.apiErrorMod.ErrorCode.ENOTEMPTY with Double = js.native
    
    @js.native
    sealed trait ENOTSUP extends ErrorCode
    /* 95 */ val ENOTSUP: typings.browserfs.apiErrorMod.ErrorCode.ENOTSUP with Double = js.native
    
    @js.native
    sealed trait EPERM extends ErrorCode
    /* 1 */ val EPERM: typings.browserfs.apiErrorMod.ErrorCode.EPERM with Double = js.native
    
    @js.native
    sealed trait EROFS extends ErrorCode
    /* 30 */ val EROFS: typings.browserfs.apiErrorMod.ErrorCode.EROFS with Double = js.native
  }
}
