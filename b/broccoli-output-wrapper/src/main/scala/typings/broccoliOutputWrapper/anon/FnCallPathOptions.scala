package typings.broccoliOutputWrapper.anon

import typings.broccoliOutputWrapper.broccoliOutputWrapperStrings.buffer
import typings.node.Buffer
import typings.node.BufferEncoding
import typings.node.anon.BaseEncodingOptionswithFi
import typings.node.anon.BaseEncodingOptionswithFiEncoding
import typings.node.anon.Encoding
import typings.node.anon.WithFileTypes
import typings.node.fsMod.Dirent
import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
