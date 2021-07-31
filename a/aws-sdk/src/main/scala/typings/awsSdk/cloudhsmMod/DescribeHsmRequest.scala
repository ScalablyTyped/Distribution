package typings.awsSdk.cloudhsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeHsmRequest extends StObject {
  
  /**
    * The ARN of the HSM. Either the HsmArn or the SerialNumber parameter must be specified.
    */
  var HsmArn: js.UndefOr[typings.awsSdk.cloudhsmMod.HsmArn] = js.undefined
  
  /**
    * The serial number of the HSM. Either the HsmArn or the HsmSerialNumber parameter must be specified.
    */
  var HsmSerialNumber: js.UndefOr[typings.awsSdk.cloudhsmMod.HsmSerialNumber] = js.undefined
}
object DescribeHsmRequest {
  
  @scala.inline
  def apply(): DescribeHsmRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeHsmRequest]
  }
  
  @scala.inline
  implicit class DescribeHsmRequestMutableBuilder[Self <: DescribeHsmRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHsmArn(value: HsmArn): Self = StObject.set(x, "HsmArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHsmArnUndefined: Self = StObject.set(x, "HsmArn", js.undefined)
    
    @scala.inline
    def setHsmSerialNumber(value: HsmSerialNumber): Self = StObject.set(x, "HsmSerialNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHsmSerialNumberUndefined: Self = StObject.set(x, "HsmSerialNumber", js.undefined)
  }
}
