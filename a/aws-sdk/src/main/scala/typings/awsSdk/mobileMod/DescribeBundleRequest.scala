package typings.awsSdk.mobileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeBundleRequest extends js.Object {
  /**
    *  Unique bundle identifier. 
    */
  var bundleId: BundleId = js.native
}

object DescribeBundleRequest {
  @scala.inline
  def apply(bundleId: BundleId): DescribeBundleRequest = {
    val __obj = js.Dynamic.literal(bundleId = bundleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeBundleRequest]
  }
}

