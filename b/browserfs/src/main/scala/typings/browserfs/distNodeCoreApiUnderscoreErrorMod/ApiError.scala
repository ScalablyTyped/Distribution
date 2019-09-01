package typings.browserfs.distNodeCoreApiUnderscoreErrorMod

import typings.node.Buffer
import typings.node.NodeJSNs.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.std.Error because var conflicts: stack. Inlined message, name */ @JSImport("browserfs/dist/node/core/api_error", "ApiError")
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

/* static members */
@JSImport("browserfs/dist/node/core/api_error", "ApiError")
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

