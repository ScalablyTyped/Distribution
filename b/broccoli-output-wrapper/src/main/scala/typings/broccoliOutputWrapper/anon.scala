package typings.broccoliOutputWrapper

import typings.broccoliOutputWrapper.broccoliOutputWrapperStrings.buffer
import typings.node.Buffer
import typings.node.BufferEncoding
import typings.node.NodeJS.ArrayBufferView
import typings.node.anon.BaseEncodingOptionsflagst
import typings.node.anon.BaseEncodingOptionswithFi
import typings.node.anon.BaseEncodingOptionswithFiEncoding
import typings.node.anon.Encoding
import typings.node.anon.EncodingBufferEncoding
import typings.node.anon.EncodingNull
import typings.node.anon.MakeDirectoryOptionsrecur
import typings.node.anon.MakeDirectoryOptionsrecurMode
import typings.node.anon.WithFileTypes
import typings.node.fsMod.Dirent
import typings.node.fsMod.MakeDirectoryOptions
import typings.node.fsMod.Mode
import typings.node.fsMod.PathLike
import typings.node.fsMod.RmDirOptions
import typings.node.fsMod.WriteFileOptions
import typings.node.fsMod.symlink.Type
import typings.std.Date
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object anon extends js.Object {
  @js.native
  trait Fn0 extends js.Object {
    def apply(path: PathLike): Unit = js.native
    def apply(path: PathLike, options: RmDirOptions): Unit = js.native
  }
  
  @js.native
  trait Fn1 extends js.Object {
    def apply(path: PathLike): js.UndefOr[String] = js.native
    def apply(path: PathLike, options: MakeDirectoryOptionsrecur): String = js.native
    def apply(path: PathLike, options: MakeDirectoryOptionsrecurMode): Unit = js.native
    def apply(path: PathLike, options: MakeDirectoryOptions): js.UndefOr[String] = js.native
    def apply(path: PathLike, options: Mode): js.UndefOr[String] = js.native
  }
  
  @js.native
  trait FnCall extends js.Object {
    def apply(path: Double): String | Buffer = js.native
    def apply(path: Double, options: BufferEncoding): String = js.native
    def apply(path: Double, options: BaseEncodingOptionsflagst): String | Buffer = js.native
    def apply(path: Double, options: EncodingBufferEncoding): String = js.native
    def apply(path: Double, options: EncodingNull): Buffer = js.native
    def apply(path: PathLike): String | Buffer = js.native
    def apply(path: PathLike, options: BufferEncoding): String = js.native
    def apply(path: PathLike, options: BaseEncodingOptionsflagst): String | Buffer = js.native
    def apply(path: PathLike, options: EncodingBufferEncoding): String = js.native
    def apply(path: PathLike, options: EncodingNull): Buffer = js.native
  }
  
  @js.native
  trait FnCallFileDataOptions extends js.Object {
    def apply(file: Double, data: String): Unit = js.native
    def apply(file: Double, data: String, options: WriteFileOptions): Unit = js.native
    def apply(file: Double, data: Uint8Array): Unit = js.native
    def apply(file: Double, data: Uint8Array, options: WriteFileOptions): Unit = js.native
    def apply(file: PathLike, data: String): Unit = js.native
    def apply(file: PathLike, data: String, options: WriteFileOptions): Unit = js.native
    def apply(file: PathLike, data: Uint8Array): Unit = js.native
    def apply(file: PathLike, data: Uint8Array, options: WriteFileOptions): Unit = js.native
  }
  
  @js.native
  trait FnCallPathAtimeMtime extends js.Object {
    def apply(path: PathLike, atime: String, mtime: String): Unit = js.native
    def apply(path: PathLike, atime: String, mtime: Double): Unit = js.native
    def apply(path: PathLike, atime: String, mtime: Date): Unit = js.native
    def apply(path: PathLike, atime: Double, mtime: String): Unit = js.native
    def apply(path: PathLike, atime: Double, mtime: Double): Unit = js.native
    def apply(path: PathLike, atime: Double, mtime: Date): Unit = js.native
    def apply(path: PathLike, atime: Date, mtime: String): Unit = js.native
    def apply(path: PathLike, atime: Date, mtime: Double): Unit = js.native
    def apply(path: PathLike, atime: Date, mtime: Date): Unit = js.native
  }
  
  @js.native
  trait FnCallPathDataOptions extends js.Object {
    def apply(path: Double, data: String): Unit = js.native
    def apply(path: Double, data: String, options: WriteFileOptions): Unit = js.native
    def apply(path: Double, data: ArrayBufferView): Unit = js.native
    def apply(path: Double, data: ArrayBufferView, options: WriteFileOptions): Unit = js.native
    def apply(path: PathLike, data: String): Unit = js.native
    def apply(path: PathLike, data: String, options: WriteFileOptions): Unit = js.native
    def apply(path: PathLike, data: ArrayBufferView): Unit = js.native
    def apply(path: PathLike, data: ArrayBufferView, options: WriteFileOptions): Unit = js.native
  }
  
  @js.native
  trait FnCallPathOptions extends js.Object {
    def apply(path: PathLike): js.Array[Buffer | String] = js.native
    def apply(path: PathLike, options: buffer): js.Array[Buffer] = js.native
    def apply(path: PathLike, options: BufferEncoding): js.Array[Buffer | String] = js.native
    def apply(path: PathLike, options: BaseEncodingOptionswithFi): js.Array[Buffer | String] = js.native
    def apply(path: PathLike, options: BaseEncodingOptionswithFiEncoding): js.Array[Dirent] = js.native
    def apply(path: PathLike, options: Encoding): js.Array[Buffer] = js.native
    def apply(path: PathLike, options: WithFileTypes): js.Array[String] = js.native
  }
  
  @js.native
  trait FnCallTargetPathType extends js.Object {
    def apply(target: PathLike, path: PathLike): Unit = js.native
    def apply(target: PathLike, path: PathLike, `type`: Type): Unit = js.native
  }
  
}

