package typings.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TotalImpactFilter extends js.Object {
  
  /**
    *  The upper bound dollar value used in the filter. 
    */
  var EndValue: js.UndefOr[GenericDouble] = js.native
  
  /**
    *  The comparing value used in the filter. 
    */
  var NumericOperator: typings.awsSdk.costexplorerMod.NumericOperator = js.native
  
  /**
    *  The lower bound dollar value used in the filter. 
    */
  var StartValue: GenericDouble = js.native
}
object TotalImpactFilter {
  
  @scala.inline
  def apply(NumericOperator: NumericOperator, StartValue: GenericDouble): TotalImpactFilter = {
    val __obj = js.Dynamic.literal(NumericOperator = NumericOperator.asInstanceOf[js.Any], StartValue = StartValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[TotalImpactFilter]
  }
  
  @scala.inline
  implicit class TotalImpactFilterOps[Self <: TotalImpactFilter] (val x: Self) extends AnyVal {
    
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
    def setNumericOperator(value: NumericOperator): Self = this.set("NumericOperator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartValue(value: GenericDouble): Self = this.set("StartValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndValue(value: GenericDouble): Self = this.set("EndValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndValue: Self = this.set("EndValue", js.undefined)
  }
}
