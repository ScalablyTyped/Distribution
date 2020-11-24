package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsApiGatewayEndpointConfiguration extends js.Object {
  
  /**
    * A list of endpoint types for the REST API. For an edge-optimized API, the endpoint type is EDGE. For a Regional API, the endpoint type is REGIONAL. For a private API, the endpoint type is PRIVATE.
    */
  var Types: js.UndefOr[NonEmptyStringList] = js.native
}
object AwsApiGatewayEndpointConfiguration {
  
  @scala.inline
  def apply(): AwsApiGatewayEndpointConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsApiGatewayEndpointConfiguration]
  }
  
  @scala.inline
  implicit class AwsApiGatewayEndpointConfigurationOps[Self <: AwsApiGatewayEndpointConfiguration] (val x: Self) extends AnyVal {
    
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
    def setTypesVarargs(value: NonEmptyString*): Self = this.set("Types", js.Array(value :_*))
    
    @scala.inline
    def setTypes(value: NonEmptyStringList): Self = this.set("Types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTypes: Self = this.set("Types", js.undefined)
  }
}
