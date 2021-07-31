package typings.browserfs

import org.scalablytyped.runtime.StringDictionary
import typings.browserfs.anon.Readable
import typings.browserfs.fileFlagMod.FileFlag
import typings.browserfs.fileMod.File
import typings.browserfs.fileSystemMod.BFSCallback
import typings.browserfs.fileSystemMod.BFSOneArgCallback
import typings.browserfs.fileSystemMod.BaseFileSystem
import typings.browserfs.fileSystemMod.FileSystem
import typings.browserfs.fileSystemMod.FileSystemOptions
import typings.node.Buffer
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object overlayFSMod {
  
  @JSImport("browserfs/dist/node/backend/OverlayFS", JSImport.Default)
  @js.native
  class default protected () extends OverlayFS {
    /**
      * **Deprecated. Please use OverlayFS.Create() method instead.**
      * @param writable The file system to write modified files to.
      * @param readable The file system that initially populates this file system.
      */
    def this(writable: FileSystem, readable: FileSystem) = this()
    def this(writable: FileSystem, readable: FileSystem, deprecateMsg: Boolean) = this()
  }
  /* static members */
  object default {
    
    @JSImport("browserfs/dist/node/backend/OverlayFS", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Constructs and initializes an OverlayFS instance with the given options.
      */
    @scala.inline
    def Create(opts: OverlayFSOptions, cb: BFSCallback[OverlayFS]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Create")(opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("browserfs/dist/node/backend/OverlayFS", "default.Name")
    @js.native
    val Name: String = js.native
    
    @JSImport("browserfs/dist/node/backend/OverlayFS", "default.Options")
    @js.native
    val Options: FileSystemOptions = js.native
    
    @scala.inline
    def isAvailable(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAvailable")().asInstanceOf[Boolean]
  }
  
  @JSImport("browserfs/dist/node/backend/OverlayFS", "UnlockedOverlayFS")
  @js.native
  class UnlockedOverlayFS protected ()
    extends BaseFileSystem
       with FileSystem {
    def this(writable: FileSystem, readable: FileSystem) = this()
    
    var _deleteLog: js.Any = js.native
    
    var _deleteLogError: js.Any = js.native
    
    var _deleteLogUpdateNeeded: js.Any = js.native
    
    var _deleteLogUpdatePending: js.Any = js.native
    
    var _deletedFiles: js.Any = js.native
    
    var _initializeCallbacks: js.Any = js.native
    
    var _isInitialized: js.Any = js.native
    
    var _readable: js.Any = js.native
    
    /* private */ def _reparseDeletionLog(): js.Any = js.native
    
    def _syncAsync(file: typings.browserfs.preloadFileMod.default[UnlockedOverlayFS], cb: BFSOneArgCallback): Unit = js.native
    
    def _syncSync(file: typings.browserfs.preloadFileMod.default[UnlockedOverlayFS]): Unit = js.native
    
    var _writable: js.Any = js.native
    
    /* private */ def checkInitAsync(cb: js.Any): js.Any = js.native
    
    /* private */ def checkInitialized(): js.Any = js.native
    
    /* private */ def checkPath(p: js.Any): js.Any = js.native
    
    /* private */ def checkPathAsync(p: js.Any, cb: js.Any): js.Any = js.native
    
    /* InferMemberOverrides */
    override def chmod(p: String, isLchmod: Boolean, mode: Double, cb: BFSOneArgCallback): Unit = js.native
    
    /* InferMemberOverrides */
    override def chmodSync(p: String, isLchmod: Boolean, mode: Double): Unit = js.native
    
    /* InferMemberOverrides */
    override def chown(p: String, isLchown: Boolean, uid: Double, gid: Double, cb: BFSOneArgCallback): Unit = js.native
    
    /* InferMemberOverrides */
    override def chownSync(p: String, isLchown: Boolean, uid: Double, gid: Double): Unit = js.native
    
    /**
      * Copy from readable to writable storage.
      * PRECONDITION: File does not exist on writable storage.
      */
    /* private */ def copyToWritable(p: js.Any): js.Any = js.native
    
    /* private */ def copyToWritableAsync(p: js.Any, cb: js.Any): js.Any = js.native
    
    /**
      * With the given path, create the needed parent directories on the writable storage
      * should they not exist. Use modes from the read-only storage.
      */
    /* private */ def createParentDirectories(p: js.Any): js.Any = js.native
    
    /* private */ def createParentDirectoriesAsync(p: js.Any, cb: js.Any): js.Any = js.native
    
    /* private */ def deletePath(p: js.Any): js.Any = js.native
    
    /* InferMemberOverrides */
    override def diskSpace(p: String, cb: js.Function2[/* total */ Double, /* free */ Double, js.Any]): Unit = js.native
    
    /* InferMemberOverrides */
    override def exists(p: String, cb: js.Function1[/* exists */ Boolean, Unit]): Unit = js.native
    
    /* InferMemberOverrides */
    override def existsSync(p: String): Boolean = js.native
    
    def getDeletionLog(): String = js.native
    
    def getOverlayedFileSystems(): Readable = js.native
    
    /**
      * Called once to load up metadata stored on the writable file system.
      */
    def initialize(cb: BFSOneArgCallback): Unit = js.native
    
    /* InferMemberOverrides */
    override def link(srcpath: String, dstpath: String, cb: BFSOneArgCallback): Unit = js.native
    
    /* InferMemberOverrides */
    override def linkSync(srcpath: String, dstpath: String): Unit = js.native
    
    def mkdir(p: String, mode: Double, cb: BFSCallback[typings.browserfs.nodeFsStatsMod.default]): Unit = js.native
    /* InferMemberOverrides */
    override def mkdir(p: String, mode: Double, cb: BFSOneArgCallback): Unit = js.native
    
    /* InferMemberOverrides */
    override def mkdirSync(p: String, mode: Double): Unit = js.native
    
    /* InferMemberOverrides */
    override def open(p: String, flag: FileFlag, mode: Double, cb: BFSCallback[File]): Unit = js.native
    
    /* InferMemberOverrides */
    override def openSync(p: String, flag: FileFlag, mode: Double): File = js.native
    
    /**
      * Helper function:
      * - Ensures p is on writable before proceeding. Throws an error if it doesn't exist.
      * - Calls f to perform operation on writable.
      */
    /* private */ def operateOnWritable(p: js.Any, f: js.Any): js.Any = js.native
    
    /* private */ def operateOnWritableAsync(p: js.Any, cb: js.Any): js.Any = js.native
    
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
    override def readlinkSync(p: String): String = js.native
    
    /* InferMemberOverrides */
    override def realpath(p: String, cache: StringDictionary[String], cb: BFSCallback[String]): Unit = js.native
    
    /* InferMemberOverrides */
    override def realpathSync(p: String, cache: StringDictionary[String]): String = js.native
    
    /* InferMemberOverrides */
    override def rename(oldPath: String, newPath: String, cb: BFSOneArgCallback): Unit = js.native
    
    /* InferMemberOverrides */
    override def renameSync(oldPath: String, newPath: String): Unit = js.native
    
    def restoreDeletionLog(log: String): Unit = js.native
    
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
    
    /* private */ def updateLog(addition: js.Any): js.Any = js.native
    
    /* InferMemberOverrides */
    override def utimes(p: String, atime: Date, mtime: Date, cb: BFSOneArgCallback): Unit = js.native
    
    /* InferMemberOverrides */
    override def utimesSync(p: String, atime: Date, mtime: Date): Unit = js.native
    
    /* InferMemberOverrides */
    override def writeFile(fname: String, data: js.Any, encoding: String, flag: FileFlag, mode: Double, cb: BFSOneArgCallback): Unit = js.native
    /* InferMemberOverrides */
    override def writeFile(fname: String, data: js.Any, encoding: Null, flag: FileFlag, mode: Double, cb: BFSOneArgCallback): Unit = js.native
  }
  /* static members */
  object UnlockedOverlayFS {
    
    @JSImport("browserfs/dist/node/backend/OverlayFS", "UnlockedOverlayFS")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def isAvailable(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAvailable")().asInstanceOf[Boolean]
  }
  
  @js.native
  trait OverlayFS
    extends typings.browserfs.lockedFsMod.default[UnlockedOverlayFS] {
    
    def getOverlayedFileSystems(): Readable = js.native
    
    def initialize(cb: BFSOneArgCallback, deprecateMsg: Boolean): Unit = js.native
    
    def unwrap(): UnlockedOverlayFS = js.native
  }
  
  trait OverlayFSOptions extends StObject {
    
    var readable: FileSystem
    
    var writable: FileSystem
  }
  object OverlayFSOptions {
    
    @scala.inline
    def apply(readable: FileSystem, writable: FileSystem): OverlayFSOptions = {
      val __obj = js.Dynamic.literal(readable = readable.asInstanceOf[js.Any], writable = writable.asInstanceOf[js.Any])
      __obj.asInstanceOf[OverlayFSOptions]
    }
    
    @scala.inline
    implicit class OverlayFSOptionsMutableBuilder[Self <: OverlayFSOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setReadable(value: FileSystem): Self = StObject.set(x, "readable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWritable(value: FileSystem): Self = StObject.set(x, "writable", value.asInstanceOf[js.Any])
    }
  }
}
