package typings.atAwsDashSdkClientDashCodecommitDashNode.typesUnderscoreRepositoryMetadataMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledRepositoryMetadata extends _RepositoryMetadata {
  /**
    * <p>The date and time the repository was created, in timestamp format.</p>
    */
  @JSName("creationDate")
  var creationDate__UnmarshalledRepositoryMetadata: js.UndefOr[Date] = js.undefined
  /**
    * <p>The date and time the repository was last modified, in timestamp format.</p>
    */
  @JSName("lastModifiedDate")
  var lastModifiedDate__UnmarshalledRepositoryMetadata: js.UndefOr[Date] = js.undefined
}

object _UnmarshalledRepositoryMetadata {
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
  ): _UnmarshalledRepositoryMetadata = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn)
    if (accountId != null) __obj.updateDynamic("accountId")(accountId)
    if (cloneUrlHttp != null) __obj.updateDynamic("cloneUrlHttp")(cloneUrlHttp)
    if (cloneUrlSsh != null) __obj.updateDynamic("cloneUrlSsh")(cloneUrlSsh)
    if (creationDate != null) __obj.updateDynamic("creationDate")(creationDate)
    if (defaultBranch != null) __obj.updateDynamic("defaultBranch")(defaultBranch)
    if (lastModifiedDate != null) __obj.updateDynamic("lastModifiedDate")(lastModifiedDate)
    if (repositoryDescription != null) __obj.updateDynamic("repositoryDescription")(repositoryDescription)
    if (repositoryId != null) __obj.updateDynamic("repositoryId")(repositoryId)
    if (repositoryName != null) __obj.updateDynamic("repositoryName")(repositoryName)
    __obj.asInstanceOf[_UnmarshalledRepositoryMetadata]
  }
}

