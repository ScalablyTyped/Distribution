package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsCodeBuildProjectDetails extends StObject {
  
  /**
    * The AWS Key Management Service (AWS KMS) customer master key (CMK) used to encrypt the build output artifacts. You can specify either the Amazon Resource Name (ARN) of the CMK or, if available, the CMK alias (using the format alias/alias-name). 
    */
  var EncryptionKey: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Information about the build environment for this build project.
    */
  var Environment: js.UndefOr[AwsCodeBuildProjectEnvironment] = js.undefined
  
  /**
    * The name of the build project.
    */
  var Name: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The ARN of the IAM role that enables AWS CodeBuild to interact with dependent AWS services on behalf of the AWS account.
    */
  var ServiceRole: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Information about the build input source code for this build project.
    */
  var Source: js.UndefOr[AwsCodeBuildProjectSource] = js.undefined
  
  /**
    * Information about the VPC configuration that AWS CodeBuild accesses.
    */
  var VpcConfig: js.UndefOr[AwsCodeBuildProjectVpcConfig] = js.undefined
}
object AwsCodeBuildProjectDetails {
  
  @scala.inline
  def apply(): AwsCodeBuildProjectDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsCodeBuildProjectDetails]
  }
  
  @scala.inline
  implicit class AwsCodeBuildProjectDetailsMutableBuilder[Self <: AwsCodeBuildProjectDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEncryptionKey(value: NonEmptyString): Self = StObject.set(x, "EncryptionKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptionKeyUndefined: Self = StObject.set(x, "EncryptionKey", js.undefined)
    
    @scala.inline
    def setEnvironment(value: AwsCodeBuildProjectEnvironment): Self = StObject.set(x, "Environment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentUndefined: Self = StObject.set(x, "Environment", js.undefined)
    
    @scala.inline
    def setName(value: NonEmptyString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setServiceRole(value: NonEmptyString): Self = StObject.set(x, "ServiceRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceRoleUndefined: Self = StObject.set(x, "ServiceRole", js.undefined)
    
    @scala.inline
    def setSource(value: AwsCodeBuildProjectSource): Self = StObject.set(x, "Source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "Source", js.undefined)
    
    @scala.inline
    def setVpcConfig(value: AwsCodeBuildProjectVpcConfig): Self = StObject.set(x, "VpcConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcConfigUndefined: Self = StObject.set(x, "VpcConfig", js.undefined)
  }
}
