package typings
package d3DashRequestLib.d3DashRequestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Request extends js.Object {
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
  def get[ResponseData](callback: js.Function2[/* error */ js.Any, /* d */ ResponseData, scala.Unit]): this.type = js.native
  /**
    * Equivalent to `request.send` with the GET method: `request.send("GET", data)`.
    */
  def get[RequestData](data: RequestData): this.type = js.native
  /**
    * Equivalent to `request.send` with the GET method: `request.send("GET", data, callback)`.
    */
  def get[RequestData, ResponseData](data: RequestData, callback: js.Function2[/* error */ js.Any, /* d */ ResponseData, scala.Unit]): this.type = js.native
  def header(name: java.lang.String): this.type = js.native
  /**
    * Sets the request header with the specified name to the specified value and returns this request instance.
    * If value is null, removes the request header with the specified name instead.
    * Header names are case-insensitive.
    *
    * Request headers can only be modified before the request is sent.
    * Therefore, you cannot pass a callback to the request constructor if you wish to specify a header;
    * use `request.get` or similar instead.
    */
  def header(name: java.lang.String, value: java.lang.String): this.type = js.native
  /**
    * Returns the current value of the request header with the specified name.
    * Header names are case-insensitive.
    */
  @JSName("header")
  def header_String(name: java.lang.String): java.lang.String = js.native
  /**
    * Returns the current mime type, which defaults to null.
    */
  def mimeType(): java.lang.String | scala.Null = js.native
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
  def mimeType(value: java.lang.String): this.type = js.native
  @JSName("mimeType")
  def `mimeType_<this>`(): this.type = js.native
  /**
    * Returns the currently-assigned listener for the specified type, if any.
    */
  def on(`type`: java.lang.String): js.UndefOr[js.ThisFunction1[/* this */ this.type, /* data */ js.Any, scala.Unit]] = js.native
  /**
    * Sets the event listener for the specified type,
    * and returns this request instance.
    *
    * The type must be one of the following: "beforesend", "progress", "load", "error".
    *
    * If an event listener was already registered for the same type, the existing listener is removed before the new listener is added.
    * To register multiple listeners for the same type, the type may be followed by an optional name, such as `load.foo`. See d3-dispatch for details.
    */
  def on(
    `type`: java.lang.String,
    listener: js.ThisFunction1[/* this */ this.type, /* data */ js.Any, scala.Unit]
  ): this.type = js.native
  /**
    * Removes the current event listener for the specified type, if any.
    */
  @JSName("on")
  def `on_<this>`(`type`: java.lang.String): this.type = js.native
  /**
    * Returns the currently-assigned listener for the "beforesend" type, if any.
    */
  @JSName("on")
  def on_beforesend(`type`: d3DashRequestLib.d3DashRequestLibStrings.beforesend): js.UndefOr[
    js.ThisFunction1[/* this */ this.type, /* xhr */ stdLib.XMLHttpRequest, scala.Unit]
  ] = js.native
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
    `type`: d3DashRequestLib.d3DashRequestLibStrings.beforesend,
    listener: js.ThisFunction1[/* this */ this.type, /* xhr */ stdLib.XMLHttpRequest, scala.Unit]
  ): this.type = js.native
  /**
    * Returns the currently-assigned listener for the "error" type, if any.
    */
  @JSName("on")
  def on_error(`type`: d3DashRequestLib.d3DashRequestLibStrings.error): js.UndefOr[js.ThisFunction1[/* this */ this.type, /* error */ js.Any, scala.Unit]] = js.native
  /**
    * Sets the event listener for the "error" type,
    * when the request completes unsuccessfully; this includes 4xx and 5xx response codes,
    * and returns this request instance.
    *
    * If an event listener was already registered for the same type, the existing listener is removed before the new listener is added.
    * To register multiple listeners for the same type, the type may be followed by an optional name, such as `error.foo`. See d3-dispatch for details.
    */
  @JSName("on")
  def on_error(
    `type`: d3DashRequestLib.d3DashRequestLibStrings.error,
    listener: js.ThisFunction1[/* this */ this.type, /* error */ js.Any, scala.Unit]
  ): this.type = js.native
  /**
    * Returns the currently-assigned listener for the "load" type, if any.
    */
  @JSName("on")
  def on_load[ResponseData](`type`: d3DashRequestLib.d3DashRequestLibStrings.load): js.UndefOr[js.ThisFunction1[/* this */ this.type, /* data */ ResponseData, scala.Unit]] = js.native
  /**
    * Sets the event listener for the "load" type,
    * when the request completes successfully,
    * and returns this request instance.
    *
    * If an event listener was already registered for the same type, the existing listener is removed before the new listener is added.
    * To register multiple listeners for the same type, the type may be followed by an optional name, such as `load.foo`. See d3-dispatch for details.
    */
  @JSName("on")
  def on_load[ResponseData](
    `type`: d3DashRequestLib.d3DashRequestLibStrings.load,
    listener: js.ThisFunction1[/* this */ this.type, /* data */ ResponseData, scala.Unit]
  ): this.type = js.native
  /**
    * Returns the currently-assigned listener for the "progress" type, if any.
    */
  @JSName("on")
  def on_progress(`type`: d3DashRequestLib.d3DashRequestLibStrings.progress): js.UndefOr[
    js.ThisFunction1[/* this */ this.type, /* progressEvent */ stdLib.ProgressEvent, scala.Unit]
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
    `type`: d3DashRequestLib.d3DashRequestLibStrings.progress,
    listener: js.ThisFunction1[/* this */ this.type, /* progressEvent */ stdLib.ProgressEvent, scala.Unit]
  ): this.type = js.native
  /**
    * Returns the current password, which defaults to null.
    */
  def password(): java.lang.String | scala.Null = js.native
  /**
    * Sets the password for authentication to the specified string and returns this request instance.
    */
  def password(value: java.lang.String): this.type = js.native
  @JSName("password")
  def `password_<this>`(): this.type = js.native
  /**
    * Equivalent to `request.send` with the POST method: `request.send("POST")`.
    */
  def post(): this.type = js.native
  /**
    * Equivalent to `request.send` with the POST method: `request.send("POST", callback)`.
    */
  def post[ResponseData](
    callback: js.ThisFunction2[/* this */ this.type, /* error */ js.Any, /* d */ ResponseData, scala.Unit]
  ): this.type = js.native
  /**
    * Equivalent to `request.send` with the POST method: `request.send("POST", data)`.
    */
  def post[RequestData](data: RequestData): this.type = js.native
  /**
    * Equivalent to `request.send` with the POST method: `request.send("POST", data, callback)`.
    */
  def post[RequestData, ResponseData](
    data: RequestData,
    callback: js.ThisFunction2[/* this */ this.type, /* error */ js.Any, /* d */ ResponseData, scala.Unit]
  ): this.type = js.native
  /**
    * Sets the response value function to the specified function and returns this request instance.
    * The response value function is used to map the response XMLHttpRequest object to a useful data value.
    * See the convenience methods `json` and `text` for examples.
    */
  def response[ResponseData](
    callback: js.ThisFunction1[/* this */ this.type, /* response */ stdLib.XMLHttpRequest, ResponseData]
  ): this.type = js.native
  /**
    * Returns the current response type, which defaults to `` (the empty string).
    */
  def responseType(): js.UndefOr[stdLib.XMLHttpRequestResponseType] = js.native
  /**
    * Sets the response type attribute of the request and returns this request instance. Typical values are: `` (the empty string), `arraybuffer`, `blob`, `document`, and `text`.
    */
  def responseType(value: stdLib.XMLHttpRequestResponseType): this.type = js.native
  /**
    * Issues this request using the specified method (such as GET or POST).
    *
    * The listeners "load" and "error" should be registered via `request.on`.
    */
  def send(method: java.lang.String): this.type = js.native
  /**
    * Issues this request using the specified method (such as GET or POST) and returns this request instance.
    * The callback will be invoked asynchronously when the request succeeds or fails.
    * The callback is invoked with two arguments: the error, if any, and the response value.
    * The response value is undefined if an error occurs.
    */
  def send[ResponseData](
    method: java.lang.String,
    callback: js.ThisFunction2[
      /* this */ this.type, 
      /* error */ js.Any | scala.Null, 
      /* d */ ResponseData | scala.Null, 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Issues this request using the specified method (such as GET or POST), posting the specified data in the request body, and returns this request instance.
    *
    * The listeners "load" and "error" should be registered via `request.on`.
    */
  def send[RequestData](method: java.lang.String, data: RequestData): this.type = js.native
  /**
    * Issues this request using the specified method (such as GET or POST), posting the specified data in the request body, and returns this request instance.
    * The callback will be invoked asynchronously when the request succeeds or fails.
    * The callback is invoked with two arguments: the error, if any, and the response value.
    * The response value is undefined if an error occurs.
    */
  def send[RequestData, ResponseData](
    method: java.lang.String,
    data: RequestData,
    callback: js.ThisFunction2[
      /* this */ this.type, 
      /* error */ js.Any | scala.Null, 
      /* d */ ResponseData | scala.Null, 
      scala.Unit
    ]
  ): this.type = js.native
  /**
    * Returns the current response timeout, which defaults to 0.
    */
  def timeout(): scala.Double = js.native
  /**
    * Sets the timeout attribute of the request to the specified number of milliseconds and returns this request instance.
    */
  def timeout(value: scala.Double): this.type = js.native
  /**
    * Returns the current user name, which defaults to null.
    */
  def user(): java.lang.String | scala.Null = js.native
  /**
    * Sets the user name for authentication to the specified string and returns this request instance.
    */
  def user(value: java.lang.String): this.type = js.native
  @JSName("user")
  def `user_<this>`(): this.type = js.native
}

