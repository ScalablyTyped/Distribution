package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateAutoMLJobResponse extends js.Object {
  /**
    * When a job is created, it is assigned a unique ARN.
    */
  var AutoMLJobArn: typings.awsSdk.sagemakerMod.AutoMLJobArn = js.native
}

object CreateAutoMLJobResponse {
  @scala.inline
  def apply(AutoMLJobArn: AutoMLJobArn): CreateAutoMLJobResponse = {
    val __obj = js.Dynamic.literal(AutoMLJobArn = AutoMLJobArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateAutoMLJobResponse]
  }
}

