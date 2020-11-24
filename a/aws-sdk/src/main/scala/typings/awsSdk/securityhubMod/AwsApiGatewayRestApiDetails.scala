package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsApiGatewayRestApiDetails extends js.Object {
  
  /**
    * The source of the API key for metering requests according to a usage plan.  HEADER indicates whether to read the API key from the X-API-Key header of a request.  AUTHORIZER indicates whether to read the API key from the UsageIdentifierKey from a custom authorizer.
    */
  var ApiKeySource: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The list of binary media types supported by the REST API.
    */
  var BinaryMediaTypes: js.UndefOr[NonEmptyStringList] = js.native
  
  /**
    * Indicates when the API was created. Uses the date-time format specified in RFC 3339 section 5.6, Internet Date/Time Format. The value cannot contain spaces. For example, 2020-03-22T13:22:13.933Z.
    */
  var CreatedDate: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * A description of the REST API.
    */
  var Description: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The endpoint configuration of the REST API.
    */
  var EndpointConfiguration: js.UndefOr[AwsApiGatewayEndpointConfiguration] = js.native
  
  /**
    * The identifier of the REST API.
    */
  var Id: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The minimum size in bytes of a payload before compression is enabled. If null, then compression is disabled. If 0, then all payloads are compressed.
    */
  var MinimumCompressionSize: js.UndefOr[Integer] = js.native
  
  /**
    * The name of the REST API.
    */
  var Name: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The version identifier for the REST API.
    */
  var Version: js.UndefOr[NonEmptyString] = js.native
}
object AwsApiGatewayRestApiDetails {
  
  @scala.inline
  def apply(): AwsApiGatewayRestApiDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsApiGatewayRestApiDetails]
  }
  
  @scala.inline
  implicit class AwsApiGatewayRestApiDetailsOps[Self <: AwsApiGatewayRestApiDetails] (val x: Self) extends AnyVal {
    
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
    def setApiKeySource(value: NonEmptyString): Self = this.set("ApiKeySource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApiKeySource: Self = this.set("ApiKeySource", js.undefined)
    
    @scala.inline
    def setBinaryMediaTypesVarargs(value: NonEmptyString*): Self = this.set("BinaryMediaTypes", js.Array(value :_*))
    
    @scala.inline
    def setBinaryMediaTypes(value: NonEmptyStringList): Self = this.set("BinaryMediaTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBinaryMediaTypes: Self = this.set("BinaryMediaTypes", js.undefined)
    
    @scala.inline
    def setCreatedDate(value: NonEmptyString): Self = this.set("CreatedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedDate: Self = this.set("CreatedDate", js.undefined)
    
    @scala.inline
    def setDescription(value: NonEmptyString): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setEndpointConfiguration(value: AwsApiGatewayEndpointConfiguration): Self = this.set("EndpointConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndpointConfiguration: Self = this.set("EndpointConfiguration", js.undefined)
    
    @scala.inline
    def setId(value: NonEmptyString): Self = this.set("Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    
    @scala.inline
    def setMinimumCompressionSize(value: Integer): Self = this.set("MinimumCompressionSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimumCompressionSize: Self = this.set("MinimumCompressionSize", js.undefined)
    
    @scala.inline
    def setName(value: NonEmptyString): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setVersion(value: NonEmptyString): Self = this.set("Version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("Version", js.undefined)
  }
}
