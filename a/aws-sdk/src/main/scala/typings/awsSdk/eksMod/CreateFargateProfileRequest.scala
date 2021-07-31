package typings.awsSdk.eksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateFargateProfileRequest extends StObject {
  
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var clientRequestToken: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the Amazon EKS cluster to apply the Fargate profile to.
    */
  var clusterName: String
  
  /**
    * The name of the Fargate profile.
    */
  var fargateProfileName: String
  
  /**
    * The Amazon Resource Name (ARN) of the pod execution role to use for pods that match the selectors in the Fargate profile. The pod execution role allows Fargate infrastructure to register with your cluster as a node, and it provides read access to Amazon ECR image repositories. For more information, see Pod Execution Role in the Amazon EKS User Guide.
    */
  var podExecutionRoleArn: String
  
  /**
    * The selectors to match for pods to use this Fargate profile. Each selector must have an associated namespace. Optionally, you can also specify labels for a namespace. You may specify up to five selectors in a Fargate profile.
    */
  var selectors: js.UndefOr[FargateProfileSelectors] = js.undefined
  
  /**
    * The IDs of subnets to launch your pods into. At this time, pods running on Fargate are not assigned public IP addresses, so only private subnets (with no direct route to an Internet Gateway) are accepted for this parameter.
    */
  var subnets: js.UndefOr[StringList] = js.undefined
  
  /**
    * The metadata to apply to the Fargate profile to assist with categorization and organization. Each tag consists of a key and an optional value, both of which you define. Fargate profile tags do not propagate to any other resources associated with the Fargate profile, such as the pods that are scheduled with it.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
}
object CreateFargateProfileRequest {
  
  @scala.inline
  def apply(clusterName: String, fargateProfileName: String, podExecutionRoleArn: String): CreateFargateProfileRequest = {
    val __obj = js.Dynamic.literal(clusterName = clusterName.asInstanceOf[js.Any], fargateProfileName = fargateProfileName.asInstanceOf[js.Any], podExecutionRoleArn = podExecutionRoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFargateProfileRequest]
  }
  
  @scala.inline
  implicit class CreateFargateProfileRequestMutableBuilder[Self <: CreateFargateProfileRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientRequestToken(value: String): Self = StObject.set(x, "clientRequestToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientRequestTokenUndefined: Self = StObject.set(x, "clientRequestToken", js.undefined)
    
    @scala.inline
    def setClusterName(value: String): Self = StObject.set(x, "clusterName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFargateProfileName(value: String): Self = StObject.set(x, "fargateProfileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPodExecutionRoleArn(value: String): Self = StObject.set(x, "podExecutionRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectors(value: FargateProfileSelectors): Self = StObject.set(x, "selectors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorsUndefined: Self = StObject.set(x, "selectors", js.undefined)
    
    @scala.inline
    def setSelectorsVarargs(value: FargateProfileSelector*): Self = StObject.set(x, "selectors", js.Array(value :_*))
    
    @scala.inline
    def setSubnets(value: StringList): Self = StObject.set(x, "subnets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetsUndefined: Self = StObject.set(x, "subnets", js.undefined)
    
    @scala.inline
    def setSubnetsVarargs(value: String*): Self = StObject.set(x, "subnets", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
