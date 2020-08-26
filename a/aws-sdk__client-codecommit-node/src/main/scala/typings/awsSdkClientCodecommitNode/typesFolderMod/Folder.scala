package typings.awsSdkClientCodecommitNode.typesFolderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Folder extends js.Object {
  /**
    * <p>The fully-qualified path of the folder in the repository.</p>
    */
  var absolutePath: js.UndefOr[String] = js.native
  /**
    * <p>The relative path of the specified folder from the folder where the query originated.</p>
    */
  var relativePath: js.UndefOr[String] = js.native
  /**
    * <p>The full SHA-1 pointer of the tree information for the commit that contains the folder.</p>
    */
  var treeId: js.UndefOr[String] = js.native
}

object Folder {
  @scala.inline
  def apply(): Folder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Folder]
  }
  @scala.inline
  implicit class FolderOps[Self <: Folder] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAbsolutePath(value: String): Self = this.set("absolutePath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAbsolutePath: Self = this.set("absolutePath", js.undefined)
    @scala.inline
    def setRelativePath(value: String): Self = this.set("relativePath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelativePath: Self = this.set("relativePath", js.undefined)
    @scala.inline
    def setTreeId(value: String): Self = this.set("treeId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTreeId: Self = this.set("treeId", js.undefined)
  }
  
}

