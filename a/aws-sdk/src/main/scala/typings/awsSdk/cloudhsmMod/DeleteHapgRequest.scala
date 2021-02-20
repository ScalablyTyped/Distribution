package typings.awsSdk.cloudhsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteHapgRequest extends StObject {
  
  /**
    * The ARN of the high-availability partition group to delete.
    */
  var HapgArn: typings.awsSdk.cloudhsmMod.HapgArn = js.native
}
object DeleteHapgRequest {
  
  @scala.inline
  def apply(HapgArn: HapgArn): DeleteHapgRequest = {
    val __obj = js.Dynamic.literal(HapgArn = HapgArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteHapgRequest]
  }
  
  @scala.inline
  implicit class DeleteHapgRequestMutableBuilder[Self <: DeleteHapgRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHapgArn(value: HapgArn): Self = StObject.set(x, "HapgArn", value.asInstanceOf[js.Any])
  }
}
