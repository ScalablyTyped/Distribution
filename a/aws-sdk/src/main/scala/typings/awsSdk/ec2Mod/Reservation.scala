package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Reservation extends js.Object {
  /**
    * [EC2-Classic only] The security groups.
    */
  var Groups: js.UndefOr[GroupIdentifierList] = js.native
  /**
    * The instances.
    */
  var Instances: js.UndefOr[InstanceList] = js.native
  /**
    * The ID of the AWS account that owns the reservation.
    */
  var OwnerId: js.UndefOr[String] = js.native
  /**
    * The ID of the requester that launched the instances on your behalf (for example, AWS Management Console or Auto Scaling).
    */
  var RequesterId: js.UndefOr[String] = js.native
  /**
    * The ID of the reservation.
    */
  var ReservationId: js.UndefOr[String] = js.native
}

object Reservation {
  @scala.inline
  def apply(): Reservation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Reservation]
  }
  @scala.inline
  implicit class ReservationOps[Self <: Reservation] (val x: Self) extends AnyVal {
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
    def setGroupsVarargs(value: GroupIdentifier*): Self = this.set("Groups", js.Array(value :_*))
    @scala.inline
    def setGroups(value: GroupIdentifierList): Self = this.set("Groups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroups: Self = this.set("Groups", js.undefined)
    @scala.inline
    def setInstancesVarargs(value: Instance*): Self = this.set("Instances", js.Array(value :_*))
    @scala.inline
    def setInstances(value: InstanceList): Self = this.set("Instances", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstances: Self = this.set("Instances", js.undefined)
    @scala.inline
    def setOwnerId(value: String): Self = this.set("OwnerId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwnerId: Self = this.set("OwnerId", js.undefined)
    @scala.inline
    def setRequesterId(value: String): Self = this.set("RequesterId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequesterId: Self = this.set("RequesterId", js.undefined)
    @scala.inline
    def setReservationId(value: String): Self = this.set("ReservationId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReservationId: Self = this.set("ReservationId", js.undefined)
  }
  
}

