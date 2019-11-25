package typings.broDashFs.broDashFsMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatObject extends js.Object {
  var fullPath: String
  var isDirectory: Boolean
  var isFile: Boolean
  var modificationTime: Date
  var name: String
  var size: Double
}

object StatObject {
  @scala.inline
  def apply(
    fullPath: String,
    isDirectory: Boolean,
    isFile: Boolean,
    modificationTime: Date,
    name: String,
    size: Double
  ): StatObject = {
    val __obj = js.Dynamic.literal(fullPath = fullPath.asInstanceOf[js.Any], isDirectory = isDirectory.asInstanceOf[js.Any], isFile = isFile.asInstanceOf[js.Any], modificationTime = modificationTime.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StatObject]
  }
}

