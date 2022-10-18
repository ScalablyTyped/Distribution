package typings.browserfs

import typings.browserfs.anon.TypeofAsyncMirror
import typings.browserfs.anon.TypeofDropbox
import typings.browserfs.anon.TypeofEmscripten
import typings.browserfs.anon.TypeofFolderAdapter
import typings.browserfs.anon.TypeofHTML5FS
import typings.browserfs.anon.TypeofInMemory
import typings.browserfs.anon.TypeofIndexedDB
import typings.browserfs.anon.TypeofIsoFS
import typings.browserfs.anon.TypeofLocalStorage
import typings.browserfs.anon.TypeofMountableFileSystem
import typings.browserfs.anon.TypeofOverlayFS
import typings.browserfs.anon.TypeofWorkerFS
import typings.browserfs.anon.TypeofXmlHttpRequest
import typings.browserfs.anon.TypeofZipFS
import typings.browserfs.distNodeBackendIndexedDBMod.IndexedDBFileSystem
import typings.browserfs.distNodeBackendZipFSMod.ZipTOC
import typings.browserfs.distNodeCoreFileSystemMod.BFSCallback
import typings.browserfs.distNodeCoreFileSystemMod.FileSystem
import typings.dropboxjs.Dropbox.Client
import typings.node.bufferMod.global.Buffer
import typings.std.Worker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodeCoreBackendsMod {
  
  /**
    * @hidden
    */
  /**
    * @hidden
    */
  object default {
    
    @JSImport("browserfs/dist/node/core/backends", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("browserfs/dist/node/core/backends", "default.AsyncMirror")
    @js.native
    open class AsyncMirror protected ()
      extends typings.browserfs.distNodeBackendAsyncMirrorMod.default {
      /**
        * **Deprecated; use AsyncMirror.Create() method instead.**
        *
        * Mirrors the synchronous file system into the asynchronous file system.
        *
        * **IMPORTANT**: You must call `initialize` on the file system before it can be used.
        * @param sync The synchronous file system to mirror the asynchronous file system to.
        * @param async The asynchronous file system to mirror.
        */
      def this(sync: FileSystem, async: FileSystem) = this()
      def this(sync: FileSystem, async: FileSystem, deprecateMsg: Boolean) = this()
    }
    @JSImport("browserfs/dist/node/core/backends", "default.AsyncMirror")
    @js.native
    def AsyncMirror: TypeofAsyncMirror = js.native
    inline def AsyncMirror_=(x: TypeofAsyncMirror): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AsyncMirror")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("browserfs/dist/node/core/backends", "default.Dropbox")
    @js.native
    open class Dropbox protected ()
      extends typings.browserfs.distNodeBackendDropboxMod.default {
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
    @JSImport("browserfs/dist/node/core/backends", "default.Dropbox")
    @js.native
    def Dropbox: TypeofDropbox = js.native
    inline def Dropbox_=(x: TypeofDropbox): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Dropbox")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("browserfs/dist/node/core/backends", "default.Emscripten")
    @js.native
    open class Emscripten protected ()
      extends typings.browserfs.distNodeBackendEmscriptenMod.default {
      /**
        * Creates a BrowserFS file system for the given Emscripten file system.
        * @param _FS The Emscripten file system (`FS`).
        */
      def this(_FS: Any) = this()
    }
    @JSImport("browserfs/dist/node/core/backends", "default.Emscripten")
    @js.native
    def Emscripten: TypeofEmscripten = js.native
    inline def Emscripten_=(x: TypeofEmscripten): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Emscripten")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("browserfs/dist/node/core/backends", "default.FolderAdapter")
    @js.native
    open class FolderAdapter protected ()
      extends typings.browserfs.distNodeBackendFolderAdapterMod.default {
      /**
        * Wraps a file system, and uses the given folder as its root.
        *
        * @param folder The folder to use as the root directory.
        * @param wrapped The file system to wrap.
        */
      def this(folder: String, wrapped: FileSystem) = this()
    }
    @JSImport("browserfs/dist/node/core/backends", "default.FolderAdapter")
    @js.native
    def FolderAdapter: TypeofFolderAdapter = js.native
    inline def FolderAdapter_=(x: TypeofFolderAdapter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FolderAdapter")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("browserfs/dist/node/core/backends", "default.HTML5FS")
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
      extends typings.browserfs.distNodeBackendHtml5fsMod.default {
      def this(size: Double) = this()
      def this(size: Double, `type`: Double) = this()
      def this(size: Unit, `type`: Double) = this()
      def this(size: Double, `type`: Double, deprecateMsg: Boolean) = this()
      def this(size: Double, `type`: Unit, deprecateMsg: Boolean) = this()
      def this(size: Unit, `type`: Double, deprecateMsg: Boolean) = this()
      def this(size: Unit, `type`: Unit, deprecateMsg: Boolean) = this()
    }
    @JSImport("browserfs/dist/node/core/backends", "default.HTML5FS")
    @js.native
    def HTML5FS: TypeofHTML5FS = js.native
    inline def HTML5FS_=(x: TypeofHTML5FS): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HTML5FS")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("browserfs/dist/node/core/backends", "default.InMemory")
    @js.native
    open class InMemory ()
      extends typings.browserfs.distNodeBackendInMemoryMod.default
    @JSImport("browserfs/dist/node/core/backends", "default.InMemory")
    @js.native
    def InMemory: TypeofInMemory = js.native
    inline def InMemory_=(x: TypeofInMemory): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("InMemory")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("browserfs/dist/node/core/backends", "default.IndexedDB")
    @js.native
    open class IndexedDB protected ()
      extends typings.browserfs.distNodeBackendIndexedDBMod.default {
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
    @JSImport("browserfs/dist/node/core/backends", "default.IndexedDB")
    @js.native
    def IndexedDB: TypeofIndexedDB = js.native
    inline def IndexedDB_=(x: TypeofIndexedDB): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IndexedDB")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("browserfs/dist/node/core/backends", "default.IsoFS")
    @js.native
    open class IsoFS protected ()
      extends typings.browserfs.distNodeBackendIsoFSMod.default {
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
    @JSImport("browserfs/dist/node/core/backends", "default.IsoFS")
    @js.native
    def IsoFS: TypeofIsoFS = js.native
    inline def IsoFS_=(x: TypeofIsoFS): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IsoFS")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("browserfs/dist/node/core/backends", "default.LocalStorage")
    @js.native
    /**
      * Creates a new LocalStorage file system using the contents of `localStorage`.
      */
    open class LocalStorage ()
      extends typings.browserfs.distNodeBackendLocalStorageMod.default
    @JSImport("browserfs/dist/node/core/backends", "default.LocalStorage")
    @js.native
    def LocalStorage: TypeofLocalStorage = js.native
    inline def LocalStorage_=(x: TypeofLocalStorage): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LocalStorage")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("browserfs/dist/node/core/backends", "default.MountableFileSystem")
    @js.native
    /**
      * Creates a new, empty MountableFileSystem.
      */
    open class MountableFileSystem ()
      extends typings.browserfs.distNodeBackendMountableFileSystemMod.default
    @JSImport("browserfs/dist/node/core/backends", "default.MountableFileSystem")
    @js.native
    def MountableFileSystem: TypeofMountableFileSystem = js.native
    inline def MountableFileSystem_=(x: TypeofMountableFileSystem): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MountableFileSystem")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("browserfs/dist/node/core/backends", "default.OverlayFS")
    @js.native
    open class OverlayFS protected ()
      extends typings.browserfs.distNodeBackendOverlayFSMod.default {
      /**
        * **Deprecated. Please use OverlayFS.Create() method instead.**
        * @param writable The file system to write modified files to.
        * @param readable The file system that initially populates this file system.
        */
      def this(writable: FileSystem, readable: FileSystem) = this()
      def this(writable: FileSystem, readable: FileSystem, deprecateMsg: Boolean) = this()
    }
    @JSImport("browserfs/dist/node/core/backends", "default.OverlayFS")
    @js.native
    def OverlayFS: TypeofOverlayFS = js.native
    inline def OverlayFS_=(x: TypeofOverlayFS): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OverlayFS")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("browserfs/dist/node/core/backends", "default.WorkerFS")
    @js.native
    open class WorkerFS protected ()
      extends typings.browserfs.distNodeBackendWorkerFSMod.default {
      /**
        * **Deprecated. Please use WorkerFS.Create() method instead.**
        *
        * Constructs a new WorkerFS instance that connects with BrowserFS running on
        * the specified worker.
        */
      def this(worker: Worker) = this()
      def this(worker: Worker, deprecateMsg: Boolean) = this()
    }
    @JSImport("browserfs/dist/node/core/backends", "default.WorkerFS")
    @js.native
    def WorkerFS: TypeofWorkerFS = js.native
    inline def WorkerFS_=(x: TypeofWorkerFS): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WorkerFS")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("browserfs/dist/node/core/backends", "default.XmlHttpRequest")
    @js.native
    open class XmlHttpRequest protected ()
      extends typings.browserfs.distNodeBackendXmlHttpRequestMod.default {
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
    @JSImport("browserfs/dist/node/core/backends", "default.XmlHttpRequest")
    @js.native
    def XmlHttpRequest: TypeofXmlHttpRequest = js.native
    inline def XmlHttpRequest_=(x: TypeofXmlHttpRequest): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("XmlHttpRequest")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("browserfs/dist/node/core/backends", "default.ZipFS")
    @js.native
    open class ZipFS protected ()
      extends typings.browserfs.distNodeBackendZipFSMod.default {
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
    @JSImport("browserfs/dist/node/core/backends", "default.ZipFS")
    @js.native
    def ZipFS: TypeofZipFS = js.native
    inline def ZipFS_=(x: TypeofZipFS): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ZipFS")(x.asInstanceOf[js.Any])
  }
}
