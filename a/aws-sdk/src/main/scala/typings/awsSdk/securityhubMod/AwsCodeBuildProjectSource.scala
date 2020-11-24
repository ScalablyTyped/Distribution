package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsCodeBuildProjectSource extends js.Object {
  
  /**
    * Information about the Git clone depth for the build project.
    */
  var GitCloneDepth: js.UndefOr[Integer] = js.native
  
  /**
    * Whether to ignore SSL warnings while connecting to the project source code.
    */
  var InsecureSsl: js.UndefOr[Boolean] = js.native
  
  /**
    * Information about the location of the source code to be built. Valid values include:   For source code settings that are specified in the source action of a pipeline in AWS CodePipeline, location should not be specified. If it is specified, AWS CodePipeline ignores it. This is because AWS CodePipeline uses the settings in a pipeline's source action instead of this value.   For source code in an AWS CodeCommit repository, the HTTPS clone URL to the repository that contains the source code and the build spec file (for example, https://git-codecommit.region-ID.amazonaws.com/v1/repos/repo-name ).   For source code in an S3 input bucket, one of the following.   The path to the ZIP file that contains the source code (for example, bucket-name/path/to/object-name.zip).    The path to the folder that contains the source code (for example, bucket-name/path/to/source-code/folder/).     For source code in a GitHub repository, the HTTPS clone URL to the repository that contains the source and the build spec file.   For source code in a Bitbucket repository, the HTTPS clone URL to the repository that contains the source and the build spec file.   
    */
  var Location: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The type of repository that contains the source code to be built. Valid values are:    BITBUCKET - The source code is in a Bitbucket repository.    CODECOMMIT - The source code is in an AWS CodeCommit repository.    CODEPIPELINE - The source code settings are specified in the source action of a pipeline in AWS CodePipeline.    GITHUB - The source code is in a GitHub repository.    GITHUB_ENTERPRISE - The source code is in a GitHub Enterprise repository.    NO_SOURCE - The project does not have input source code.    S3 - The source code is in an S3 input bucket.   
    */
  var Type: js.UndefOr[NonEmptyString] = js.native
}
object AwsCodeBuildProjectSource {
  
  @scala.inline
  def apply(): AwsCodeBuildProjectSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsCodeBuildProjectSource]
  }
  
  @scala.inline
  implicit class AwsCodeBuildProjectSourceOps[Self <: AwsCodeBuildProjectSource] (val x: Self) extends AnyVal {
    
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
    def setGitCloneDepth(value: Integer): Self = this.set("GitCloneDepth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGitCloneDepth: Self = this.set("GitCloneDepth", js.undefined)
    
    @scala.inline
    def setInsecureSsl(value: Boolean): Self = this.set("InsecureSsl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsecureSsl: Self = this.set("InsecureSsl", js.undefined)
    
    @scala.inline
    def setLocation(value: NonEmptyString): Self = this.set("Location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("Location", js.undefined)
    
    @scala.inline
    def setType(value: NonEmptyString): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
  }
}
