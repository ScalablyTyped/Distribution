package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteRepositoryOutput extends js.Object {
  
  /**
    * The ID of the repository that was deleted.
    */
  var repositoryId: js.UndefOr[RepositoryId] = js.native
}
object DeleteRepositoryOutput {
  
  @scala.inline
  def apply(): DeleteRepositoryOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteRepositoryOutput]
  }
  
  @scala.inline
  implicit class DeleteRepositoryOutputOps[Self <: DeleteRepositoryOutput] (val x: Self) extends AnyVal {
    
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
    def setRepositoryId(value: RepositoryId): Self = this.set("repositoryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRepositoryId: Self = this.set("repositoryId", js.undefined)
  }
}
