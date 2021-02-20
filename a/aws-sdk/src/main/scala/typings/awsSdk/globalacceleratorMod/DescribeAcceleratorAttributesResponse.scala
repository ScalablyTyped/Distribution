package typings.awsSdk.globalacceleratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeAcceleratorAttributesResponse extends StObject {
  
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
  implicit class DescribeAcceleratorAttributesResponseMutableBuilder[Self <: DescribeAcceleratorAttributesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcceleratorAttributes(value: AcceleratorAttributes): Self = StObject.set(x, "AcceleratorAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceleratorAttributesUndefined: Self = StObject.set(x, "AcceleratorAttributes", js.undefined)
  }
}
