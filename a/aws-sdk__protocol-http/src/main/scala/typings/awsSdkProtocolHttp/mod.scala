package typings.awsSdkProtocolHttp

import typings.awsSdkProtocolHttp.distTypesFieldMod.FieldOptions
import typings.awsSdkProtocolHttp.distTypesFieldsMod.FieldsOptions
import typings.awsSdkProtocolHttp.distTypesHttpRequestMod.HttpRequestOptions
import typings.awsSdkProtocolHttp.distTypesHttpResponseMod.HttpResponseOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/protocol-http", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@aws-sdk/protocol-http", "Field")
  @js.native
  open class Field protected ()
    extends typings.awsSdkProtocolHttp.distTypesFieldMod.Field {
    def this(param0: FieldOptions) = this()
  }
  
  @JSImport("@aws-sdk/protocol-http", "FieldPosition")
  @js.native
  object FieldPosition extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.awsSdkProtocolHttp.distTypesFieldPositionMod.FieldPosition & Double] = js.native
    
    /* 0 */ val HEADER: typings.awsSdkProtocolHttp.distTypesFieldPositionMod.FieldPosition.HEADER & Double = js.native
    
    /* 1 */ val TRAILER: typings.awsSdkProtocolHttp.distTypesFieldPositionMod.FieldPosition.TRAILER & Double = js.native
  }
  
  @JSImport("@aws-sdk/protocol-http", "Fields")
  @js.native
  open class Fields protected ()
    extends typings.awsSdkProtocolHttp.distTypesFieldsMod.Fields {
    def this(param0: FieldsOptions) = this()
  }
  
  @JSImport("@aws-sdk/protocol-http", "HttpRequest")
  @js.native
  open class HttpRequest protected ()
    extends typings.awsSdkProtocolHttp.distTypesHttpRequestMod.HttpRequest {
    def this(options: HttpRequestOptions) = this()
  }
  /* static members */
  object HttpRequest {
    
    @JSImport("@aws-sdk/protocol-http", "HttpRequest")
    @js.native
    val ^ : js.Any = js.native
    
    inline def isInstance(request: Any): /* is @aws-sdk/protocol-http.@aws-sdk/protocol-http/dist-types/httpRequest.HttpRequest */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(request.asInstanceOf[js.Any]).asInstanceOf[/* is @aws-sdk/protocol-http.@aws-sdk/protocol-http/dist-types/httpRequest.HttpRequest */ Boolean]
  }
  
  @JSImport("@aws-sdk/protocol-http", "HttpResponse")
  @js.native
  open class HttpResponse protected ()
    extends typings.awsSdkProtocolHttp.distTypesHttpResponseMod.HttpResponse {
    def this(options: HttpResponseOptions) = this()
  }
  /* static members */
  object HttpResponse {
    
    @JSImport("@aws-sdk/protocol-http", "HttpResponse")
    @js.native
    val ^ : js.Any = js.native
    
    inline def isInstance(response: Any): /* is @aws-sdk/protocol-http.@aws-sdk/protocol-http/dist-types/httpResponse.HttpResponse */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(response.asInstanceOf[js.Any]).asInstanceOf[/* is @aws-sdk/protocol-http.@aws-sdk/protocol-http/dist-types/httpResponse.HttpResponse */ Boolean]
  }
  
  inline def isValidHostname(hostname: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidHostname")(hostname.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
