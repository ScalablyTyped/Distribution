package typings.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutAccountSettingDefaultRequest extends js.Object {
  /**
    * The resource name for which to modify the account setting. If serviceLongArnFormat is specified, the ARN for your Amazon ECS services is affected. If taskLongArnFormat is specified, the ARN and resource ID for your Amazon ECS tasks is affected. If containerInstanceLongArnFormat is specified, the ARN and resource ID for your Amazon ECS container instances is affected. If awsvpcTrunking is specified, the ENI limit for your Amazon ECS container instances is affected. If containerInsights is specified, the default setting for CloudWatch Container Insights for your clusters is affected.
    */
  var name: SettingName = js.native
  /**
    * The account setting value for the specified principal ARN. Accepted values are enabled and disabled.
    */
  var value: String = js.native
}

object PutAccountSettingDefaultRequest {
  @scala.inline
  def apply(name: SettingName, value: String): PutAccountSettingDefaultRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PutAccountSettingDefaultRequest]
  }
}

