package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCloudFrontOriginAccessIdentityConfigRequest extends js.Object {
  /**
    * The identity's ID. 
    */
  var Id: String = js.native
}

object GetCloudFrontOriginAccessIdentityConfigRequest {
  @scala.inline
  def apply(Id: String): GetCloudFrontOriginAccessIdentityConfigRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetCloudFrontOriginAccessIdentityConfigRequest]
  }
}

