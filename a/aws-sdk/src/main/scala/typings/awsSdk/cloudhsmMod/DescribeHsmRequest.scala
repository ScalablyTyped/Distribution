package typings.awsSdk.cloudhsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeHsmRequest extends js.Object {
  
  /**
    * The ARN of the HSM. Either the HsmArn or the SerialNumber parameter must be specified.
    */
  var HsmArn: js.UndefOr[typings.awsSdk.cloudhsmMod.HsmArn] = js.native
  
  /**
    * The serial number of the HSM. Either the HsmArn or the HsmSerialNumber parameter must be specified.
    */
  var HsmSerialNumber: js.UndefOr[typings.awsSdk.cloudhsmMod.HsmSerialNumber] = js.native
}
object DescribeHsmRequest {
  
  @scala.inline
  def apply(): DescribeHsmRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeHsmRequest]
  }
  
  @scala.inline
  implicit class DescribeHsmRequestOps[Self <: DescribeHsmRequest] (val x: Self) extends AnyVal {
    
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
    def setHsmArn(value: HsmArn): Self = this.set("HsmArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHsmArn: Self = this.set("HsmArn", js.undefined)
    
    @scala.inline
    def setHsmSerialNumber(value: HsmSerialNumber): Self = this.set("HsmSerialNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHsmSerialNumber: Self = this.set("HsmSerialNumber", js.undefined)
  }
}
