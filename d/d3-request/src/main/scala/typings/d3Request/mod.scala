package typings.d3Request

import org.scalablytyped.runtime.StringDictionary
import typings.d3Dsv.mod.DSVParsedArray
import typings.d3Dsv.mod.DSVRowString
import typings.d3Request.d3RequestStrings.beforesend
import typings.d3Request.d3RequestStrings.error
import typings.d3Request.d3RequestStrings.load
import typings.d3Request.d3RequestStrings.progress
import typings.std.DocumentFragment
import typings.std.EventTarget
import typings.std.ProgressEvent
import typings.std.XMLHttpRequest
import typings.std.XMLHttpRequestResponseType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("d3-request", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def csv(url: String): DsvRequest = js.native
  def csv(
    url: String,
    callback: js.ThisFunction2[
      /* this */ DsvRequest, 
      /* error */ js.Any, 
      /* d */ DSVParsedArray[DSVRowString[String]], 
      Unit
    ]
  ): DsvRequest = js.native
  def csv[ParsedRow /* <: js.Object */](
    url: String,
    row: js.Function3[
      /* rawRow */ DSVRowString[String], 
      /* index */ Double, 
      /* columns */ js.Array[String], 
      ParsedRow
    ],
    callback: js.ThisFunction2[/* this */ DsvRequest, /* error */ js.Any, /* d */ DSVParsedArray[ParsedRow], Unit]
  ): DsvRequest = js.native
  
  def html(url: String): Request_ = js.native
  def html(
    url: String,
    callback: js.ThisFunction2[/* this */ Request_, /* error */ js.Any, /* d */ DocumentFragment, Unit]
  ): Request_ = js.native
  
  def json(url: String): Request_ = js.native
  def json[ParsedObject /* <: StringDictionary[js.Any] */](
    url: String,
    callback: js.ThisFunction2[/* this */ Request_, /* error */ js.Any, /* d */ ParsedObject, Unit]
  ): Request_ = js.native
  
  def request(url: String): Request_ = js.native
  def request(
    url: String,
    callback: js.ThisFunction2[/* this */ Request_, /* error */ js.Any, /* d */ XMLHttpRequest, Unit]
  ): Request_ = js.native
  
  def text(url: String): Request_ = js.native
  def text(
    url: String,
    callback: js.ThisFunction2[/* this */ Request_, /* error */ js.Any, /* d */ String, Unit]
  ): Request_ = js.native
  
  def tsv(url: String): DsvRequest = js.native
  def tsv(
    url: String,
    callback: js.ThisFunction2[
      /* this */ DsvRequest, 
      /* error */ js.Any, 
      /* d */ DSVParsedArray[DSVRowString[String]], 
      Unit
    ]
  ): DsvRequest = js.native
  def tsv[ParsedRow /* <: js.Object */](
    url: String,
    row: js.Function3[
      /* rawRow */ DSVRowString[String], 
      /* index */ Double, 
      /* columns */ js.Array[String], 
      ParsedRow
    ],
    callback: js.ThisFunction2[/* this */ DsvRequest, /* error */ js.Any, /* d */ DSVParsedArray[ParsedRow], Unit]
  ): DsvRequest = js.native
  
  def xml(url: String): Request_ = js.native
  def xml(
    url: String,
    callback: js.ThisFunction2[/* this */ Request_, /* error */ js.Any, /* d */ js.Any, Unit]
  ): Request_ = js.native
  
  @js.native
  trait DsvRequest extends Request_ {
    
    def row[ParsedRow /* <: js.Object */](
      value: js.Function3[
          /* rawRow */ DSVRowString[String], 
          /* index */ Double, 
          /* columns */ js.Array[String], 
          ParsedRow
        ]
    ): DsvRequest = js.native
  }
  
  @js.native
  trait Request_ extends js.Object {
    
    /**
      * Aborts this request, if it is currently in-flight, and returns this request instance.
      * See XMLHttpRequest’s abort.
      */
    def abort(): this.type = js.native
    
    /**
      * Equivalent to `request.send` with the GET method: `request.send("GET")`.
      */
    def get(): this.type = js.native
    /**
      * Equivalent to `request.send` with the GET method: `request.send("GET", callback)`.
      */
    def get[ResponseData](callback: js.Function2[/* error */ js.Any, /* d */ ResponseData, Unit]): this.type = js.native
    /**
      * Equivalent to `request.send` with the GET method: `request.send("GET", data)`.
      */
    def get[RequestData](data: RequestData): this.type = js.native
    /**
      * Equivalent to `request.send` with the GET method: `request.send("GET", data, callback)`.
      */
    def get[RequestData, ResponseData](data: RequestData, callback: js.Function2[/* error */ js.Any, /* d */ ResponseData, Unit]): this.type = js.native
    
    /**
      * Sets the request header with the specified name to the specified value and returns this request instance.
      * If value is null, removes the request header with the specified name instead.
      * Header names are case-insensitive.
      *
      * Request headers can only be modified before the request is sent.
      * Therefore, you cannot pass a callback to the request constructor if you wish to specify a header;
      * use `request.get` or similar instead.
      */
    def header(name: String): this.type = js.native
    def header(name: String, value: String): this.type = js.native
    /**
      * Returns the current value of the request header with the specified name.
      * Header names are case-insensitive.
      */
    @JSName("header")
    def header_String(name: String): String = js.native
    
    /**
      * Sets the request mime type to the specified value and returns this request instance.
      * If type is null, clears the current mime type (if any) instead.
      *
      * The mime type is used to both set the "Accept" request header and for `overrideMimeType`, where supported.
      *
      * The request mime type can only be modified before the request is sent.
      * Therefore, you cannot pass a callback to the request constructor if you wish to override the mime type;
      * use `request.get` or similar instead.
      */
    def mimeType(): this.type = js.native
    def mimeType(value: String): this.type = js.native
    /**
      * Returns the current mime type, which defaults to null.
      */
    @JSName("mimeType")
    def mimeType_Union(): String | Null = js.native
    
    /**
      * Returns the currently-assigned listener for the specified type, if any.
      */
    def on(`type`: String): js.UndefOr[js.ThisFunction1[/* this */ this.type, /* data */ js.Any, Unit]] = js.native
    /**
      * Sets the event listener for the specified type,
      * and returns this request instance.
      *
      * The type must be one of the following: "beforesend", "progress", "load", "error".
      *
      * If an event listener was already registered for the same type, the existing listener is removed before the new listener is added.
      * To register multiple listeners for the same type, the type may be followed by an optional name, such as `load.foo`. See d3-dispatch for details.
      */
    def on(`type`: String, listener: js.ThisFunction1[/* this */ this.type, /* data */ js.Any, Unit]): this.type = js.native
    /**
      * Removes the current event listener for the specified type, if any.
      */
    def on(`type`: String, listener: Null): this.type = js.native
    /**
      * Returns the currently-assigned listener for the "beforesend" type, if any.
      */
    @JSName("on")
    def on_beforesend(`type`: beforesend): js.UndefOr[js.ThisFunction1[/* this */ this.type, /* xhr */ XMLHttpRequest, Unit]] = js.native
    /**
      * Sets the event listener for the "beforesend" type,
      * to allow custom headers and the like to be set before the request is sent,
      * and returns this request instance.
      *
      * If an event listener was already registered for the same type, the existing listener is removed before the new listener is added.
      * To register multiple listeners for the same type, the type may be followed by an optional name, such as `beforesend.foo`. See d3-dispatch for details.
      */
    @JSName("on")
    def on_beforesend(
      `type`: beforesend,
      listener: js.ThisFunction1[/* this */ this.type, /* xhr */ XMLHttpRequest, Unit]
    ): this.type = js.native
    /**
      * Returns the currently-assigned listener for the "error" type, if any.
      */
    @JSName("on")
    def on_error(`type`: error): js.UndefOr[js.ThisFunction1[/* this */ this.type, /* error */ js.Any, Unit]] = js.native
    /**
      * Sets the event listener for the "error" type,
      * when the request completes unsuccessfully; this includes 4xx and 5xx response codes,
      * and returns this request instance.
      *
      * If an event listener was already registered for the same type, the existing listener is removed before the new listener is added.
      * To register multiple listeners for the same type, the type may be followed by an optional name, such as `error.foo`. See d3-dispatch for details.
      */
    @JSName("on")
    def on_error(`type`: error, listener: js.ThisFunction1[/* this */ this.type, /* error */ js.Any, Unit]): this.type = js.native
    /**
      * Returns the currently-assigned listener for the "load" type, if any.
      */
    @JSName("on")
    def on_load[ResponseData](`type`: load): js.UndefOr[js.ThisFunction1[/* this */ this.type, /* data */ ResponseData, Unit]] = js.native
    /**
      * Sets the event listener for the "load" type,
      * when the request completes successfully,
      * and returns this request instance.
      *
      * If an event listener was already registered for the same type, the existing listener is removed before the new listener is added.
      * To register multiple listeners for the same type, the type may be followed by an optional name, such as `load.foo`. See d3-dispatch for details.
      */
    @JSName("on")
    def on_load[ResponseData](`type`: load, listener: js.ThisFunction1[/* this */ this.type, /* data */ ResponseData, Unit]): this.type = js.native
    /**
      * Returns the currently-assigned listener for the "progress" type, if any.
      */
    @JSName("on")
    def on_progress(`type`: progress): js.UndefOr[
        js.ThisFunction1[/* this */ this.type, /* progressEvent */ ProgressEvent[EventTarget], Unit]
      ] = js.native
    /**
      * Sets the event listener for the "progress" type,
      * to monitor the progress of the request,
      * and returns this request instance.
      *
      * If an event listener was already registered for the same type, the existing listener is removed before the new listener is added.
      * To register multiple listeners for the same type, the type may be followed by an optional name, such as `progress.foo`. See d3-dispatch for details.
      */
    @JSName("on")
    def on_progress(
      `type`: progress,
      listener: js.ThisFunction1[/* this */ this.type, /* progressEvent */ ProgressEvent[EventTarget], Unit]
    ): this.type = js.native
    
    /**
      * Sets the password for authentication to the specified string and returns this request instance.
      */
    def password(): this.type = js.native
    def password(value: String): this.type = js.native
    /**
      * Returns the current password, which defaults to null.
      */
    @JSName("password")
    def password_Union(): String | Null = js.native
    
    /**
      * Equivalent to `request.send` with the POST method: `request.send("POST")`.
      */
    def post(): this.type = js.native
    /**
      * Equivalent to `request.send` with the POST method: `request.send("POST", callback)`.
      */
    def post[ResponseData](callback: js.ThisFunction2[/* this */ this.type, /* error */ js.Any, /* d */ ResponseData, Unit]): this.type = js.native
    /**
      * Equivalent to `request.send` with the POST method: `request.send("POST", data)`.
      */
    def post[RequestData](data: RequestData): this.type = js.native
    /**
      * Equivalent to `request.send` with the POST method: `request.send("POST", data, callback)`.
      */
    def post[RequestData, ResponseData](
      data: RequestData,
      callback: js.ThisFunction2[/* this */ this.type, /* error */ js.Any, /* d */ ResponseData, Unit]
    ): this.type = js.native
    
    /**
      * Sets the response value function to the specified function and returns this request instance.
      * The response value function is used to map the response XMLHttpRequest object to a useful data value.
      * See the convenience methods `json` and `text` for examples.
      */
    def response[ResponseData](callback: js.ThisFunction1[/* this */ this.type, /* response */ XMLHttpRequest, ResponseData]): this.type = js.native
    
    /**
      * Returns the current response type, which defaults to `` (the empty string).
      */
    def responseType(): js.UndefOr[XMLHttpRequestResponseType] = js.native
    /**
      * Sets the response type attribute of the request and returns this request instance. Typical values are: `` (the empty string), `arraybuffer`, `blob`, `document`, and `text`.
      */
    def responseType(value: XMLHttpRequestResponseType): this.type = js.native
    
    /**
      * Issues this request using the specified method (such as GET or POST).
      *
      * The listeners "load" and "error" should be registered via `request.on`.
      */
    def send(method: String): this.type = js.native
    /**
      * Issues this request using the specified method (such as GET or POST) and returns this request instance.
      * The callback will be invoked asynchronously when the request succeeds or fails.
      * The callback is invoked with two arguments: the error, if any, and the response value.
      * The response value is undefined if an error occurs.
      */
    def send[ResponseData](
      method: String,
      callback: js.ThisFunction2[/* this */ this.type, /* error */ js.Any | Null, /* d */ ResponseData | Null, Unit]
    ): this.type = js.native
    /**
      * Issues this request using the specified method (such as GET or POST), posting the specified data in the request body, and returns this request instance.
      *
      * The listeners "load" and "error" should be registered via `request.on`.
      */
    def send[RequestData](method: String, data: RequestData): this.type = js.native
    /**
      * Issues this request using the specified method (such as GET or POST), posting the specified data in the request body, and returns this request instance.
      * The callback will be invoked asynchronously when the request succeeds or fails.
      * The callback is invoked with two arguments: the error, if any, and the response value.
      * The response value is undefined if an error occurs.
      */
    def send[RequestData, ResponseData](
      method: String,
      data: RequestData,
      callback: js.ThisFunction2[/* this */ this.type, /* error */ js.Any | Null, /* d */ ResponseData | Null, Unit]
    ): this.type = js.native
    
    /**
      * Returns the current response timeout, which defaults to 0.
      */
    def timeout(): Double = js.native
    /**
      * Sets the timeout attribute of the request to the specified number of milliseconds and returns this request instance.
      */
    def timeout(value: Double): this.type = js.native
    
    /**
      * Sets the user name for authentication to the specified string and returns this request instance.
      */
    def user(): this.type = js.native
    def user(value: String): this.type = js.native
    /**
      * Returns the current user name, which defaults to null.
      */
    @JSName("user")
    def user_Union(): String | Null = js.native
  }
}
