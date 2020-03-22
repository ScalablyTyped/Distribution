package typings.browserfs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("browserfs/dist/node/core/backends", JSImport.Namespace)
@js.native
object backendsMod extends js.Object {
  /**
    * @hidden
    */
  @js.native
  object default extends js.Object {
    var AsyncMirror: TypeofAsyncMirror = js.native
    var Dropbox: TypeofDropbox = js.native
    var Emscripten: TypeofEmscripten = js.native
    var FolderAdapter: TypeofFolderAdapter = js.native
    var HTML5FS: TypeofHTML5FS = js.native
    var InMemory: TypeofInMemory = js.native
    var IndexedDB: TypeofIndexedDB = js.native
    var IsoFS: TypeofIsoFS = js.native
    var LocalStorage: TypeofLocalStorage = js.native
    var MountableFileSystem: TypeofMountableFileSystem = js.native
    var OverlayFS: TypeofOverlayFS = js.native
    var WorkerFS: TypeofWorkerFS = js.native
    var XmlHttpRequest: TypeofXmlHttpRequest = js.native
    var ZipFS: TypeofZipFS = js.native
  }
  
}

