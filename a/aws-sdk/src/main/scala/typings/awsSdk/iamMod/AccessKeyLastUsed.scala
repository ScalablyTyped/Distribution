package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccessKeyLastUsed extends js.Object {
  /**
    * The date and time, in ISO 8601 date-time format, when the access key was most recently used. This field is null in the following situations:   The user does not have an access key.   An access key exists but has not been used since IAM began tracking this information.   There is no sign-in data associated with the user.  
    */
  var LastUsedDate: dateType = js.native
  /**
    * The AWS Region where this access key was most recently used. The value for this field is "N/A" in the following situations:   The user does not have an access key.   An access key exists but has not been used since IAM began tracking this information.   There is no sign-in data associated with the user.   For more information about AWS Regions, see Regions and Endpoints in the Amazon Web Services General Reference.
    */
  var Region: stringType = js.native
  /**
    * The name of the AWS service with which this access key was most recently used. The value of this field is "N/A" in the following situations:   The user does not have an access key.   An access key exists but has not been used since IAM started tracking this information.   There is no sign-in data associated with the user.  
    */
  var ServiceName: stringType = js.native
}

object AccessKeyLastUsed {
  @scala.inline
  def apply(LastUsedDate: dateType, Region: stringType, ServiceName: stringType): AccessKeyLastUsed = {
    val __obj = js.Dynamic.literal(LastUsedDate = LastUsedDate.asInstanceOf[js.Any], Region = Region.asInstanceOf[js.Any], ServiceName = ServiceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessKeyLastUsed]
  }
  @scala.inline
  implicit class AccessKeyLastUsedOps[Self <: AccessKeyLastUsed] (val x: Self) extends AnyVal {
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
    def setLastUsedDate(value: dateType): Self = this.set("LastUsedDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setRegion(value: stringType): Self = this.set("Region", value.asInstanceOf[js.Any])
    @scala.inline
    def setServiceName(value: stringType): Self = this.set("ServiceName", value.asInstanceOf[js.Any])
  }
  
}

