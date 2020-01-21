package typings.browserfs.browserfsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileSystemConfiguration extends js.Object {
  var fs: String
  var options: js.Any
}

object FileSystemConfiguration {
  @scala.inline
  def apply(fs: String, options: js.Any): FileSystemConfiguration = {
    val __obj = js.Dynamic.literal(fs = fs.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FileSystemConfiguration]
  }
}

