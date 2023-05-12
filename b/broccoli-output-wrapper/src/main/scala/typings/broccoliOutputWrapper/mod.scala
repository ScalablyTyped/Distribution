package typings.broccoliOutputWrapper

import typings.broccoliOutputWrapper.anon.Fn0
import typings.broccoliOutputWrapper.anon.FnCall
import typings.broccoliOutputWrapper.anon.FnCallFileDataOptions
import typings.broccoliOutputWrapper.anon.FnCallPathDataOptions
import typings.broccoliOutputWrapper.anon.FnCallPathOptions
import typings.broccoliOutputWrapper.anon.FnCallTargetPathType
import typings.broccoliOutputWrapper.broccoliOutputWrapperStrings.buffer
import typings.node.NodeJS.ArrayBufferView
import typings.node.anon.Encoding
import typings.node.anon.EncodingFlag
import typings.node.anon.Flag
import typings.node.anon.MakeDirectoryOptionsrecur
import typings.node.anon.MakeDirectoryOptionsrecurMode
import typings.node.anon.ObjectEncodingOptionsflagEncoding
import typings.node.anon.ObjectEncodingOptionswith
import typings.node.anon.ObjectEncodingOptionswithEncoding
import typings.node.anon.Recursive
import typings.node.anon.StatSyncOptionsbigintbool
import typings.node.anon.StatSyncOptionsbigintfals
import typings.node.anon.StatSyncOptionsbigintfalsBigint
import typings.node.anon.StatSyncOptionsbiginttrue
import typings.node.anon.StatSyncOptionsbiginttrueBigint
import typings.node.bufferMod.global.Buffer
import typings.node.bufferMod.global.BufferEncoding
import typings.node.fsMod.BigIntStats
import typings.node.fsMod.Dirent
import typings.node.fsMod.MakeDirectoryOptions
import typings.node.fsMod.Mode
import typings.node.fsMod.PathLike
import typings.node.fsMod.PathOrFileDescriptor
import typings.node.fsMod.StatSyncFn
import typings.node.fsMod.StatSyncOptions
import typings.node.fsMod.Stats
import typings.node.fsMod.TimeLike
import typings.node.fsMod.WriteFileOptions
import typings.node.fsMod.symlink.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(node: Any): FSOutput = ^.asInstanceOf[js.Dynamic].apply(node.asInstanceOf[js.Any]).asInstanceOf[FSOutput]
  
  @JSImport("broccoli-output-wrapper", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait FSOutput extends StObject {
    
    def appendFileSync(path: PathOrFileDescriptor, data: String): Unit = js.native
    def appendFileSync(path: PathOrFileDescriptor, data: String, options: WriteFileOptions): Unit = js.native
    def appendFileSync(path: PathOrFileDescriptor, data: js.typedarray.Uint8Array): Unit = js.native
    def appendFileSync(path: PathOrFileDescriptor, data: js.typedarray.Uint8Array, options: WriteFileOptions): Unit = js.native
    @JSName("appendFileSync")
    var appendFileSync_Original: FnCallPathDataOptions = js.native
    
    def existsSync(path: PathLike): Boolean = js.native
    @JSName("existsSync")
    var existsSync_Original: js.Function1[/* path */ PathLike, Boolean] = js.native
    
    def lstatSync(path: PathLike): js.UndefOr[Stats] = js.native
    def lstatSync(path: PathLike, options: Unit): Stats = js.native
    def lstatSync(path: PathLike, options: StatSyncOptionsbigintbool): Stats | BigIntStats = js.native
    def lstatSync(path: PathLike, options: StatSyncOptionsbigintfals): js.UndefOr[Stats] = js.native
    def lstatSync(path: PathLike, options: StatSyncOptionsbigintfalsBigint): Stats = js.native
    def lstatSync(path: PathLike, options: StatSyncOptionsbiginttrue): js.UndefOr[BigIntStats] = js.native
    def lstatSync(path: PathLike, options: StatSyncOptionsbiginttrueBigint): BigIntStats = js.native
    def lstatSync(path: PathLike, options: StatSyncOptions): js.UndefOr[Stats | BigIntStats] = js.native
    @JSName("lstatSync")
    var lstatSync_Original: StatSyncFn = js.native
    @JSName("lstatSync")
    def lstatSync_Stats(path: PathLike): Stats = js.native
    
    def mkdirSync(path: PathLike): js.UndefOr[String] = js.native
    def mkdirSync(path: PathLike, options: MakeDirectoryOptionsrecur): js.UndefOr[String] = js.native
    def mkdirSync(path: PathLike, options: MakeDirectoryOptionsrecurMode): Unit = js.native
    def mkdirSync(path: PathLike, options: MakeDirectoryOptions): js.UndefOr[String] = js.native
    def mkdirSync(path: PathLike, options: Mode): js.UndefOr[String] = js.native
    @JSName("mkdirSync")
    var mkdirSync_Original: Fn0 = js.native
    @JSName("mkdirSync")
    def mkdirSync_Unit(path: PathLike): Unit = js.native
    @JSName("mkdirSync")
    def mkdirSync_Unit(path: PathLike, options: Mode): Unit = js.native
    
    def readFileSync(path: PathOrFileDescriptor): String | Buffer = js.native
    def readFileSync(path: PathOrFileDescriptor, options: EncodingFlag): String = js.native
    def readFileSync(path: PathOrFileDescriptor, options: Flag): Buffer = js.native
    def readFileSync(path: PathOrFileDescriptor, options: ObjectEncodingOptionsflagEncoding): String | Buffer = js.native
    def readFileSync(path: PathOrFileDescriptor, options: BufferEncoding): String = js.native
    @JSName("readFileSync")
    def readFileSync_Buffer(path: PathOrFileDescriptor): Buffer = js.native
    @JSName("readFileSync")
    var readFileSync_Original: FnCall = js.native
    @JSName("readFileSync")
    def readFileSync_Union(path: PathOrFileDescriptor, options: BufferEncoding): String | Buffer = js.native
    
    def readdirSync(path: PathLike): js.Array[Buffer | String] = js.native
    def readdirSync(path: PathLike, options: Encoding): js.Array[Buffer] = js.native
    def readdirSync(path: PathLike, options: ObjectEncodingOptionswith): js.Array[Buffer | String] = js.native
    def readdirSync(path: PathLike, options: ObjectEncodingOptionswithEncoding): js.Array[Dirent] = js.native
    def readdirSync(path: PathLike, options: Recursive): js.Array[String] = js.native
    def readdirSync(path: PathLike, options: BufferEncoding): js.Array[Buffer | String] = js.native
    @JSName("readdirSync")
    var readdirSync_Original: FnCallPathOptions = js.native
    @JSName("readdirSync")
    def readdirSync_buffer(path: PathLike, options: buffer): js.Array[Buffer] = js.native
    
    def rmdirSync(path: String): Unit = js.native
    def rmdirSync(path: String, options: typings.broccoliOutputWrapper.anon.Recursive): Unit = js.native
    
    def statSync(path: PathLike): js.UndefOr[Stats] = js.native
    def statSync(path: PathLike, options: Unit): Stats = js.native
    def statSync(path: PathLike, options: StatSyncOptionsbigintbool): Stats | BigIntStats = js.native
    def statSync(path: PathLike, options: StatSyncOptionsbigintfals): js.UndefOr[Stats] = js.native
    def statSync(path: PathLike, options: StatSyncOptionsbigintfalsBigint): Stats = js.native
    def statSync(path: PathLike, options: StatSyncOptionsbiginttrue): js.UndefOr[BigIntStats] = js.native
    def statSync(path: PathLike, options: StatSyncOptionsbiginttrueBigint): BigIntStats = js.native
    def statSync(path: PathLike, options: StatSyncOptions): js.UndefOr[Stats | BigIntStats] = js.native
    @JSName("statSync")
    var statSync_Original: StatSyncFn = js.native
    @JSName("statSync")
    def statSync_Stats(path: PathLike): Stats = js.native
    
    def symlinkOrCopySync(srcPath: String, destPath: String): Unit = js.native
    
    def symlinkSync(target: PathLike, path: PathLike): Unit = js.native
    def symlinkSync(target: PathLike, path: PathLike, `type`: Type): Unit = js.native
    @JSName("symlinkSync")
    var symlinkSync_Original: FnCallTargetPathType = js.native
    
    def unlinkSync(path: PathLike): Unit = js.native
    @JSName("unlinkSync")
    var unlinkSync_Original: js.Function1[/* path */ PathLike, Unit] = js.native
    
    def utimesSync(path: PathLike, atime: TimeLike, mtime: TimeLike): Unit = js.native
    @JSName("utimesSync")
    var utimesSync_Original: js.Function3[/* path */ PathLike, /* atime */ TimeLike, /* mtime */ TimeLike, Unit] = js.native
    
    def writeFileSync(file: PathOrFileDescriptor, data: String): Unit = js.native
    def writeFileSync(file: PathOrFileDescriptor, data: String, options: WriteFileOptions): Unit = js.native
    def writeFileSync(file: PathOrFileDescriptor, data: ArrayBufferView): Unit = js.native
    def writeFileSync(file: PathOrFileDescriptor, data: ArrayBufferView, options: WriteFileOptions): Unit = js.native
    @JSName("writeFileSync")
    var writeFileSync_Original: FnCallFileDataOptions = js.native
  }
}
