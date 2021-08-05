package typings.browserfs

import typings.browserfs.fileMod.BaseFile
import typings.browserfs.fileMod.File
import typings.browserfs.fileSystemMod.BFSCallback
import typings.browserfs.fileSystemMod.BFSOneArgCallback
import typings.browserfs.fileSystemMod.BFSThreeArgCallback
import typings.browserfs.fileSystemMod.FileSystemOptions
import typings.browserfs.fileSystemMod.SynchronousFileSystem
import typings.node.Buffer
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object emscriptenMod {
  
  @JSImport("browserfs/dist/node/backend/Emscripten", JSImport.Default)
  @js.native
  class default protected () extends EmscriptenFileSystem {
    /**
      * Creates a BrowserFS file system for the given Emscripten file system.
      * @param _FS The Emscripten file system (`FS`).
      */
    def this(_FS: js.Any) = this()
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
  class EmscriptenFile protected ()
    extends BaseFile
       with File {
    def this(_fs: EmscriptenFileSystem, _FS: js.Any, _path: String, _stream: js.Any) = this()
    
    /* private */ var _FS: js.Any = js.native
    
    /* private */ var _fs: js.Any = js.native
    
    /* private */ var _path: js.Any = js.native
    
    /* private */ var _stream: js.Any = js.native
    
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
      buffer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeBuffer */ js.Any,
      offset: Double,
      length: Double,
      position: Double,
      cb: BFSThreeArgCallback[Double, Buffer]
    ): Unit = js.native
    
    def readSync(
      buffer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeBuffer */ js.Any,
      offset: Double,
      length: Double
    ): Double = js.native
    def readSync(
      buffer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeBuffer */ js.Any,
      offset: Double,
      length: Double,
      position: Double
    ): Double = js.native
    
    /* InferMemberOverrides */
    override def sync(cb: BFSOneArgCallback): Unit = js.native
    
    /* InferMemberOverrides */
    override def syncSync(): Unit = js.native
    
    /* InferMemberOverrides */
    override def utimes(atime: Date, mtime: Date, cb: BFSOneArgCallback): Unit = js.native
    
    /* InferMemberOverrides */
    override def utimesSync(atime: Date, mtime: Date): Unit = js.native
    
    def write(
      buffer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeBuffer */ js.Any,
      offset: Double,
      length: Double,
      position: Double,
      cb: BFSThreeArgCallback[Double, Buffer]
    ): Unit = js.native
    
    def writeSync(
      buffer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeBuffer */ js.Any,
      offset: Double,
      length: Double
    ): Double = js.native
    def writeSync(
      buffer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeBuffer */ js.Any,
      offset: Double,
      length: Double,
      position: Double
    ): Double = js.native
  }
  
  @js.native
  trait EmscriptenFileSystem extends SynchronousFileSystem {
    
    /* private */ var _FS: js.Any = js.native
    
    def getName(): String = js.native
    
    def isReadOnly(): Boolean = js.native
    
    /* private */ def modeToFileType(mode: js.Any): js.Any = js.native
    
    def supportsProps(): Boolean = js.native
  }
  
  trait EmscriptenFileSystemOptions extends StObject {
    
    var FS: js.Any
  }
  object EmscriptenFileSystemOptions {
    
    inline def apply(FS: js.Any): EmscriptenFileSystemOptions = {
      val __obj = js.Dynamic.literal(FS = FS.asInstanceOf[js.Any])
      __obj.asInstanceOf[EmscriptenFileSystemOptions]
    }
    
    extension [Self <: EmscriptenFileSystemOptions](x: Self) {
      
      inline def setFS(value: js.Any): Self = StObject.set(x, "FS", value.asInstanceOf[js.Any])
    }
  }
}
