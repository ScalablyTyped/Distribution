package typings.awsSdk.eksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FargateProfile extends StObject {
  
  /**
    * The name of the Amazon EKS cluster that the Fargate profile belongs to.
    */
  var clusterName: js.UndefOr[String] = js.undefined
  
  /**
    * The Unix epoch timestamp in seconds for when the Fargate profile was created.
    */
  var createdAt: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The full Amazon Resource Name (ARN) of the Fargate profile.
    */
  var fargateProfileArn: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the Fargate profile.
    */
  var fargateProfileName: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the pod execution role to use for pods that match the selectors in the Fargate profile. For more information, see Pod Execution Role in the Amazon EKS User Guide.
    */
  var podExecutionRoleArn: js.UndefOr[String] = js.undefined
  
  /**
    * The selectors to match for pods to use this Fargate profile.
    */
  var selectors: js.UndefOr[FargateProfileSelectors] = js.undefined
  
  /**
    * The current status of the Fargate profile.
    */
  var status: js.UndefOr[FargateProfileStatus] = js.undefined
  
  /**
    * The IDs of subnets to launch pods into.
    */
  var subnets: js.UndefOr[StringList] = js.undefined
  
  /**
    * The metadata applied to the Fargate profile to assist with categorization and organization. Each tag consists of a key and an optional value, both of which you define. Fargate profile tags do not propagate to any other resources associated with the Fargate profile, such as the pods that are scheduled with it.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
}
object FargateProfile {
  
  inline def apply(): FargateProfile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FargateProfile]
  }
  
  extension [Self <: FargateProfile](x: Self) {
    
    inline def setClusterName(value: String): Self = StObject.set(x, "clusterName", value.asInstanceOf[js.Any])
    
    inline def setClusterNameUndefined: Self = StObject.set(x, "clusterName", js.undefined)
    
    inline def setCreatedAt(value: Timestamp): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    inline def setFargateProfileArn(value: String): Self = StObject.set(x, "fargateProfileArn", value.asInstanceOf[js.Any])
    
    inline def setFargateProfileArnUndefined: Self = StObject.set(x, "fargateProfileArn", js.undefined)
    
    inline def setFargateProfileName(value: String): Self = StObject.set(x, "fargateProfileName", value.asInstanceOf[js.Any])
    
    inline def setFargateProfileNameUndefined: Self = StObject.set(x, "fargateProfileName", js.undefined)
    
    inline def setPodExecutionRoleArn(value: String): Self = StObject.set(x, "podExecutionRoleArn", value.asInstanceOf[js.Any])
    
    inline def setPodExecutionRoleArnUndefined: Self = StObject.set(x, "podExecutionRoleArn", js.undefined)
    
    inline def setSelectors(value: FargateProfileSelectors): Self = StObject.set(x, "selectors", value.asInstanceOf[js.Any])
    
    inline def setSelectorsUndefined: Self = StObject.set(x, "selectors", js.undefined)
    
    inline def setSelectorsVarargs(value: FargateProfileSelector*): Self = StObject.set(x, "selectors", js.Array(value :_*))
    
    inline def setStatus(value: FargateProfileStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setSubnets(value: StringList): Self = StObject.set(x, "subnets", value.asInstanceOf[js.Any])
    
    inline def setSubnetsUndefined: Self = StObject.set(x, "subnets", js.undefined)
    
    inline def setSubnetsVarargs(value: String*): Self = StObject.set(x, "subnets", js.Array(value :_*))
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
