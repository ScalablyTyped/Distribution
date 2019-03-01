package typings
package builderDashUtilDashRuntimeLib.outBlockMapApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileChunks extends js.Object {
  var checksums: js.Array[java.lang.String]
  var sizes: js.Array[scala.Double]
}

object FileChunks {
  @scala.inline
  def apply(checksums: js.Array[java.lang.String], sizes: js.Array[scala.Double]): FileChunks = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("checksums")(checksums)
    __obj.updateDynamic("sizes")(sizes)
    __obj.asInstanceOf[FileChunks]
  }
}

