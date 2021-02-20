package typings.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UntagResourceRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the resource that you want to remove tags from. To get the ARN, send a GET request with the resource name.
    */
  var Arn: string = js.native
  
  /**
    * The keys of the tags that you want to remove from the resource.
    */
  var TagKeys: js.UndefOr[listOfString] = js.native
}
object UntagResourceRequest {
  
  @scala.inline
  def apply(Arn: string): UntagResourceRequest = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UntagResourceRequest]
  }
  
  @scala.inline
  implicit class UntagResourceRequestMutableBuilder[Self <: UntagResourceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: string): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagKeys(value: listOfString): Self = StObject.set(x, "TagKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagKeysUndefined: Self = StObject.set(x, "TagKeys", js.undefined)
    
    @scala.inline
    def setTagKeysVarargs(value: string*): Self = StObject.set(x, "TagKeys", js.Array(value :_*))
  }
}
