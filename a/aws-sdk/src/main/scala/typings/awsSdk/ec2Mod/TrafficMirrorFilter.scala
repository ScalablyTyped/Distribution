package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrafficMirrorFilter extends StObject {
  
  /**
    * The description of the Traffic Mirror filter.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * Information about the egress rules that are associated with the Traffic Mirror filter.
    */
  var EgressFilterRules: js.UndefOr[TrafficMirrorFilterRuleList] = js.undefined
  
  /**
    * Information about the ingress rules that are associated with the Traffic Mirror filter.
    */
  var IngressFilterRules: js.UndefOr[TrafficMirrorFilterRuleList] = js.undefined
  
  /**
    * The network service traffic that is associated with the Traffic Mirror filter.
    */
  var NetworkServices: js.UndefOr[TrafficMirrorNetworkServiceList] = js.undefined
  
  /**
    * The tags assigned to the Traffic Mirror filter.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The ID of the Traffic Mirror filter.
    */
  var TrafficMirrorFilterId: js.UndefOr[String] = js.undefined
}
object TrafficMirrorFilter {
  
  @scala.inline
  def apply(): TrafficMirrorFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrafficMirrorFilter]
  }
  
  @scala.inline
  implicit class TrafficMirrorFilterMutableBuilder[Self <: TrafficMirrorFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setEgressFilterRules(value: TrafficMirrorFilterRuleList): Self = StObject.set(x, "EgressFilterRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEgressFilterRulesUndefined: Self = StObject.set(x, "EgressFilterRules", js.undefined)
    
    @scala.inline
    def setEgressFilterRulesVarargs(value: TrafficMirrorFilterRule*): Self = StObject.set(x, "EgressFilterRules", js.Array(value :_*))
    
    @scala.inline
    def setIngressFilterRules(value: TrafficMirrorFilterRuleList): Self = StObject.set(x, "IngressFilterRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIngressFilterRulesUndefined: Self = StObject.set(x, "IngressFilterRules", js.undefined)
    
    @scala.inline
    def setIngressFilterRulesVarargs(value: TrafficMirrorFilterRule*): Self = StObject.set(x, "IngressFilterRules", js.Array(value :_*))
    
    @scala.inline
    def setNetworkServices(value: TrafficMirrorNetworkServiceList): Self = StObject.set(x, "NetworkServices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkServicesUndefined: Self = StObject.set(x, "NetworkServices", js.undefined)
    
    @scala.inline
    def setNetworkServicesVarargs(value: TrafficMirrorNetworkService*): Self = StObject.set(x, "NetworkServices", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    
    @scala.inline
    def setTrafficMirrorFilterId(value: String): Self = StObject.set(x, "TrafficMirrorFilterId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrafficMirrorFilterIdUndefined: Self = StObject.set(x, "TrafficMirrorFilterId", js.undefined)
  }
}
