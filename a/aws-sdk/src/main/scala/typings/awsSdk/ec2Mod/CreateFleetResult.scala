package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateFleetResult extends js.Object {
  /**
    * Information about the instances that could not be launched by the fleet. Valid only when Type is set to instant.
    */
  var Errors: js.UndefOr[CreateFleetErrorsSet] = js.native
  /**
    * The ID of the EC2 Fleet.
    */
  var FleetId: js.UndefOr[typings.awsSdk.ec2Mod.FleetId] = js.native
  /**
    * Information about the instances that were launched by the fleet. Valid only when Type is set to instant.
    */
  var Instances: js.UndefOr[CreateFleetInstancesSet] = js.native
}

object CreateFleetResult {
  @scala.inline
  def apply(): CreateFleetResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateFleetResult]
  }
  @scala.inline
  implicit class CreateFleetResultOps[Self <: CreateFleetResult] (val x: Self) extends AnyVal {
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
    def setErrorsVarargs(value: CreateFleetError*): Self = this.set("Errors", js.Array(value :_*))
    @scala.inline
    def setErrors(value: CreateFleetErrorsSet): Self = this.set("Errors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrors: Self = this.set("Errors", js.undefined)
    @scala.inline
    def setFleetId(value: FleetId): Self = this.set("FleetId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFleetId: Self = this.set("FleetId", js.undefined)
    @scala.inline
    def setInstancesVarargs(value: CreateFleetInstance*): Self = this.set("Instances", js.Array(value :_*))
    @scala.inline
    def setInstances(value: CreateFleetInstancesSet): Self = this.set("Instances", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstances: Self = this.set("Instances", js.undefined)
  }
  
}

