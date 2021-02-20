package typings.awsSdk.globalacceleratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteAcceleratorRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of an accelerator.
    */
  var AcceleratorArn: GenericString = js.native
}
object DeleteAcceleratorRequest {
  
  @scala.inline
  def apply(AcceleratorArn: GenericString): DeleteAcceleratorRequest = {
    val __obj = js.Dynamic.literal(AcceleratorArn = AcceleratorArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAcceleratorRequest]
  }
  
  @scala.inline
  implicit class DeleteAcceleratorRequestMutableBuilder[Self <: DeleteAcceleratorRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcceleratorArn(value: GenericString): Self = StObject.set(x, "AcceleratorArn", value.asInstanceOf[js.Any])
  }
}
