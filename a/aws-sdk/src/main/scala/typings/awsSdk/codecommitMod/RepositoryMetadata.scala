package typings.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RepositoryMetadata extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the repository.
    */
  var Arn: js.UndefOr[typings.awsSdk.codecommitMod.Arn] = js.undefined
  
  /**
    * The ID of the AWS account associated with the repository.
    */
  var accountId: js.UndefOr[AccountId] = js.undefined
  
  /**
    * The URL to use for cloning the repository over HTTPS.
    */
  var cloneUrlHttp: js.UndefOr[CloneUrlHttp] = js.undefined
  
  /**
    * The URL to use for cloning the repository over SSH.
    */
  var cloneUrlSsh: js.UndefOr[CloneUrlSsh] = js.undefined
  
  /**
    * The date and time the repository was created, in timestamp format.
    */
  var creationDate: js.UndefOr[CreationDate] = js.undefined
  
  /**
    * The repository's default branch name.
    */
  var defaultBranch: js.UndefOr[BranchName] = js.undefined
  
  /**
    * The date and time the repository was last modified, in timestamp format.
    */
  var lastModifiedDate: js.UndefOr[LastModifiedDate] = js.undefined
  
  /**
    * A comment or description about the repository.
    */
  var repositoryDescription: js.UndefOr[RepositoryDescription] = js.undefined
  
  /**
    * The ID of the repository.
    */
  var repositoryId: js.UndefOr[RepositoryId] = js.undefined
  
  /**
    * The repository's name.
    */
  var repositoryName: js.UndefOr[RepositoryName] = js.undefined
}
object RepositoryMetadata {
  
  @scala.inline
  def apply(): RepositoryMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RepositoryMetadata]
  }
  
  @scala.inline
  implicit class RepositoryMetadataMutableBuilder[Self <: RepositoryMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: AccountId): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    @scala.inline
    def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    @scala.inline
    def setCloneUrlHttp(value: CloneUrlHttp): Self = StObject.set(x, "cloneUrlHttp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloneUrlHttpUndefined: Self = StObject.set(x, "cloneUrlHttp", js.undefined)
    
    @scala.inline
    def setCloneUrlSsh(value: CloneUrlSsh): Self = StObject.set(x, "cloneUrlSsh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloneUrlSshUndefined: Self = StObject.set(x, "cloneUrlSsh", js.undefined)
    
    @scala.inline
    def setCreationDate(value: CreationDate): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDateUndefined: Self = StObject.set(x, "creationDate", js.undefined)
    
    @scala.inline
    def setDefaultBranch(value: BranchName): Self = StObject.set(x, "defaultBranch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultBranchUndefined: Self = StObject.set(x, "defaultBranch", js.undefined)
    
    @scala.inline
    def setLastModifiedDate(value: LastModifiedDate): Self = StObject.set(x, "lastModifiedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedDateUndefined: Self = StObject.set(x, "lastModifiedDate", js.undefined)
    
    @scala.inline
    def setRepositoryDescription(value: RepositoryDescription): Self = StObject.set(x, "repositoryDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepositoryDescriptionUndefined: Self = StObject.set(x, "repositoryDescription", js.undefined)
    
    @scala.inline
    def setRepositoryId(value: RepositoryId): Self = StObject.set(x, "repositoryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepositoryIdUndefined: Self = StObject.set(x, "repositoryId", js.undefined)
    
    @scala.inline
    def setRepositoryName(value: RepositoryName): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepositoryNameUndefined: Self = StObject.set(x, "repositoryName", js.undefined)
  }
}
