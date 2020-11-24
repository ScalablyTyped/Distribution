package typings.awsSdk.globalacceleratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeAcceleratorAttributesResponse extends js.Object {
  
  /**
    * The attributes of the accelerator.
    */
  var AcceleratorAttributes: js.UndefOr[typings.awsSdk.globalacceleratorMod.AcceleratorAttributes] = js.native
}
object DescribeAcceleratorAttributesResponse {
  
  @scala.inline
  def apply(): DescribeAcceleratorAttributesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAcceleratorAttributesResponse]
  }
  
  @scala.inline
  implicit class DescribeAcceleratorAttributesResponseOps[Self <: DescribeAcceleratorAttributesResponse] (val x: Self) extends AnyVal {
    
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
    def setAcceleratorAttributes(value: AcceleratorAttributes): Self = this.set("AcceleratorAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAcceleratorAttributes: Self = this.set("AcceleratorAttributes", js.undefined)
  }
}
