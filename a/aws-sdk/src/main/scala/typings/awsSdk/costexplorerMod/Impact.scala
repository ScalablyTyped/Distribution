package typings.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Impact extends js.Object {
  
  /**
    *  The maximum dollar value observed for an anomaly. 
    */
  var MaxImpact: GenericDouble = js.native
  
  /**
    *  The cumulative dollar value observed for an anomaly. 
    */
  var TotalImpact: js.UndefOr[GenericDouble] = js.native
}
object Impact {
  
  @scala.inline
  def apply(MaxImpact: GenericDouble): Impact = {
    val __obj = js.Dynamic.literal(MaxImpact = MaxImpact.asInstanceOf[js.Any])
    __obj.asInstanceOf[Impact]
  }
  
  @scala.inline
  implicit class ImpactOps[Self <: Impact] (val x: Self) extends AnyVal {
    
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
    def setMaxImpact(value: GenericDouble): Self = this.set("MaxImpact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalImpact(value: GenericDouble): Self = this.set("TotalImpact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalImpact: Self = this.set("TotalImpact", js.undefined)
  }
}
