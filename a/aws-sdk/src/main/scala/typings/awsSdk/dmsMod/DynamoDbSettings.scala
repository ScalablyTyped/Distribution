package typings.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DynamoDbSettings extends js.Object {
  /**
    *  The Amazon Resource Name (ARN) used by the service access IAM role. 
    */
  var ServiceAccessRoleArn: String = js.native
}

object DynamoDbSettings {
  @scala.inline
  def apply(ServiceAccessRoleArn: String): DynamoDbSettings = {
    val __obj = js.Dynamic.literal(ServiceAccessRoleArn = ServiceAccessRoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DynamoDbSettings]
  }
  @scala.inline
  implicit class DynamoDbSettingsOps[Self <: DynamoDbSettings] (val x: Self) extends AnyVal {
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
    def setServiceAccessRoleArn(value: String): Self = this.set("ServiceAccessRoleArn", value.asInstanceOf[js.Any])
  }
  
}

