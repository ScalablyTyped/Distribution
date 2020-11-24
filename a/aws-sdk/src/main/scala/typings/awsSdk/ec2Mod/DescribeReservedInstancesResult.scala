package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeReservedInstancesResult extends js.Object {
  
  /**
    * A list of Reserved Instances.
    */
  var ReservedInstances: js.UndefOr[ReservedInstancesList] = js.native
}
object DescribeReservedInstancesResult {
  
  @scala.inline
  def apply(): DescribeReservedInstancesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeReservedInstancesResult]
  }
  
  @scala.inline
  implicit class DescribeReservedInstancesResultOps[Self <: DescribeReservedInstancesResult] (val x: Self) extends AnyVal {
    
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
    def setReservedInstancesVarargs(value: ReservedInstances*): Self = this.set("ReservedInstances", js.Array(value :_*))
    
    @scala.inline
    def setReservedInstances(value: ReservedInstancesList): Self = this.set("ReservedInstances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReservedInstances: Self = this.set("ReservedInstances", js.undefined)
  }
}
