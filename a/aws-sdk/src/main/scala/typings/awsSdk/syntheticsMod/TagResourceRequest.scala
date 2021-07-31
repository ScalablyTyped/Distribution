package typings.awsSdk.syntheticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagResourceRequest extends StObject {
  
  /**
    * The ARN of the canary that you're adding tags to. The ARN format of a canary is arn:aws:synthetics:Region:account-id:canary:canary-name .
    */
  var ResourceArn: CanaryArn
  
  /**
    * The list of key-value pairs to associate with the canary.
    */
  var Tags: TagMap
}
object TagResourceRequest {
  
  @scala.inline
  def apply(ResourceArn: CanaryArn, Tags: TagMap): TagResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagResourceRequest]
  }
  
  @scala.inline
  implicit class TagResourceRequestMutableBuilder[Self <: TagResourceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceArn(value: CanaryArn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
  }
}
