package typings.awsSdk.clientsWafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManagedRuleSetVersion extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the vendor rule group that's used to define the published version of your managed rule group. 
    */
  var AssociatedRuleGroupArn: js.UndefOr[ResourceArn] = js.undefined
  
  /**
    * The web ACL capacity units (WCUs) required for this rule group. WAF uses WCUs to calculate and control the operating resources that are used to run your rules, rule groups, and web ACLs. WAF calculates capacity differently for each rule type, to reflect the relative cost of each rule. Simple rules that cost little to run use fewer WCUs than more complex rules that use more processing power. Rule group capacity is fixed at creation, which helps users plan their web ACL WCU usage when they use a rule group. The WCU limit for web ACLs is 1,500. 
    */
  var Capacity: js.UndefOr[CapacityUnit] = js.undefined
  
  /**
    * The time that this version is set to expire. Times are in Coordinated Universal Time (UTC) format. UTC format includes the special designator, Z. For example, "2016-09-27T14:50Z". 
    */
  var ExpiryTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The amount of time you expect this version of your managed rule group to last, in days. 
    */
  var ForecastedLifetime: js.UndefOr[TimeWindowDay] = js.undefined
  
  /**
    * The last time that you updated this version.  Times are in Coordinated Universal Time (UTC) format. UTC format includes the special designator, Z. For example, "2016-09-27T14:50Z". 
    */
  var LastUpdateTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The time that you first published this version.  Times are in Coordinated Universal Time (UTC) format. UTC format includes the special designator, Z. For example, "2016-09-27T14:50Z". 
    */
  var PublishTimestamp: js.UndefOr[js.Date] = js.undefined
}
object ManagedRuleSetVersion {
  
  inline def apply(): ManagedRuleSetVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedRuleSetVersion]
  }
  
  extension [Self <: ManagedRuleSetVersion](x: Self) {
    
    inline def setAssociatedRuleGroupArn(value: ResourceArn): Self = StObject.set(x, "AssociatedRuleGroupArn", value.asInstanceOf[js.Any])
    
    inline def setAssociatedRuleGroupArnUndefined: Self = StObject.set(x, "AssociatedRuleGroupArn", js.undefined)
    
    inline def setCapacity(value: CapacityUnit): Self = StObject.set(x, "Capacity", value.asInstanceOf[js.Any])
    
    inline def setCapacityUndefined: Self = StObject.set(x, "Capacity", js.undefined)
    
    inline def setExpiryTimestamp(value: js.Date): Self = StObject.set(x, "ExpiryTimestamp", value.asInstanceOf[js.Any])
    
    inline def setExpiryTimestampUndefined: Self = StObject.set(x, "ExpiryTimestamp", js.undefined)
    
    inline def setForecastedLifetime(value: TimeWindowDay): Self = StObject.set(x, "ForecastedLifetime", value.asInstanceOf[js.Any])
    
    inline def setForecastedLifetimeUndefined: Self = StObject.set(x, "ForecastedLifetime", js.undefined)
    
    inline def setLastUpdateTimestamp(value: js.Date): Self = StObject.set(x, "LastUpdateTimestamp", value.asInstanceOf[js.Any])
    
    inline def setLastUpdateTimestampUndefined: Self = StObject.set(x, "LastUpdateTimestamp", js.undefined)
    
    inline def setPublishTimestamp(value: js.Date): Self = StObject.set(x, "PublishTimestamp", value.asInstanceOf[js.Any])
    
    inline def setPublishTimestampUndefined: Self = StObject.set(x, "PublishTimestamp", js.undefined)
  }
}
