package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagResourceRequest extends js.Object {
  /**
    *  An ARN of a CloudFront resource.
    */
  var Resource: ResourceARN = js.native
  /**
    *  A complex type that contains zero or more Tag elements.
    */
  var Tags: typings.awsSdk.cloudfrontMod.Tags = js.native
}

object TagResourceRequest {
  @scala.inline
  def apply(Resource: ResourceARN, Tags: Tags): TagResourceRequest = {
    val __obj = js.Dynamic.literal(Resource = Resource.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagResourceRequest]
  }
  @scala.inline
  implicit class TagResourceRequestOps[Self <: TagResourceRequest] (val x: Self) extends AnyVal {
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
    def setResource(value: ResourceARN): Self = this.set("Resource", value.asInstanceOf[js.Any])
    @scala.inline
    def setTags(value: Tags): Self = this.set("Tags", value.asInstanceOf[js.Any])
  }
  
}

