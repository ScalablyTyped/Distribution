package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsApiGatewayRestApiDetails extends StObject {
  
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
  implicit class AwsApiGatewayRestApiDetailsMutableBuilder[Self <: AwsApiGatewayRestApiDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiKeySource(value: NonEmptyString): Self = StObject.set(x, "ApiKeySource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiKeySourceUndefined: Self = StObject.set(x, "ApiKeySource", js.undefined)
    
    @scala.inline
    def setBinaryMediaTypes(value: NonEmptyStringList): Self = StObject.set(x, "BinaryMediaTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBinaryMediaTypesUndefined: Self = StObject.set(x, "BinaryMediaTypes", js.undefined)
    
    @scala.inline
    def setBinaryMediaTypesVarargs(value: NonEmptyString*): Self = StObject.set(x, "BinaryMediaTypes", js.Array(value :_*))
    
    @scala.inline
    def setCreatedDate(value: NonEmptyString): Self = StObject.set(x, "CreatedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedDateUndefined: Self = StObject.set(x, "CreatedDate", js.undefined)
    
    @scala.inline
    def setDescription(value: NonEmptyString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setEndpointConfiguration(value: AwsApiGatewayEndpointConfiguration): Self = StObject.set(x, "EndpointConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointConfigurationUndefined: Self = StObject.set(x, "EndpointConfiguration", js.undefined)
    
    @scala.inline
    def setId(value: NonEmptyString): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setMinimumCompressionSize(value: Integer): Self = StObject.set(x, "MinimumCompressionSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumCompressionSizeUndefined: Self = StObject.set(x, "MinimumCompressionSize", js.undefined)
    
    @scala.inline
    def setName(value: NonEmptyString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setVersion(value: NonEmptyString): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
  }
}
