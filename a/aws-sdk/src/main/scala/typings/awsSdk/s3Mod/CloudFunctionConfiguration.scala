package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloudFunctionConfiguration extends js.Object {
  /**
    * Lambda cloud function ARN that Amazon S3 can invoke when it detects events of the specified type.
    */
  var CloudFunction: js.UndefOr[typings.awsSdk.s3Mod.CloudFunction] = js.native
  var Event: js.UndefOr[typings.awsSdk.s3Mod.Event] = js.native
  /**
    * Bucket events for which to send notifications.
    */
  var Events: js.UndefOr[EventList] = js.native
  var Id: js.UndefOr[NotificationId] = js.native
  /**
    * The role supporting the invocation of the Lambda function
    */
  var InvocationRole: js.UndefOr[CloudFunctionInvocationRole] = js.native
}

object CloudFunctionConfiguration {
  @scala.inline
  def apply(): CloudFunctionConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloudFunctionConfiguration]
  }
  @scala.inline
  implicit class CloudFunctionConfigurationOps[Self <: CloudFunctionConfiguration] (val x: Self) extends AnyVal {
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
    def setCloudFunction(value: CloudFunction): Self = this.set("CloudFunction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloudFunction: Self = this.set("CloudFunction", js.undefined)
    @scala.inline
    def setEvent(value: Event): Self = this.set("Event", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvent: Self = this.set("Event", js.undefined)
    @scala.inline
    def setEventsVarargs(value: Event*): Self = this.set("Events", js.Array(value :_*))
    @scala.inline
    def setEvents(value: EventList): Self = this.set("Events", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvents: Self = this.set("Events", js.undefined)
    @scala.inline
    def setId(value: NotificationId): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    @scala.inline
    def setInvocationRole(value: CloudFunctionInvocationRole): Self = this.set("InvocationRole", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInvocationRole: Self = this.set("InvocationRole", js.undefined)
  }
  
}

