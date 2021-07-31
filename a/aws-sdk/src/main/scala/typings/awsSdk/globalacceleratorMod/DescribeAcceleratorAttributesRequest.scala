package typings.awsSdk.globalacceleratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAcceleratorAttributesRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the accelerator with the attributes that you want to describe.
    */
  var AcceleratorArn: GenericString
}
object DescribeAcceleratorAttributesRequest {
  
  @scala.inline
  def apply(AcceleratorArn: GenericString): DescribeAcceleratorAttributesRequest = {
    val __obj = js.Dynamic.literal(AcceleratorArn = AcceleratorArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAcceleratorAttributesRequest]
  }
  
  @scala.inline
  implicit class DescribeAcceleratorAttributesRequestMutableBuilder[Self <: DescribeAcceleratorAttributesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcceleratorArn(value: GenericString): Self = StObject.set(x, "AcceleratorArn", value.asInstanceOf[js.Any])
  }
}
