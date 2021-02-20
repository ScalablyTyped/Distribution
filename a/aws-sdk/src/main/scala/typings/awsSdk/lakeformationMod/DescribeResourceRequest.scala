package typings.awsSdk.lakeformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeResourceRequest extends StObject {
  
  /**
    * The resource ARN.
    */
  var ResourceArn: ResourceArnString = js.native
}
object DescribeResourceRequest {
  
  @scala.inline
  def apply(ResourceArn: ResourceArnString): DescribeResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeResourceRequest]
  }
  
  @scala.inline
  implicit class DescribeResourceRequestMutableBuilder[Self <: DescribeResourceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceArn(value: ResourceArnString): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
  }
}
