package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateCodeRepositoryInput extends js.Object {
  /**
    * The name of the Git repository. The name must have 1 to 63 characters. Valid characters are a-z, A-Z, 0-9, and - (hyphen).
    */
  var CodeRepositoryName: EntityName = js.native
  /**
    * Specifies details about the repository, including the URL where the repository is located, the default branch, and credentials to use to access the repository.
    */
  var GitConfig: typings.awsSdk.sagemakerMod.GitConfig = js.native
}

object CreateCodeRepositoryInput {
  @scala.inline
  def apply(CodeRepositoryName: EntityName, GitConfig: GitConfig): CreateCodeRepositoryInput = {
    val __obj = js.Dynamic.literal(CodeRepositoryName = CodeRepositoryName.asInstanceOf[js.Any], GitConfig = GitConfig.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateCodeRepositoryInput]
  }
}

