package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LaunchTemplateInstanceMetadataOptionsRequest extends js.Object {
  
  /**
    * This parameter enables or disables the HTTP metadata endpoint on your instances. If the parameter is not specified, the default state is enabled.  If you specify a value of disabled, you will not be able to access your instance metadata.  
    */
  var HttpEndpoint: js.UndefOr[LaunchTemplateInstanceMetadataEndpointState] = js.native
  
  /**
    * The desired HTTP PUT response hop limit for instance metadata requests. The larger the number, the further instance metadata requests can travel. Default: 1 Possible values: Integers from 1 to 64
    */
  var HttpPutResponseHopLimit: js.UndefOr[Integer] = js.native
  
  /**
    * The state of token usage for your instance metadata requests. If the parameter is not specified in the request, the default state is optional. If the state is optional, you can choose to retrieve instance metadata with or without a signed token header on your request. If you retrieve the IAM role credentials without a token, the version 1.0 role credentials are returned. If you retrieve the IAM role credentials using a valid signed token, the version 2.0 role credentials are returned. If the state is required, you must send a signed token header with any instance metadata retrieval requests. In this state, retrieving the IAM role credentials always returns the version 2.0 credentials; the version 1.0 credentials are not available.
    */
  var HttpTokens: js.UndefOr[LaunchTemplateHttpTokensState] = js.native
}
object LaunchTemplateInstanceMetadataOptionsRequest {
  
  @scala.inline
  def apply(): LaunchTemplateInstanceMetadataOptionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchTemplateInstanceMetadataOptionsRequest]
  }
  
  @scala.inline
  implicit class LaunchTemplateInstanceMetadataOptionsRequestOps[Self <: LaunchTemplateInstanceMetadataOptionsRequest] (val x: Self) extends AnyVal {
    
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
    def setHttpEndpoint(value: LaunchTemplateInstanceMetadataEndpointState): Self = this.set("HttpEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttpEndpoint: Self = this.set("HttpEndpoint", js.undefined)
    
    @scala.inline
    def setHttpPutResponseHopLimit(value: Integer): Self = this.set("HttpPutResponseHopLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttpPutResponseHopLimit: Self = this.set("HttpPutResponseHopLimit", js.undefined)
    
    @scala.inline
    def setHttpTokens(value: LaunchTemplateHttpTokensState): Self = this.set("HttpTokens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttpTokens: Self = this.set("HttpTokens", js.undefined)
  }
}
