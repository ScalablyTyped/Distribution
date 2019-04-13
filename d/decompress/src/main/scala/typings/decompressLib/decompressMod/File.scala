package typings
package decompressLib.decompressMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait File extends js.Object {
  var data: nodeLib.Buffer
  var mode: scala.Double
  var mtime: java.lang.String
  var path: java.lang.String
  var `type`: java.lang.String
}

object File {
  @scala.inline
  def apply(
    data: nodeLib.Buffer,
    mode: scala.Double,
    mtime: java.lang.String,
    path: java.lang.String,
    `type`: java.lang.String
  ): File = {
    val __obj = js.Dynamic.literal(data = data, mode = mode, mtime = mtime, path = path)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[File]
  }
}

