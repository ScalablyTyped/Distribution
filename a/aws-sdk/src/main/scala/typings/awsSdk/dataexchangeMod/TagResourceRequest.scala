package typings.awsSdk.dataexchangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagResourceRequest extends js.Object {
  /**
    * An Amazon Resource Name (ARN) that uniquely identifies an AWS resource.
    */
  var ResourceArn: string = js.native
  /**
    * A label that consists of a customer-defined key and an optional value.
    */
  var Tags: MapOfString = js.native
}

object TagResourceRequest {
  @scala.inline
  def apply(ResourceArn: string, Tags: MapOfString): TagResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagResourceRequest]
  }
}

