package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FailedQueuedPurchaseDeletion extends js.Object {
  /**
    * The error.
    */
  var Error: js.UndefOr[DeleteQueuedReservedInstancesError] = js.native
  /**
    * The ID of the Reserved Instance.
    */
  var ReservedInstancesId: js.UndefOr[String] = js.native
}

object FailedQueuedPurchaseDeletion {
  @scala.inline
  def apply(): FailedQueuedPurchaseDeletion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FailedQueuedPurchaseDeletion]
  }
  @scala.inline
  implicit class FailedQueuedPurchaseDeletionOps[Self <: FailedQueuedPurchaseDeletion] (val x: Self) extends AnyVal {
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
    def setError(value: DeleteQueuedReservedInstancesError): Self = this.set("Error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("Error", js.undefined)
    @scala.inline
    def setReservedInstancesId(value: String): Self = this.set("ReservedInstancesId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReservedInstancesId: Self = this.set("ReservedInstancesId", js.undefined)
  }
  
}

