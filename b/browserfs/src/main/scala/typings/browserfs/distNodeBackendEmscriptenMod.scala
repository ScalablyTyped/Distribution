package typings.browserfs

import typings.browserfs.distNodeCoreFileMod.BaseFile
import typings.browserfs.distNodeCoreFileMod.File
import typings.browserfs.distNodeCoreFileSystemMod.BFSCallback
import typings.browserfs.distNodeCoreFileSystemMod.BFSOneArgCallback
import typings.browserfs.distNodeCoreFileSystemMod.BFSThreeArgCallback
import typings.browserfs.distNodeCoreFileSystemMod.FileSystemOptions
import typings.browserfs.distNodeCoreFileSystemMod.SynchronousFileSystem
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodeBackendEmscriptenMod {
  
  @JSImport("browserfs/dist/node/backend/Emscripten", JSImport.Default)
  @js.native
  open class default protected () extends EmscriptenFileSystem {
    /**
      * Creates a BrowserFS file system for the given Emscripten file system.
      * @param _FS The Emscripten file system (`FS`).
      */
    def this(_FS: Any) = this()
  }
  /* static members */
  object default {
    
    @JSImport("browserfs/dist/node/backend/Emscripten", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Create an EmscriptenFileSystem instance with the given options.
      */
    inline def Create(opts: EmscriptenFileSystemOptions, cb: BFSCallback[EmscriptenFileSystem]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Create")(opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("browserfs/dist/node/backend/Emscripten", "default.Name")
    @js.native
    val Name: String = js.native
    
    @JSImport("browserfs/dist/node/backend/Emscripten", "default.Options")
    @js.native
    val Options: FileSystemOptions = js.native
    
    inline def isAvailable(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAvailable")().asInstanceOf[Boolean]
  }
  
  @JSImport("browserfs/dist/node/backend/Emscripten", "EmscriptenFile")
  @js.native
  open class EmscriptenFile protected ()
    extends BaseFile
       with File {
    def this(_fs: EmscriptenFileSystem, _FS: Any, _path: String, _stream: Any) = this()
    
    /* private */ var _FS: Any = js.native
    
    /* private */ var _fs: Any = js.native
    
    /* private */ var _path: Any = js.native
    
    /* private */ var _stream: Any = js.native
    
    /* InferMemberOverrides */
    override def chmod(mode: Double, cb: BFSOneArgCallback): Unit = js.native
    
    /* InferMemberOverrides */
    override def chmodSync(mode: Double): Unit = js.native
    
    /* InferMemberOverrides */
    override def chown(uid: Double, gid: Double, cb: BFSOneArgCallback): Unit = js.native
    
    /* InferMemberOverrides */
    override def chownSync(uid: Double, gid: Double): Unit = js.native
    
    /* InferMemberOverrides */
    override def datasync(cb: BFSOneArgCallback): Unit = js.native
    
    /* InferMemberOverrides */
    override def datasyncSync(): Unit = js.native
    
    def read(
      buffer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeBuffer */ Any,
      offset: Double,
      length: Double,
      position: Double,
      cb: BFSThreeArgCallback[Double, Buffer]
    ): Unit = js.native
    
    def readSync(
      buffer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeBuffer */ Any,
      offset: Double,
      length: Double
    ): Double = js.native
    def readSync(
      buffer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeBuffer */ Any,
      offset: Double,
      length: Double,
      position: Double
    ): Double = js.native
    
    /* InferMemberOverrides */
    override def sync(cb: BFSOneArgCallback): Unit = js.native
    
    /* InferMemberOverrides */
    override def syncSync(): Unit = js.native
    
    /* InferMemberOverrides */
    override def utimes(atime: js.Date, mtime: js.Date, cb: BFSOneArgCallback): Unit = js.native
    
    /* InferMemberOverrides */
    override def utimesSync(atime: js.Date, mtime: js.Date): Unit = js.native
    
    def write(
      buffer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeBuffer */ Any,
      offset: Double,
      length: Double,
      position: Double,
      cb: BFSThreeArgCallback[Double, Buffer]
    ): Unit = js.native
    
    def writeSync(
      buffer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeBuffer */ Any,
      offset: Double,
      length: Double
    ): Double = js.native
    def writeSync(
      buffer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeBuffer */ Any,
      offset: Double,
      length: Double,
      position: Double
    ): Double = js.native
  }
  
  @js.native
  trait EmscriptenFileSystem extends SynchronousFileSystem {
    
    /* private */ var _FS: Any = js.native
    
    def getName(): String = js.native
    
    def isReadOnly(): Boolean = js.native
    
    /* private */ def modeToFileType(mode: Any): Any = js.native
    
    def supportsProps(): Boolean = js.native
  }
  
  trait EmscriptenFileSystemOptions extends StObject {
    
    var FS: Any
  }
  object EmscriptenFileSystemOptions {
    
    inline def apply(FS: Any): EmscriptenFileSystemOptions = {
      val __obj = js.Dynamic.literal(FS = FS.asInstanceOf[js.Any])
      __obj.asInstanceOf[EmscriptenFileSystemOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EmscriptenFileSystemOptions] (val x: Self) extends AnyVal {
      
      inline def setFS(value: Any): Self = StObject.set(x, "FS", value.asInstanceOf[js.Any])
    }
  }
}
