package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyInstanceMetadataOptionsRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * This parameter enables or disables the HTTP metadata endpoint on your instances. If the parameter is not specified, the existing state is maintained.  If you specify a value of disabled, you will not be able to access your instance metadata. 
    */
  var HttpEndpoint: js.UndefOr[InstanceMetadataEndpointState] = js.native
  /**
    * The desired HTTP PUT response hop limit for instance metadata requests. The larger the number, the further instance metadata requests can travel. If no parameter is specified, the existing state is maintained. Possible values: Integers from 1 to 64
    */
  var HttpPutResponseHopLimit: js.UndefOr[Integer] = js.native
  /**
    * The state of token usage for your instance metadata requests. If the parameter is not specified in the request, the default state is optional. If the state is optional, you can choose to retrieve instance metadata with or without a signed token header on your request. If you retrieve the IAM role credentials without a token, the version 1.0 role credentials are returned. If you retrieve the IAM role credentials using a valid signed token, the version 2.0 role credentials are returned. If the state is required, you must send a signed token header with any instance metadata retrieval requests. In this state, retrieving the IAM role credential always returns the version 2.0 credentials; the version 1.0 credentials are not available.
    */
  var HttpTokens: js.UndefOr[HttpTokensState] = js.native
  /**
    * The ID of the instance.
    */
  var InstanceId: typings.awsSdk.ec2Mod.InstanceId = js.native
}

object ModifyInstanceMetadataOptionsRequest {
  @scala.inline
  def apply(InstanceId: InstanceId): ModifyInstanceMetadataOptionsRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyInstanceMetadataOptionsRequest]
  }
  @scala.inline
  implicit class ModifyInstanceMetadataOptionsRequestOps[Self <: ModifyInstanceMetadataOptionsRequest] (val x: Self) extends AnyVal {
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
    def setInstanceId(value: InstanceId): Self = this.set("InstanceId", value.asInstanceOf[js.Any])
    @scala.inline
    def setDryRun(value: Boolean): Self = this.set("DryRun", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDryRun: Self = this.set("DryRun", js.undefined)
    @scala.inline
    def setHttpEndpoint(value: InstanceMetadataEndpointState): Self = this.set("HttpEndpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHttpEndpoint: Self = this.set("HttpEndpoint", js.undefined)
    @scala.inline
    def setHttpPutResponseHopLimit(value: Integer): Self = this.set("HttpPutResponseHopLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHttpPutResponseHopLimit: Self = this.set("HttpPutResponseHopLimit", js.undefined)
    @scala.inline
    def setHttpTokens(value: HttpTokensState): Self = this.set("HttpTokens", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHttpTokens: Self = this.set("HttpTokens", js.undefined)
  }
  
}

