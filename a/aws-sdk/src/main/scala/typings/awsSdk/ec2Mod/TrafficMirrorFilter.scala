package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TrafficMirrorFilter extends js.Object {
  
  /**
    * The description of the Traffic Mirror filter.
    */
  var Description: js.UndefOr[String] = js.native
  
  /**
    * Information about the egress rules that are associated with the Traffic Mirror filter.
    */
  var EgressFilterRules: js.UndefOr[TrafficMirrorFilterRuleList] = js.native
  
  /**
    * Information about the ingress rules that are associated with the Traffic Mirror filter.
    */
  var IngressFilterRules: js.UndefOr[TrafficMirrorFilterRuleList] = js.native
  
  /**
    * The network service traffic that is associated with the Traffic Mirror filter.
    */
  var NetworkServices: js.UndefOr[TrafficMirrorNetworkServiceList] = js.native
  
  /**
    * The tags assigned to the Traffic Mirror filter.
    */
  var Tags: js.UndefOr[TagList] = js.native
  
  /**
    * The ID of the Traffic Mirror filter.
    */
  var TrafficMirrorFilterId: js.UndefOr[String] = js.native
}
object TrafficMirrorFilter {
  
  @scala.inline
  def apply(): TrafficMirrorFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrafficMirrorFilter]
  }
  
  @scala.inline
  implicit class TrafficMirrorFilterOps[Self <: TrafficMirrorFilter] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setEgressFilterRulesVarargs(value: TrafficMirrorFilterRule*): Self = this.set("EgressFilterRules", js.Array(value :_*))
    
    @scala.inline
    def setEgressFilterRules(value: TrafficMirrorFilterRuleList): Self = this.set("EgressFilterRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEgressFilterRules: Self = this.set("EgressFilterRules", js.undefined)
    
    @scala.inline
    def setIngressFilterRulesVarargs(value: TrafficMirrorFilterRule*): Self = this.set("IngressFilterRules", js.Array(value :_*))
    
    @scala.inline
    def setIngressFilterRules(value: TrafficMirrorFilterRuleList): Self = this.set("IngressFilterRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIngressFilterRules: Self = this.set("IngressFilterRules", js.undefined)
    
    @scala.inline
    def setNetworkServicesVarargs(value: TrafficMirrorNetworkService*): Self = this.set("NetworkServices", js.Array(value :_*))
    
    @scala.inline
    def setNetworkServices(value: TrafficMirrorNetworkServiceList): Self = this.set("NetworkServices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkServices: Self = this.set("NetworkServices", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
    
    @scala.inline
    def setTrafficMirrorFilterId(value: String): Self = this.set("TrafficMirrorFilterId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrafficMirrorFilterId: Self = this.set("TrafficMirrorFilterId", js.undefined)
  }
}
