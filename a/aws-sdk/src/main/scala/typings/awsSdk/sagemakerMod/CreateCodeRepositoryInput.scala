package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateCodeRepositoryInput extends StObject {
  
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
  
  @scala.inline
  implicit class CreateCodeRepositoryInputMutableBuilder[Self <: CreateCodeRepositoryInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCodeRepositoryName(value: EntityName): Self = StObject.set(x, "CodeRepositoryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGitConfig(value: GitConfig): Self = StObject.set(x, "GitConfig", value.asInstanceOf[js.Any])
  }
}
