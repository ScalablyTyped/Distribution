package typings.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReusableDelegationSetLimit extends js.Object {
  
  /**
    * The limit that you requested: MAX_ZONES_BY_REUSABLE_DELEGATION_SET, the maximum number of hosted zones that you can associate with the specified reusable delegation set.
    */
  var Type: ReusableDelegationSetLimitType = js.native
  
  /**
    * The current value for the MAX_ZONES_BY_REUSABLE_DELEGATION_SET limit.
    */
  var Value: LimitValue = js.native
}
object ReusableDelegationSetLimit {
  
  @scala.inline
  def apply(Type: ReusableDelegationSetLimitType, Value: LimitValue): ReusableDelegationSetLimit = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReusableDelegationSetLimit]
  }
  
  @scala.inline
  implicit class ReusableDelegationSetLimitOps[Self <: ReusableDelegationSetLimit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setType(value: ReusableDelegationSetLimitType): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: LimitValue): Self = this.set("Value", value.asInstanceOf[js.Any])
  }
}
