package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeRaidArraysResult extends js.Object {
  
  /**
    * A RaidArrays object that describes the specified RAID arrays.
    */
  var RaidArrays: js.UndefOr[typings.awsSdk.opsworksMod.RaidArrays] = js.native
}
object DescribeRaidArraysResult {
  
  @scala.inline
  def apply(): DescribeRaidArraysResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeRaidArraysResult]
  }
  
  @scala.inline
  implicit class DescribeRaidArraysResultOps[Self <: DescribeRaidArraysResult] (val x: Self) extends AnyVal {
    
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
    def setRaidArraysVarargs(value: RaidArray*): Self = this.set("RaidArrays", js.Array(value :_*))
    
    @scala.inline
    def setRaidArrays(value: RaidArrays): Self = this.set("RaidArrays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRaidArrays: Self = this.set("RaidArrays", js.undefined)
  }
}
