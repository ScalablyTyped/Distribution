package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeRaidArraysRequest extends js.Object {
  
  /**
    * The instance ID. If you use this parameter, DescribeRaidArrays returns descriptions of the RAID arrays associated with the specified instance. 
    */
  var InstanceId: js.UndefOr[String] = js.native
  
  /**
    * An array of RAID array IDs. If you use this parameter, DescribeRaidArrays returns descriptions of the specified arrays. Otherwise, it returns a description of every array.
    */
  var RaidArrayIds: js.UndefOr[Strings] = js.native
  
  /**
    * The stack ID.
    */
  var StackId: js.UndefOr[String] = js.native
}
object DescribeRaidArraysRequest {
  
  @scala.inline
  def apply(): DescribeRaidArraysRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeRaidArraysRequest]
  }
  
  @scala.inline
  implicit class DescribeRaidArraysRequestOps[Self <: DescribeRaidArraysRequest] (val x: Self) extends AnyVal {
    
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
    def setInstanceId(value: String): Self = this.set("InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceId: Self = this.set("InstanceId", js.undefined)
    
    @scala.inline
    def setRaidArrayIdsVarargs(value: String*): Self = this.set("RaidArrayIds", js.Array(value :_*))
    
    @scala.inline
    def setRaidArrayIds(value: Strings): Self = this.set("RaidArrayIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRaidArrayIds: Self = this.set("RaidArrayIds", js.undefined)
    
    @scala.inline
    def setStackId(value: String): Self = this.set("StackId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStackId: Self = this.set("StackId", js.undefined)
  }
}
