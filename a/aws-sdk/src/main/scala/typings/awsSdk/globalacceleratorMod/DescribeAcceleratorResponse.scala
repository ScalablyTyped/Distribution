package typings.awsSdk.globalacceleratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeAcceleratorResponse extends StObject {
  
  /**
    * The description of the accelerator.
    */
  var Accelerator: js.UndefOr[typings.awsSdk.globalacceleratorMod.Accelerator] = js.native
}
object DescribeAcceleratorResponse {
  
  @scala.inline
  def apply(): DescribeAcceleratorResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAcceleratorResponse]
  }
  
  @scala.inline
  implicit class DescribeAcceleratorResponseMutableBuilder[Self <: DescribeAcceleratorResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccelerator(value: Accelerator): Self = StObject.set(x, "Accelerator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceleratorUndefined: Self = StObject.set(x, "Accelerator", js.undefined)
  }
}
