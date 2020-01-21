package typings.builderUtilRuntime.blockMapApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileChunks extends js.Object {
  var checksums: js.Array[String]
  var sizes: js.Array[Double]
}

object FileChunks {
  @scala.inline
  def apply(checksums: js.Array[String], sizes: js.Array[Double]): FileChunks = {
    val __obj = js.Dynamic.literal(checksums = checksums.asInstanceOf[js.Any], sizes = sizes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FileChunks]
  }
}

