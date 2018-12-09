package typings
package decompressLib.decompressMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("decompress", JSImport.Namespace)
@js.native
object decompressModMembers extends js.Object {
  def apply(input: java.lang.String | nodeLib.Buffer): js.Promise[js.Array[decompressLib.decompressMod.decompressNs.File]] = js.native
  def apply(
    input: java.lang.String | nodeLib.Buffer,
    output: java.lang.String | decompressLib.decompressMod.decompressNs.DecompressOptions
  ): js.Promise[js.Array[decompressLib.decompressMod.decompressNs.File]] = js.native
  def apply(
    input: java.lang.String | nodeLib.Buffer,
    output: java.lang.String | decompressLib.decompressMod.decompressNs.DecompressOptions,
    opts: decompressLib.decompressMod.decompressNs.DecompressOptions
  ): js.Promise[js.Array[decompressLib.decompressMod.decompressNs.File]] = js.native
}

