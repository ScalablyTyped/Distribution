package typings
package builderDashUtilDashRuntimeLib.outBlockMapApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlockMapFile extends FileChunks {
  var name: java.lang.String
  var offset: scala.Double
}

object BlockMapFile {
  @scala.inline
  def apply(
    checksums: js.Array[java.lang.String],
    name: java.lang.String,
    offset: scala.Double,
    sizes: js.Array[scala.Double]
  ): BlockMapFile = {
    val __obj = js.Dynamic.literal(checksums = checksums, name = name, offset = offset, sizes = sizes)
  
    __obj.asInstanceOf[BlockMapFile]
  }
}

