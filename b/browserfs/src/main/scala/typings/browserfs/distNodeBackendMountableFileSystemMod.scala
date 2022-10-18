package typings.browserfs

import org.scalablytyped.runtime.StringDictionary
import typings.browserfs.anon.Fs
import typings.browserfs.distNodeCoreApiErrorMod.ApiError
import typings.browserfs.distNodeCoreFileFlagMod.FileFlag
import typings.browserfs.distNodeCoreFileMod.File
import typings.browserfs.distNodeCoreFileSystemMod.BFSCallback
import typings.browserfs.distNodeCoreFileSystemMod.BFSOneArgCallback
import typings.browserfs.distNodeCoreFileSystemMod.BaseFileSystem
import typings.browserfs.distNodeCoreFileSystemMod.FileSystem
import typings.browserfs.distNodeCoreFileSystemMod.FileSystemOptions
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodeBackendMountableFileSystemMod {
  
  @JSImport("browserfs/dist/node/backend/MountableFileSystem", JSImport.Default)
  @js.native
  /**
    * Creates a new, empty MountableFileSystem.
    */
  open class default () extends MountableFileSystem
  /* static members */
  object default {
    
    @JSImport("browserfs/dist/node/backend/MountableFileSystem", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a MountableFileSystem instance with the given options.
      */
    inline def Create(opts: MountableFileSystemOptions, cb: BFSCallback[MountableFileSystem]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Create")(opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("browserfs/dist/node/backend/MountableFileSystem", "default.Name")
    @js.native
    val Name: String = js.native
    
    @JSImport("browserfs/dist/node/backend/MountableFileSystem", "default.Options")
    @js.native
    val Options: FileSystemOptions = js.native
    
    inline def isAvailable(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAvailable")().asInstanceOf[Boolean]
  }
  
  @js.native
  trait MountableFileSystem
    extends BaseFileSystem
       with FileSystem {
    
    /**
      * Returns true if the given path contains a mount point.
      */
    /* private */ def _containsMountPt(p: Any): Any = js.native
    
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
    override def diskSpace(p: String, cb: js.Function2[/* total */ Double, /* free */ Double, Any]): Unit = js.native
    
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
    
    /* private */ var mntMap: Any = js.native
    
    /**
      * Mounts the file system at the given mount point.
      */
    def mount(mountPoint: String, fs: FileSystem): Unit = js.native
    
    /* private */ var mountList: Any = js.native
    
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
    
    /* private */ var rootFs: Any = js.native
    
    /**
      * Fixes up error messages so they mention the mounted file location relative
      * to the MFS root, not to the particular FS's root.
      * Mutates the input error, and returns it.
      */
    def standardizeError(err: ApiError, path: String, realPath: String): ApiError = js.native
    
    /* InferMemberOverrides */
    override def stat(p: String, isLstat: Boolean, cb: BFSCallback[typings.browserfs.distNodeCoreNodeFsStatsMod.default]): Unit = js.native
    /* InferMemberOverrides */
    override def stat(p: String, isLstat: Null, cb: BFSCallback[typings.browserfs.distNodeCoreNodeFsStatsMod.default]): Unit = js.native
    
    /* InferMemberOverrides */
    override def statSync(p: String): typings.browserfs.distNodeCoreNodeFsStatsMod.default = js.native
    /* InferMemberOverrides */
    override def statSync(p: String, isLstat: Boolean): typings.browserfs.distNodeCoreNodeFsStatsMod.default = js.native
    
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
    override def utimes(p: String, atime: js.Date, mtime: js.Date, cb: BFSOneArgCallback): Unit = js.native
    
    /* InferMemberOverrides */
    override def utimesSync(p: String, atime: js.Date, mtime: js.Date): Unit = js.native
    
    /* InferMemberOverrides */
    override def writeFile(fname: String, data: Any, encoding: String, flag: FileFlag, mode: Double, cb: BFSOneArgCallback): Unit = js.native
    /* InferMemberOverrides */
    override def writeFile(fname: String, data: Any, encoding: Null, flag: FileFlag, mode: Double, cb: BFSOneArgCallback): Unit = js.native
  }
  
  type MountableFileSystemOptions = StringDictionary[FileSystem]
}
