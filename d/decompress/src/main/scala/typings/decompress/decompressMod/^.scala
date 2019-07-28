package typings.decompress.decompressMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("decompress", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(input: String | Buffer): js.Promise[js.Array[File]] = js.native
  def apply(input: String | Buffer, output: String | DecompressOptions): js.Promise[js.Array[File]] = js.native
  def apply(input: String | Buffer, output: String | DecompressOptions, opts: DecompressOptions): js.Promise[js.Array[File]] = js.native
}

