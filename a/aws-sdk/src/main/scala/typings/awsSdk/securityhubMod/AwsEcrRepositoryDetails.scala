package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEcrRepositoryDetails extends StObject {
  
  /**
    * The ARN of the repository.
    */
  var Arn: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The image scanning configuration for a repository.
    */
  var ImageScanningConfiguration: js.UndefOr[AwsEcrRepositoryImageScanningConfigurationDetails] = js.undefined
  
  /**
    * The tag mutability setting for the repository. Valid values are IMMUTABLE or MUTABLE.
    */
  var ImageTagMutability: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Information about the lifecycle policy for the repository.
    */
  var LifecyclePolicy: js.UndefOr[AwsEcrRepositoryLifecyclePolicyDetails] = js.undefined
  
  /**
    * The name of the repository.
    */
  var RepositoryName: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The text of the repository policy.
    */
  var RepositoryPolicyText: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsEcrRepositoryDetails {
  
  inline def apply(): AwsEcrRepositoryDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEcrRepositoryDetails]
  }
  
  extension [Self <: AwsEcrRepositoryDetails](x: Self) {
    
    inline def setArn(value: NonEmptyString): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setImageScanningConfiguration(value: AwsEcrRepositoryImageScanningConfigurationDetails): Self = StObject.set(x, "ImageScanningConfiguration", value.asInstanceOf[js.Any])
    
    inline def setImageScanningConfigurationUndefined: Self = StObject.set(x, "ImageScanningConfiguration", js.undefined)
    
    inline def setImageTagMutability(value: NonEmptyString): Self = StObject.set(x, "ImageTagMutability", value.asInstanceOf[js.Any])
    
    inline def setImageTagMutabilityUndefined: Self = StObject.set(x, "ImageTagMutability", js.undefined)
    
    inline def setLifecyclePolicy(value: AwsEcrRepositoryLifecyclePolicyDetails): Self = StObject.set(x, "LifecyclePolicy", value.asInstanceOf[js.Any])
    
    inline def setLifecyclePolicyUndefined: Self = StObject.set(x, "LifecyclePolicy", js.undefined)
    
    inline def setRepositoryName(value: NonEmptyString): Self = StObject.set(x, "RepositoryName", value.asInstanceOf[js.Any])
    
    inline def setRepositoryNameUndefined: Self = StObject.set(x, "RepositoryName", js.undefined)
    
    inline def setRepositoryPolicyText(value: NonEmptyString): Self = StObject.set(x, "RepositoryPolicyText", value.asInstanceOf[js.Any])
    
    inline def setRepositoryPolicyTextUndefined: Self = StObject.set(x, "RepositoryPolicyText", js.undefined)
  }
}
