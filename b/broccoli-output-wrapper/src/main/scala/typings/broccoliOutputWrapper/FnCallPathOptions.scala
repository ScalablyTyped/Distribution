package typings.broccoliOutputWrapper

import typings.broccoliOutputWrapper.broccoliOutputWrapperStrings.buffer
import typings.node.Anon4
import typings.node.Anon5
import typings.node.AnonEncodingWithFileTypes
import typings.node.AnonWithFileTypes
import typings.node.Buffer
import typings.node.BufferEncoding
import typings.node.fsMod.Dirent
import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallPathOptions extends js.Object {
  def apply(path: PathLike): js.Array[Buffer | String] = js.native
  def apply(path: PathLike, options: String): js.Array[Buffer | String] = js.native
  def apply(path: PathLike, options: buffer): js.Array[Buffer] = js.native
  def apply(path: PathLike, options: Anon4): js.Array[Buffer | String] = js.native
  def apply(path: PathLike, options: Anon5): js.Array[Dirent] = js.native
  def apply(path: PathLike, options: AnonEncodingWithFileTypes): js.Array[Buffer] = js.native
  def apply(path: PathLike, options: AnonWithFileTypes): js.Array[String] = js.native
  def apply(path: PathLike, options: BufferEncoding): js.Array[String] = js.native
}

