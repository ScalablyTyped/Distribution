package typings.awsSdk.mediapackagevodMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeletePackagingConfigurationRequest extends js.Object {
  /**
    * The ID of the MediaPackage VOD PackagingConfiguration resource to delete.
    */
  var Id: string = js.native
}

object DeletePackagingConfigurationRequest {
  @scala.inline
  def apply(Id: string): DeletePackagingConfigurationRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeletePackagingConfigurationRequest]
  }
}

