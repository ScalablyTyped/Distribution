package typings.awsSdk.eksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeFargateProfileRequest extends StObject {
  
  /**
    * The name of the Amazon EKS cluster associated with the Fargate profile.
    */
  var clusterName: String
  
  /**
    * The name of the Fargate profile to describe.
    */
  var fargateProfileName: String
}
object DescribeFargateProfileRequest {
  
  inline def apply(clusterName: String, fargateProfileName: String): DescribeFargateProfileRequest = {
    val __obj = js.Dynamic.literal(clusterName = clusterName.asInstanceOf[js.Any], fargateProfileName = fargateProfileName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeFargateProfileRequest]
  }
  
  extension [Self <: DescribeFargateProfileRequest](x: Self) {
    
    inline def setClusterName(value: String): Self = StObject.set(x, "clusterName", value.asInstanceOf[js.Any])
    
    inline def setFargateProfileName(value: String): Self = StObject.set(x, "fargateProfileName", value.asInstanceOf[js.Any])
  }
}
