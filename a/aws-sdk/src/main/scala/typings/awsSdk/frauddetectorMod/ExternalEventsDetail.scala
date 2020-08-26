package typings.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExternalEventsDetail extends js.Object {
  /**
    * The ARN of the role that provides Amazon Fraud Detector access to the data location.
    */
  var dataAccessRoleArn: iamRoleArn = js.native
  /**
    * The Amazon S3 bucket location for the data.
    */
  var dataLocation: s3BucketLocation = js.native
}

object ExternalEventsDetail {
  @scala.inline
  def apply(dataAccessRoleArn: iamRoleArn, dataLocation: s3BucketLocation): ExternalEventsDetail = {
    val __obj = js.Dynamic.literal(dataAccessRoleArn = dataAccessRoleArn.asInstanceOf[js.Any], dataLocation = dataLocation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExternalEventsDetail]
  }
  @scala.inline
  implicit class ExternalEventsDetailOps[Self <: ExternalEventsDetail] (val x: Self) extends AnyVal {
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
    def setDataAccessRoleArn(value: iamRoleArn): Self = this.set("dataAccessRoleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataLocation(value: s3BucketLocation): Self = this.set("dataLocation", value.asInstanceOf[js.Any])
  }
  
}

