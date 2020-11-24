package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UsageLimit extends js.Object {
  
  /**
    * The limit amount. If time-based, this amount is in minutes. If data-based, this amount is in terabytes (TB).
    */
  var Amount: js.UndefOr[Long] = js.native
  
  /**
    * The action that Amazon Redshift takes when the limit is reached. Possible values are:     log - To log an event in a system table. The default is log.    emit-metric - To emit CloudWatch metrics.    disable - To disable the feature until the next usage period begins.  
    */
  var BreachAction: js.UndefOr[UsageLimitBreachAction] = js.native
  
  /**
    * The identifier of the cluster with a usage limit.
    */
  var ClusterIdentifier: js.UndefOr[String] = js.native
  
  /**
    * The Amazon Redshift feature to which the limit applies.
    */
  var FeatureType: js.UndefOr[UsageLimitFeatureType] = js.native
  
  /**
    * The type of limit. Depending on the feature type, this can be based on a time duration or data size.
    */
  var LimitType: js.UndefOr[UsageLimitLimitType] = js.native
  
  /**
    * The time period that the amount applies to. A weekly period begins on Sunday. The default is monthly. 
    */
  var Period: js.UndefOr[UsageLimitPeriod] = js.native
  
  /**
    * A list of tag instances.
    */
  var Tags: js.UndefOr[TagList] = js.native
  
  /**
    * The identifier of the usage limit.
    */
  var UsageLimitId: js.UndefOr[String] = js.native
}
object UsageLimit {
  
  @scala.inline
  def apply(): UsageLimit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UsageLimit]
  }
  
  @scala.inline
  implicit class UsageLimitOps[Self <: UsageLimit] (val x: Self) extends AnyVal {
    
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
    def setAmount(value: Long): Self = this.set("Amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAmount: Self = this.set("Amount", js.undefined)
    
    @scala.inline
    def setBreachAction(value: UsageLimitBreachAction): Self = this.set("BreachAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBreachAction: Self = this.set("BreachAction", js.undefined)
    
    @scala.inline
    def setClusterIdentifier(value: String): Self = this.set("ClusterIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClusterIdentifier: Self = this.set("ClusterIdentifier", js.undefined)
    
    @scala.inline
    def setFeatureType(value: UsageLimitFeatureType): Self = this.set("FeatureType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFeatureType: Self = this.set("FeatureType", js.undefined)
    
    @scala.inline
    def setLimitType(value: UsageLimitLimitType): Self = this.set("LimitType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimitType: Self = this.set("LimitType", js.undefined)
    
    @scala.inline
    def setPeriod(value: UsageLimitPeriod): Self = this.set("Period", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePeriod: Self = this.set("Period", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
    
    @scala.inline
    def setUsageLimitId(value: String): Self = this.set("UsageLimitId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsageLimitId: Self = this.set("UsageLimitId", js.undefined)
  }
}
