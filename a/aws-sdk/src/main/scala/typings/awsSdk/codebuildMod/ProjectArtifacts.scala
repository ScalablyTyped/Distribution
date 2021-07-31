package typings.awsSdk.codebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectArtifacts extends StObject {
  
  /**
    *  An identifier for this artifact definition. 
    */
  var artifactIdentifier: js.UndefOr[String] = js.undefined
  
  /**
    *  Set to true if you do not want your output artifacts encrypted. This option is valid only if your artifacts type is Amazon Simple Storage Service (Amazon S3). If this is set with another artifacts type, an invalidInputException is thrown. 
    */
  var encryptionDisabled: js.UndefOr[WrapperBoolean] = js.undefined
  
  /**
    * Information about the build output artifact location:   If type is set to CODEPIPELINE, AWS CodePipeline ignores this value if specified. This is because AWS CodePipeline manages its build output locations instead of AWS CodeBuild.   If type is set to NO_ARTIFACTS, this value is ignored if specified, because no build output is produced.   If type is set to S3, this is the name of the output bucket.  
    */
  var location: js.UndefOr[String] = js.undefined
  
  /**
    * Along with path and namespaceType, the pattern that AWS CodeBuild uses to name and store the output artifact:   If type is set to CODEPIPELINE, AWS CodePipeline ignores this value if specified. This is because AWS CodePipeline manages its build output names instead of AWS CodeBuild.   If type is set to NO_ARTIFACTS, this value is ignored if specified, because no build output is produced.   If type is set to S3, this is the name of the output artifact object. If you set the name to be a forward slash ("/"), the artifact is stored in the root of the output bucket.   For example:    If path is set to MyArtifacts, namespaceType is set to BUILD_ID, and name is set to MyArtifact.zip, then the output artifact is stored in MyArtifacts/&lt;build-ID&gt;/MyArtifact.zip.     If path is empty, namespaceType is set to NONE, and name is set to "/", the output artifact is stored in the root of the output bucket.     If path is set to MyArtifacts, namespaceType is set to BUILD_ID, and name is set to "/", the output artifact is stored in MyArtifacts/&lt;build-ID&gt;.   
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Along with path and name, the pattern that AWS CodeBuild uses to determine the name and location to store the output artifact:   If type is set to CODEPIPELINE, AWS CodePipeline ignores this value if specified. This is because AWS CodePipeline manages its build output names instead of AWS CodeBuild.   If type is set to NO_ARTIFACTS, this value is ignored if specified, because no build output is produced.   If type is set to S3, valid values include:    BUILD_ID: Include the build ID in the location of the build output artifact.    NONE: Do not include the build ID. This is the default if namespaceType is not specified.     For example, if path is set to MyArtifacts, namespaceType is set to BUILD_ID, and name is set to MyArtifact.zip, the output artifact is stored in MyArtifacts/&lt;build-ID&gt;/MyArtifact.zip.
    */
  var namespaceType: js.UndefOr[ArtifactNamespace] = js.undefined
  
  /**
    *  If this flag is set, a name specified in the buildspec file overrides the artifact name. The name specified in a buildspec file is calculated at build time and uses the Shell Command Language. For example, you can append a date and time to your artifact name so that it is always unique. 
    */
  var overrideArtifactName: js.UndefOr[WrapperBoolean] = js.undefined
  
  /**
    * The type of build output artifact to create:   If type is set to CODEPIPELINE, AWS CodePipeline ignores this value if specified. This is because AWS CodePipeline manages its build output artifacts instead of AWS CodeBuild.   If type is set to NO_ARTIFACTS, this value is ignored if specified, because no build output is produced.   If type is set to S3, valid values include:    NONE: AWS CodeBuild creates in the output bucket a folder that contains the build output. This is the default if packaging is not specified.    ZIP: AWS CodeBuild creates in the output bucket a ZIP file that contains the build output.    
    */
  var packaging: js.UndefOr[ArtifactPackaging] = js.undefined
  
  /**
    * Along with namespaceType and name, the pattern that AWS CodeBuild uses to name and store the output artifact:   If type is set to CODEPIPELINE, AWS CodePipeline ignores this value if specified. This is because AWS CodePipeline manages its build output names instead of AWS CodeBuild.   If type is set to NO_ARTIFACTS, this value is ignored if specified, because no build output is produced.   If type is set to S3, this is the path to the output artifact. If path is not specified, path is not used.   For example, if path is set to MyArtifacts, namespaceType is set to NONE, and name is set to MyArtifact.zip, the output artifact is stored in the output bucket at MyArtifacts/MyArtifact.zip.
    */
  var path: js.UndefOr[String] = js.undefined
  
  /**
    * The type of build output artifact. Valid values include:    CODEPIPELINE: The build project has build output generated through AWS CodePipeline.   The CODEPIPELINE type is not supported for secondaryArtifacts.     NO_ARTIFACTS: The build project does not produce any build output.    S3: The build project stores build output in Amazon Simple Storage Service (Amazon S3).  
    */
  var `type`: ArtifactsType
}
object ProjectArtifacts {
  
  @scala.inline
  def apply(`type`: ArtifactsType): ProjectArtifacts = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectArtifacts]
  }
  
  @scala.inline
  implicit class ProjectArtifactsMutableBuilder[Self <: ProjectArtifacts] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArtifactIdentifier(value: String): Self = StObject.set(x, "artifactIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArtifactIdentifierUndefined: Self = StObject.set(x, "artifactIdentifier", js.undefined)
    
    @scala.inline
    def setEncryptionDisabled(value: WrapperBoolean): Self = StObject.set(x, "encryptionDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptionDisabledUndefined: Self = StObject.set(x, "encryptionDisabled", js.undefined)
    
    @scala.inline
    def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNamespaceType(value: ArtifactNamespace): Self = StObject.set(x, "namespaceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespaceTypeUndefined: Self = StObject.set(x, "namespaceType", js.undefined)
    
    @scala.inline
    def setOverrideArtifactName(value: WrapperBoolean): Self = StObject.set(x, "overrideArtifactName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverrideArtifactNameUndefined: Self = StObject.set(x, "overrideArtifactName", js.undefined)
    
    @scala.inline
    def setPackaging(value: ArtifactPackaging): Self = StObject.set(x, "packaging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackagingUndefined: Self = StObject.set(x, "packaging", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setType(value: ArtifactsType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
