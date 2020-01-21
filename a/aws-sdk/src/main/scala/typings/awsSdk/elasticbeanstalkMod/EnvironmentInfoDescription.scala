package typings.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnvironmentInfoDescription extends js.Object {
  /**
    * The Amazon EC2 Instance ID for this information.
    */
  var Ec2InstanceId: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.Ec2InstanceId] = js.native
  /**
    * The type of information retrieved.
    */
  var InfoType: js.UndefOr[EnvironmentInfoType] = js.native
  /**
    * The retrieved information. Currently contains a presigned Amazon S3 URL. The files are deleted after 15 minutes. Anyone in possession of this URL can access the files before they are deleted. Make the URL available only to trusted parties.
    */
  var Message: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.Message] = js.native
  /**
    * The time stamp when this information was retrieved.
    */
  var SampleTimestamp: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.SampleTimestamp] = js.native
}

object EnvironmentInfoDescription {
  @scala.inline
  def apply(
    Ec2InstanceId: Ec2InstanceId = null,
    InfoType: EnvironmentInfoType = null,
    Message: Message = null,
    SampleTimestamp: SampleTimestamp = null
  ): EnvironmentInfoDescription = {
    val __obj = js.Dynamic.literal()
    if (Ec2InstanceId != null) __obj.updateDynamic("Ec2InstanceId")(Ec2InstanceId.asInstanceOf[js.Any])
    if (InfoType != null) __obj.updateDynamic("InfoType")(InfoType.asInstanceOf[js.Any])
    if (Message != null) __obj.updateDynamic("Message")(Message.asInstanceOf[js.Any])
    if (SampleTimestamp != null) __obj.updateDynamic("SampleTimestamp")(SampleTimestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnvironmentInfoDescription]
  }
}

