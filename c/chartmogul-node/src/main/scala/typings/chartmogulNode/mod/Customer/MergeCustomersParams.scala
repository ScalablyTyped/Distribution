package typings.chartmogulNode.mod.Customer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MergeCustomersParams extends js.Object {
  
  var from: MergeID = js.native
  
  var into: MergeID = js.native
}
object MergeCustomersParams {
  
  @scala.inline
  def apply(from: MergeID, into: MergeID): MergeCustomersParams = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], into = into.asInstanceOf[js.Any])
    __obj.asInstanceOf[MergeCustomersParams]
  }
  
  @scala.inline
  implicit class MergeCustomersParamsOps[Self <: MergeCustomersParams] (val x: Self) extends AnyVal {
    
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
    def setFrom(value: MergeID): Self = this.set("from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInto(value: MergeID): Self = this.set("into", value.asInstanceOf[js.Any])
  }
}
