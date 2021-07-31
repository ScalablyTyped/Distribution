package typings.awsSdk.globalacceleratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAcceleratorRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the accelerator to describe.
    */
  var AcceleratorArn: GenericString
}
object DescribeAcceleratorRequest {
  
  @scala.inline
  def apply(AcceleratorArn: GenericString): DescribeAcceleratorRequest = {
    val __obj = js.Dynamic.literal(AcceleratorArn = AcceleratorArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAcceleratorRequest]
  }
  
  @scala.inline
  implicit class DescribeAcceleratorRequestMutableBuilder[Self <: DescribeAcceleratorRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcceleratorArn(value: GenericString): Self = StObject.set(x, "AcceleratorArn", value.asInstanceOf[js.Any])
  }
}
