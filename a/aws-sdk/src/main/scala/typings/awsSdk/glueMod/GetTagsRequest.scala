package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetTagsRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the resource for which to retrieve tags.
    */
  var ResourceArn: GlueResourceArn = js.native
}
object GetTagsRequest {
  
  @scala.inline
  def apply(ResourceArn: GlueResourceArn): GetTagsRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTagsRequest]
  }
  
  @scala.inline
  implicit class GetTagsRequestMutableBuilder[Self <: GetTagsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceArn(value: GlueResourceArn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
  }
}
