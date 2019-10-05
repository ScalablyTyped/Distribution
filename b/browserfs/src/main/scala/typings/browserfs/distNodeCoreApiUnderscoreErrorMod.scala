package typings.browserfs

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.browserfs.distNodeCoreApiUnderscoreErrorMod.ApiError
import typings.browserfs.distNodeCoreApiUnderscoreErrorMod.ErrorCode
import typings.node.Buffer
import typings.node.NodeJS.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("browserfs/dist/node/core/api_error", JSImport.Namespace)
@js.native
object distNodeCoreApiUnderscoreErrorMod extends js.Object {
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.std.Error because var conflicts: stack. Inlined message, name */ @js.native
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
    def this(`type`: ErrorCode, message: String, path: String) = this()
    @JSName("code")
    var code_ApiError: String = js.native
    @JSName("errno")
    var errno_ApiError: ErrorCode = js.native
    var message: String = js.native
    var name: String = js.native
    @JSName("path")
    var path_ApiError: js.UndefOr[String] = js.native
    @JSName("stack")
    var stack_ApiError: js.UndefOr[String] = js.native
    @JSName("syscall")
    var syscall_ApiError: String = js.native
    /**
      * The size of the API error in buffer-form in bytes.
      */
    def bufferSize(): Double = js.native
    def toJSON(): js.Any = js.native
    /**
      * Writes the API error into a buffer.
      */
    def writeToBuffer(): Buffer = js.native
    def writeToBuffer(buffer: Buffer): Buffer = js.native
    def writeToBuffer(buffer: Buffer, i: Double): Buffer = js.native
  }
  
  @js.native
  sealed trait ErrorCode extends js.Object
  
  /* static members */
  @js.native
  object ApiError extends js.Object {
    def EEXIST(path: String): ApiError = js.native
    def EISDIR(path: String): ApiError = js.native
    def ENOENT(path: String): ApiError = js.native
    def ENOTDIR(path: String): ApiError = js.native
    def ENOTEMPTY(path: String): ApiError = js.native
    def EPERM(path: String): ApiError = js.native
    def FileError(code: ErrorCode, p: String): ApiError = js.native
    /**
      * Creates an ApiError object from a buffer.
      */
    def fromBuffer(buffer: Buffer): ApiError = js.native
    def fromBuffer(buffer: Buffer, i: Double): ApiError = js.native
    def fromJSON(json: js.Any): ApiError = js.native
  }
  
  @js.native
  object ErrorCode extends js.Object {
    @js.native
    sealed trait EACCES extends ErrorCode
    
    @js.native
    sealed trait EBADF extends ErrorCode
    
    @js.native
    sealed trait EBUSY extends ErrorCode
    
    @js.native
    sealed trait EEXIST extends ErrorCode
    
    @js.native
    sealed trait EFBIG extends ErrorCode
    
    @js.native
    sealed trait EINVAL extends ErrorCode
    
    @js.native
    sealed trait EIO extends ErrorCode
    
    @js.native
    sealed trait EISDIR extends ErrorCode
    
    @js.native
    sealed trait ENOENT extends ErrorCode
    
    @js.native
    sealed trait ENOSPC extends ErrorCode
    
    @js.native
    sealed trait ENOTDIR extends ErrorCode
    
    @js.native
    sealed trait ENOTEMPTY extends ErrorCode
    
    @js.native
    sealed trait ENOTSUP extends ErrorCode
    
    @js.native
    sealed trait EPERM extends ErrorCode
    
    @js.native
    sealed trait EROFS extends ErrorCode
    
    /* 13 */ val EACCES: typings.browserfs.distNodeCoreApiUnderscoreErrorMod.ErrorCode.EACCES with Double = js.native
    /* 9 */ val EBADF: typings.browserfs.distNodeCoreApiUnderscoreErrorMod.ErrorCode.EBADF with Double = js.native
    /* 16 */ val EBUSY: typings.browserfs.distNodeCoreApiUnderscoreErrorMod.ErrorCode.EBUSY with Double = js.native
    /* 17 */ val EEXIST: typings.browserfs.distNodeCoreApiUnderscoreErrorMod.ErrorCode.EEXIST with Double = js.native
    /* 27 */ val EFBIG: typings.browserfs.distNodeCoreApiUnderscoreErrorMod.ErrorCode.EFBIG with Double = js.native
    /* 22 */ val EINVAL: typings.browserfs.distNodeCoreApiUnderscoreErrorMod.ErrorCode.EINVAL with Double = js.native
    /* 5 */ val EIO: typings.browserfs.distNodeCoreApiUnderscoreErrorMod.ErrorCode.EIO with Double = js.native
    /* 21 */ val EISDIR: typings.browserfs.distNodeCoreApiUnderscoreErrorMod.ErrorCode.EISDIR with Double = js.native
    /* 2 */ val ENOENT: typings.browserfs.distNodeCoreApiUnderscoreErrorMod.ErrorCode.ENOENT with Double = js.native
    /* 28 */ val ENOSPC: typings.browserfs.distNodeCoreApiUnderscoreErrorMod.ErrorCode.ENOSPC with Double = js.native
    /* 20 */ val ENOTDIR: typings.browserfs.distNodeCoreApiUnderscoreErrorMod.ErrorCode.ENOTDIR with Double = js.native
    /* 39 */ val ENOTEMPTY: typings.browserfs.distNodeCoreApiUnderscoreErrorMod.ErrorCode.ENOTEMPTY with Double = js.native
    /* 95 */ val ENOTSUP: typings.browserfs.distNodeCoreApiUnderscoreErrorMod.ErrorCode.ENOTSUP with Double = js.native
    /* 1 */ val EPERM: typings.browserfs.distNodeCoreApiUnderscoreErrorMod.ErrorCode.EPERM with Double = js.native
    /* 30 */ val EROFS: typings.browserfs.distNodeCoreApiUnderscoreErrorMod.ErrorCode.EROFS with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ErrorCode with Double] = js.native
  }
  
  @js.native
  object ErrorStrings
    extends /* code */ StringDictionary[String]
       with /* code */ NumberDictionary[String]
  
}

