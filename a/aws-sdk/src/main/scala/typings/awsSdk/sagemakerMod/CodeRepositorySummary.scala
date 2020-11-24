package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CodeRepositorySummary extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the Git repository.
    */
  var CodeRepositoryArn: typings.awsSdk.sagemakerMod.CodeRepositoryArn = js.native
  
  /**
    * The name of the Git repository.
    */
  var CodeRepositoryName: EntityName = js.native
  
  /**
    * The date and time that the Git repository was created.
    */
  var CreationTime: typings.awsSdk.sagemakerMod.CreationTime = js.native
  
  /**
    * Configuration details for the Git repository, including the URL where it is located and the ARN of the AWS Secrets Manager secret that contains the credentials used to access the repository.
    */
  var GitConfig: js.UndefOr[typings.awsSdk.sagemakerMod.GitConfig] = js.native
  
  /**
    * The date and time that the Git repository was last modified.
    */
  var LastModifiedTime: typings.awsSdk.sagemakerMod.LastModifiedTime = js.native
}
object CodeRepositorySummary {
  
  @scala.inline
  def apply(
    CodeRepositoryArn: CodeRepositoryArn,
    CodeRepositoryName: EntityName,
    CreationTime: CreationTime,
    LastModifiedTime: LastModifiedTime
  ): CodeRepositorySummary = {
    val __obj = js.Dynamic.literal(CodeRepositoryArn = CodeRepositoryArn.asInstanceOf[js.Any], CodeRepositoryName = CodeRepositoryName.asInstanceOf[js.Any], CreationTime = CreationTime.asInstanceOf[js.Any], LastModifiedTime = LastModifiedTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeRepositorySummary]
  }
  
  @scala.inline
  implicit class CodeRepositorySummaryOps[Self <: CodeRepositorySummary] (val x: Self) extends AnyVal {
    
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
