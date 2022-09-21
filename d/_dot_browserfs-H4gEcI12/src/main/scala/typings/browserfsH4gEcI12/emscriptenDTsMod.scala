package typings.browserfsH4gEcI12

import typings.browserfsH4gEcI12.fileDTsMod.BaseFile
import typings.browserfsH4gEcI12.fileDTsMod.File
import typings.browserfsH4gEcI12.fileSystemDTsMod.BFSCallback
import typings.browserfsH4gEcI12.fileSystemDTsMod.BFSOneArgCallback
import typings.browserfsH4gEcI12.fileSystemDTsMod.BFSThreeArgCallback
import typings.browserfsH4gEcI12.fileSystemDTsMod.FileSystemOptions
import typings.browserfsH4gEcI12.fileSystemDTsMod.SynchronousFileSystem
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object emscriptenDTsMod {
  
  @JSImport(".browserfs-H4gEcI12/dist/node/backend/Emscripten.d.ts", JSImport.Default)
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
    
    @JSImport(".browserfs-H4gEcI12/dist/node/backend/Emscripten.d.ts", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Create an EmscriptenFileSystem instance with the given options.
      */
    inline def Create(opts: EmscriptenFileSystemOptions, cb: BFSCallback[EmscriptenFileSystem]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Create")(opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport(".browserfs-H4gEcI12/dist/node/backend/Emscripten.d.ts", "default.Name")
    @js.native
    val Name: String = js.native
    
    @JSImport(".browserfs-H4gEcI12/dist/node/backend/Emscripten.d.ts", "default.Options")
    @js.native
    val Options: FileSystemOptions = js.native
    
    inline def isAvailable(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAvailable")().asInstanceOf[Boolean]
  }
  
  @JSImport(".browserfs-H4gEcI12/dist/node/backend/Emscripten.d.ts", "EmscriptenFile")
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
    
    extension [Self <: EmscriptenFileSystemOptions](x: Self) {
      
      inline def setFS(value: Any): Self = StObject.set(x, "FS", value.asInstanceOf[js.Any])
    }
  }
}
