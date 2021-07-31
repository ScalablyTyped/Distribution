package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTagsRequest extends StObject {
  
  var ResourceArn: string
  
  var Tags: js.UndefOr[typings.awsSdk.medialiveMod.Tags] = js.undefined
}
object CreateTagsRequest {
  
  @scala.inline
  def apply(ResourceArn: string): CreateTagsRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTagsRequest]
  }
  
  @scala.inline
  implicit class CreateTagsRequestMutableBuilder[Self <: CreateTagsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceArn(value: string): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
