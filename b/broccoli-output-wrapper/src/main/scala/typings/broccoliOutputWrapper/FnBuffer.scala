package typings.broccoliOutputWrapper

import typings.broccoliOutputWrapper.broccoliOutputWrapperStrings.buffer
import typings.node.AnonBufferEncodingFalse
import typings.node.AnonEncodingFalse
import typings.node.AnonEncodingFalseWithFileTypes
import typings.node.AnonEncodingTrue
import typings.node.Buffer
import typings.node.BufferEncoding
import typings.node.fsMod.Dirent
import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnBuffer extends js.Object {
  def apply(path: PathLike): js.Array[Buffer | String] = js.native
  def apply(path: PathLike, options: String): js.Array[Buffer | String] = js.native
  def apply(path: PathLike, options: buffer): js.Array[Buffer] = js.native
  def apply(path: PathLike, options: AnonBufferEncodingFalse): js.Array[Buffer] = js.native
  def apply(path: PathLike, options: AnonEncodingFalse): js.Array[String] = js.native
  def apply(path: PathLike, options: AnonEncodingFalseWithFileTypes): js.Array[Buffer | String] = js.native
  def apply(path: PathLike, options: AnonEncodingTrue): js.Array[Dirent] = js.native
  def apply(path: PathLike, options: BufferEncoding): js.Array[String] = js.native
}

