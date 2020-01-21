package typings.awsSdkClientCodecommitNode.typesFolderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Folder extends js.Object {
  /**
    * <p>The fully-qualified path of the folder in the repository.</p>
    */
  var absolutePath: js.UndefOr[String] = js.undefined
  /**
    * <p>The relative path of the specified folder from the folder where the query originated.</p>
    */
  var relativePath: js.UndefOr[String] = js.undefined
  /**
    * <p>The full SHA-1 pointer of the tree information for the commit that contains the folder.</p>
    */
  var treeId: js.UndefOr[String] = js.undefined
}

object Folder {
  @scala.inline
  def apply(absolutePath: String = null, relativePath: String = null, treeId: String = null): Folder = {
    val __obj = js.Dynamic.literal()
    if (absolutePath != null) __obj.updateDynamic("absolutePath")(absolutePath.asInstanceOf[js.Any])
    if (relativePath != null) __obj.updateDynamic("relativePath")(relativePath.asInstanceOf[js.Any])
    if (treeId != null) __obj.updateDynamic("treeId")(treeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Folder]
  }
}

