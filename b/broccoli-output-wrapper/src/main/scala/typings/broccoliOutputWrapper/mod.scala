package typings.broccoliOutputWrapper

import typings.broccoliOutputWrapper.broccoliOutputWrapperStrings.buffer
import typings.node.Anon4
import typings.node.Anon5
import typings.node.AnonEncodingFlag
import typings.node.AnonEncodingWithFileTypes
import typings.node.AnonFlag
import typings.node.AnonFlagString
import typings.node.AnonWithFileTypes
import typings.node.Buffer
import typings.node.BufferEncoding
import typings.node.MakeDirectoryOptionsrecur
import typings.node.MakeDirectoryOptionsrecurMode
import typings.node.fsMod.Dirent
import typings.node.fsMod.MakeDirectoryOptions
import typings.node.fsMod.PathLike
import typings.node.fsMod.RmDirOptions
import typings.node.fsMod.Stats
import typings.node.fsMod.WriteFileOptions
import typings.node.fsMod.symlink.Type
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("broccoli-output-wrapper", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  trait FSOutput extends js.Object {
    @JSName("appendFileSync")
    var appendFileSync_Original: FnCallFileDataOptions = js.native
    @JSName("existsSync")
    var existsSync_Original: js.Function1[/* path */ PathLike, Boolean] = js.native
    @JSName("lstatSync")
    var lstatSync_Original: js.Function1[/* path */ PathLike, Stats] = js.native
    @JSName("mkdirSync")
    var mkdirSync_Original: Fn1 = js.native
    @JSName("readFileSync")
    var readFileSync_Original: FnCall = js.native
    @JSName("readdirSync")
    var readdirSync_Original: FnCallPathOptions = js.native
    @JSName("rmdirSync")
    var rmdirSync_Original: Fn0 = js.native
    @JSName("statSync")
    var statSync_Original: js.Function1[/* path */ PathLike, Stats] = js.native
    @JSName("symlinkSync")
    var symlinkSync_Original: FnCallTargetPathType = js.native
    @JSName("unlinkSync")
    var unlinkSync_Original: js.Function1[/* path */ PathLike, Unit] = js.native
    @JSName("utimesSync")
    var utimesSync_Original: FnCallPathAtimeMtime = js.native
    @JSName("writeFileSync")
    var writeFileSync_Original: FnCallPathDataOptions = js.native
    def appendFileSync(file: Double, data: js.Any): Unit = js.native
    def appendFileSync(file: Double, data: js.Any, options: WriteFileOptions): Unit = js.native
    def appendFileSync(file: PathLike, data: js.Any): Unit = js.native
    def appendFileSync(file: PathLike, data: js.Any, options: WriteFileOptions): Unit = js.native
    def existsSync(path: PathLike): Boolean = js.native
    def lstatSync(path: PathLike): Stats = js.native
    def mkdirSync(path: PathLike): js.UndefOr[String] = js.native
    def mkdirSync(path: PathLike, options: String): js.UndefOr[String] = js.native
    def mkdirSync(path: PathLike, options: Double): js.UndefOr[String] = js.native
    def mkdirSync(path: PathLike, options: MakeDirectoryOptionsrecur): String = js.native
    def mkdirSync(path: PathLike, options: MakeDirectoryOptionsrecurMode): Unit = js.native
    def mkdirSync(path: PathLike, options: MakeDirectoryOptions): js.UndefOr[String] = js.native
    @JSName("mkdirSync")
    def mkdirSync_Unit(path: PathLike): Unit = js.native
    @JSName("mkdirSync")
    def mkdirSync_Unit(path: PathLike, options: String): Unit = js.native
    @JSName("mkdirSync")
    def mkdirSync_Unit(path: PathLike, options: Double): Unit = js.native
    def readFileSync(path: Double): String | Buffer = js.native
    def readFileSync(path: Double, options: String): String = js.native
    def readFileSync(path: Double, options: AnonEncodingFlag): String = js.native
    def readFileSync(path: Double, options: AnonFlag): Buffer = js.native
    def readFileSync(path: Double, options: AnonFlagString): String | Buffer = js.native
    def readFileSync(path: PathLike): String | Buffer = js.native
    def readFileSync(path: PathLike, options: String): String = js.native
    def readFileSync(path: PathLike, options: AnonEncodingFlag): String = js.native
    def readFileSync(path: PathLike, options: AnonFlag): Buffer = js.native
    def readFileSync(path: PathLike, options: AnonFlagString): String | Buffer = js.native
    @JSName("readFileSync")
    def readFileSync_Buffer(path: Double): Buffer = js.native
    @JSName("readFileSync")
    def readFileSync_Buffer(path: PathLike): Buffer = js.native
    @JSName("readFileSync")
    def readFileSync_Union(path: Double, options: String): String | Buffer = js.native
    @JSName("readFileSync")
    def readFileSync_Union(path: PathLike, options: String): String | Buffer = js.native
    def readdirSync(path: PathLike): js.Array[Buffer | String] = js.native
    def readdirSync(path: PathLike, options: String): js.Array[Buffer | String] = js.native
    def readdirSync(path: PathLike, options: Anon4): js.Array[Buffer | String] = js.native
    def readdirSync(path: PathLike, options: Anon5): js.Array[Dirent] = js.native
    def readdirSync(path: PathLike, options: AnonEncodingWithFileTypes): js.Array[Buffer] = js.native
    def readdirSync(path: PathLike, options: AnonWithFileTypes): js.Array[String] = js.native
    def readdirSync(path: PathLike, options: BufferEncoding): js.Array[String] = js.native
    @JSName("readdirSync")
    def readdirSync_buffer(path: PathLike, options: buffer): js.Array[Buffer] = js.native
    def rmdirSync(path: PathLike): Unit = js.native
    def rmdirSync(path: PathLike, options: RmDirOptions): Unit = js.native
    def statSync(path: PathLike): Stats = js.native
    def symlinkOrCopySync(srcPath: String, destPath: String): Unit = js.native
    def symlinkSync(target: PathLike, path: PathLike): Unit = js.native
    def symlinkSync(target: PathLike, path: PathLike, `type`: Type): Unit = js.native
    def unlinkSync(path: PathLike): Unit = js.native
    def utimesSync(path: PathLike, atime: String, mtime: String): Unit = js.native
    def utimesSync(path: PathLike, atime: String, mtime: Double): Unit = js.native
    def utimesSync(path: PathLike, atime: String, mtime: Date): Unit = js.native
    def utimesSync(path: PathLike, atime: Double, mtime: String): Unit = js.native
    def utimesSync(path: PathLike, atime: Double, mtime: Double): Unit = js.native
    def utimesSync(path: PathLike, atime: Double, mtime: Date): Unit = js.native
    def utimesSync(path: PathLike, atime: Date, mtime: String): Unit = js.native
    def utimesSync(path: PathLike, atime: Date, mtime: Double): Unit = js.native
    def utimesSync(path: PathLike, atime: Date, mtime: Date): Unit = js.native
    def writeFileSync(path: Double, data: js.Any): Unit = js.native
    def writeFileSync(path: Double, data: js.Any, options: WriteFileOptions): Unit = js.native
    def writeFileSync(path: PathLike, data: js.Any): Unit = js.native
    def writeFileSync(path: PathLike, data: js.Any, options: WriteFileOptions): Unit = js.native
  }
  
  def apply(node: js.Any): FSOutput = js.native
}

