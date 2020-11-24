package typings.awsSdkClientCodecommitNode.typesSubModuleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubModule extends js.Object {
  
  /**
    * <p>The fully qualified path to the folder that contains the reference to the submodule.</p>
    */
  var absolutePath: js.UndefOr[String] = js.native
  
  /**
    * <p>The commit ID that contains the reference to the submodule.</p>
    */
  var commitId: js.UndefOr[String] = js.native
  
  /**
    * <p>The relative path of the submodule from the folder where the query originated.</p>
    */
  var relativePath: js.UndefOr[String] = js.native
}
object SubModule {
  
  @scala.inline
  def apply(): SubModule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubModule]
  }
  
  @scala.inline
  implicit class SubModuleOps[Self <: SubModule] (val x: Self) extends AnyVal {
    
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
    def setCommitId(value: String): Self = this.set("commitId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommitId: Self = this.set("commitId", js.undefined)
    
    @scala.inline
    def setRelativePath(value: String): Self = this.set("relativePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelativePath: Self = this.set("relativePath", js.undefined)
  }
}
