package typings.awsSdk.lakeformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeregisterResourceRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the resource that you want to deregister.
    */
  var ResourceArn: ResourceArnString = js.native
}
object DeregisterResourceRequest {
  
  @scala.inline
  def apply(ResourceArn: ResourceArnString): DeregisterResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeregisterResourceRequest]
  }
  
  @scala.inline
  implicit class DeregisterResourceRequestMutableBuilder[Self <: DeregisterResourceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceArn(value: ResourceArnString): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
  }
}
