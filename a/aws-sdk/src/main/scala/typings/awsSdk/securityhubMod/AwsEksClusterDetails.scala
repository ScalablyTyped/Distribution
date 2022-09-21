package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEksClusterDetails extends StObject {
  
  /**
    * The ARN of the cluster.
    */
  var Arn: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The certificate authority data for the cluster.
    */
  var CertificateAuthorityData: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The status of the cluster. Valid values are as follows:    ACTIVE     CREATING     DELETING     FAILED     PENDING     UPDATING   
    */
  var ClusterStatus: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The endpoint for the Amazon EKS API server.
    */
  var Endpoint: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The logging configuration for the cluster.
    */
  var Logging: js.UndefOr[AwsEksClusterLoggingDetails] = js.undefined
  
  /**
    * The name of the cluster.
    */
  var Name: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The VPC configuration used by the cluster control plane.
    */
  var ResourcesVpcConfig: js.UndefOr[AwsEksClusterResourcesVpcConfigDetails] = js.undefined
  
  /**
    * The ARN of the IAM role that provides permissions for the Amazon EKS control plane to make calls to Amazon Web Services API operations on your behalf.
    */
  var RoleArn: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The Amazon EKS server version for the cluster.
    */
  var Version: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsEksClusterDetails {
  
  inline def apply(): AwsEksClusterDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEksClusterDetails]
  }
  
  extension [Self <: AwsEksClusterDetails](x: Self) {
    
    inline def setArn(value: NonEmptyString): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setCertificateAuthorityData(value: NonEmptyString): Self = StObject.set(x, "CertificateAuthorityData", value.asInstanceOf[js.Any])
    
    inline def setCertificateAuthorityDataUndefined: Self = StObject.set(x, "CertificateAuthorityData", js.undefined)
    
    inline def setClusterStatus(value: NonEmptyString): Self = StObject.set(x, "ClusterStatus", value.asInstanceOf[js.Any])
    
    inline def setClusterStatusUndefined: Self = StObject.set(x, "ClusterStatus", js.undefined)
    
    inline def setEndpoint(value: NonEmptyString): Self = StObject.set(x, "Endpoint", value.asInstanceOf[js.Any])
    
    inline def setEndpointUndefined: Self = StObject.set(x, "Endpoint", js.undefined)
    
    inline def setLogging(value: AwsEksClusterLoggingDetails): Self = StObject.set(x, "Logging", value.asInstanceOf[js.Any])
    
    inline def setLoggingUndefined: Self = StObject.set(x, "Logging", js.undefined)
    
    inline def setName(value: NonEmptyString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setResourcesVpcConfig(value: AwsEksClusterResourcesVpcConfigDetails): Self = StObject.set(x, "ResourcesVpcConfig", value.asInstanceOf[js.Any])
    
    inline def setResourcesVpcConfigUndefined: Self = StObject.set(x, "ResourcesVpcConfig", js.undefined)
    
    inline def setRoleArn(value: NonEmptyString): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
    
    inline def setVersion(value: NonEmptyString): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
  }
}
