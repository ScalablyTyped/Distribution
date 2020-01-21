package typings.awsSdk.mediapackagevodMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAssetRequest extends js.Object {
  /**
    * The ID of an MediaPackage VOD Asset resource.
    */
  var Id: string = js.native
}

object DescribeAssetRequest {
  @scala.inline
  def apply(Id: string): DescribeAssetRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeAssetRequest]
  }
}

