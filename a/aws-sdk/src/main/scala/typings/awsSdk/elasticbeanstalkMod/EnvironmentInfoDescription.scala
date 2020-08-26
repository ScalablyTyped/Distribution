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
  def apply(): EnvironmentInfoDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvironmentInfoDescription]
  }
  @scala.inline
  implicit class EnvironmentInfoDescriptionOps[Self <: EnvironmentInfoDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEc2InstanceId(value: Ec2InstanceId): Self = this.set("Ec2InstanceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEc2InstanceId: Self = this.set("Ec2InstanceId", js.undefined)
    @scala.inline
    def setInfoType(value: EnvironmentInfoType): Self = this.set("InfoType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInfoType: Self = this.set("InfoType", js.undefined)
    @scala.inline
    def setMessage(value: Message): Self = this.set("Message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("Message", js.undefined)
    @scala.inline
    def setSampleTimestamp(value: SampleTimestamp): Self = this.set("SampleTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSampleTimestamp: Self = this.set("SampleTimestamp", js.undefined)
  }
  
}

