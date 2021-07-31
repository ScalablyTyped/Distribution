package typings.browserfs

import org.scalablytyped.runtime.StringDictionary
import typings.browserfs.anon.Fs
import typings.browserfs.apiErrorMod.ApiError
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

object mountableFileSystemMod {
  
  @JSImport("browserfs/dist/node/backend/MountableFileSystem", JSImport.Default)
  @js.native
  /**
    * Creates a new, empty MountableFileSystem.
    */
  class default () extends MountableFileSystem
  /* static members */
  object default {
    
    @JSImport("browserfs/dist/node/backend/MountableFileSystem", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a MountableFileSystem instance with the given options.
      */
    @scala.inline
    def Create(opts: MountableFileSystemOptions, cb: BFSCallback[MountableFileSystem]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Create")(opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("browserfs/dist/node/backend/MountableFileSystem", "default.Name")
    @js.native
    val Name: String = js.native
    
    @JSImport("browserfs/dist/node/backend/MountableFileSystem", "default.Options")
    @js.native
    val Options: FileSystemOptions = js.native
    
    @scala.inline
    def isAvailable(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAvailable")().asInstanceOf[Boolean]
  }
  
  @js.native
  trait MountableFileSystem
    extends BaseFileSystem
       with FileSystem {
    
    /**
      * Returns true if the given path contains a mount point.
      */
    /* private */ def _containsMountPt(p: js.Any): js.Any = js.native
    
    /**
      * Returns the file system that the path points to.
      */
    def _getFs(path: String): Fs = js.native
    
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
    
    /* InferMemberOverrides */
    override def exists(p: String, cb: js.Function1[/* exists */ Boolean, Unit]): Unit = js.native
    
    /* InferMemberOverrides */
    override def existsSync(p: String): Boolean = js.native
    
    /* InferMemberOverrides */
    override def link(srcpath: String, dstpath: String, cb: BFSOneArgCallback): Unit = js.native
    
    /* InferMemberOverrides */
    override def linkSync(srcpath: String, dstpath: String): Unit = js.native
    
    /* InferMemberOverrides */
    override def mkdir(p: String, mode: Double, cb: BFSOneArgCallback): Unit = js.native
    
    /* InferMemberOverrides */
    override def mkdirSync(p: String, mode: Double): Unit = js.native
    
    var mntMap: js.Any = js.native
    
    /**
      * Mounts the file system at the given mount point.
      */
    def mount(mountPoint: String, fs: FileSystem): Unit = js.native
    
    var mountList: js.Any = js.native
    
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
    
    var rootFs: js.Any = js.native
    
    /**
      * Fixes up error messages so they mention the mounted file location relative
      * to the MFS root, not to the particular FS's root.
      * Mutates the input error, and returns it.
      */
    def standardizeError(err: ApiError, path: String, realPath: String): ApiError = js.native
    
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
    
    def umount(mountPoint: String): Unit = js.native
    
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
  
  type MountableFileSystemOptions = StringDictionary[FileSystem]
}
