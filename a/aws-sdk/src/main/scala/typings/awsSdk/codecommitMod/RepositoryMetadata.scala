package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    Arn: Arn = null,
    accountId: AccountId = null,
    cloneUrlHttp: CloneUrlHttp = null,
    cloneUrlSsh: CloneUrlSsh = null,
    creationDate: CreationDate = null,
    defaultBranch: BranchName = null,
    lastModifiedDate: LastModifiedDate = null,
    repositoryDescription: RepositoryDescription = null,
    repositoryId: RepositoryId = null,
    repositoryName: RepositoryName = null
  ): RepositoryMetadata = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn.asInstanceOf[js.Any])
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (cloneUrlHttp != null) __obj.updateDynamic("cloneUrlHttp")(cloneUrlHttp.asInstanceOf[js.Any])
    if (cloneUrlSsh != null) __obj.updateDynamic("cloneUrlSsh")(cloneUrlSsh.asInstanceOf[js.Any])
    if (creationDate != null) __obj.updateDynamic("creationDate")(creationDate.asInstanceOf[js.Any])
    if (defaultBranch != null) __obj.updateDynamic("defaultBranch")(defaultBranch.asInstanceOf[js.Any])
    if (lastModifiedDate != null) __obj.updateDynamic("lastModifiedDate")(lastModifiedDate.asInstanceOf[js.Any])
    if (repositoryDescription != null) __obj.updateDynamic("repositoryDescription")(repositoryDescription.asInstanceOf[js.Any])
    if (repositoryId != null) __obj.updateDynamic("repositoryId")(repositoryId.asInstanceOf[js.Any])
    if (repositoryName != null) __obj.updateDynamic("repositoryName")(repositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepositoryMetadata]
  }
}

