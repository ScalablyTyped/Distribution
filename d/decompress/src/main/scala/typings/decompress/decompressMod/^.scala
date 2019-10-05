package typings.decompress.decompressMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("decompress", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(input: String): js.Promise[js.Array[File]] = js.native
  def apply(input: String, output: String): js.Promise[js.Array[File]] = js.native
  def apply(input: String, output: String, opts: DecompressOptions): js.Promise[js.Array[File]] = js.native
  def apply(input: String, output: DecompressOptions): js.Promise[js.Array[File]] = js.native
  def apply(input: String, output: DecompressOptions, opts: DecompressOptions): js.Promise[js.Array[File]] = js.native
  def apply(input: Buffer): js.Promise[js.Array[File]] = js.native
  def apply(input: Buffer, output: String): js.Promise[js.Array[File]] = js.native
  def apply(input: Buffer, output: String, opts: DecompressOptions): js.Promise[js.Array[File]] = js.native
  def apply(input: Buffer, output: DecompressOptions): js.Promise[js.Array[File]] = js.native
  def apply(input: Buffer, output: DecompressOptions, opts: DecompressOptions): js.Promise[js.Array[File]] = js.native
}

