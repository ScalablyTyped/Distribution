package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeCodeRepositoryOutput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the Git repository.
    */
  var CodeRepositoryArn: typings.awsSdk.sagemakerMod.CodeRepositoryArn = js.native
  /**
    * The name of the Git repository.
    */
  var CodeRepositoryName: EntityName = js.native
  /**
    * The date and time that the repository was created.
    */
  var CreationTime: typings.awsSdk.sagemakerMod.CreationTime = js.native
  /**
    * Configuration details about the repository, including the URL where the repository is located, the default branch, and the Amazon Resource Name (ARN) of the AWS Secrets Manager secret that contains the credentials used to access the repository.
    */
  var GitConfig: js.UndefOr[typings.awsSdk.sagemakerMod.GitConfig] = js.native
  /**
    * The date and time that the repository was last changed.
    */
  var LastModifiedTime: typings.awsSdk.sagemakerMod.LastModifiedTime = js.native
}

object DescribeCodeRepositoryOutput {
  @scala.inline
  def apply(
    CodeRepositoryArn: CodeRepositoryArn,
    CodeRepositoryName: EntityName,
    CreationTime: CreationTime,
    LastModifiedTime: LastModifiedTime
  ): DescribeCodeRepositoryOutput = {
    val __obj = js.Dynamic.literal(CodeRepositoryArn = CodeRepositoryArn.asInstanceOf[js.Any], CodeRepositoryName = CodeRepositoryName.asInstanceOf[js.Any], CreationTime = CreationTime.asInstanceOf[js.Any], LastModifiedTime = LastModifiedTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeCodeRepositoryOutput]
  }
  @scala.inline
  implicit class DescribeCodeRepositoryOutputOps[Self <: DescribeCodeRepositoryOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCodeRepositoryArn(value: CodeRepositoryArn): Self = this.set("CodeRepositoryArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setCodeRepositoryName(value: EntityName): Self = this.set("CodeRepositoryName", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreationTime(value: CreationTime): Self = this.set("CreationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setLastModifiedTime(value: LastModifiedTime): Self = this.set("LastModifiedTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setGitConfig(value: GitConfig): Self = this.set("GitConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGitConfig: Self = this.set("GitConfig", js.undefined)
  }
  
}

