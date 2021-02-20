package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UntagResourceRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the user pool that the tags are assigned to.
    */
  var ResourceArn: ArnType = js.native
  
  /**
    * The keys of the tags to remove from the user pool.
    */
  var TagKeys: UserPoolTagsListType = js.native
}
object UntagResourceRequest {
  
  @scala.inline
  def apply(ResourceArn: ArnType, TagKeys: UserPoolTagsListType): UntagResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[UntagResourceRequest]
  }
  
  @scala.inline
  implicit class UntagResourceRequestMutableBuilder[Self <: UntagResourceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceArn(value: ArnType): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagKeys(value: UserPoolTagsListType): Self = StObject.set(x, "TagKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagKeysVarargs(value: TagKeysType*): Self = StObject.set(x, "TagKeys", js.Array(value :_*))
  }
}
