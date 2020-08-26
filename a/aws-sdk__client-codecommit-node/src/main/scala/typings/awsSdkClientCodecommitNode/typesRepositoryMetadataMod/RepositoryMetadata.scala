package typings.awsSdkClientCodecommitNode.typesRepositoryMetadataMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RepositoryMetadata extends js.Object {
  /**
    * <p>The Amazon Resource Name (ARN) of the repository.</p>
    */
  var Arn: js.UndefOr[String] = js.native
  /**
    * <p>The ID of the AWS account associated with the repository.</p>
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * <p>The URL to use for cloning the repository over HTTPS.</p>
    */
  var cloneUrlHttp: js.UndefOr[String] = js.native
  /**
    * <p>The URL to use for cloning the repository over SSH.</p>
    */
  var cloneUrlSsh: js.UndefOr[String] = js.native
  /**
    * <p>The date and time the repository was created, in timestamp format.</p>
    */
  var creationDate: js.UndefOr[Date | String | Double] = js.native
  /**
    * <p>The repository's default branch name.</p>
    */
  var defaultBranch: js.UndefOr[String] = js.native
  /**
    * <p>The date and time the repository was last modified, in timestamp format.</p>
    */
  var lastModifiedDate: js.UndefOr[Date | String | Double] = js.native
  /**
    * <p>A comment or description about the repository.</p>
    */
  var repositoryDescription: js.UndefOr[String] = js.native
  /**
    * <p>The ID of the repository.</p>
    */
  var repositoryId: js.UndefOr[String] = js.native
  /**
    * <p>The repository's name.</p>
    */
  var repositoryName: js.UndefOr[String] = js.native
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
    def setArn(value: String): Self = this.set("Arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("Arn", js.undefined)
    @scala.inline
    def setAccountId(value: String): Self = this.set("accountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccountId: Self = this.set("accountId", js.undefined)
    @scala.inline
    def setCloneUrlHttp(value: String): Self = this.set("cloneUrlHttp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloneUrlHttp: Self = this.set("cloneUrlHttp", js.undefined)
    @scala.inline
    def setCloneUrlSsh(value: String): Self = this.set("cloneUrlSsh", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloneUrlSsh: Self = this.set("cloneUrlSsh", js.undefined)
    @scala.inline
    def setCreationDate(value: Date | String | Double): Self = this.set("creationDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationDate: Self = this.set("creationDate", js.undefined)
    @scala.inline
    def setDefaultBranch(value: String): Self = this.set("defaultBranch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultBranch: Self = this.set("defaultBranch", js.undefined)
    @scala.inline
    def setLastModifiedDate(value: Date | String | Double): Self = this.set("lastModifiedDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModifiedDate: Self = this.set("lastModifiedDate", js.undefined)
    @scala.inline
    def setRepositoryDescription(value: String): Self = this.set("repositoryDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRepositoryDescription: Self = this.set("repositoryDescription", js.undefined)
    @scala.inline
    def setRepositoryId(value: String): Self = this.set("repositoryId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRepositoryId: Self = this.set("repositoryId", js.undefined)
    @scala.inline
    def setRepositoryName(value: String): Self = this.set("repositoryName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRepositoryName: Self = this.set("repositoryName", js.undefined)
  }
  
}

