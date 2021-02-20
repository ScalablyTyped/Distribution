package typings.awsSdk.wafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetWebACLForResourceRequest extends StObject {
  
  /**
    * The ARN (Amazon Resource Name) of the resource.
    */
  var ResourceArn: typings.awsSdk.wafv2Mod.ResourceArn = js.native
}
object GetWebACLForResourceRequest {
  
  @scala.inline
  def apply(ResourceArn: ResourceArn): GetWebACLForResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetWebACLForResourceRequest]
  }
  
  @scala.inline
  implicit class GetWebACLForResourceRequestMutableBuilder[Self <: GetWebACLForResourceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceArn(value: ResourceArn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
  }
}
