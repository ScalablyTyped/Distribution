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
}

