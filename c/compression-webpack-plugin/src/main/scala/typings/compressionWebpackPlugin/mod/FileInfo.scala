package typings.compressionWebpackPlugin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileInfo extends js.Object {
  /** original asset filename */
  var file: String
  /** path of the original asset */
  var path: String
  /** query */
  var query: String
}

object FileInfo {
  @scala.inline
  def apply(file: String, path: String, query: String): FileInfo = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileInfo]
  }
}

