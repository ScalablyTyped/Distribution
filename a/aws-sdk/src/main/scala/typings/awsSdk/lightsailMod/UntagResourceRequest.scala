package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UntagResourceRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the resource from which you want to remove a tag.
    */
  var resourceArn: js.UndefOr[ResourceArn] = js.undefined
  
  /**
    * The name of the resource from which you are removing a tag.
    */
  var resourceName: ResourceName
  
  /**
    * The tag keys to delete from the specified resource.
    */
  var tagKeys: TagKeyList
}
object UntagResourceRequest {
  
  @scala.inline
  def apply(resourceName: ResourceName, tagKeys: TagKeyList): UntagResourceRequest = {
    val __obj = js.Dynamic.literal(resourceName = resourceName.asInstanceOf[js.Any], tagKeys = tagKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[UntagResourceRequest]
  }
  
  @scala.inline
  implicit class UntagResourceRequestMutableBuilder[Self <: UntagResourceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceArn(value: ResourceArn): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceArnUndefined: Self = StObject.set(x, "resourceArn", js.undefined)
    
    @scala.inline
    def setResourceName(value: ResourceName): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagKeys(value: TagKeyList): Self = StObject.set(x, "tagKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagKeysVarargs(value: TagKey*): Self = StObject.set(x, "tagKeys", js.Array(value :_*))
  }
}
