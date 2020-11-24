package typings.awsSdk.cloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScalingParameters extends js.Object {
  
  /**
    * The instance type that you want to preconfigure for your domain. For example, search.m1.small.
    */
  var DesiredInstanceType: js.UndefOr[PartitionInstanceType] = js.native
  
  /**
    * The number of partitions you want to preconfigure for your domain. Only valid when you select m2.2xlarge as the desired instance type.
    */
  var DesiredPartitionCount: js.UndefOr[UIntValue] = js.native
  
  /**
    * The number of replicas you want to preconfigure for each index partition.
    */
  var DesiredReplicationCount: js.UndefOr[UIntValue] = js.native
}
object ScalingParameters {
  
  @scala.inline
  def apply(): ScalingParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScalingParameters]
  }
  
  @scala.inline
  implicit class ScalingParametersOps[Self <: ScalingParameters] (val x: Self) extends AnyVal {
    
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
    def setDesiredInstanceType(value: PartitionInstanceType): Self = this.set("DesiredInstanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDesiredInstanceType: Self = this.set("DesiredInstanceType", js.undefined)
    
    @scala.inline
    def setDesiredPartitionCount(value: UIntValue): Self = this.set("DesiredPartitionCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDesiredPartitionCount: Self = this.set("DesiredPartitionCount", js.undefined)
    
    @scala.inline
    def setDesiredReplicationCount(value: UIntValue): Self = this.set("DesiredReplicationCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDesiredReplicationCount: Self = this.set("DesiredReplicationCount", js.undefined)
  }
}
