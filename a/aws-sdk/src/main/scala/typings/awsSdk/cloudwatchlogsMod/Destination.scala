package typings.awsSdk.cloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Destination extends js.Object {
  /**
    * An IAM policy document that governs which AWS accounts can create subscription filters against this destination.
    */
  var accessPolicy: js.UndefOr[AccessPolicy] = js.native
  /**
    * The ARN of this destination.
    */
  var arn: js.UndefOr[Arn] = js.native
  /**
    * The creation time of the destination, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC.
    */
  var creationTime: js.UndefOr[Timestamp] = js.native
  /**
    * The name of the destination.
    */
  var destinationName: js.UndefOr[DestinationName] = js.native
  /**
    * A role for impersonation, used when delivering log events to the target.
    */
  var roleArn: js.UndefOr[RoleArn] = js.native
  /**
    * The Amazon Resource Name (ARN) of the physical target to where the log events are delivered (for example, a Kinesis stream).
    */
  var targetArn: js.UndefOr[TargetArn] = js.native
}

object Destination {
  @scala.inline
  def apply(): Destination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Destination]
  }
  @scala.inline
  implicit class DestinationOps[Self <: Destination] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAccessPolicy(value: AccessPolicy): Self = this.set("accessPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessPolicy: Self = this.set("accessPolicy", js.undefined)
    @scala.inline
    def setArn(value: Arn): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    @scala.inline
    def setCreationTime(value: Timestamp): Self = this.set("creationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationTime: Self = this.set("creationTime", js.undefined)
    @scala.inline
    def setDestinationName(value: DestinationName): Self = this.set("destinationName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestinationName: Self = this.set("destinationName", js.undefined)
    @scala.inline
    def setRoleArn(value: RoleArn): Self = this.set("roleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoleArn: Self = this.set("roleArn", js.undefined)
    @scala.inline
    def setTargetArn(value: TargetArn): Self = this.set("targetArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetArn: Self = this.set("targetArn", js.undefined)
  }
  
}

