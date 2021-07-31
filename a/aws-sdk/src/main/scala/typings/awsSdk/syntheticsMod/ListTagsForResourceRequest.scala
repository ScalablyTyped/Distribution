package typings.awsSdk.syntheticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTagsForResourceRequest extends StObject {
  
  /**
    * The ARN of the canary that you want to view tags for. The ARN format of a canary is arn:aws:synthetics:Region:account-id:canary:canary-name .
    */
  var ResourceArn: CanaryArn
}
object ListTagsForResourceRequest {
  
  @scala.inline
  def apply(ResourceArn: CanaryArn): ListTagsForResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForResourceRequest]
  }
  
  @scala.inline
  implicit class ListTagsForResourceRequestMutableBuilder[Self <: ListTagsForResourceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceArn(value: CanaryArn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
  }
}
