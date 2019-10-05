package typings.browserfs

import org.scalablytyped.runtime.StringDictionary
import typings.browserfs.distNodeBackendMountableFileSystemMod.MountableFileSystem
import typings.browserfs.distNodeBackendMountableFileSystemMod.MountableFileSystemOptions
import typings.browserfs.distNodeCoreApiUnderscoreErrorMod.ApiError
import typings.browserfs.distNodeCoreFileMod.File
import typings.browserfs.distNodeCoreFileUnderscoreFlagMod.FileFlag
import typings.browserfs.distNodeCoreFileUnderscoreSystemMod.BFSCallback
import typings.browserfs.distNodeCoreFileUnderscoreSystemMod.BFSOneArgCallback
import typings.browserfs.distNodeCoreFileUnderscoreSystemMod.BaseFileSystem
import typings.browserfs.distNodeCoreFileUnderscoreSystemMod.FileSystem
import typings.browserfs.distNodeCoreFileUnderscoreSystemMod.FileSystemOptions
import typings.node.Buffer
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("browserfs/dist/node/backend/MountableFileSystem", JSImport.Namespace)
@js.native
object distNodeBackendMountableFileSystemMod extends js.Object {
  @js.native
  trait MountableFileSystem
    extends BaseFileSystem
       with FileSystem {
    var mntMap: js.Any = js.native
    var mountList: js.Any = js.native
    var rootFs: js.Any = js.native
    /**
      * Returns true if the given path contains a mount point.
      */
    /* private */ def _containsMountPt(p: js.Any): js.Any = js.native
    /**
      * Returns the file system that the path points to.
      */
    def _getFs(path: String): Anon_Fs = js.native
    /* InferMemberOverrides */
    override def chmod(p: String, isLchmod: Boolean, mode: Double, cb: BFSOneArgCallback): Unit = js.native
    /* InferMemberOverrides */
    override def chmodSync(p: String, isLchmod: Boolean, mode: Double): Unit = js.native
    /* InferMemberOverrides */
    override def chown(p: String, isLchown: Boolean, uid: Double, gid: Double, cb: BFSOneArgCallback): Unit = js.native
    /* InferMemberOverrides */
    override def chownSync(p: String, isLchown: Boolean, uid: Double, gid: Double): Unit = js.native
    /* InferMemberOverrides */
    override def diskSpace(p: String, cb: js.Function2[/* total */ Double, /* free */ Double, _]): Unit = js.native
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
    /**
      * Mounts the file system at the given mount point.
      */
    def mount(mountPoint: String, fs: FileSystem): Unit = js.native
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
    /**
      * Fixes up error messages so they mention the mounted file location relative
      * to the MFS root, not to the particular FS's root.
      * Mutates the input error, and returns it.
      */
    def standardizeError(err: ApiError, path: String, realPath: String): ApiError = js.native
    /* InferMemberOverrides */
    override def stat(
      p: String,
      isLstat: Boolean,
      cb: BFSCallback[typings.browserfs.distNodeCoreNodeUnderscoreFsUnderscoreStatsMod.default]
    ): Unit = js.native
    /* InferMemberOverrides */
    override def stat(
      p: String,
      isLstat: Null,
      cb: BFSCallback[typings.browserfs.distNodeCoreNodeUnderscoreFsUnderscoreStatsMod.default]
    ): Unit = js.native
    /* InferMemberOverrides */
    override def statSync(p: String): typings.browserfs.distNodeCoreNodeUnderscoreFsUnderscoreStatsMod.default = js.native
    /* InferMemberOverrides */
    override def statSync(p: String, isLstat: Boolean): typings.browserfs.distNodeCoreNodeUnderscoreFsUnderscoreStatsMod.default = js.native
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
  
  @js.native
  /**
    * Creates a new, empty MountableFileSystem.
    */
  class default () extends MountableFileSystem
  
  /* static members */
  @js.native
  object default extends js.Object {
    val Name: String = js.native
    val Options: FileSystemOptions = js.native
    /**
      * Creates a MountableFileSystem instance with the given options.
      */
    def Create(opts: MountableFileSystemOptions, cb: BFSCallback[MountableFileSystem]): Unit = js.native
    def isAvailable(): Boolean = js.native
  }
  
  type MountableFileSystemOptions = StringDictionary[FileSystem]
}

