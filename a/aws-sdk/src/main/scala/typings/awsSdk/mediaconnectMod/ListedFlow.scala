package typings.awsSdk.mediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListedFlow extends js.Object {
  /**
    * The Availability Zone that the flow was created in.
    */
  var AvailabilityZone: string = js.native
  /**
    * A description of the flow.
    */
  var Description: string = js.native
  /**
    * The ARN of the flow.
    */
  var FlowArn: string = js.native
  /**
    * The name of the flow.
    */
  var Name: string = js.native
  /**
    * The type of source. This value is either owned (originated somewhere other than an AWS Elemental MediaConnect flow owned by another AWS account) or entitled (originated at an AWS Elemental MediaConnect flow owned by another AWS account).
    */
  var SourceType: typings.awsSdk.mediaconnectMod.SourceType = js.native
  /**
    * The current status of the flow.
    */
  var Status: typings.awsSdk.mediaconnectMod.Status = js.native
}

object ListedFlow {
  @scala.inline
  def apply(
    AvailabilityZone: string,
    Description: string,
    FlowArn: string,
    Name: string,
    SourceType: SourceType,
    Status: Status
  ): ListedFlow = {
    val __obj = js.Dynamic.literal(AvailabilityZone = AvailabilityZone.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], FlowArn = FlowArn.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], SourceType = SourceType.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ListedFlow]
  }
}

