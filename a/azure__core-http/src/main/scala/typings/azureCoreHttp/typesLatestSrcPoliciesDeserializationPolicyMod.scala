package typings.azureCoreHttp

import typings.azureCoreHttp.typesLatestSrcHttpOperationResponseMod.HttpOperationResponse
import typings.azureCoreHttp.typesLatestSrcPoliciesRequestPolicyMod.BaseRequestPolicy
import typings.azureCoreHttp.typesLatestSrcPoliciesRequestPolicyMod.RequestPolicy
import typings.azureCoreHttp.typesLatestSrcPoliciesRequestPolicyMod.RequestPolicyFactory
import typings.azureCoreHttp.typesLatestSrcPoliciesRequestPolicyMod.RequestPolicyOptions
import typings.azureCoreHttp.typesLatestSrcUtilSerializerDotcommonMod.SerializerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLatestSrcPoliciesDeserializationPolicyMod {
  
  @JSImport("@azure/core-http/types/latest/src/policies/deserializationPolicy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@azure/core-http/types/latest/src/policies/deserializationPolicy", "DefaultDeserializationOptions")
  @js.native
  val DefaultDeserializationOptions: DeserializationOptions = js.native
  
  @JSImport("@azure/core-http/types/latest/src/policies/deserializationPolicy", "DeserializationPolicy")
  @js.native
  open class DeserializationPolicy_ protected () extends BaseRequestPolicy {
    def this(nextPolicy: RequestPolicy, requestPolicyOptions: RequestPolicyOptions) = this()
    def this(
      nextPolicy: RequestPolicy,
      requestPolicyOptions: RequestPolicyOptions,
      deserializationContentTypes: DeserializationContentTypes
    ) = this()
    def this(
      nextPolicy: RequestPolicy,
      requestPolicyOptions: RequestPolicyOptions,
      deserializationContentTypes: Unit,
      parsingOptions: SerializerOptions
    ) = this()
    def this(
      nextPolicy: RequestPolicy,
      requestPolicyOptions: RequestPolicyOptions,
      deserializationContentTypes: DeserializationContentTypes,
      parsingOptions: SerializerOptions
    ) = this()
    
    val jsonContentTypes: js.Array[String] = js.native
    
    val xmlCharKey: String = js.native
    
    val xmlContentTypes: js.Array[String] = js.native
  }
  
  @JSImport("@azure/core-http/types/latest/src/policies/deserializationPolicy", "defaultJsonContentTypes")
  @js.native
  val defaultJsonContentTypes: js.Array[String] = js.native
  
  @JSImport("@azure/core-http/types/latest/src/policies/deserializationPolicy", "defaultXmlContentTypes")
  @js.native
  val defaultXmlContentTypes: js.Array[String] = js.native
  
  inline def deserializationPolicy(): RequestPolicyFactory = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializationPolicy")().asInstanceOf[RequestPolicyFactory]
  inline def deserializationPolicy(deserializationContentTypes: Unit, parsingOptions: SerializerOptions): RequestPolicyFactory = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializationPolicy")(deserializationContentTypes.asInstanceOf[js.Any], parsingOptions.asInstanceOf[js.Any])).asInstanceOf[RequestPolicyFactory]
  inline def deserializationPolicy(deserializationContentTypes: DeserializationContentTypes): RequestPolicyFactory = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializationPolicy")(deserializationContentTypes.asInstanceOf[js.Any]).asInstanceOf[RequestPolicyFactory]
  inline def deserializationPolicy(deserializationContentTypes: DeserializationContentTypes, parsingOptions: SerializerOptions): RequestPolicyFactory = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializationPolicy")(deserializationContentTypes.asInstanceOf[js.Any], parsingOptions.asInstanceOf[js.Any])).asInstanceOf[RequestPolicyFactory]
  
  inline def deserializeResponseBody(
    jsonContentTypes: js.Array[String],
    xmlContentTypes: js.Array[String],
    response: HttpOperationResponse
  ): js.Promise[HttpOperationResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeResponseBody")(jsonContentTypes.asInstanceOf[js.Any], xmlContentTypes.asInstanceOf[js.Any], response.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpOperationResponse]]
  inline def deserializeResponseBody(
    jsonContentTypes: js.Array[String],
    xmlContentTypes: js.Array[String],
    response: HttpOperationResponse,
    options: SerializerOptions
  ): js.Promise[HttpOperationResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeResponseBody")(jsonContentTypes.asInstanceOf[js.Any], xmlContentTypes.asInstanceOf[js.Any], response.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[HttpOperationResponse]]
  
  trait DeserializationContentTypes extends StObject {
    
    /**
      * The content-types that indicate that an operation response should be deserialized as JSON.
      * Defaults to [ "application/json", "text/json" ].
      */
    var json: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * The content-types that indicate that an operation response should be deserialized as XML.
      * Defaults to [ "application/xml", "application/atom+xml" ].
      */
    var xml: js.UndefOr[js.Array[String]] = js.undefined
  }
  object DeserializationContentTypes {
    
    inline def apply(): DeserializationContentTypes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeserializationContentTypes]
    }
    
    extension [Self <: DeserializationContentTypes](x: Self) {
      
      inline def setJson(value: js.Array[String]): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      inline def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
      
      inline def setJsonVarargs(value: String*): Self = StObject.set(x, "json", js.Array(value*))
      
      inline def setXml(value: js.Array[String]): Self = StObject.set(x, "xml", value.asInstanceOf[js.Any])
      
      inline def setXmlUndefined: Self = StObject.set(x, "xml", js.undefined)
      
      inline def setXmlVarargs(value: String*): Self = StObject.set(x, "xml", js.Array(value*))
    }
  }
  
  trait DeserializationOptions extends StObject {
    
    /**
      * Configures the expected content types for the deserialization of
      * JSON and XML response bodies.
      */
    var expectedContentTypes: DeserializationContentTypes
  }
  object DeserializationOptions {
    
    inline def apply(expectedContentTypes: DeserializationContentTypes): DeserializationOptions = {
      val __obj = js.Dynamic.literal(expectedContentTypes = expectedContentTypes.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeserializationOptions]
    }
    
    extension [Self <: DeserializationOptions](x: Self) {
      
      inline def setExpectedContentTypes(value: DeserializationContentTypes): Self = StObject.set(x, "expectedContentTypes", value.asInstanceOf[js.Any])
    }
  }
}
