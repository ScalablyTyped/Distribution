package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EC2InstanceLimit extends js.Object {
  /**
    * Number of instances of the specified type that are currently in use by this AWS account.
    */
  var CurrentInstances: js.UndefOr[WholeNumber] = js.native
  /**
    * Name of an EC2 instance type that is supported in Amazon GameLift. A fleet instance type determines the computing resources of each instance in the fleet, including CPU, memory, storage, and networking capacity. Amazon GameLift supports the following EC2 instance types. See Amazon EC2 Instance Types for detailed descriptions.
    */
  var EC2InstanceType: js.UndefOr[typings.awsSdk.gameliftMod.EC2InstanceType] = js.native
  /**
    * Number of instances allowed.
    */
  var InstanceLimit: js.UndefOr[WholeNumber] = js.native
}

object EC2InstanceLimit {
  @scala.inline
  def apply(): EC2InstanceLimit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EC2InstanceLimit]
  }
  @scala.inline
  implicit class EC2InstanceLimitOps[Self <: EC2InstanceLimit] (val x: Self) extends AnyVal {
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
    def setCurrentInstances(value: WholeNumber): Self = this.set("CurrentInstances", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentInstances: Self = this.set("CurrentInstances", js.undefined)
    @scala.inline
    def setEC2InstanceType(value: EC2InstanceType): Self = this.set("EC2InstanceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEC2InstanceType: Self = this.set("EC2InstanceType", js.undefined)
    @scala.inline
    def setInstanceLimit(value: WholeNumber): Self = this.set("InstanceLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceLimit: Self = this.set("InstanceLimit", js.undefined)
  }
  
}

