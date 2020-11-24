package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateRepositoryOutput extends js.Object {
  
  /**
    * Information about the newly created repository.
    */
  var repositoryMetadata: js.UndefOr[RepositoryMetadata] = js.native
}
object CreateRepositoryOutput {
  
  @scala.inline
  def apply(): CreateRepositoryOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateRepositoryOutput]
  }
  
  @scala.inline
  implicit class CreateRepositoryOutputOps[Self <: CreateRepositoryOutput] (val x: Self) extends AnyVal {
    
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
    def setRepositoryMetadata(value: RepositoryMetadata): Self = this.set("repositoryMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRepositoryMetadata: Self = this.set("repositoryMetadata", js.undefined)
  }
}
