package typings.azureCoreHttp

import org.scalablytyped.runtime.StringDictionary
import typings.azureCoreHttp.azureCoreHttpStrings.binary
import typings.azureCoreHttp.azureCoreHttpStrings.form
import typings.azureCoreHttp.azureCoreHttpStrings.json
import typings.azureCoreHttp.azureCoreHttpStrings.multipart
import typings.azureCoreHttp.azureCoreHttpStrings.text
import typings.azureCoreHttp.azureCoreHttpStrings.unknown
import typings.azureCoreHttp.azureCoreHttpStrings.xml
import typings.azureCoreHttp.typesLatestSrcOperationParameterMod.OperationParameter
import typings.azureCoreHttp.typesLatestSrcOperationParameterMod.OperationQueryParameter
import typings.azureCoreHttp.typesLatestSrcOperationParameterMod.OperationURLParameter
import typings.azureCoreHttp.typesLatestSrcOperationResponseMod.OperationResponse
import typings.azureCoreHttp.typesLatestSrcSerializerMod.Serializer
import typings.azureCoreHttp.typesLatestSrcWebResourceMod.HttpMethods
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLatestSrcOperationSpecMod {
  
  @JSImport("@azure/core-http/types/latest/src/operationSpec", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getStreamResponseStatusCodes(operationSpec: OperationSpec): Set[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("getStreamResponseStatusCodes")(operationSpec.asInstanceOf[js.Any]).asInstanceOf[Set[Double]]
  
  trait OperationSpec extends StObject {
    
    /**
      * The URL that was provided in the service's specification. This will still have all of the URL
      * template variables in it. If this is not provided when the OperationSpec is created, then it
      * will be populated by a "baseUri" property on the ServiceClient.
      */
    val baseUrl: js.UndefOr[String] = js.undefined
    
    /**
      * The content type of the request body. This value will be used as the "Content-Type" header if
      * it is provided.
      */
    val contentType: js.UndefOr[String] = js.undefined
    
    /**
      * The parameters to the operation method that will be used to create a formdata body for the
      * operation's HTTP request.
      */
    val formDataParameters: js.UndefOr[js.Array[OperationParameter]] = js.undefined
    
    /**
      * The parameters to the operation method that will be converted to headers on the operation's
      * HTTP request.
      */
    val headerParameters: js.UndefOr[js.Array[OperationParameter]] = js.undefined
    
    /**
      * The HTTP method that should be used by requests for this operation.
      */
    val httpMethod: HttpMethods
    
    /**
      * Whether or not this operation uses XML request and response bodies.
      */
    val isXML: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The media type of the request body.
      * This value can be used to aide in serialization if it is provided.
      */
    val mediaType: js.UndefOr[json | xml | form | binary | multipart | text | unknown | String] = js.undefined
    
    /**
      * The fixed path for this operation's URL. This will still have all of the URL template variables
      * in it.
      */
    val path: js.UndefOr[String] = js.undefined
    
    /**
      * The parameters to the operation method that will be added to the constructed URL's query.
      */
    val queryParameters: js.UndefOr[js.Array[OperationQueryParameter]] = js.undefined
    
    /**
      * The parameter that will be used to construct the HTTP request's body.
      */
    val requestBody: js.UndefOr[OperationParameter] = js.undefined
    
    /**
      * The different types of responses that this operation can return based on what status code is
      * returned.
      */
    val responses: StringDictionary[OperationResponse]
    
    /**
      * The serializer to use in this operation.
      */
    val serializer: Serializer
    
    /**
      * The parameters to the operation method that will be substituted into the constructed URL.
      */
    val urlParameters: js.UndefOr[js.Array[OperationURLParameter]] = js.undefined
  }
  object OperationSpec {
    
    inline def apply(httpMethod: HttpMethods, responses: StringDictionary[OperationResponse], serializer: Serializer): OperationSpec = {
      val __obj = js.Dynamic.literal(httpMethod = httpMethod.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any], serializer = serializer.asInstanceOf[js.Any])
      __obj.asInstanceOf[OperationSpec]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OperationSpec] (val x: Self) extends AnyVal {
      
      inline def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
      
      inline def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
      
      inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
      
      inline def setFormDataParameters(value: js.Array[OperationParameter]): Self = StObject.set(x, "formDataParameters", value.asInstanceOf[js.Any])
      
      inline def setFormDataParametersUndefined: Self = StObject.set(x, "formDataParameters", js.undefined)
      
      inline def setFormDataParametersVarargs(value: OperationParameter*): Self = StObject.set(x, "formDataParameters", js.Array(value*))
      
      inline def setHeaderParameters(value: js.Array[OperationParameter]): Self = StObject.set(x, "headerParameters", value.asInstanceOf[js.Any])
      
      inline def setHeaderParametersUndefined: Self = StObject.set(x, "headerParameters", js.undefined)
      
      inline def setHeaderParametersVarargs(value: OperationParameter*): Self = StObject.set(x, "headerParameters", js.Array(value*))
      
      inline def setHttpMethod(value: HttpMethods): Self = StObject.set(x, "httpMethod", value.asInstanceOf[js.Any])
      
      inline def setIsXML(value: Boolean): Self = StObject.set(x, "isXML", value.asInstanceOf[js.Any])
      
      inline def setIsXMLUndefined: Self = StObject.set(x, "isXML", js.undefined)
      
      inline def setMediaType(value: json | xml | form | binary | multipart | text | unknown | String): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
      
      inline def setMediaTypeUndefined: Self = StObject.set(x, "mediaType", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setQueryParameters(value: js.Array[OperationQueryParameter]): Self = StObject.set(x, "queryParameters", value.asInstanceOf[js.Any])
      
      inline def setQueryParametersUndefined: Self = StObject.set(x, "queryParameters", js.undefined)
      
      inline def setQueryParametersVarargs(value: OperationQueryParameter*): Self = StObject.set(x, "queryParameters", js.Array(value*))
      
      inline def setRequestBody(value: OperationParameter): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
      
      inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
      
      inline def setResponses(value: StringDictionary[OperationResponse]): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
      
      inline def setSerializer(value: Serializer): Self = StObject.set(x, "serializer", value.asInstanceOf[js.Any])
      
      inline def setUrlParameters(value: js.Array[OperationURLParameter]): Self = StObject.set(x, "urlParameters", value.asInstanceOf[js.Any])
      
      inline def setUrlParametersUndefined: Self = StObject.set(x, "urlParameters", js.undefined)
      
      inline def setUrlParametersVarargs(value: OperationURLParameter*): Self = StObject.set(x, "urlParameters", js.Array(value*))
    }
  }
}
