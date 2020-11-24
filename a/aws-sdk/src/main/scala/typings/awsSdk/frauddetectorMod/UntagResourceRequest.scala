package typings.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UntagResourceRequest extends js.Object {
  
  /**
    * The ARN of the resource from which to remove the tag.
    */
  var resourceARN: fraudDetectorArn = js.native
  
  /**
    * The resource ARN.
    */
  var tagKeys: tagKeyList = js.native
}
object UntagResourceRequest {
  
  @scala.inline
  def apply(resourceARN: fraudDetectorArn, tagKeys: tagKeyList): UntagResourceRequest = {
    val __obj = js.Dynamic.literal(resourceARN = resourceARN.asInstanceOf[js.Any], tagKeys = tagKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[UntagResourceRequest]
  }
  
  @scala.inline
  implicit class UntagResourceRequestOps[Self <: UntagResourceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setResourceARN(value: fraudDetectorArn): Self = this.set("resourceARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagKeysVarargs(value: tagKey*): Self = this.set("tagKeys", js.Array(value :_*))
    
    @scala.inline
    def setTagKeys(value: tagKeyList): Self = this.set("tagKeys", value.asInstanceOf[js.Any])
  }
}
