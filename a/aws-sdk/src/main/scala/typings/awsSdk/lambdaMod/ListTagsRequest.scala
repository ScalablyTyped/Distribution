package typings.awsSdk.lambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListTagsRequest extends StObject {
  
  /**
    * The function's Amazon Resource Name (ARN).
    */
  var Resource: FunctionArn = js.native
}
object ListTagsRequest {
  
  @scala.inline
  def apply(Resource: FunctionArn): ListTagsRequest = {
    val __obj = js.Dynamic.literal(Resource = Resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsRequest]
  }
  
  @scala.inline
  implicit class ListTagsRequestMutableBuilder[Self <: ListTagsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResource(value: FunctionArn): Self = StObject.set(x, "Resource", value.asInstanceOf[js.Any])
  }
}
