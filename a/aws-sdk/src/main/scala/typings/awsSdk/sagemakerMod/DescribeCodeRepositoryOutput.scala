package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeCodeRepositoryOutput extends StObject {
  
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
  implicit class DescribeCodeRepositoryOutputMutableBuilder[Self <: DescribeCodeRepositoryOutput] (val x: Self) extends AnyVal {
    
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
