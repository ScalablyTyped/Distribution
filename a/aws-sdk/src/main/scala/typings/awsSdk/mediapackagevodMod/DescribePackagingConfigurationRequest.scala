package typings.awsSdk.mediapackagevodMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribePackagingConfigurationRequest extends js.Object {
  /**
    * The ID of a MediaPackage VOD PackagingConfiguration resource.
    */
  var Id: string = js.native
}

object DescribePackagingConfigurationRequest {
  @scala.inline
  def apply(Id: string): DescribePackagingConfigurationRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribePackagingConfigurationRequest]
  }
}

