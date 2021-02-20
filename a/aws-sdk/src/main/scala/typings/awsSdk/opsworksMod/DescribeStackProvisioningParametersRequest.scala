package typings.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeStackProvisioningParametersRequest extends StObject {
  
  /**
    * The stack ID.
    */
  var StackId: String = js.native
}
object DescribeStackProvisioningParametersRequest {
  
  @scala.inline
  def apply(StackId: String): DescribeStackProvisioningParametersRequest = {
    val __obj = js.Dynamic.literal(StackId = StackId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeStackProvisioningParametersRequest]
  }
  
  @scala.inline
  implicit class DescribeStackProvisioningParametersRequestMutableBuilder[Self <: DescribeStackProvisioningParametersRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStackId(value: String): Self = StObject.set(x, "StackId", value.asInstanceOf[js.Any])
  }
}
