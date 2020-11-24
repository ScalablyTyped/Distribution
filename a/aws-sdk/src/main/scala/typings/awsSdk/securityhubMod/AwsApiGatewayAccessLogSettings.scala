package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsApiGatewayAccessLogSettings extends js.Object {
  
  /**
    * The ARN of the CloudWatch Logs log group that receives the access logs.
    */
  var DestinationArn: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * A single-line format of the access logs of data, as specified by selected $context variables. The format must include at least $context.requestId.
    */
  var Format: js.UndefOr[NonEmptyString] = js.native
}
object AwsApiGatewayAccessLogSettings {
  
  @scala.inline
  def apply(): AwsApiGatewayAccessLogSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsApiGatewayAccessLogSettings]
  }
  
  @scala.inline
  implicit class AwsApiGatewayAccessLogSettingsOps[Self <: AwsApiGatewayAccessLogSettings] (val x: Self) extends AnyVal {
    
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
    def setDestinationArn(value: NonEmptyString): Self = this.set("DestinationArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestinationArn: Self = this.set("DestinationArn", js.undefined)
    
    @scala.inline
    def setFormat(value: NonEmptyString): Self = this.set("Format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("Format", js.undefined)
  }
}
