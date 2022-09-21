package typings.browserfsH4gEcI12

import org.scalablytyped.runtime.StringDictionary
import typings.browserfsH4gEcI12.fileDTsMod.File
import typings.browserfsH4gEcI12.fileFlagDTsMod.FileFlag
import typings.browserfsH4gEcI12.fileSystemDTsMod.BFSCallback
import typings.browserfsH4gEcI12.fileSystemDTsMod.BFSOneArgCallback
import typings.browserfsH4gEcI12.fileSystemDTsMod.FileSystem
import typings.browserfsH4gEcI12.fileSystemDTsMod.FileSystemOptions
import typings.browserfsH4gEcI12.fileSystemDTsMod.SynchronousFileSystem
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object asyncMirrorDTsMod {
  
  @JSImport(".browserfs-H4gEcI12/dist/node/backend/AsyncMirror.d.ts", JSImport.Default)
  @js.native
  open class default protected () extends AsyncMirror {
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
  /* static members */
  object default {
    
    @JSImport(".browserfs-H4gEcI12/dist/node/backend/AsyncMirror.d.ts", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Constructs and initializes an AsyncMirror file system with the given options.
      */
    inline def Create(opts: AsyncMirrorOptions, cb: BFSCallback[AsyncMirror]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Create")(opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport(".browserfs-H4gEcI12/dist/node/backend/AsyncMirror.d.ts", "default.Name")
    @js.native
    val Name: String = js.native
    
    @JSImport(".browserfs-H4gEcI12/dist/node/backend/AsyncMirror.d.ts", "default.Options")
    @js.native
    val Options: FileSystemOptions = js.native
    
    inline def isAvailable(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAvailable")().asInstanceOf[Boolean]
  }
  
  @js.native
  trait AsyncMirror
    extends SynchronousFileSystem
       with FileSystem {
    
    /* private */ var _async: Any = js.native
    
    /* private */ var _initializeCallbacks: Any = js.native
    
    /* private */ var _isInitialized: Any = js.native
    
    /**
      * Queue of pending asynchronous operations.
      */
    /* private */ var _queue: Any = js.native
    
    /* private */ var _queueRunning: Any = js.native
    
    /* private */ var _sync: Any = js.native
    
    def _syncSync(fd: typings.browserfsH4gEcI12.preloadFileDTsMod.default[Any]): Unit = js.native
    
    /* private */ def checkInitialized(): Any = js.native
    
    /* InferMemberOverrides */
    override def chmod(p: String, isLchmod: Boolean, mode: Double, cb: BFSOneArgCallback): Unit = js.native
    
    /* InferMemberOverrides */
    override def chmodSync(p: String, isLchmod: Boolean, mode: Double): Unit = js.native
    
    /* InferMemberOverrides */
    override def chown(p: String, isLchown: Boolean, uid: Double, gid: Double, cb: BFSOneArgCallback): Unit = js.native
    
    /* InferMemberOverrides */
    override def chownSync(p: String, isLchown: Boolean, uid: Double, gid: Double): Unit = js.native
    
    /* InferMemberOverrides */
    override def diskSpace(p: String, cb: js.Function2[/* total */ Double, /* free */ Double, Any]): Unit = js.native
    
    /* private */ def enqueueOp(op: Any): Any = js.native
    
    /* InferMemberOverrides */
    override def exists(p: String, cb: js.Function1[/* exists */ Boolean, Unit]): Unit = js.native
    
    /* InferMemberOverrides */
    override def existsSync(p: String): Boolean = js.native
    
    /**
      * Called once to load up files from async storage into sync storage.
      */
    def initialize(userCb: BFSOneArgCallback): Unit = js.native
    def initialize(userCb: BFSOneArgCallback, deprecateMsg: Boolean): Unit = js.native
    
    /* InferMemberOverrides */
    override def link(srcpath: String, dstpath: String, cb: BFSOneArgCallback): Unit = js.native
    
    /* InferMemberOverrides */
    override def linkSync(srcpath: String, dstpath: String): Unit = js.native
    
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
    
    /* InferMemberOverrides */
    override def readlink(p: String, cb: BFSCallback[String]): Unit = js.native
    
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
    
    /* InferMemberOverrides */
    override def supportsSynch(): Boolean = js.native
    
    /* InferMemberOverrides */
    override def symlink(srcpath: String, dstpath: String, `type`: String, cb: BFSOneArgCallback): Unit = js.native
    
    /* InferMemberOverrides */
    override def symlinkSync(srcpath: String, dstpath: String, `type`: String): Unit = js.native
    
    /* InferMemberOverrides */
    override def truncate(p: String, len: Double, cb: BFSOneArgCallback): Unit = js.native
    
    /* InferMemberOverrides */
    override def truncateSync(p: String, len: Double): Unit = js.native
    
    /* InferMemberOverrides */
    override def unlink(p: String, cb: BFSOneArgCallback): Unit = js.native
    
    /* InferMemberOverrides */
    override def unlinkSync(p: String): Unit = js.native
    
    /* InferMemberOverrides */
    override def utimes(p: String, atime: js.Date, mtime: js.Date, cb: BFSOneArgCallback): Unit = js.native
    
    /* InferMemberOverrides */
    override def utimesSync(p: String, atime: js.Date, mtime: js.Date): Unit = js.native
    
    /* InferMemberOverrides */
    override def writeFile(fname: String, data: Any, encoding: String, flag: FileFlag, mode: Double, cb: BFSOneArgCallback): Unit = js.native
    /* InferMemberOverrides */
    override def writeFile(fname: String, data: Any, encoding: Null, flag: FileFlag, mode: Double, cb: BFSOneArgCallback): Unit = js.native
  }
  
  trait AsyncMirrorOptions extends StObject {
    
    var async: FileSystem
    
    var sync: FileSystem
  }
  object AsyncMirrorOptions {
    
    inline def apply(async: FileSystem, sync: FileSystem): AsyncMirrorOptions = {
      val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], sync = sync.asInstanceOf[js.Any])
      __obj.asInstanceOf[AsyncMirrorOptions]
    }
    
    extension [Self <: AsyncMirrorOptions](x: Self) {
      
      inline def setAsync(value: FileSystem): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      inline def setSync(value: FileSystem): Self = StObject.set(x, "sync", value.asInstanceOf[js.Any])
    }
  }
}
