package typings.decompress.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait File extends js.Object {
  var data: Buffer
  var mode: Double
  var mtime: String
  var path: String
  var `type`: String
}

object File {
  @scala.inline
  def apply(data: Buffer, mode: Double, mtime: String, path: String, `type`: String): File = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], mtime = mtime.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[File]
  }
}

