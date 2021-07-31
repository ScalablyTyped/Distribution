package typings.browserfs

import org.scalablytyped.runtime.StringDictionary
import typings.browserfs.fileFlagMod.FileFlag
import typings.browserfs.fileMod.File
import typings.browserfs.fileSystemMod.BFSCallback
import typings.browserfs.fileSystemMod.BFSOneArgCallback
import typings.browserfs.fileSystemMod.FileSystem
import typings.browserfs.fileSystemMod.FileSystemOptions
import typings.browserfs.fileSystemMod.SynchronousFileSystem
import typings.node.Buffer
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object asyncMirrorMod {
  
  @JSImport("browserfs/dist/node/backend/AsyncMirror", JSImport.Default)
  @js.native
  class default protected () extends AsyncMirror {
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
    
    @JSImport("browserfs/dist/node/backend/AsyncMirror", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Constructs and initializes an AsyncMirror file system with the given options.
      */
    @scala.inline
    def Create(opts: AsyncMirrorOptions, cb: BFSCallback[AsyncMirror]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Create")(opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("browserfs/dist/node/backend/AsyncMirror", "default.Name")
    @js.native
    val Name: String = js.native
    
    @JSImport("browserfs/dist/node/backend/AsyncMirror", "default.Options")
    @js.native
    val Options: FileSystemOptions = js.native
    
    @scala.inline
    def isAvailable(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAvailable")().asInstanceOf[Boolean]
  }
  
  @js.native
  trait AsyncMirror
    extends SynchronousFileSystem
       with FileSystem {
    
    var _async: js.Any = js.native
    
    var _initializeCallbacks: js.Any = js.native
    
    var _isInitialized: js.Any = js.native
    
    /**
      * Queue of pending asynchronous operations.
      */
    var _queue: js.Any = js.native
    
    var _queueRunning: js.Any = js.native
    
    var _sync: js.Any = js.native
    
    def _syncSync(fd: typings.browserfs.preloadFileMod.default[js.Any]): Unit = js.native
    
    /* private */ def checkInitialized(): js.Any = js.native
    
    /* InferMemberOverrides */
    override def chmod(p: String, isLchmod: Boolean, mode: Double, cb: BFSOneArgCallback): Unit = js.native
    
    /* InferMemberOverrides */
    override def chmodSync(p: String, isLchmod: Boolean, mode: Double): Unit = js.native
    
    /* InferMemberOverrides */
    override def chown(p: String, isLchown: Boolean, uid: Double, gid: Double, cb: BFSOneArgCallback): Unit = js.native
    
    /* InferMemberOverrides */
    override def chownSync(p: String, isLchown: Boolean, uid: Double, gid: Double): Unit = js.native
    
    /* InferMemberOverrides */
    override def diskSpace(p: String, cb: js.Function2[/* total */ Double, /* free */ Double, js.Any]): Unit = js.native
    
    /* private */ def enqueueOp(op: js.Any): js.Any = js.native
    
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
    override def readFileSync(fname: String, encoding: String, flag: FileFlag): js.Any = js.native
    /* InferMemberOverrides */
    override def readFileSync(fname: String, encoding: Null, flag: FileFlag): js.Any = js.native
    
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
    override def stat(p: String, isLstat: Boolean, cb: BFSCallback[typings.browserfs.nodeFsStatsMod.default]): Unit = js.native
    /* InferMemberOverrides */
    override def stat(p: String, isLstat: Null, cb: BFSCallback[typings.browserfs.nodeFsStatsMod.default]): Unit = js.native
    
    /* InferMemberOverrides */
    override def statSync(p: String): typings.browserfs.nodeFsStatsMod.default = js.native
    /* InferMemberOverrides */
    override def statSync(p: String, isLstat: Boolean): typings.browserfs.nodeFsStatsMod.default = js.native
    
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
    override def utimes(p: String, atime: Date, mtime: Date, cb: BFSOneArgCallback): Unit = js.native
    
    /* InferMemberOverrides */
    override def utimesSync(p: String, atime: Date, mtime: Date): Unit = js.native
    
    /* InferMemberOverrides */
    override def writeFile(fname: String, data: js.Any, encoding: String, flag: FileFlag, mode: Double, cb: BFSOneArgCallback): Unit = js.native
    /* InferMemberOverrides */
    override def writeFile(fname: String, data: js.Any, encoding: Null, flag: FileFlag, mode: Double, cb: BFSOneArgCallback): Unit = js.native
  }
  
  trait AsyncMirrorOptions extends StObject {
    
    var async: FileSystem
    
    var sync: FileSystem
  }
  object AsyncMirrorOptions {
    
    @scala.inline
    def apply(async: FileSystem, sync: FileSystem): AsyncMirrorOptions = {
      val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], sync = sync.asInstanceOf[js.Any])
      __obj.asInstanceOf[AsyncMirrorOptions]
    }
    
    @scala.inline
    implicit class AsyncMirrorOptionsMutableBuilder[Self <: AsyncMirrorOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAsync(value: FileSystem): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSync(value: FileSystem): Self = StObject.set(x, "sync", value.asInstanceOf[js.Any])
    }
  }
}
