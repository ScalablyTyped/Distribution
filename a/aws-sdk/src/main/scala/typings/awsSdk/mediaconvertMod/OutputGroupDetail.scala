package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OutputGroupDetail extends js.Object {
  
  /**
    * Details about the output
    */
  var OutputDetails: js.UndefOr[listOfOutputDetail] = js.native
}
object OutputGroupDetail {
  
  @scala.inline
  def apply(): OutputGroupDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutputGroupDetail]
  }
  
  @scala.inline
  implicit class OutputGroupDetailOps[Self <: OutputGroupDetail] (val x: Self) extends AnyVal {
    
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
    def setOutputDetailsVarargs(value: OutputDetail*): Self = this.set("OutputDetails", js.Array(value :_*))
    
    @scala.inline
    def setOutputDetails(value: listOfOutputDetail): Self = this.set("OutputDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputDetails: Self = this.set("OutputDetails", js.undefined)
  }
}
