package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileBrowserOpenedParams extends js.Object {
  var fileTree: FileTree
  var message: String
  var ownerUri: String
  var succeeded: Boolean
}

object FileBrowserOpenedParams {
  @scala.inline
  def apply(fileTree: FileTree, message: String, ownerUri: String, succeeded: Boolean): FileBrowserOpenedParams = {
    val __obj = js.Dynamic.literal(fileTree = fileTree.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], ownerUri = ownerUri.asInstanceOf[js.Any], succeeded = succeeded.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FileBrowserOpenedParams]
  }
}

