package typings.atAwsDashSdkClientDashCodecommitDashNode.typesUnderscoreRepositoryMetadataMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _RepositoryMetadata extends js.Object {
  /**
    * <p>The Amazon Resource Name (ARN) of the repository.</p>
    */
  var Arn: js.UndefOr[String] = js.undefined
  /**
    * <p>The ID of the AWS account associated with the repository.</p>
    */
  var accountId: js.UndefOr[String] = js.undefined
  /**
    * <p>The URL to use for cloning the repository over HTTPS.</p>
    */
  var cloneUrlHttp: js.UndefOr[String] = js.undefined
  /**
    * <p>The URL to use for cloning the repository over SSH.</p>
    */
  var cloneUrlSsh: js.UndefOr[String] = js.undefined
  /**
    * <p>The date and time the repository was created, in timestamp format.</p>
    */
  var creationDate: js.UndefOr[Date | String | Double] = js.undefined
  /**
    * <p>The repository's default branch name.</p>
    */
  var defaultBranch: js.UndefOr[String] = js.undefined
  /**
    * <p>The date and time the repository was last modified, in timestamp format.</p>
    */
  var lastModifiedDate: js.UndefOr[Date | String | Double] = js.undefined
  /**
    * <p>A comment or description about the repository.</p>
    */
  var repositoryDescription: js.UndefOr[String] = js.undefined
  /**
    * <p>The ID of the repository.</p>
    */
  var repositoryId: js.UndefOr[String] = js.undefined
  /**
    * <p>The repository's name.</p>
    */
  var repositoryName: js.UndefOr[String] = js.undefined
}

object _RepositoryMetadata {
  @scala.inline
  def apply(
    Arn: String = null,
    accountId: String = null,
    cloneUrlHttp: String = null,
    cloneUrlSsh: String = null,
    creationDate: Date | String | Double = null,
    defaultBranch: String = null,
    lastModifiedDate: Date | String | Double = null,
    repositoryDescription: String = null,
    repositoryId: String = null,
    repositoryName: String = null
  ): _RepositoryMetadata = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn)
    if (accountId != null) __obj.updateDynamic("accountId")(accountId)
    if (cloneUrlHttp != null) __obj.updateDynamic("cloneUrlHttp")(cloneUrlHttp)
    if (cloneUrlSsh != null) __obj.updateDynamic("cloneUrlSsh")(cloneUrlSsh)
    if (creationDate != null) __obj.updateDynamic("creationDate")(creationDate.asInstanceOf[js.Any])
    if (defaultBranch != null) __obj.updateDynamic("defaultBranch")(defaultBranch)
    if (lastModifiedDate != null) __obj.updateDynamic("lastModifiedDate")(lastModifiedDate.asInstanceOf[js.Any])
    if (repositoryDescription != null) __obj.updateDynamic("repositoryDescription")(repositoryDescription)
    if (repositoryId != null) __obj.updateDynamic("repositoryId")(repositoryId)
    if (repositoryName != null) __obj.updateDynamic("repositoryName")(repositoryName)
    __obj.asInstanceOf[_RepositoryMetadata]
  }
}

