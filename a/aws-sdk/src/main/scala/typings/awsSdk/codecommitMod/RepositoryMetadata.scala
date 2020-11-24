package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RepositoryMetadata extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the repository.
    */
  var Arn: js.UndefOr[typings.awsSdk.codecommitMod.Arn] = js.native
  
  /**
    * The ID of the AWS account associated with the repository.
    */
  var accountId: js.UndefOr[AccountId] = js.native
  
  /**
    * The URL to use for cloning the repository over HTTPS.
    */
  var cloneUrlHttp: js.UndefOr[CloneUrlHttp] = js.native
  
  /**
    * The URL to use for cloning the repository over SSH.
    */
  var cloneUrlSsh: js.UndefOr[CloneUrlSsh] = js.native
  
  /**
    * The date and time the repository was created, in timestamp format.
    */
  var creationDate: js.UndefOr[CreationDate] = js.native
  
  /**
    * The repository's default branch name.
    */
  var defaultBranch: js.UndefOr[BranchName] = js.native
  
  /**
    * The date and time the repository was last modified, in timestamp format.
    */
  var lastModifiedDate: js.UndefOr[LastModifiedDate] = js.native
  
  /**
    * A comment or description about the repository.
    */
  var repositoryDescription: js.UndefOr[RepositoryDescription] = js.native
  
  /**
    * The ID of the repository.
    */
  var repositoryId: js.UndefOr[RepositoryId] = js.native
  
  /**
    * The repository's name.
    */
  var repositoryName: js.UndefOr[RepositoryName] = js.native
}
object RepositoryMetadata {
  
  @scala.inline
  def apply(): RepositoryMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RepositoryMetadata]
  }
  
  @scala.inline
  implicit class RepositoryMetadataOps[Self <: RepositoryMetadata] (val x: Self) extends AnyVal {
    
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
    def setArn(value: Arn): Self = this.set("Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("Arn", js.undefined)
    
    @scala.inline
    def setAccountId(value: AccountId): Self = this.set("accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountId: Self = this.set("accountId", js.undefined)
    
    @scala.inline
    def setCloneUrlHttp(value: CloneUrlHttp): Self = this.set("cloneUrlHttp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloneUrlHttp: Self = this.set("cloneUrlHttp", js.undefined)
    
    @scala.inline
    def setCloneUrlSsh(value: CloneUrlSsh): Self = this.set("cloneUrlSsh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloneUrlSsh: Self = this.set("cloneUrlSsh", js.undefined)
    
    @scala.inline
    def setCreationDate(value: CreationDate): Self = this.set("creationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationDate: Self = this.set("creationDate", js.undefined)
    
    @scala.inline
    def setDefaultBranch(value: BranchName): Self = this.set("defaultBranch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultBranch: Self = this.set("defaultBranch", js.undefined)
    
    @scala.inline
    def setLastModifiedDate(value: LastModifiedDate): Self = this.set("lastModifiedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastModifiedDate: Self = this.set("lastModifiedDate", js.undefined)
    
    @scala.inline
    def setRepositoryDescription(value: RepositoryDescription): Self = this.set("repositoryDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRepositoryDescription: Self = this.set("repositoryDescription", js.undefined)
    
    @scala.inline
    def setRepositoryId(value: RepositoryId): Self = this.set("repositoryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRepositoryId: Self = this.set("repositoryId", js.undefined)
    
    @scala.inline
    def setRepositoryName(value: RepositoryName): Self = this.set("repositoryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRepositoryName: Self = this.set("repositoryName", js.undefined)
  }
}
