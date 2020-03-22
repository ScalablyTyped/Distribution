package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileBrowserExpandedParams extends js.Object {
  var children: js.Array[FileTreeNode]
  var expandPath: String
  var message: String
  var ownerUri: String
  var succeeded: Boolean
}

object FileBrowserExpandedParams {
  @scala.inline
  def apply(
    children: js.Array[FileTreeNode],
    expandPath: String,
    message: String,
    ownerUri: String,
    succeeded: Boolean
  ): FileBrowserExpandedParams = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], expandPath = expandPath.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], ownerUri = ownerUri.asInstanceOf[js.Any], succeeded = succeeded.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FileBrowserExpandedParams]
  }
}

