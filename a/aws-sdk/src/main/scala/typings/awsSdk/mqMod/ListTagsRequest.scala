package typings.awsSdk.mqMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTagsRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the resource tag.
    */
  var ResourceArn: string
}
object ListTagsRequest {
  
  @scala.inline
  def apply(ResourceArn: string): ListTagsRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsRequest]
  }
  
  @scala.inline
  implicit class ListTagsRequestMutableBuilder[Self <: ListTagsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceArn(value: string): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
  }
}
