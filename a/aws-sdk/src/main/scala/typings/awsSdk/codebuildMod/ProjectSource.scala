package typings.awsSdk.codebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProjectSource extends StObject {
  
  /**
    * Information about the authorization settings for AWS CodeBuild to access the source code to be built. This information is for the AWS CodeBuild console's use only. Your code should not get or set this information directly.
    */
  var auth: js.UndefOr[SourceAuth] = js.native
  
  /**
    * Contains information that defines how the build project reports the build status to the source provider. This option is only used when the source provider is GITHUB, GITHUB_ENTERPRISE, or BITBUCKET.
    */
  var buildStatusConfig: js.UndefOr[BuildStatusConfig] = js.native
  
  /**
    * The buildspec file declaration to use for the builds in this build project.  If this value is set, it can be either an inline buildspec definition, the path to an alternate buildspec file relative to the value of the built-in CODEBUILD_SRC_DIR environment variable, or the path to an S3 bucket. The bucket must be in the same AWS Region as the build project. Specify the buildspec file using its ARN (for example, arn:aws:s3:::my-codebuild-sample2/buildspec.yml). If this value is not provided or is set to an empty string, the source code must contain a buildspec file in its root directory. For more information, see Buildspec File Name and Storage Location. 
    */
  var buildspec: js.UndefOr[String] = js.native
  
  /**
    * Information about the Git clone depth for the build project.
    */
  var gitCloneDepth: js.UndefOr[GitCloneDepth] = js.native
  
  /**
    *  Information about the Git submodules configuration for the build project. 
    */
  var gitSubmodulesConfig: js.UndefOr[GitSubmodulesConfig] = js.native
  
  /**
    * Enable this flag to ignore SSL warnings while connecting to the project source code.
    */
  var insecureSsl: js.UndefOr[WrapperBoolean] = js.native
  
  /**
    * Information about the location of the source code to be built. Valid values include:   For source code settings that are specified in the source action of a pipeline in AWS CodePipeline, location should not be specified. If it is specified, AWS CodePipeline ignores it. This is because AWS CodePipeline uses the settings in a pipeline's source action instead of this value.   For source code in an AWS CodeCommit repository, the HTTPS clone URL to the repository that contains the source code and the buildspec file (for example, https://git-codecommit.&lt;region-ID&gt;.amazonaws.com/v1/repos/&lt;repo-name&gt;).   For source code in an Amazon Simple Storage Service (Amazon S3) input bucket, one of the following.    The path to the ZIP file that contains the source code (for example, &lt;bucket-name&gt;/&lt;path&gt;/&lt;object-name&gt;.zip).    The path to the folder that contains the source code (for example, &lt;bucket-name&gt;/&lt;path-to-source-code&gt;/&lt;folder&gt;/).      For source code in a GitHub repository, the HTTPS clone URL to the repository that contains the source and the buildspec file. You must connect your AWS account to your GitHub account. Use the AWS CodeBuild console to start creating a build project. When you use the console to connect (or reconnect) with GitHub, on the GitHub Authorize application page, for Organization access, choose Request access next to each repository you want to allow AWS CodeBuild to have access to, and then choose Authorize application. (After you have connected to your GitHub account, you do not need to finish creating the build project. You can leave the AWS CodeBuild console.) To instruct AWS CodeBuild to use this connection, in the source object, set the auth object's type value to OAUTH.   For source code in a Bitbucket repository, the HTTPS clone URL to the repository that contains the source and the buildspec file. You must connect your AWS account to your Bitbucket account. Use the AWS CodeBuild console to start creating a build project. When you use the console to connect (or reconnect) with Bitbucket, on the Bitbucket Confirm access to your account page, choose Grant access. (After you have connected to your Bitbucket account, you do not need to finish creating the build project. You can leave the AWS CodeBuild console.) To instruct AWS CodeBuild to use this connection, in the source object, set the auth object's type value to OAUTH.  
    */
  var location: js.UndefOr[String] = js.native
  
  /**
    *  Set to true to report the status of a build's start and finish to your source provider. This option is valid only when your source provider is GitHub, GitHub Enterprise, or Bitbucket. If this is set and you use a different source provider, an invalidInputException is thrown.    The status of a build triggered by a webhook is always reported to your source provider.  
    */
  var reportBuildStatus: js.UndefOr[WrapperBoolean] = js.native
  
  /**
    *  An identifier for this project source. 
    */
  var sourceIdentifier: js.UndefOr[String] = js.native
  
  /**
    * The type of repository that contains the source code to be built. Valid values include:    BITBUCKET: The source code is in a Bitbucket repository.    CODECOMMIT: The source code is in an AWS CodeCommit repository.    CODEPIPELINE: The source code settings are specified in the source action of a pipeline in AWS CodePipeline.    GITHUB: The source code is in a GitHub or GitHub Enterprise Cloud repository.    GITHUB_ENTERPRISE: The source code is in a GitHub Enterprise Server repository.    NO_SOURCE: The project does not have input source code.    S3: The source code is in an Amazon Simple Storage Service (Amazon S3) input bucket.  
    */
  var `type`: SourceType = js.native
}
object ProjectSource {
  
  @scala.inline
  def apply(`type`: SourceType): ProjectSource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectSource]
  }
  
  @scala.inline
  implicit class ProjectSourceMutableBuilder[Self <: ProjectSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: SourceAuth): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setBuildStatusConfig(value: BuildStatusConfig): Self = StObject.set(x, "buildStatusConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuildStatusConfigUndefined: Self = StObject.set(x, "buildStatusConfig", js.undefined)
    
    @scala.inline
    def setBuildspec(value: String): Self = StObject.set(x, "buildspec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuildspecUndefined: Self = StObject.set(x, "buildspec", js.undefined)
    
    @scala.inline
    def setGitCloneDepth(value: GitCloneDepth): Self = StObject.set(x, "gitCloneDepth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGitCloneDepthUndefined: Self = StObject.set(x, "gitCloneDepth", js.undefined)
    
    @scala.inline
    def setGitSubmodulesConfig(value: GitSubmodulesConfig): Self = StObject.set(x, "gitSubmodulesConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGitSubmodulesConfigUndefined: Self = StObject.set(x, "gitSubmodulesConfig", js.undefined)
    
    @scala.inline
    def setInsecureSsl(value: WrapperBoolean): Self = StObject.set(x, "insecureSsl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsecureSslUndefined: Self = StObject.set(x, "insecureSsl", js.undefined)
    
    @scala.inline
    def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setReportBuildStatus(value: WrapperBoolean): Self = StObject.set(x, "reportBuildStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportBuildStatusUndefined: Self = StObject.set(x, "reportBuildStatus", js.undefined)
    
    @scala.inline
    def setSourceIdentifier(value: String): Self = StObject.set(x, "sourceIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceIdentifierUndefined: Self = StObject.set(x, "sourceIdentifier", js.undefined)
    
    @scala.inline
    def setType(value: SourceType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
