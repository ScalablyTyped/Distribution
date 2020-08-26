package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateCodeRepositoryInput extends js.Object {
  /**
    * The name of the Git repository to update.
    */
  var CodeRepositoryName: EntityName = js.native
  /**
    * The configuration of the git repository, including the URL and the Amazon Resource Name (ARN) of the AWS Secrets Manager secret that contains the credentials used to access the repository. The secret must have a staging label of AWSCURRENT and must be in the following format:  {"username": UserName, "password": Password} 
    */
  var GitConfig: js.UndefOr[GitConfigForUpdate] = js.native
}

object UpdateCodeRepositoryInput {
  @scala.inline
  def apply(CodeRepositoryName: EntityName): UpdateCodeRepositoryInput = {
    val __obj = js.Dynamic.literal(CodeRepositoryName = CodeRepositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateCodeRepositoryInput]
  }
  @scala.inline
  implicit class UpdateCodeRepositoryInputOps[Self <: UpdateCodeRepositoryInput] (val x: Self) extends AnyVal {
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
    def setCodeRepositoryName(value: EntityName): Self = this.set("CodeRepositoryName", value.asInstanceOf[js.Any])
    @scala.inline
    def setGitConfig(value: GitConfigForUpdate): Self = this.set("GitConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGitConfig: Self = this.set("GitConfig", js.undefined)
  }
  
}

