package typings.browserfsH4gEcI12

import typings.browserfsH4gEcI12.anon.TypeofAsyncMirror
import typings.browserfsH4gEcI12.anon.TypeofBFSUtils
import typings.browserfsH4gEcI12.anon.TypeofDropbox
import typings.browserfsH4gEcI12.anon.TypeofEmscripten
import typings.browserfsH4gEcI12.anon.TypeofFolderAdapter
import typings.browserfsH4gEcI12.anon.TypeofHTML5FS
import typings.browserfsH4gEcI12.anon.TypeofInMemory
import typings.browserfsH4gEcI12.anon.TypeofIndexedDB
import typings.browserfsH4gEcI12.anon.TypeofIsoFS
import typings.browserfsH4gEcI12.anon.TypeofLocalStorage
import typings.browserfsH4gEcI12.anon.TypeofMountableFileSystem
import typings.browserfsH4gEcI12.anon.TypeofOverlayFS
import typings.browserfsH4gEcI12.anon.TypeofWorkerFS
import typings.browserfsH4gEcI12.anon.TypeofXmlHttpRequest
import typings.browserfsH4gEcI12.anon.TypeofZipFS
import typings.browserfsH4gEcI12.anon.Typeofbuffer
import typings.browserfsH4gEcI12.apiErrorDTsMod.ErrorCode
import typings.browserfsH4gEcI12.browserfsH4gEcI12Strings.bfs_utils
import typings.browserfsH4gEcI12.browserfsH4gEcI12Strings.buffer
import typings.browserfsH4gEcI12.browserfsH4gEcI12Strings.fs
import typings.browserfsH4gEcI12.browserfsH4gEcI12Strings.path
import typings.browserfsH4gEcI12.browserfsH4gEcI12Strings.process
import typings.browserfsH4gEcI12.emscriptenFsDTsMod.default
import typings.browserfsH4gEcI12.fileSystemDTsMod.BFSCallback
import typings.browserfsH4gEcI12.fileSystemDTsMod.BFSOneArgCallback
import typings.browserfsH4gEcI12.fileSystemDTsMod.FileSystem
import typings.browserfsH4gEcI12.fileSystemDTsMod.FileSystemConstructor
import typings.browserfsH4gEcI12.fsDTsMod.FSModule
import typings.browserfsH4gEcI12.indexedDBDTsMod.IndexedDBFileSystem
import typings.browserfsH4gEcI12.zipFSDTsMod.ZipTOC
import typings.dropboxjs.Dropbox.Client
import typings.node.bufferMod.global.Buffer
import typings.node.pathMod.PlatformPath
import typings.node.processMod.global.NodeJS.Process
import typings.std.Worker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object browserfsDTsMod {
  
  @JSImport(".browserfs-H4gEcI12/dist/node/core/browserfs.d.ts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def BFSRequire(module: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("BFSRequire")(module.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def BFSRequire_bfsutils(module: bfs_utils): TypeofBFSUtils = ^.asInstanceOf[js.Dynamic].applyDynamic("BFSRequire")(module.asInstanceOf[js.Any]).asInstanceOf[TypeofBFSUtils]
  
  inline def BFSRequire_buffer(module: buffer): Typeofbuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("BFSRequire")(module.asInstanceOf[js.Any]).asInstanceOf[Typeofbuffer]
  
  inline def BFSRequire_fs(module: fs): FSModule = ^.asInstanceOf[js.Dynamic].applyDynamic("BFSRequire")(module.asInstanceOf[js.Any]).asInstanceOf[FSModule]
  
  inline def BFSRequire_path(module: path): PlatformPath = ^.asInstanceOf[js.Dynamic].applyDynamic("BFSRequire")(module.asInstanceOf[js.Any]).asInstanceOf[PlatformPath]
  
  inline def BFSRequire_process(module: process): Process = ^.asInstanceOf[js.Dynamic].applyDynamic("BFSRequire")(module.asInstanceOf[js.Any]).asInstanceOf[Process]
  
  @JSImport(".browserfs-H4gEcI12/dist/node/core/browserfs.d.ts", "EmscriptenFS")
  @js.native
  open class EmscriptenFS () extends default {
    def this(_FS: Any) = this()
    def this(_FS: Any, _PATH: Any) = this()
    def this(_FS: Unit, _PATH: Any) = this()
    def this(_FS: Any, _PATH: Any, _ERRNO_CODES: Any) = this()
    def this(_FS: Any, _PATH: Unit, _ERRNO_CODES: Any) = this()
    def this(_FS: Unit, _PATH: Any, _ERRNO_CODES: Any) = this()
    def this(_FS: Unit, _PATH: Unit, _ERRNO_CODES: Any) = this()
    def this(_FS: Any, _PATH: Any, _ERRNO_CODES: Any, nodefs: typings.browserfsH4gEcI12.fsDTsMod.default) = this()
    def this(_FS: Any, _PATH: Any, _ERRNO_CODES: Unit, nodefs: typings.browserfsH4gEcI12.fsDTsMod.default) = this()
    def this(_FS: Any, _PATH: Unit, _ERRNO_CODES: Any, nodefs: typings.browserfsH4gEcI12.fsDTsMod.default) = this()
    def this(_FS: Any, _PATH: Unit, _ERRNO_CODES: Unit, nodefs: typings.browserfsH4gEcI12.fsDTsMod.default) = this()
    def this(_FS: Unit, _PATH: Any, _ERRNO_CODES: Any, nodefs: typings.browserfsH4gEcI12.fsDTsMod.default) = this()
    def this(_FS: Unit, _PATH: Any, _ERRNO_CODES: Unit, nodefs: typings.browserfsH4gEcI12.fsDTsMod.default) = this()
    def this(_FS: Unit, _PATH: Unit, _ERRNO_CODES: Any, nodefs: typings.browserfsH4gEcI12.fsDTsMod.default) = this()
    def this(_FS: Unit, _PATH: Unit, _ERRNO_CODES: Unit, nodefs: typings.browserfsH4gEcI12.fsDTsMod.default) = this()
  }
  
  object Errors {
    
    @JSImport(".browserfs-H4gEcI12/dist/node/core/browserfs.d.ts", "Errors.ApiError")
    @js.native
    open class ApiError protected ()
      extends typings.browserfsH4gEcI12.apiErrorDTsMod.ApiError {
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
    }
    /* static members */
    object ApiError {
      
      @JSImport(".browserfs-H4gEcI12/dist/node/core/browserfs.d.ts", "Errors.ApiError")
      @js.native
      val ^ : js.Any = js.native
      
      inline def EEXIST(path: String): typings.browserfsH4gEcI12.apiErrorDTsMod.ApiError = ^.asInstanceOf[js.Dynamic].applyDynamic("EEXIST")(path.asInstanceOf[js.Any]).asInstanceOf[typings.browserfsH4gEcI12.apiErrorDTsMod.ApiError]
      
      inline def EISDIR(path: String): typings.browserfsH4gEcI12.apiErrorDTsMod.ApiError = ^.asInstanceOf[js.Dynamic].applyDynamic("EISDIR")(path.asInstanceOf[js.Any]).asInstanceOf[typings.browserfsH4gEcI12.apiErrorDTsMod.ApiError]
      
      inline def ENOENT(path: String): typings.browserfsH4gEcI12.apiErrorDTsMod.ApiError = ^.asInstanceOf[js.Dynamic].applyDynamic("ENOENT")(path.asInstanceOf[js.Any]).asInstanceOf[typings.browserfsH4gEcI12.apiErrorDTsMod.ApiError]
      
      inline def ENOTDIR(path: String): typings.browserfsH4gEcI12.apiErrorDTsMod.ApiError = ^.asInstanceOf[js.Dynamic].applyDynamic("ENOTDIR")(path.asInstanceOf[js.Any]).asInstanceOf[typings.browserfsH4gEcI12.apiErrorDTsMod.ApiError]
      
      inline def ENOTEMPTY(path: String): typings.browserfsH4gEcI12.apiErrorDTsMod.ApiError = ^.asInstanceOf[js.Dynamic].applyDynamic("ENOTEMPTY")(path.asInstanceOf[js.Any]).asInstanceOf[typings.browserfsH4gEcI12.apiErrorDTsMod.ApiError]
      
      inline def EPERM(path: String): typings.browserfsH4gEcI12.apiErrorDTsMod.ApiError = ^.asInstanceOf[js.Dynamic].applyDynamic("EPERM")(path.asInstanceOf[js.Any]).asInstanceOf[typings.browserfsH4gEcI12.apiErrorDTsMod.ApiError]
      
      inline def FileError(code: ErrorCode, p: String): typings.browserfsH4gEcI12.apiErrorDTsMod.ApiError = (^.asInstanceOf[js.Dynamic].applyDynamic("FileError")(code.asInstanceOf[js.Any], p.asInstanceOf[js.Any])).asInstanceOf[typings.browserfsH4gEcI12.apiErrorDTsMod.ApiError]
      
      /**
        * Creates an ApiError object from a buffer.
        */
      inline def fromBuffer(buffer: Buffer): typings.browserfsH4gEcI12.apiErrorDTsMod.ApiError = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBuffer")(buffer.asInstanceOf[js.Any]).asInstanceOf[typings.browserfsH4gEcI12.apiErrorDTsMod.ApiError]
      inline def fromBuffer(buffer: Buffer, i: Double): typings.browserfsH4gEcI12.apiErrorDTsMod.ApiError = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBuffer")(buffer.asInstanceOf[js.Any], i.asInstanceOf[js.Any])).asInstanceOf[typings.browserfsH4gEcI12.apiErrorDTsMod.ApiError]
      
      inline def fromJSON(json: Any): typings.browserfsH4gEcI12.apiErrorDTsMod.ApiError = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.browserfsH4gEcI12.apiErrorDTsMod.ApiError]
    }
    
    @JSImport(".browserfs-H4gEcI12/dist/node/core/browserfs.d.ts", "Errors.ErrorCode")
    @js.native
    object ErrorCode extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.browserfsH4gEcI12.apiErrorDTsMod.ErrorCode & Double] = js.native
      
      /* 13 */ val EACCES: typings.browserfsH4gEcI12.apiErrorDTsMod.ErrorCode.EACCES & Double = js.native
      
      /* 9 */ val EBADF: typings.browserfsH4gEcI12.apiErrorDTsMod.ErrorCode.EBADF & Double = js.native
      
      /* 16 */ val EBUSY: typings.browserfsH4gEcI12.apiErrorDTsMod.ErrorCode.EBUSY & Double = js.native
      
      /* 17 */ val EEXIST: typings.browserfsH4gEcI12.apiErrorDTsMod.ErrorCode.EEXIST & Double = js.native
      
      /* 27 */ val EFBIG: typings.browserfsH4gEcI12.apiErrorDTsMod.ErrorCode.EFBIG & Double = js.native
      
      /* 22 */ val EINVAL: typings.browserfsH4gEcI12.apiErrorDTsMod.ErrorCode.EINVAL & Double = js.native
      
      /* 5 */ val EIO: typings.browserfsH4gEcI12.apiErrorDTsMod.ErrorCode.EIO & Double = js.native
      
      /* 21 */ val EISDIR: typings.browserfsH4gEcI12.apiErrorDTsMod.ErrorCode.EISDIR & Double = js.native
      
      /* 2 */ val ENOENT: typings.browserfsH4gEcI12.apiErrorDTsMod.ErrorCode.ENOENT & Double = js.native
      
      /* 28 */ val ENOSPC: typings.browserfsH4gEcI12.apiErrorDTsMod.ErrorCode.ENOSPC & Double = js.native
      
      /* 20 */ val ENOTDIR: typings.browserfsH4gEcI12.apiErrorDTsMod.ErrorCode.ENOTDIR & Double = js.native
      
      /* 39 */ val ENOTEMPTY: typings.browserfsH4gEcI12.apiErrorDTsMod.ErrorCode.ENOTEMPTY & Double = js.native
      
      /* 95 */ val ENOTSUP: typings.browserfsH4gEcI12.apiErrorDTsMod.ErrorCode.ENOTSUP & Double = js.native
      
      /* 1 */ val EPERM: typings.browserfsH4gEcI12.apiErrorDTsMod.ErrorCode.EPERM & Double = js.native
      
      /* 30 */ val EROFS: typings.browserfsH4gEcI12.apiErrorDTsMod.ErrorCode.EROFS & Double = js.native
    }
  }
  
  /**
    * @hidden
    */
  /**
    * @hidden
    */
  object FileSystem {
    
    @JSImport(".browserfs-H4gEcI12/dist/node/core/browserfs.d.ts", "FileSystem")
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport(".browserfs-H4gEcI12/dist/node/core/browserfs.d.ts", "FileSystem.AsyncMirror")
    @js.native
    open class AsyncMirror protected ()
      extends typings.browserfsH4gEcI12.asyncMirrorDTsMod.default {
      /**
        * **Deprecated; use AsyncMirror.Create() method instead.**
        *
        * Mirrors the synchronous file system into the asynchronous file system.
        *
        * **IMPORTANT**: You must call `initialize` on the file system before it can be used.
        * @param sync The synchronous file system to mirror the asynchronous file system to.
        * @param async The asynchronous file system to mirror.
        */
      def this(
        sync: typings.browserfsH4gEcI12.fileSystemDTsMod.FileSystem,
        async: typings.browserfsH4gEcI12.fileSystemDTsMod.FileSystem
      ) = this()
      def this(
        sync: typings.browserfsH4gEcI12.fileSystemDTsMod.FileSystem,
        async: typings.browserfsH4gEcI12.fileSystemDTsMod.FileSystem,
        deprecateMsg: Boolean
      ) = this()
    }
    @JSImport(".browserfs-H4gEcI12/dist/node/core/browserfs.d.ts", "FileSystem.AsyncMirror")
    @js.native
    def AsyncMirror: TypeofAsyncMirror = js.native
    inline def AsyncMirror_=(x: TypeofAsyncMirror): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AsyncMirror")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport(".browserfs-H4gEcI12/dist/node/core/browserfs.d.ts", "FileSystem.Dropbox")
    @js.native
    open class Dropbox protected ()
      extends typings.browserfsH4gEcI12.dropboxDTsMod.default {
      /**
        * **Deprecated. Please use Dropbox.Create() method instead.**
        *
        * Constructs a Dropbox-backed file system using the *authenticated* DropboxJS client.
        *
        * Note that you must use the old v0.10 version of the Dropbox JavaScript SDK.
        */
      def this(client: Client) = this()
      def this(client: Client, deprecateMsg: Boolean) = this()
    }
    @JSImport(".browserfs-H4gEcI12/dist/node/core/browserfs.d.ts", "FileSystem.Dropbox")
    @js.native
    def Dropbox: TypeofDropbox = js.native
    inline def Dropbox_=(x: TypeofDropbox): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Dropbox")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport(".browserfs-H4gEcI12/dist/node/core/browserfs.d.ts", "FileSystem.Emscripten")
    @js.native
    open class Emscripten protected ()
      extends typings.browserfsH4gEcI12.emscriptenDTsMod.default {
      /**
        * Creates a BrowserFS file system for the given Emscripten file system.
        * @param _FS The Emscripten file system (`FS`).
        */
      def this(_FS: Any) = this()
    }
    @JSImport(".browserfs-H4gEcI12/dist/node/core/browserfs.d.ts", "FileSystem.Emscripten")
    @js.native
    def Emscripten: TypeofEmscripten = js.native
    inline def Emscripten_=(x: TypeofEmscripten): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Emscripten")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport(".browserfs-H4gEcI12/dist/node/core/browserfs.d.ts", "FileSystem.FolderAdapter")
    @js.native
    open class FolderAdapter protected ()
      extends typings.browserfsH4gEcI12.folderAdapterDTsMod.default {
      /**
        * Wraps a file system, and uses the given folder as its root.
        *
        * @param folder The folder to use as the root directory.
        * @param wrapped The file system to wrap.
        */
      def this(folder: String, wrapped: typings.browserfsH4gEcI12.fileSystemDTsMod.FileSystem) = this()
    }
    @JSImport(".browserfs-H4gEcI12/dist/node/core/browserfs.d.ts", "FileSystem.FolderAdapter")
    @js.native
    def FolderAdapter: TypeofFolderAdapter = js.native
    inline def FolderAdapter_=(x: TypeofFolderAdapter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FolderAdapter")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport(".browserfs-H4gEcI12/dist/node/core/browserfs.d.ts", "FileSystem.HTML5FS")
    @js.native
    /**
      * **Deprecated. Please use HTML5FS.Create() method instead.**
      *
      * Creates a new HTML5 FileSystem-backed BrowserFS file system of the given size
      * and storage type.
      *
      * **IMPORTANT**: You must call `allocate` on the resulting object before the file system
      * can be used.
      *
      * @param size storage quota to request, in megabytes. Allocated value may be less.
      * @param type window.PERSISTENT or window.TEMPORARY. Defaults to PERSISTENT.
      */
    open class HTML5FS ()
      extends typings.browserfsH4gEcI12.html5fsDTsMod.default {
      def this(size: Double) = this()
      def this(size: Double, `type`: Double) = this()
      def this(size: Unit, `type`: Double) = this()
      def this(size: Double, `type`: Double, deprecateMsg: Boolean) = this()
      def this(size: Double, `type`: Unit, deprecateMsg: Boolean) = this()
      def this(size: Unit, `type`: Double, deprecateMsg: Boolean) = this()
      def this(size: Unit, `type`: Unit, deprecateMsg: Boolean) = this()
    }
    @JSImport(".browserfs-H4gEcI12/dist/node/core/browserfs.d.ts", "FileSystem.HTML5FS")
    @js.native
    def HTML5FS: TypeofHTML5FS = js.native
    inline def HTML5FS_=(x: TypeofHTML5FS): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HTML5FS")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport(".browserfs-H4gEcI12/dist/node/core/browserfs.d.ts", "FileSystem.InMemory")
    @js.native
    open class InMemory ()
      extends typings.browserfsH4gEcI12.inMemoryDTsMod.default
    @JSImport(".browserfs-H4gEcI12/dist/node/core/browserfs.d.ts", "FileSystem.InMemory")
    @js.native
    def InMemory: TypeofInMemory = js.native
    inline def InMemory_=(x: TypeofInMemory): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("InMemory")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport(".browserfs-H4gEcI12/dist/node/core/browserfs.d.ts", "FileSystem.IndexedDB")
    @js.native
    open class IndexedDB protected ()
      extends typings.browserfsH4gEcI12.indexedDBDTsMod.default {
      /**
        * **Deprecated. Use IndexedDB.Create() method instead.**
        *
        * Constructs an IndexedDB file system.
        * @param cb Called once the database is instantiated and ready for use.
        *   Passes an error if there was an issue instantiating the database.
        * @param storeName The name of this file system. You can have
        *   multiple IndexedDB file systems operating at once, but each must have
        *   a different name.
        */
      def this(cb: BFSCallback[IndexedDBFileSystem]) = this()
      def this(cb: BFSCallback[IndexedDBFileSystem], storeName: String) = this()
      def this(cb: BFSCallback[IndexedDBFileSystem], storeName: String, deprecateMsg: Boolean) = this()
      def this(cb: BFSCallback[IndexedDBFileSystem], storeName: Unit, deprecateMsg: Boolean) = this()
    }
    @JSImport(".browserfs-H4gEcI12/dist/node/core/browserfs.d.ts", "FileSystem.IndexedDB")
    @js.native
    def IndexedDB: TypeofIndexedDB = js.native
    inline def IndexedDB_=(x: TypeofIndexedDB): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IndexedDB")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport(".browserfs-H4gEcI12/dist/node/core/browserfs.d.ts", "FileSystem.IsoFS")
    @js.native
    open class IsoFS protected ()
      extends typings.browserfsH4gEcI12.isoFSDTsMod.default {
      /**
        * **Deprecated. Please use IsoFS.Create() method instead.**
        *
        * Constructs a read-only file system from the given ISO.
        * @param data The ISO file in a buffer.
        * @param name The name of the ISO (optional; used for debug messages / identification via getName()).
        */
      def this(data: Buffer) = this()
      def this(data: Buffer, name: String) = this()
      def this(data: Buffer, name: String, deprecateMsg: Boolean) = this()
      def this(data: Buffer, name: Unit, deprecateMsg: Boolean) = this()
    }
    @JSImport(".browserfs-H4gEcI12/dist/node/core/browserfs.d.ts", "FileSystem.IsoFS")
    @js.native
    def IsoFS: TypeofIsoFS = js.native
    inline def IsoFS_=(x: TypeofIsoFS): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IsoFS")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport(".browserfs-H4gEcI12/dist/node/core/browserfs.d.ts", "FileSystem.LocalStorage")
    @js.native
    /**
      * Creates a new LocalStorage file system using the contents of `localStorage`.
      */
    open class LocalStorage ()
      extends typings.browserfsH4gEcI12.localStorageDTsMod.default
    @JSImport(".browserfs-H4gEcI12/dist/node/core/browserfs.d.ts", "FileSystem.LocalStorage")
    @js.native
    def LocalStorage: TypeofLocalStorage = js.native
    inline def LocalStorage_=(x: TypeofLocalStorage): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LocalStorage")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport(".browserfs-H4gEcI12/dist/node/core/browserfs.d.ts", "FileSystem.MountableFileSystem")
    @js.native
    /**
      * Creates a new, empty MountableFileSystem.
      */
    open class MountableFileSystem ()
      extends typings.browserfsH4gEcI12.mountableFileSystemDTsMod.default
    @JSImport(".browserfs-H4gEcI12/dist/node/core/browserfs.d.ts", "FileSystem.MountableFileSystem")
    @js.native
    def MountableFileSystem: TypeofMountableFileSystem = js.native
    inline def MountableFileSystem_=(x: TypeofMountableFileSystem): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MountableFileSystem")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport(".browserfs-H4gEcI12/dist/node/core/browserfs.d.ts", "FileSystem.OverlayFS")
    @js.native
    open class OverlayFS protected ()
      extends typings.browserfsH4gEcI12.overlayFSDTsMod.default {
      /**
        * **Deprecated. Please use OverlayFS.Create() method instead.**
        * @param writable The file system to write modified files to.
        * @param readable The file system that initially populates this file system.
        */
      def this(
        writable: typings.browserfsH4gEcI12.fileSystemDTsMod.FileSystem,
        readable: typings.browserfsH4gEcI12.fileSystemDTsMod.FileSystem
      ) = this()
      def this(
        writable: typings.browserfsH4gEcI12.fileSystemDTsMod.FileSystem,
        readable: typings.browserfsH4gEcI12.fileSystemDTsMod.FileSystem,
        deprecateMsg: Boolean
      ) = this()
    }
    @JSImport(".browserfs-H4gEcI12/dist/node/core/browserfs.d.ts", "FileSystem.OverlayFS")
    @js.native
    def OverlayFS: TypeofOverlayFS = js.native
    inline def OverlayFS_=(x: TypeofOverlayFS): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OverlayFS")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport(".browserfs-H4gEcI12/dist/node/core/browserfs.d.ts", "FileSystem.WorkerFS")
    @js.native
    open class WorkerFS protected ()
      extends typings.browserfsH4gEcI12.workerFSDTsMod.default {
      /**
        * **Deprecated. Please use WorkerFS.Create() method instead.**
        *
        * Constructs a new WorkerFS instance that connects with BrowserFS running on
        * the specified worker.
        */
      def this(worker: Worker) = this()
      def this(worker: Worker, deprecateMsg: Boolean) = this()
    }
    @JSImport(".browserfs-H4gEcI12/dist/node/core/browserfs.d.ts", "FileSystem.WorkerFS")
    @js.native
    def WorkerFS: TypeofWorkerFS = js.native
    inline def WorkerFS_=(x: TypeofWorkerFS): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WorkerFS")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport(".browserfs-H4gEcI12/dist/node/core/browserfs.d.ts", "FileSystem.XmlHttpRequest")
    @js.native
    open class XmlHttpRequest protected ()
      extends typings.browserfsH4gEcI12.xmlHttpRequestDTsMod.default {
      /**
        * **Deprecated. Please use XmlHttpRequest.Create() method instead to construct XmlHttpRequest objects.**
        *
        * Constructs the file system. You must provide the directory listing as a JSON object
        * produced by the `make_xhrfs_index` script.
        *
        * **DEPRECATED:** You may pass a URL to the file index to the constructor, which will fetch the file index
        * *synchronously* and may freeze up the web page. This behavior will be removed in the next major version
        * of BrowserFS.
        *
        * @param listingUrlOrObj index object or the path to the JSON file index generated by
        *   `make_xhrfs_index`.
        * @param prefixUrl URL that is prepended to any file locations in the file index. e.g. if `prefixUrl = 'data/`, and the user wants to open the file `/foo.txt`,
        * the file system will fetch file `data/foo.txt`. The browser will access the file relative to the currrent webpage
        * URL.
        */
      def this(listingUrlOrObj: String) = this()
      def this(listingUrlOrObj: js.Object) = this()
      def this(listingUrlOrObj: String, prefixUrl: String) = this()
      def this(listingUrlOrObj: js.Object, prefixUrl: String) = this()
      def this(listingUrlOrObj: String, prefixUrl: String, deprecateMsg: Boolean) = this()
      def this(listingUrlOrObj: String, prefixUrl: Unit, deprecateMsg: Boolean) = this()
      def this(listingUrlOrObj: js.Object, prefixUrl: String, deprecateMsg: Boolean) = this()
      def this(listingUrlOrObj: js.Object, prefixUrl: Unit, deprecateMsg: Boolean) = this()
    }
    @JSImport(".browserfs-H4gEcI12/dist/node/core/browserfs.d.ts", "FileSystem.XmlHttpRequest")
    @js.native
    def XmlHttpRequest: TypeofXmlHttpRequest = js.native
    inline def XmlHttpRequest_=(x: TypeofXmlHttpRequest): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("XmlHttpRequest")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport(".browserfs-H4gEcI12/dist/node/core/browserfs.d.ts", "FileSystem.ZipFS")
    @js.native
    open class ZipFS protected ()
      extends typings.browserfsH4gEcI12.zipFSDTsMod.default {
      def this(input: ZipTOC) = this()
      /**
        * **Deprecated. Please use ZipFS.Create() method to construct ZipFS objects.**
        */
      def this(input: Buffer) = this()
      def this(input: ZipTOC, name: String) = this()
      def this(input: Buffer, name: String) = this()
      def this(input: ZipTOC, name: String, deprecateMsg: Boolean) = this()
      def this(input: ZipTOC, name: Unit, deprecateMsg: Boolean) = this()
      def this(input: Buffer, name: String, deprecateMsg: Boolean) = this()
      def this(input: Buffer, name: Unit, deprecateMsg: Boolean) = this()
    }
    @JSImport(".browserfs-H4gEcI12/dist/node/core/browserfs.d.ts", "FileSystem.ZipFS")
    @js.native
    def ZipFS: TypeofZipFS = js.native
    inline def ZipFS_=(x: TypeofZipFS): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ZipFS")(x.asInstanceOf[js.Any])
  }
  
  inline def configure(config: FileSystemConfiguration, cb: BFSOneArgCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("configure")(config.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getFileSystem(config: FileSystemConfiguration, cb: BFSCallback[FileSystem]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getFileSystem")(config.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def initialize(rootfs: FileSystem): FileSystem = ^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(rootfs.asInstanceOf[js.Any]).asInstanceOf[FileSystem]
  
  inline def install(obj: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("install")(obj.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def registerFileSystem(name: String, fs: FileSystemConstructor): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerFileSystem")(name.asInstanceOf[js.Any], fs.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport(".browserfs-H4gEcI12/dist/node/core/browserfs.d.ts", "setImmediate")
  @js.native
  def setImmediate: js.Function1[/* cb */ js.Function, Any] = js.native
  inline def setImmediate_=(x: js.Function1[/* cb */ js.Function, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("setImmediate")(x.asInstanceOf[js.Any])
  
  trait FileSystemConfiguration extends StObject {
    
    var fs: String
    
    var options: Any
  }
  object FileSystemConfiguration {
    
    inline def apply(fs: String, options: Any): FileSystemConfiguration = {
      val __obj = js.Dynamic.literal(fs = fs.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileSystemConfiguration]
    }
    
    extension [Self <: FileSystemConfiguration](x: Self) {
      
      inline def setFs(value: String): Self = StObject.set(x, "fs", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    }
  }
}
