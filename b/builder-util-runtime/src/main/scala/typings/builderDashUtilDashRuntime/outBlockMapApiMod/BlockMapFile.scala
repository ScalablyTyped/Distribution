package typings.builderDashUtilDashRuntime.outBlockMapApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlockMapFile extends FileChunks {
  var name: String
  var offset: Double
}

object BlockMapFile {
  @scala.inline
  def apply(checksums: js.Array[String], name: String, offset: Double, sizes: js.Array[Double]): BlockMapFile = {
    val __obj = js.Dynamic.literal(checksums = checksums.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], sizes = sizes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BlockMapFile]
  }
}

