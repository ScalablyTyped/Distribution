package typings.awsSdk.eksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FargateProfile extends js.Object {
  
  /**
    * The name of the Amazon EKS cluster that the Fargate profile belongs to.
    */
  var clusterName: js.UndefOr[String] = js.native
  
  /**
    * The Unix epoch timestamp in seconds for when the Fargate profile was created.
    */
  var createdAt: js.UndefOr[Timestamp] = js.native
  
  /**
    * The full Amazon Resource Name (ARN) of the Fargate profile.
    */
  var fargateProfileArn: js.UndefOr[String] = js.native
  
  /**
    * The name of the Fargate profile.
    */
  var fargateProfileName: js.UndefOr[String] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the pod execution role to use for pods that match the selectors in the Fargate profile. For more information, see Pod Execution Role in the Amazon EKS User Guide.
    */
  var podExecutionRoleArn: js.UndefOr[String] = js.native
  
  /**
    * The selectors to match for pods to use this Fargate profile.
    */
  var selectors: js.UndefOr[FargateProfileSelectors] = js.native
  
  /**
    * The current status of the Fargate profile.
    */
  var status: js.UndefOr[FargateProfileStatus] = js.native
  
  /**
    * The IDs of subnets to launch pods into.
    */
  var subnets: js.UndefOr[StringList] = js.native
  
  /**
    * The metadata applied to the Fargate profile to assist with categorization and organization. Each tag consists of a key and an optional value, both of which you define. Fargate profile tags do not propagate to any other resources associated with the Fargate profile, such as the pods that are scheduled with it.
    */
  var tags: js.UndefOr[TagMap] = js.native
}
object FargateProfile {
  
  @scala.inline
  def apply(): FargateProfile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FargateProfile]
  }
  
  @scala.inline
  implicit class FargateProfileOps[Self <: FargateProfile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClusterName(value: String): Self = this.set("clusterName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClusterName: Self = this.set("clusterName", js.undefined)
    
    @scala.inline
    def setCreatedAt(value: Timestamp): Self = this.set("createdAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedAt: Self = this.set("createdAt", js.undefined)
    
    @scala.inline
    def setFargateProfileArn(value: String): Self = this.set("fargateProfileArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFargateProfileArn: Self = this.set("fargateProfileArn", js.undefined)
    
    @scala.inline
    def setFargateProfileName(value: String): Self = this.set("fargateProfileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFargateProfileName: Self = this.set("fargateProfileName", js.undefined)
    
    @scala.inline
    def setPodExecutionRoleArn(value: String): Self = this.set("podExecutionRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePodExecutionRoleArn: Self = this.set("podExecutionRoleArn", js.undefined)
    
    @scala.inline
    def setSelectorsVarargs(value: FargateProfileSelector*): Self = this.set("selectors", js.Array(value :_*))
    
    @scala.inline
    def setSelectors(value: FargateProfileSelectors): Self = this.set("selectors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectors: Self = this.set("selectors", js.undefined)
    
    @scala.inline
    def setStatus(value: FargateProfileStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setSubnetsVarargs(value: String*): Self = this.set("subnets", js.Array(value :_*))
    
    @scala.inline
    def setSubnets(value: StringList): Self = this.set("subnets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubnets: Self = this.set("subnets", js.undefined)
    
    @scala.inline
    def setTags(value: TagMap): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
