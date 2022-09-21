package typings.browserfsH4gEcI12

import org.scalablytyped.runtime.StringDictionary
import typings.browserfsH4gEcI12.fileDTsMod.File
import typings.browserfsH4gEcI12.fileFlagDTsMod.FileFlag
import typings.browserfsH4gEcI12.fileSystemDTsMod.BFSCallback
import typings.browserfsH4gEcI12.fileSystemDTsMod.BFSOneArgCallback
import typings.browserfsH4gEcI12.fileSystemDTsMod.BaseFileSystem
import typings.browserfsH4gEcI12.fileSystemDTsMod.FileSystem
import typings.browserfsH4gEcI12.fileSystemDTsMod.FileSystemOptions
import typings.node.bufferMod.global.Buffer
import typings.std.Worker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object workerFSDTsMod {
  
  @JSImport(".browserfs-H4gEcI12/dist/node/backend/WorkerFS.d.ts", JSImport.Default)
  @js.native
  open class default protected () extends WorkerFS {
    /**
      * **Deprecated. Please use WorkerFS.Create() method instead.**
      *
      * Constructs a new WorkerFS instance that connects with BrowserFS running on
      * the specified worker.
      */
    def this(worker: Worker) = this()
    def this(worker: Worker, deprecateMsg: Boolean) = this()
  }
  /* static members */
  object default {
    
    @JSImport(".browserfs-H4gEcI12/dist/node/backend/WorkerFS.d.ts", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def Create(opts: WorkerFSOptions, cb: BFSCallback[WorkerFS]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Create")(opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport(".browserfs-H4gEcI12/dist/node/backend/WorkerFS.d.ts", "default.Name")
    @js.native
    val Name: String = js.native
    
    @JSImport(".browserfs-H4gEcI12/dist/node/backend/WorkerFS.d.ts", "default.Options")
    @js.native
    val Options: FileSystemOptions = js.native
    
    /**
      * Attaches a listener to the remote worker for file system requests.
      */
    inline def attachRemoteListener(worker: Worker): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("attachRemoteListener")(worker.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def isAvailable(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAvailable")().asInstanceOf[Boolean]
  }
  
  @js.native
  trait WorkerFS
    extends BaseFileSystem
       with FileSystem {
    
    /**
      * Converts a local argument into a remote argument. Public so WorkerFile objects can call it.
      */
    /* private */ def _argLocal2Remote(arg: Any): Any = js.native
    
    /* private */ def _argRemote2Local(arg: Any): Any = js.native
    
    /* private */ var _callbackConverter: Any = js.native
    
    /* private */ var _isInitialized: Any = js.native
    
    /* private */ var _isReadOnly: Any = js.native
    
    /* private */ def _rpc(methodName: Any, args: Any): Any = js.native
    
    /* private */ var _supportLinks: Any = js.native
    
    /* private */ var _supportProps: Any = js.native
    
    /* private */ var _worker: Any = js.native
    
    def chmod(p: String, isLchmod: Boolean, mode: Double, cb: js.Function): Unit = js.native
    /* InferMemberOverrides */
    override def chmod(p: String, isLchmod: Boolean, mode: Double, cb: BFSOneArgCallback): Unit = js.native
    
    /* InferMemberOverrides */
    override def chmodSync(p: String, isLchmod: Boolean, mode: Double): Unit = js.native
    
    def chown(p: String, isLchown: Boolean, uid: Double, gid: Double, cb: js.Function): Unit = js.native
    /* InferMemberOverrides */
    override def chown(p: String, isLchown: Boolean, uid: Double, gid: Double, cb: BFSOneArgCallback): Unit = js.native
    
    /* InferMemberOverrides */
    override def chownSync(p: String, isLchown: Boolean, uid: Double, gid: Double): Unit = js.native
    
    /* InferMemberOverrides */
    override def diskSpace(p: String, cb: js.Function2[/* total */ Double, /* free */ Double, Any]): Unit = js.native
    
    /* InferMemberOverrides */
    override def exists(p: String, cb: js.Function1[/* exists */ Boolean, Unit]): Unit = js.native
    
    /* InferMemberOverrides */
    override def existsSync(p: String): Boolean = js.native
    
    /**
      * **Deprecated. Please use WorkerFS.Create() method to construct and initialize WorkerFS instances.**
      *
      * Called once both local and remote sides are set up.
      */
    def initialize(cb: js.Function0[Unit]): Unit = js.native
    
    def link(srcpath: String, dstpath: String, cb: js.Function): Unit = js.native
    /* InferMemberOverrides */
    override def link(srcpath: String, dstpath: String, cb: BFSOneArgCallback): Unit = js.native
    
    /* InferMemberOverrides */
    override def linkSync(srcpath: String, dstpath: String): Unit = js.native
    
    def mkdir(p: String, mode: Double, cb: js.Function): Unit = js.native
    /* InferMemberOverrides */
    override def mkdir(p: String, mode: Double, cb: BFSOneArgCallback): Unit = js.native
    
    /* InferMemberOverrides */
    override def mkdirSync(p: String, mode: Double): Unit = js.native
    
    /* InferMemberOverrides */
    override def open(p: String, flag: FileFlag, mode: Double, cb: BFSCallback[File]): Unit = js.native
    
    /* InferMemberOverrides */
    override def openSync(p: String, flag: FileFlag, mode: Double): File = js.native
    
    /* InferMemberOverrides */
    override def readFile(fname: String, encoding: String, flag: FileFlag, cb: BFSCallback[String | Buffer]): Unit = js.native
    /* InferMemberOverrides */
    override def readFile(fname: String, encoding: Null, flag: FileFlag, cb: BFSCallback[String | Buffer]): Unit = js.native
    
    /* InferMemberOverrides */
    override def readFileSync(fname: String, encoding: String, flag: FileFlag): Any = js.native
    /* InferMemberOverrides */
    override def readFileSync(fname: String, encoding: Null, flag: FileFlag): Any = js.native
    
    /* InferMemberOverrides */
    override def readdir(p: String, cb: BFSCallback[js.Array[String]]): Unit = js.native
    
    /* InferMemberOverrides */
    override def readdirSync(p: String): js.Array[String] = js.native
    
    def readlink(p: String, cb: js.Function): Unit = js.native
    
    /* InferMemberOverrides */
    override def readlinkSync(p: String): String = js.native
    
    /* InferMemberOverrides */
    override def realpath(p: String, cache: StringDictionary[String], cb: BFSCallback[String]): Unit = js.native
    
    /* InferMemberOverrides */
    override def realpathSync(p: String, cache: StringDictionary[String]): String = js.native
    
    /* InferMemberOverrides */
    override def rename(oldPath: String, newPath: String, cb: BFSOneArgCallback): Unit = js.native
    
    /* InferMemberOverrides */
    override def renameSync(oldPath: String, newPath: String): Unit = js.native
    
    def rmdir(p: String, cb: js.Function): Unit = js.native
    /* InferMemberOverrides */
    override def rmdir(p: String, cb: BFSOneArgCallback): Unit = js.native
    
    /* InferMemberOverrides */
    override def rmdirSync(p: String): Unit = js.native
    
    /* InferMemberOverrides */
    override def stat(p: String, isLstat: Boolean, cb: BFSCallback[typings.browserfsH4gEcI12.nodeFsStatsDTsMod.default]): Unit = js.native
    /* InferMemberOverrides */
    override def stat(p: String, isLstat: Null, cb: BFSCallback[typings.browserfsH4gEcI12.nodeFsStatsDTsMod.default]): Unit = js.native
    
    /* InferMemberOverrides */
    override def statSync(p: String): typings.browserfsH4gEcI12.nodeFsStatsDTsMod.default = js.native
    /* InferMemberOverrides */
    override def statSync(p: String, isLstat: Boolean): typings.browserfsH4gEcI12.nodeFsStatsDTsMod.default = js.native
    
    /* InferMemberOverrides */
    override def supportsLinks(): Boolean = js.native
    
    def symlink(srcpath: String, dstpath: String, `type`: String, cb: js.Function): Unit = js.native
    /* InferMemberOverrides */
    override def symlink(srcpath: String, dstpath: String, `type`: String, cb: BFSOneArgCallback): Unit = js.native
    
    /* InferMemberOverrides */
    override def symlinkSync(srcpath: String, dstpath: String, `type`: String): Unit = js.native
    
    def syncClose(method: String, fd: File, cb: BFSOneArgCallback): Unit = js.native
    
    def truncate(p: String, len: Double, cb: js.Function): Unit = js.native
    /* InferMemberOverrides */
    override def truncate(p: String, len: Double, cb: BFSOneArgCallback): Unit = js.native
    
    /* InferMemberOverrides */
    override def truncateSync(p: String, len: Double): Unit = js.native
    
    def unlink(p: String, cb: js.Function): Unit = js.native
    /* InferMemberOverrides */
    override def unlink(p: String, cb: BFSOneArgCallback): Unit = js.native
    
    /* InferMemberOverrides */
    override def unlinkSync(p: String): Unit = js.native
    
    def utimes(p: String, atime: js.Date, mtime: js.Date, cb: js.Function): Unit = js.native
    /* InferMemberOverrides */
    override def utimes(p: String, atime: js.Date, mtime: js.Date, cb: BFSOneArgCallback): Unit = js.native
    
    /* InferMemberOverrides */
    override def utimesSync(p: String, atime: js.Date, mtime: js.Date): Unit = js.native
    
    /* InferMemberOverrides */
    override def writeFile(fname: String, data: Any, encoding: String, flag: FileFlag, mode: Double, cb: BFSOneArgCallback): Unit = js.native
    /* InferMemberOverrides */
    override def writeFile(fname: String, data: Any, encoding: Null, flag: FileFlag, mode: Double, cb: BFSOneArgCallback): Unit = js.native
  }
  
  trait WorkerFSOptions extends StObject {
    
    var worker: Worker
  }
  object WorkerFSOptions {
    
    inline def apply(worker: Worker): WorkerFSOptions = {
      val __obj = js.Dynamic.literal(worker = worker.asInstanceOf[js.Any])
      __obj.asInstanceOf[WorkerFSOptions]
    }
    
    extension [Self <: WorkerFSOptions](x: Self) {
      
      inline def setWorker(value: Worker): Self = StObject.set(x, "worker", value.asInstanceOf[js.Any])
    }
  }
}
