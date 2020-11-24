package typings.awsSdk.elasticinferenceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeAcceleratorTypesResponse extends js.Object {
  
  /**
    *  The available accelerator types. 
    */
  var acceleratorTypes: js.UndefOr[AcceleratorTypeList] = js.native
}
object DescribeAcceleratorTypesResponse {
  
  @scala.inline
  def apply(): DescribeAcceleratorTypesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAcceleratorTypesResponse]
  }
  
  @scala.inline
  implicit class DescribeAcceleratorTypesResponseOps[Self <: DescribeAcceleratorTypesResponse] (val x: Self) extends AnyVal {
    
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
    def setAcceleratorTypesVarargs(value: AcceleratorType*): Self = this.set("acceleratorTypes", js.Array(value :_*))
    
    @scala.inline
    def setAcceleratorTypes(value: AcceleratorTypeList): Self = this.set("acceleratorTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAcceleratorTypes: Self = this.set("acceleratorTypes", js.undefined)
  }
}
