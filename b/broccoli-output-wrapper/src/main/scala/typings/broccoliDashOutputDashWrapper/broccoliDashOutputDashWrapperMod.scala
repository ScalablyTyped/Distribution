package typings.broccoliDashOutputDashWrapper

import typings.broccoliDashOutputDashWrapper.broccoliDashOutputDashWrapperStrings.buffer
import typings.node.Anon_BufferEncodingFalse
import typings.node.Anon_EncodingFalse
import typings.node.Anon_EncodingFalseWithFileTypes
import typings.node.Anon_EncodingFlag
import typings.node.Anon_EncodingFlagNull
import typings.node.Anon_EncodingFlagString
import typings.node.Anon_EncodingTrue
import typings.node.Buffer
import typings.node.BufferEncoding
import typings.node.fsMod.Dirent
import typings.node.fsMod.MakeDirectoryOptions
import typings.node.fsMod.PathLike
import typings.node.fsMod.RmDirOptions
import typings.node.fsMod.Stats
import typings.node.fsMod.WriteFileOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("broccoli-output-wrapper", JSImport.Namespace)
@js.native
object broccoliDashOutputDashWrapperMod extends js.Object {
  @js.native
  trait FSOutput extends js.Object {
    @JSName("appendFileSync")
    var appendFileSync_Original: Fn_Data = js.native
    @JSName("existsSync")
    var existsSync_Original: js.Function1[/* path */ PathLike, Boolean] = js.native
    @JSName("lstatSync")
    var lstatSync_Original: js.Function1[/* path */ PathLike, Stats] = js.native
    @JSName("mkdirSync")
    var mkdirSync_Original: Fn_OptionsPathMakeDirectoryOptions = js.native
    @JSName("readFileSync")
    var readFileSync_Original: Fn_Options = js.native
    @JSName("readdirSync")
    var readdirSync_Original: Fn_Buffer = js.native
    @JSName("rmdirSync")
    var rmdirSync_Original: Fn_OptionsPath = js.native
    @JSName("statSync")
    var statSync_Original: js.Function1[/* path */ PathLike, Stats] = js.native
    @JSName("writeFileSync")
    var writeFileSync_Original: Fn_Data = js.native
    def appendFileSync(file: Double, data: js.Any): Unit = js.native
    def appendFileSync(file: Double, data: js.Any, options: WriteFileOptions): Unit = js.native
    def appendFileSync(file: PathLike, data: js.Any): Unit = js.native
    def appendFileSync(file: PathLike, data: js.Any, options: WriteFileOptions): Unit = js.native
    def existsSync(path: PathLike): Boolean = js.native
    def lstatSync(path: PathLike): Stats = js.native
    def mkdirSync(path: PathLike): Unit = js.native
    def mkdirSync(path: PathLike, options: String): Unit = js.native
    def mkdirSync(path: PathLike, options: Double): Unit = js.native
    def mkdirSync(path: PathLike, options: MakeDirectoryOptions): Unit = js.native
    def readFileSync(path: Double): String | Buffer = js.native
    def readFileSync(path: Double, options: String): String | Buffer = js.native
    def readFileSync(path: Double, options: Anon_EncodingFlag): Buffer = js.native
    def readFileSync(path: Double, options: Anon_EncodingFlagNull): String | Buffer = js.native
    def readFileSync(path: Double, options: Anon_EncodingFlagString): String = js.native
    def readFileSync(path: PathLike): String | Buffer = js.native
    def readFileSync(path: PathLike, options: String): String | Buffer = js.native
    def readFileSync(path: PathLike, options: Anon_EncodingFlag): Buffer = js.native
    def readFileSync(path: PathLike, options: Anon_EncodingFlagNull): String | Buffer = js.native
    def readFileSync(path: PathLike, options: Anon_EncodingFlagString): String = js.native
    @JSName("readFileSync")
    def readFileSync_Buffer(path: Double): Buffer = js.native
    @JSName("readFileSync")
    def readFileSync_Buffer(path: PathLike): Buffer = js.native
    @JSName("readFileSync")
    def readFileSync_String(path: Double, options: String): String = js.native
    @JSName("readFileSync")
    def readFileSync_String(path: PathLike, options: String): String = js.native
    def readdirSync(path: PathLike): js.Array[Buffer | String] = js.native
    def readdirSync(path: PathLike, options: String): js.Array[Buffer | String] = js.native
    def readdirSync(path: PathLike, options: Anon_BufferEncodingFalse): js.Array[Buffer] = js.native
    def readdirSync(path: PathLike, options: Anon_EncodingFalse): js.Array[String] = js.native
    def readdirSync(path: PathLike, options: Anon_EncodingFalseWithFileTypes): js.Array[Buffer | String] = js.native
    def readdirSync(path: PathLike, options: Anon_EncodingTrue): js.Array[Dirent] = js.native
    def readdirSync(path: PathLike, options: BufferEncoding): js.Array[String] = js.native
    @JSName("readdirSync")
    def readdirSync_buffer(path: PathLike, options: buffer): js.Array[Buffer] = js.native
    def rmdirSync(path: PathLike): Unit = js.native
    def rmdirSync(path: PathLike, options: RmDirOptions): Unit = js.native
    def statSync(path: PathLike): Stats = js.native
    def writeFileSync(file: Double, data: js.Any): Unit = js.native
    def writeFileSync(file: Double, data: js.Any, options: WriteFileOptions): Unit = js.native
    def writeFileSync(file: PathLike, data: js.Any): Unit = js.native
    def writeFileSync(file: PathLike, data: js.Any, options: WriteFileOptions): Unit = js.native
  }
  
  def apply(node: js.Any): FSOutput = js.native
}

