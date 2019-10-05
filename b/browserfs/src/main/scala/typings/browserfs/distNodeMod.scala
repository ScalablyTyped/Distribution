package typings.browserfs

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.browserfs.browserfsStrings.bfs_utils
import typings.browserfs.browserfsStrings.buffer
import typings.browserfs.browserfsStrings.fs
import typings.browserfs.browserfsStrings.path
import typings.browserfs.browserfsStrings.process
import typings.browserfs.distNodeCoreApiUnderscoreErrorMod.ErrorCode
import typings.browserfs.distNodeCoreBrowserfsMod.FileSystemConfiguration
import typings.browserfs.distNodeCoreFSMod.FSModule
import typings.browserfs.distNodeCoreFSMod.default
import typings.browserfs.distNodeCoreFileUnderscoreSystemMod.BFSCallback
import typings.browserfs.distNodeCoreFileUnderscoreSystemMod.BFSOneArgCallback
import typings.browserfs.distNodeCoreFileUnderscoreSystemMod.FileSystem
import typings.browserfs.distNodeCoreFileUnderscoreSystemMod.FileSystemConstructor
import typings.node.Buffer
import typings.node.NodeJS.Process
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("browserfs/dist/node", JSImport.Namespace)
@js.native
object distNodeMod extends js.Object {
  @js.native
  class EmscriptenFS ()
    extends typings.browserfs.distNodeCoreBrowserfsMod.EmscriptenFS {
    def this(_FS: js.Any) = this()
    def this(_FS: js.Any, _PATH: js.Any) = this()
    def this(_FS: js.Any, _PATH: js.Any, _ERRNO_CODES: js.Any) = this()
    def this(_FS: js.Any, _PATH: js.Any, _ERRNO_CODES: js.Any, nodefs: default) = this()
  }
  
  var setImmediate: js.Function1[/* cb */ js.Function, js.Any] = js.native
  def BFSRequire(module: String): js.Any = js.native
  @JSName("BFSRequire")
  def BFSRequire_bfsutils(module: bfs_utils): TypeofBFSUtils = js.native
  @JSName("BFSRequire")
  def BFSRequire_buffer(module: buffer): Typeofbuffer = js.native
  @JSName("BFSRequire")
  def BFSRequire_fs(module: fs): FSModule = js.native
  @JSName("BFSRequire")
  def BFSRequire_path(module: path): Typeofpath = js.native
  @JSName("BFSRequire")
  def BFSRequire_process(module: process): Process = js.native
  def configure(config: FileSystemConfiguration, cb: BFSOneArgCallback): Unit = js.native
  def getFileSystem(config: FileSystemConfiguration, cb: BFSCallback[FileSystem]): Unit = js.native
  def initialize(rootfs: FileSystem): FileSystem = js.native
  def install(obj: js.Any): Unit = js.native
  def registerFileSystem(name: String, fs: FileSystemConstructor): Unit = js.native
  @js.native
  object Errors extends js.Object {
    @js.native
    class ApiError protected ()
      extends typings.browserfs.distNodeCoreBrowserfsMod.Errors.ApiError {
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
    }
    
    /* static members */
    @js.native
    object ApiError extends js.Object {
      def EEXIST(path: String): typings.browserfs.distNodeCoreApiUnderscoreErrorMod.ApiError = js.native
      def EISDIR(path: String): typings.browserfs.distNodeCoreApiUnderscoreErrorMod.ApiError = js.native
      def ENOENT(path: String): typings.browserfs.distNodeCoreApiUnderscoreErrorMod.ApiError = js.native
      def ENOTDIR(path: String): typings.browserfs.distNodeCoreApiUnderscoreErrorMod.ApiError = js.native
      def ENOTEMPTY(path: String): typings.browserfs.distNodeCoreApiUnderscoreErrorMod.ApiError = js.native
      def EPERM(path: String): typings.browserfs.distNodeCoreApiUnderscoreErrorMod.ApiError = js.native
      def FileError(code: ErrorCode, p: String): typings.browserfs.distNodeCoreApiUnderscoreErrorMod.ApiError = js.native
      /**
        * Creates an ApiError object from a buffer.
        */
      def fromBuffer(buffer: Buffer): typings.browserfs.distNodeCoreApiUnderscoreErrorMod.ApiError = js.native
      def fromBuffer(buffer: Buffer, i: Double): typings.browserfs.distNodeCoreApiUnderscoreErrorMod.ApiError = js.native
      def fromJSON(json: js.Any): typings.browserfs.distNodeCoreApiUnderscoreErrorMod.ApiError = js.native
    }
    
    @js.native
    object ErrorCode extends js.Object {
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
      def apply(value: Double): js.UndefOr[typings.browserfs.distNodeCoreApiUnderscoreErrorMod.ErrorCode with Double] = js.native
    }
    
    @js.native
    object ErrorStrings
      extends /* code */ StringDictionary[String]
         with /* code */ NumberDictionary[String]
    
  }
  
  /**
    * @hidden
    */
  @js.native
  object FileSystem extends js.Object {
    var AsyncMirror: TypeofClassAsyncMirror = js.native
    var Dropbox: TypeofClassDropbox = js.native
    var Emscripten: TypeofClassEmscripten = js.native
    var FolderAdapter: TypeofClassFolderAdapter = js.native
    var HTML5FS: TypeofClassHTML5FS = js.native
    var InMemory: TypeofClassInMemory = js.native
    var IndexedDB: TypeofClassIndexedDB = js.native
    var IsoFS: TypeofClassIsoFS = js.native
    var LocalStorage: TypeofClassLocalStorage = js.native
    var MountableFileSystem: TypeofClassMountableFileSystem = js.native
    var OverlayFS: TypeofClassOverlayFS = js.native
    var WorkerFS: TypeofClassWorkerFS = js.native
    var XmlHttpRequest: TypeofClassXmlHttpRequest = js.native
    var ZipFS: TypeofClassZipFS = js.native
  }
  
}

