package typings.awsSdk.shieldMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttackDetail extends StObject {
  
  /**
    * List of counters that describe the attack for the specified time period.
    */
  var AttackCounters: js.UndefOr[SummarizedCounterList] = js.undefined
  
  /**
    * The unique identifier (ID) of the attack.
    */
  var AttackId: js.UndefOr[typings.awsSdk.shieldMod.AttackId] = js.undefined
  
  /**
    * The array of AttackProperty objects.
    */
  var AttackProperties: js.UndefOr[typings.awsSdk.shieldMod.AttackProperties] = js.undefined
  
  /**
    * The time the attack ended, in Unix time in seconds. For more information see timestamp.
    */
  var EndTime: js.UndefOr[AttackTimestamp] = js.undefined
  
  /**
    * List of mitigation actions taken for the attack.
    */
  var Mitigations: js.UndefOr[MitigationList] = js.undefined
  
  /**
    * The ARN (Amazon Resource Name) of the resource that was attacked.
    */
  var ResourceArn: js.UndefOr[typings.awsSdk.shieldMod.ResourceArn] = js.undefined
  
  /**
    * The time the attack started, in Unix time in seconds. For more information see timestamp.
    */
  var StartTime: js.UndefOr[AttackTimestamp] = js.undefined
  
  /**
    * If applicable, additional detail about the resource being attacked, for example, IP address or URL.
    */
  var SubResources: js.UndefOr[SubResourceSummaryList] = js.undefined
}
object AttackDetail {
  
  @scala.inline
  def apply(): AttackDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttackDetail]
  }
  
  @scala.inline
  implicit class AttackDetailMutableBuilder[Self <: AttackDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttackCounters(value: SummarizedCounterList): Self = StObject.set(x, "AttackCounters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttackCountersUndefined: Self = StObject.set(x, "AttackCounters", js.undefined)
    
    @scala.inline
    def setAttackCountersVarargs(value: SummarizedCounter*): Self = StObject.set(x, "AttackCounters", js.Array(value :_*))
    
    @scala.inline
    def setAttackId(value: AttackId): Self = StObject.set(x, "AttackId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttackIdUndefined: Self = StObject.set(x, "AttackId", js.undefined)
    
    @scala.inline
    def setAttackProperties(value: AttackProperties): Self = StObject.set(x, "AttackProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttackPropertiesUndefined: Self = StObject.set(x, "AttackProperties", js.undefined)
    
    @scala.inline
    def setAttackPropertiesVarargs(value: AttackProperty*): Self = StObject.set(x, "AttackProperties", js.Array(value :_*))
    
    @scala.inline
    def setEndTime(value: AttackTimestamp): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
    
    @scala.inline
    def setMitigations(value: MitigationList): Self = StObject.set(x, "Mitigations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMitigationsUndefined: Self = StObject.set(x, "Mitigations", js.undefined)
    
    @scala.inline
    def setMitigationsVarargs(value: Mitigation*): Self = StObject.set(x, "Mitigations", js.Array(value :_*))
    
    @scala.inline
    def setResourceArn(value: ResourceArn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceArnUndefined: Self = StObject.set(x, "ResourceArn", js.undefined)
    
    @scala.inline
    def setStartTime(value: AttackTimestamp): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
    
    @scala.inline
    def setSubResources(value: SubResourceSummaryList): Self = StObject.set(x, "SubResources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubResourcesUndefined: Self = StObject.set(x, "SubResources", js.undefined)
    
    @scala.inline
    def setSubResourcesVarargs(value: SubResourceSummary*): Self = StObject.set(x, "SubResources", js.Array(value :_*))
  }
}
