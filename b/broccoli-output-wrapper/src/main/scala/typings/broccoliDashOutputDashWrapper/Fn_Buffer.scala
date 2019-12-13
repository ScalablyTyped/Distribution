package typings.broccoliDashOutputDashWrapper

import typings.broccoliDashOutputDashWrapper.broccoliDashOutputDashWrapperStrings.buffer
import typings.node.Anon_BufferEncodingFalse
import typings.node.Anon_EncodingFalse
import typings.node.Anon_EncodingFalseWithFileTypes
import typings.node.Anon_EncodingTrue
import typings.node.Buffer
import typings.node.BufferEncoding
import typings.node.fsMod.Dirent
import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_Buffer extends js.Object {
  def apply(path: PathLike): js.Array[Buffer | String] = js.native
  def apply(path: PathLike, options: String): js.Array[Buffer | String] = js.native
  def apply(path: PathLike, options: buffer): js.Array[Buffer] = js.native
  def apply(path: PathLike, options: Anon_BufferEncodingFalse): js.Array[Buffer] = js.native
  def apply(path: PathLike, options: Anon_EncodingFalse): js.Array[String] = js.native
  def apply(path: PathLike, options: Anon_EncodingFalseWithFileTypes): js.Array[Buffer | String] = js.native
  def apply(path: PathLike, options: Anon_EncodingTrue): js.Array[Dirent] = js.native
  def apply(path: PathLike, options: BufferEncoding): js.Array[String] = js.native
}

