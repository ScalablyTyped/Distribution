package typings
package decompressLib.decompressMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("decompress", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(input: java.lang.String | nodeLib.Buffer): js.Promise[js.Array[File]] = js.native
  def apply(input: java.lang.String | nodeLib.Buffer, output: java.lang.String | DecompressOptions): js.Promise[js.Array[File]] = js.native
  def apply(
    input: java.lang.String | nodeLib.Buffer,
    output: java.lang.String | DecompressOptions,
    opts: DecompressOptions
  ): js.Promise[js.Array[File]] = js.native
}

