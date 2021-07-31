package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodeRepositorySummary extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the Git repository.
    */
  var CodeRepositoryArn: typings.awsSdk.sagemakerMod.CodeRepositoryArn
  
  /**
    * The name of the Git repository.
    */
  var CodeRepositoryName: EntityName
  
  /**
    * The date and time that the Git repository was created.
    */
  var CreationTime: typings.awsSdk.sagemakerMod.CreationTime
  
  /**
    * Configuration details for the Git repository, including the URL where it is located and the ARN of the AWS Secrets Manager secret that contains the credentials used to access the repository.
    */
  var GitConfig: js.UndefOr[typings.awsSdk.sagemakerMod.GitConfig] = js.undefined
  
  /**
    * The date and time that the Git repository was last modified.
    */
  var LastModifiedTime: typings.awsSdk.sagemakerMod.LastModifiedTime
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
  implicit class CodeRepositorySummaryMutableBuilder[Self <: CodeRepositorySummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCodeRepositoryArn(value: CodeRepositoryArn): Self = StObject.set(x, "CodeRepositoryArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeRepositoryName(value: EntityName): Self = StObject.set(x, "CodeRepositoryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTime(value: CreationTime): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGitConfig(value: GitConfig): Self = StObject.set(x, "GitConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGitConfigUndefined: Self = StObject.set(x, "GitConfig", js.undefined)
    
    @scala.inline
    def setLastModifiedTime(value: LastModifiedTime): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
  }
}
