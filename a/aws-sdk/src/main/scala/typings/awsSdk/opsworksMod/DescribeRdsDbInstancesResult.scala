package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeRdsDbInstancesResult extends js.Object {
  
  /**
    * An a array of RdsDbInstance objects that describe the instances.
    */
  var RdsDbInstances: js.UndefOr[typings.awsSdk.opsworksMod.RdsDbInstances] = js.native
}
object DescribeRdsDbInstancesResult {
  
  @scala.inline
  def apply(): DescribeRdsDbInstancesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeRdsDbInstancesResult]
  }
  
  @scala.inline
  implicit class DescribeRdsDbInstancesResultOps[Self <: DescribeRdsDbInstancesResult] (val x: Self) extends AnyVal {
    
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
    def setRdsDbInstancesVarargs(value: RdsDbInstance*): Self = this.set("RdsDbInstances", js.Array(value :_*))
    
    @scala.inline
    def setRdsDbInstances(value: RdsDbInstances): Self = this.set("RdsDbInstances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRdsDbInstances: Self = this.set("RdsDbInstances", js.undefined)
  }
}
