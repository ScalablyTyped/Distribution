package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutRemediationExceptionsRequest extends js.Object {
  /**
    * The name of the AWS Config rule for which you want to create remediation exception.
    */
  var ConfigRuleName: typings.awsSdk.configserviceMod.ConfigRuleName = js.native
  /**
    * The exception is automatically deleted after the expiration date.
    */
  var ExpirationTime: js.UndefOr[Date] = js.native
  /**
    * The message contains an explanation of the exception.
    */
  var Message: js.UndefOr[StringWithCharLimit1024] = js.native
  /**
    * An exception list of resource exception keys to be processed with the current request. AWS Config adds exception for each resource key. For example, AWS Config adds 3 exceptions for 3 resource keys. 
    */
  var ResourceKeys: RemediationExceptionResourceKeys = js.native
}

object PutRemediationExceptionsRequest {
  @scala.inline
  def apply(ConfigRuleName: ConfigRuleName, ResourceKeys: RemediationExceptionResourceKeys): PutRemediationExceptionsRequest = {
    val __obj = js.Dynamic.literal(ConfigRuleName = ConfigRuleName.asInstanceOf[js.Any], ResourceKeys = ResourceKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutRemediationExceptionsRequest]
  }
  @scala.inline
  implicit class PutRemediationExceptionsRequestOps[Self <: PutRemediationExceptionsRequest] (val x: Self) extends AnyVal {
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
    def setConfigRuleName(value: ConfigRuleName): Self = this.set("ConfigRuleName", value.asInstanceOf[js.Any])
    @scala.inline
    def setResourceKeysVarargs(value: RemediationExceptionResourceKey*): Self = this.set("ResourceKeys", js.Array(value :_*))
    @scala.inline
    def setResourceKeys(value: RemediationExceptionResourceKeys): Self = this.set("ResourceKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpirationTime(value: Date): Self = this.set("ExpirationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpirationTime: Self = this.set("ExpirationTime", js.undefined)
    @scala.inline
    def setMessage(value: StringWithCharLimit1024): Self = this.set("Message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("Message", js.undefined)
  }
  
}

