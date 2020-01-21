package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SigV4Authorization extends js.Object {
  /**
    * The ARN of the signing role.
    */
  var roleArn: AwsArn = js.native
  /**
    * The service name to use while signing with Sig V4.
    */
  var serviceName: ServiceName = js.native
  /**
    * The signing region.
    */
  var signingRegion: SigningRegion = js.native
}

object SigV4Authorization {
  @scala.inline
  def apply(roleArn: AwsArn, serviceName: ServiceName, signingRegion: SigningRegion): SigV4Authorization = {
    val __obj = js.Dynamic.literal(roleArn = roleArn.asInstanceOf[js.Any], serviceName = serviceName.asInstanceOf[js.Any], signingRegion = signingRegion.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SigV4Authorization]
  }
}

