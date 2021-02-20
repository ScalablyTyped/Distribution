package typings.awsSdk.inspectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateResourceGroupResponse extends StObject {
  
  /**
    * The ARN that specifies the resource group that is created.
    */
  var resourceGroupArn: Arn = js.native
}
object CreateResourceGroupResponse {
  
  @scala.inline
  def apply(resourceGroupArn: Arn): CreateResourceGroupResponse = {
    val __obj = js.Dynamic.literal(resourceGroupArn = resourceGroupArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateResourceGroupResponse]
  }
  
  @scala.inline
  implicit class CreateResourceGroupResponseMutableBuilder[Self <: CreateResourceGroupResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceGroupArn(value: Arn): Self = StObject.set(x, "resourceGroupArn", value.asInstanceOf[js.Any])
  }
}
