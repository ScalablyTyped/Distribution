package typings.bent

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.bent.bentStrings.buffer
import typings.bent.bentStrings.json
import typings.bent.bentStrings.string
import typings.node.bufferMod.global.Buffer
import typings.node.streamMod.PassThrough
import typings.node.streamMod.Stream
import typings.std.Blob
import typings.std.Error
import typings.std.FormData
import typings.std.Response
import typings.std.ResponseType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(baseUrl: String, args: Options*): RequestFunction[ValidResponse] = ^.asInstanceOf[js.Dynamic].apply(scala.List(baseUrl.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[RequestFunction[ValidResponse]]
  inline def apply(baseUrl: String, `type`: buffer, args: Options*): RequestFunction[Buffer | js.typedarray.ArrayBuffer] = (^.asInstanceOf[js.Dynamic].apply((scala.List(baseUrl.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).`++`(args.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[RequestFunction[Buffer | js.typedarray.ArrayBuffer]]
  // Method or url first
  inline def apply(baseUrl: String, `type`: string, args: Options*): RequestFunction[String] = (^.asInstanceOf[js.Dynamic].apply((scala.List(baseUrl.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).`++`(args.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[RequestFunction[String]]
  inline def apply(`type`: buffer, args: Options*): RequestFunction[Buffer | js.typedarray.ArrayBuffer] = ^.asInstanceOf[js.Dynamic].apply(scala.List(`type`.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[RequestFunction[Buffer | js.typedarray.ArrayBuffer]]
  // Type first
  inline def apply(`type`: string, args: Options*): RequestFunction[String] = ^.asInstanceOf[js.Dynamic].apply(scala.List(`type`.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[RequestFunction[String]]
  // tslint:disable-next-line no-unnecessary-generics
  inline def apply[T /* <: ValidResponse */](args: Options*): RequestFunction[T] = ^.asInstanceOf[js.Dynamic].apply(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[RequestFunction[T]]
  inline def apply[T /* <: Json */](baseUrl: String, `type`: json, args: Options*): // tslint:disable-next-line no-unnecessary-generics
  RequestFunction[T] = (^.asInstanceOf[js.Dynamic].apply((scala.List(baseUrl.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).`++`(args.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[// tslint:disable-next-line no-unnecessary-generics
  RequestFunction[T]]
  // tslint:disable-next-line no-unnecessary-generics
  inline def apply[T /* <: Json */](`type`: json, args: Options*): RequestFunction[T] = ^.asInstanceOf[js.Dynamic].apply(scala.List(`type`.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[RequestFunction[T]]
  
  @JSImport("bent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("bent", "StatusError")
  @js.native
  open class StatusError ()
    extends StObject
       with Error {
    
    def arrayBuffer(): js.Promise[js.typedarray.ArrayBuffer | Buffer] = js.native
    
    var headers: StringDictionary[Any] = js.native
    
    def json(): js.Promise[Json] = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    var responseBody: js.Promise[js.typedarray.ArrayBuffer | Buffer] = js.native
    
    var statusCode: Double = js.native
    
    def text(): js.Promise[String] = js.native
  }
  
  type BaseUrl = String
  
  /* Rewritten from type alias, can be one of: 
    - typings.bent.mod.NodeResponse
    - typings.bent.mod.FetchResponse
  */
  trait BentResponse extends StObject
  
  trait FetchResponse
    extends StObject
       with Response
       with BentResponse {
    
    var statusCode: Double
  }
  object FetchResponse {
    
    inline def apply(
      arrayBuffer: () => js.Promise[js.typedarray.ArrayBuffer],
      blob: () => js.Promise[Blob],
      bodyUsed: Boolean,
      formData: () => js.Promise[FormData],
      headers: typings.std.Headers,
      json: () => js.Promise[Any],
      ok: Boolean,
      redirected: Boolean,
      status: Double,
      statusCode: Double,
      statusText: String,
      text: () => js.Promise[String],
      `type`: ResponseType,
      url: String
    ): FetchResponse = {
      val __obj = js.Dynamic.literal(arrayBuffer = js.Any.fromFunction0(arrayBuffer), blob = js.Any.fromFunction0(blob), bodyUsed = bodyUsed.asInstanceOf[js.Any], formData = js.Any.fromFunction0(formData), headers = headers.asInstanceOf[js.Any], json = js.Any.fromFunction0(json), ok = ok.asInstanceOf[js.Any], redirected = redirected.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any], text = js.Any.fromFunction0(text), url = url.asInstanceOf[js.Any], body = null)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[FetchResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FetchResponse] (val x: Self) extends AnyVal {
      
      inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    }
  }
  
  type Headers = StringDictionary[Any]
  
  /* Rewritten from type alias, can be one of: 
    - typings.bent.bentStrings.GET
    - typings.bent.bentStrings.POST
    - typings.bent.bentStrings.DELETE
    - typings.bent.bentStrings.PUT
    - typings.bent.bentStrings.PATCH
    - typings.bent.bentStrings.HEAD
    - typings.bent.bentStrings.OPTIONS
    - typings.bent.bentStrings.CONNECT
    - typings.bent.bentStrings.TRACE
  */
  trait HttpMethod extends StObject
  object HttpMethod {
    
    inline def CONNECT: typings.bent.bentStrings.CONNECT = "CONNECT".asInstanceOf[typings.bent.bentStrings.CONNECT]
    
    inline def DELETE: typings.bent.bentStrings.DELETE = "DELETE".asInstanceOf[typings.bent.bentStrings.DELETE]
    
    inline def GET: typings.bent.bentStrings.GET = "GET".asInstanceOf[typings.bent.bentStrings.GET]
    
    inline def HEAD: typings.bent.bentStrings.HEAD = "HEAD".asInstanceOf[typings.bent.bentStrings.HEAD]
    
    inline def OPTIONS: typings.bent.bentStrings.OPTIONS = "OPTIONS".asInstanceOf[typings.bent.bentStrings.OPTIONS]
    
    inline def PATCH: typings.bent.bentStrings.PATCH = "PATCH".asInstanceOf[typings.bent.bentStrings.PATCH]
    
    inline def POST: typings.bent.bentStrings.POST = "POST".asInstanceOf[typings.bent.bentStrings.POST]
    
    inline def PUT: typings.bent.bentStrings.PUT = "PUT".asInstanceOf[typings.bent.bentStrings.PUT]
    
    inline def TRACE: typings.bent.bentStrings.TRACE = "TRACE".asInstanceOf[typings.bent.bentStrings.TRACE]
  }
  
  type Json = (StringDictionary[Any] & NumberDictionary[Any]) | js.Array[Any]
  
  @js.native
  trait NodeResponse
    extends PassThrough
       with BentResponse {
    
    def arrayBuffer(): js.Promise[Buffer] = js.native
    
    var headers: Headers = js.native
    
    def json(): js.Promise[Json] = js.native
    
    var statusCode: Double = js.native
    
    var statusMessage: String = js.native
    
    def text(): js.Promise[String] = js.native
  }
  
  type Options = HttpMethod | StatusCode | Headers | BaseUrl
  
  type RequestBody = String | Stream | Buffer | js.typedarray.ArrayBuffer | Json
  
  type RequestFunction[T /* <: ValidResponse */] = js.Function3[
    /* url */ String, 
    /* body */ js.UndefOr[RequestBody], 
    /* headers */ js.UndefOr[Headers], 
    js.Promise[T]
  ]
  
  type StatusCode = Double
  
  type ValidResponse = BentResponse | String | Buffer | js.typedarray.ArrayBuffer | Json
}
