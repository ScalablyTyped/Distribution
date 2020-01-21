package typings.awsSdkClientCodecommitNode.typesRepositoryMetadataMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledRepositoryMetadata extends RepositoryMetadata {
  /**
    * <p>The date and time the repository was created, in timestamp format.</p>
    */
  @JSName("creationDate")
  var creationDate_UnmarshalledRepositoryMetadata: js.UndefOr[Date] = js.undefined
  /**
    * <p>The date and time the repository was last modified, in timestamp format.</p>
    */
  @JSName("lastModifiedDate")
  var lastModifiedDate_UnmarshalledRepositoryMetadata: js.UndefOr[Date] = js.undefined
}

object UnmarshalledRepositoryMetadata {
  @scala.inline
  def apply(
    Arn: String = null,
    accountId: String = null,
    cloneUrlHttp: String = null,
    cloneUrlSsh: String = null,
    creationDate: Date = null,
    defaultBranch: String = null,
    lastModifiedDate: Date = null,
    repositoryDescription: String = null,
    repositoryId: String = null,
    repositoryName: String = null
  ): UnmarshalledRepositoryMetadata = {
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
    __obj.asInstanceOf[UnmarshalledRepositoryMetadata]
  }
}

