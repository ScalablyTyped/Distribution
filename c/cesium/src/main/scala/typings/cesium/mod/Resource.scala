package typings.cesium.mod

import typings.cesium.anon.CallbackParameterName
import typings.cesium.anon.Data
import typings.cesium.anon.FlipY
import typings.cesium.anon.Headers
import typings.cesium.anon.OverrideMimeType
import typings.cesium.anon.PreferBlob
import typings.cesium.anon.QueryParameters
import typings.cesium.anon.ResponseType
import typings.cesium.mod.Resource.ConstructorOptions
import typings.std.Blob
import typings.std.HTMLImageElement
import typings.std.ImageBitmap
import typings.std.XMLDocument
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "Resource")
@js.native
open class Resource protected () extends StObject {
  def this(options: String) = this()
  def this(options: ConstructorOptions) = this()
  
  /**
    * Appends a forward slash to the URL.
    */
  def appendForwardSlash(): Unit = js.native
  
  /**
    * Combines the specified object and the existing query parameters. This allows you to add many parameters at once,
    *  as opposed to adding them one at a time to the queryParameters property.
    * @param params - The query parameters
    */
  def appendQueryParameters(params: Any): Unit = js.native
  
  def clone(result: Resource): Resource = js.native
  
  /**
    * Asynchronously deletes the given resource.  Returns a promise that will resolve to
    * the result once loaded, or reject if the resource failed to load.  The data is loaded
    * using XMLHttpRequest, which means that in order to make requests to another origin,
    * the server must have Cross-Origin Resource Sharing (CORS) headers enabled.
    * @example
    * resource.delete()
    *   .then(function(body) {
    *       // use the data
    *   }).catch(function(error) {
    *       // an error occurred
    *   });
    * @param [options] - Object with the following properties:
    * @param [options.responseType] - The type of response.  This controls the type of item returned.
    * @param [options.headers] - Additional HTTP headers to send with the request, if any.
    * @param [options.overrideMimeType] - Overrides the MIME type returned by the server.
    * @returns a promise that will resolve to the requested data when loaded. Returns undefined if <code>request.throttle</code> is true and the request does not have high enough priority.
    */
  def delete(): js.UndefOr[js.Promise[Any]] = js.native
  def delete(options: OverrideMimeType): js.UndefOr[js.Promise[Any]] = js.native
  
  /**
    * The file extension of the resource.
    */
  val `extension`: String = js.native
  
  /**
    * Asynchronously loads the given resource.  Returns a promise that will resolve to
    * the result once loaded, or reject if the resource failed to load.  The data is loaded
    * using XMLHttpRequest, which means that in order to make requests to another origin,
    * the server must have Cross-Origin Resource Sharing (CORS) headers enabled. It's recommended that you use
    * the more specific functions eg. fetchJson, fetchBlob, etc.
    * @example
    * resource.fetch()
    *   .then(function(body) {
    *       // use the data
    *   }).catch(function(error) {
    *       // an error occurred
    *   });
    * @param [options] - Object with the following properties:
    * @param [options.responseType] - The type of response.  This controls the type of item returned.
    * @param [options.headers] - Additional HTTP headers to send with the request, if any.
    * @param [options.overrideMimeType] - Overrides the MIME type returned by the server.
    * @returns a promise that will resolve to the requested data when loaded. Returns undefined if <code>request.throttle</code> is true and the request does not have high enough priority.
    */
  def fetch(): js.UndefOr[js.Promise[Any]] = js.native
  def fetch(options: OverrideMimeType): js.UndefOr[js.Promise[Any]] = js.native
  
  /**
    * Asynchronously loads the resource as raw binary data.  Returns a promise that will resolve to
    * an ArrayBuffer once loaded, or reject if the resource failed to load.  The data is loaded
    * using XMLHttpRequest, which means that in order to make requests to another origin,
    * the server must have Cross-Origin Resource Sharing (CORS) headers enabled.
    * @example
    * // load a single URL asynchronously
    * resource.fetchArrayBuffer().then(function(arrayBuffer) {
    *     // use the data
    * }).catch(function(error) {
    *     // an error occurred
    * });
    * @returns a promise that will resolve to the requested data when loaded. Returns undefined if <code>request.throttle</code> is true and the request does not have high enough priority.
    */
  def fetchArrayBuffer(): js.UndefOr[js.Promise[js.typedarray.ArrayBuffer]] = js.native
  
  /**
    * Asynchronously loads the given resource as a blob.  Returns a promise that will resolve to
    * a Blob once loaded, or reject if the resource failed to load.  The data is loaded
    * using XMLHttpRequest, which means that in order to make requests to another origin,
    * the server must have Cross-Origin Resource Sharing (CORS) headers enabled.
    * @example
    * // load a single URL asynchronously
    * resource.fetchBlob().then(function(blob) {
    *     // use the data
    * }).catch(function(error) {
    *     // an error occurred
    * });
    * @returns a promise that will resolve to the requested data when loaded. Returns undefined if <code>request.throttle</code> is true and the request does not have high enough priority.
    */
  def fetchBlob(): js.UndefOr[js.Promise[Blob]] = js.native
  
  /**
    * Asynchronously loads the given image resource.  Returns a promise that will resolve to
    * an {@link https://developer.mozilla.org/en-US/docs/Web/API/ImageBitmap|ImageBitmap} if <code>preferImageBitmap</code> is true and the browser supports <code>createImageBitmap</code> or otherwise an
    * {@link https://developer.mozilla.org/en-US/docs/Web/API/HTMLImageElement|Image} once loaded, or reject if the image failed to load.
    * @example
    * // load a single image asynchronously
    * resource.fetchImage().then(function(image) {
    *     // use the loaded image
    * }).catch(function(error) {
    *     // an error occurred
    * });
    *
    * // load several images in parallel
    * Promise.all([resource1.fetchImage(), resource2.fetchImage()]).then(function(images) {
    *     // images is an array containing all the loaded images
    * });
    * @param [options] - An object with the following properties.
    * @param [options.preferBlob = false] - If true, we will load the image via a blob.
    * @param [options.preferImageBitmap = false] - If true, image will be decoded during fetch and an <code>ImageBitmap</code> is returned.
    * @param [options.flipY = false] - If true, image will be vertically flipped during decode. Only applies if the browser supports <code>createImageBitmap</code>.
    * @param [options.skipColorSpaceConversion = false] - If true, any custom gamma or color profiles in the image will be ignored. Only applies if the browser supports <code>createImageBitmap</code>.
    * @returns a promise that will resolve to the requested data when loaded. Returns undefined if <code>request.throttle</code> is true and the request does not have high enough priority.
    */
  def fetchImage(): js.UndefOr[js.Promise[ImageBitmap | HTMLImageElement]] = js.native
  def fetchImage(options: FlipY): js.UndefOr[js.Promise[ImageBitmap | HTMLImageElement]] = js.native
  
  /**
    * Asynchronously loads the given resource as JSON.  Returns a promise that will resolve to
    * a JSON object once loaded, or reject if the resource failed to load.  The data is loaded
    * using XMLHttpRequest, which means that in order to make requests to another origin,
    * the server must have Cross-Origin Resource Sharing (CORS) headers enabled. This function
    * adds 'Accept: application/json,&#42;&#47;&#42;;q=0.01' to the request headers, if not
    * already specified.
    * @example
    * resource.fetchJson().then(function(jsonData) {
    *     // Do something with the JSON object
    * }).catch(function(error) {
    *     // an error occurred
    * });
    * @returns a promise that will resolve to the requested data when loaded. Returns undefined if <code>request.throttle</code> is true and the request does not have high enough priority.
    */
  def fetchJson(): js.UndefOr[js.Promise[Any]] = js.native
  
  /**
    * Requests a resource using JSONP.
    * @example
    * // load a data asynchronously
    * resource.fetchJsonp().then(function(data) {
    *     // use the loaded data
    * }).catch(function(error) {
    *     // an error occurred
    * });
    * @param [callbackParameterName = 'callback'] - The callback parameter name that the server expects.
    * @returns a promise that will resolve to the requested data when loaded. Returns undefined if <code>request.throttle</code> is true and the request does not have high enough priority.
    */
  def fetchJsonp(): js.UndefOr[js.Promise[Any]] = js.native
  def fetchJsonp(callbackParameterName: String): js.UndefOr[js.Promise[Any]] = js.native
  
  /**
    * Asynchronously loads the given resource as text.  Returns a promise that will resolve to
    * a String once loaded, or reject if the resource failed to load.  The data is loaded
    * using XMLHttpRequest, which means that in order to make requests to another origin,
    * the server must have Cross-Origin Resource Sharing (CORS) headers enabled.
    * @example
    * // load text from a URL, setting a custom header
    * const resource = new Resource({
    *   url: 'http://someUrl.com/someJson.txt',
    *   headers: {
    *     'X-Custom-Header' : 'some value'
    *   }
    * });
    * resource.fetchText().then(function(text) {
    *     // Do something with the text
    * }).catch(function(error) {
    *     // an error occurred
    * });
    * @returns a promise that will resolve to the requested data when loaded. Returns undefined if <code>request.throttle</code> is true and the request does not have high enough priority.
    */
  def fetchText(): js.UndefOr[js.Promise[String]] = js.native
  
  /**
    * Asynchronously loads the given resource as XML.  Returns a promise that will resolve to
    * an XML Document once loaded, or reject if the resource failed to load.  The data is loaded
    * using XMLHttpRequest, which means that in order to make requests to another origin,
    * the server must have Cross-Origin Resource Sharing (CORS) headers enabled.
    * @example
    * // load XML from a URL, setting a custom header
    * Cesium.loadXML('http://someUrl.com/someXML.xml', {
    *   'X-Custom-Header' : 'some value'
    * }).then(function(document) {
    *     // Do something with the document
    * }).catch(function(error) {
    *     // an error occurred
    * });
    * @returns a promise that will resolve to the requested data when loaded. Returns undefined if <code>request.throttle</code> is true and the request does not have high enough priority.
    */
  def fetchXML(): js.UndefOr[js.Promise[XMLDocument]] = js.native
  
  /**
    * Returns the base path of the Resource.
    * @param [includeQuery = false] - Whether or not to include the query string and fragment form the uri
    * @returns The base URI of the resource
    */
  def getBaseUri(): String = js.native
  def getBaseUri(includeQuery: Boolean): String = js.native
  
  /**
    * Returns a resource relative to the current instance. All properties remain the same as the current instance unless overridden in options.
    * @param options - An object with the following properties
    * @param [options.url] - The url that will be resolved relative to the url of the current instance.
    * @param [options.queryParameters] - An object containing query parameters that will be combined with those of the current instance.
    * @param [options.templateValues] - Key/Value pairs that are used to replace template values (eg. {x}). These will be combined with those of the current instance.
    * @param [options.headers = {}] - Additional HTTP headers that will be sent.
    * @param [options.proxy] - A proxy to be used when loading the resource.
    * @param [options.retryCallback] - The function to call when loading the resource fails.
    * @param [options.retryAttempts] - The number of times the retryCallback should be called before giving up.
    * @param [options.request] - A Request object that will be used. Intended for internal use only.
    * @param [options.preserveQueryParameters = false] - If true, this will keep all query parameters from the current resource and derived resource. If false, derived parameters will replace those of the current resource.
    * @returns The resource derived from the current one.
    */
  def getDerivedResource(options: Headers): Resource = js.native
  
  /**
    * Returns the url, optional with the query string and processed by a proxy.
    * @param [query = false] - If true, the query string is included.
    * @param [proxy = false] - If true, the url is processed by the proxy object, if defined.
    * @returns The url with all the requested components.
    */
  def getUrlComponent(): String = js.native
  def getUrlComponent(query: Boolean): String = js.native
  def getUrlComponent(query: Boolean, proxy: Boolean): String = js.native
  def getUrlComponent(query: Unit, proxy: Boolean): String = js.native
  
  /**
    * True if the Resource has request headers. This is equivalent to checking if the headers property has any keys.
    */
  var hasHeaders: Boolean = js.native
  
  /**
    * Asynchronously gets headers the given resource.  Returns a promise that will resolve to
    * the result once loaded, or reject if the resource failed to load.  The data is loaded
    * using XMLHttpRequest, which means that in order to make requests to another origin,
    * the server must have Cross-Origin Resource Sharing (CORS) headers enabled.
    * @example
    * resource.head()
    *   .then(function(headers) {
    *       // use the data
    *   }).catch(function(error) {
    *       // an error occurred
    *   });
    * @param [options] - Object with the following properties:
    * @param [options.responseType] - The type of response.  This controls the type of item returned.
    * @param [options.headers] - Additional HTTP headers to send with the request, if any.
    * @param [options.overrideMimeType] - Overrides the MIME type returned by the server.
    * @returns a promise that will resolve to the requested data when loaded. Returns undefined if <code>request.throttle</code> is true and the request does not have high enough priority.
    */
  def head(): js.UndefOr[js.Promise[Any]] = js.native
  def head(options: OverrideMimeType): js.UndefOr[js.Promise[Any]] = js.native
  
  /**
    * Additional HTTP headers that will be sent with the request.
    */
  var headers: Any = js.native
  
  /**
    * True if the Resource refers to a blob URI.
    */
  var isBlobUri: Boolean = js.native
  
  /**
    * True if the Resource refers to a cross origin URL.
    */
  var isCrossOriginUrl: Boolean = js.native
  
  /**
    * True if the Resource refers to a data URI.
    */
  var isDataUri: Boolean = js.native
  
  /**
    * Asynchronously gets options the given resource.  Returns a promise that will resolve to
    * the result once loaded, or reject if the resource failed to load.  The data is loaded
    * using XMLHttpRequest, which means that in order to make requests to another origin,
    * the server must have Cross-Origin Resource Sharing (CORS) headers enabled.
    * @example
    * resource.options()
    *   .then(function(headers) {
    *       // use the data
    *   }).catch(function(error) {
    *       // an error occurred
    *   });
    * @param [options] - Object with the following properties:
    * @param [options.responseType] - The type of response.  This controls the type of item returned.
    * @param [options.headers] - Additional HTTP headers to send with the request, if any.
    * @param [options.overrideMimeType] - Overrides the MIME type returned by the server.
    * @returns a promise that will resolve to the requested data when loaded. Returns undefined if <code>request.throttle</code> is true and the request does not have high enough priority.
    */
  def options(): js.UndefOr[js.Promise[Any]] = js.native
  def options(options: OverrideMimeType): js.UndefOr[js.Promise[Any]] = js.native
  
  /**
    * Asynchronously patches data to the given resource.  Returns a promise that will resolve to
    * the result once loaded, or reject if the resource failed to load.  The data is loaded
    * using XMLHttpRequest, which means that in order to make requests to another origin,
    * the server must have Cross-Origin Resource Sharing (CORS) headers enabled.
    * @example
    * resource.patch(data)
    *   .then(function(result) {
    *       // use the result
    *   }).catch(function(error) {
    *       // an error occurred
    *   });
    * @param data - Data that is posted with the resource.
    * @param [options] - Object with the following properties:
    * @param [options.responseType] - The type of response.  This controls the type of item returned.
    * @param [options.headers] - Additional HTTP headers to send with the request, if any.
    * @param [options.overrideMimeType] - Overrides the MIME type returned by the server.
    * @returns a promise that will resolve to the requested data when loaded. Returns undefined if <code>request.throttle</code> is true and the request does not have high enough priority.
    */
  def patch(data: Any): js.UndefOr[js.Promise[Any]] = js.native
  def patch(data: Any, options: OverrideMimeType): js.UndefOr[js.Promise[Any]] = js.native
  
  /**
    * Asynchronously posts data to the given resource.  Returns a promise that will resolve to
    * the result once loaded, or reject if the resource failed to load.  The data is loaded
    * using XMLHttpRequest, which means that in order to make requests to another origin,
    * the server must have Cross-Origin Resource Sharing (CORS) headers enabled.
    * @example
    * resource.post(data)
    *   .then(function(result) {
    *       // use the result
    *   }).catch(function(error) {
    *       // an error occurred
    *   });
    * @param data - Data that is posted with the resource.
    * @param [options] - Object with the following properties:
    * @param [options.data] - Data that is posted with the resource.
    * @param [options.responseType] - The type of response.  This controls the type of item returned.
    * @param [options.headers] - Additional HTTP headers to send with the request, if any.
    * @param [options.overrideMimeType] - Overrides the MIME type returned by the server.
    * @returns a promise that will resolve to the requested data when loaded. Returns undefined if <code>request.throttle</code> is true and the request does not have high enough priority.
    */
  def post(data: Any): js.UndefOr[js.Promise[Any]] = js.native
  def post(data: Any, options: ResponseType): js.UndefOr[js.Promise[Any]] = js.native
  
  /**
    * A proxy to be used when loading the resource.
    */
  var proxy: Proxy = js.native
  
  /**
    * Asynchronously puts data to the given resource.  Returns a promise that will resolve to
    * the result once loaded, or reject if the resource failed to load.  The data is loaded
    * using XMLHttpRequest, which means that in order to make requests to another origin,
    * the server must have Cross-Origin Resource Sharing (CORS) headers enabled.
    * @example
    * resource.put(data)
    *   .then(function(result) {
    *       // use the result
    *   }).catch(function(error) {
    *       // an error occurred
    *   });
    * @param data - Data that is posted with the resource.
    * @param [options] - Object with the following properties:
    * @param [options.responseType] - The type of response.  This controls the type of item returned.
    * @param [options.headers] - Additional HTTP headers to send with the request, if any.
    * @param [options.overrideMimeType] - Overrides the MIME type returned by the server.
    * @returns a promise that will resolve to the requested data when loaded. Returns undefined if <code>request.throttle</code> is true and the request does not have high enough priority.
    */
  def put(data: Any): js.UndefOr[js.Promise[Any]] = js.native
  def put(data: Any, options: OverrideMimeType): js.UndefOr[js.Promise[Any]] = js.native
  
  /**
    * Query parameters appended to the url.
    */
  val queryParameters: Any = js.native
  
  /**
    * A Request object that will be used. Intended for internal use only.
    */
  var request: Request = js.native
  
  /**
    * The number of times the retryCallback should be called before giving up.
    */
  var retryAttempts: Double = js.native
  
  /**
    * Function to call when a request for this resource fails. If it returns true or a Promise that resolves to true, the request will be retried.
    */
  def retryCallback(params: Any*): Any = js.native
  
  /**
    * Combines the specified object and the existing query parameters. This allows you to add many parameters at once,
    *  as opposed to adding them one at a time to the queryParameters property. If a value is already set, it will be replaced with the new value.
    * @param params - The query parameters
    * @param [useAsDefault = false] - If true the params will be used as the default values, so they will only be set if they are undefined.
    */
  def setQueryParameters(params: Any): Unit = js.native
  def setQueryParameters(params: Any, useAsDefault: Boolean): Unit = js.native
  
  /**
    * Combines the specified object and the existing template values. This allows you to add many values at once,
    *  as opposed to adding them one at a time to the templateValues property. If a value is already set, it will become an array and the new value will be appended.
    * @param template - The template values
    * @param [useAsDefault = false] - If true the values will be used as the default values, so they will only be set if they are undefined.
    */
  def setTemplateValues(template: Any): Unit = js.native
  def setTemplateValues(template: Any, useAsDefault: Boolean): Unit = js.native
  
  /**
    * The key/value pairs used to replace template parameters in the url.
    */
  val templateValues: Any = js.native
  
  /**
    * The url to the resource with template values replaced, query string appended and encoded by proxy if one was set.
    */
  var url: String = js.native
}
/* static members */
object Resource {
  
  @JSImport("cesium", "Resource")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * A resource instance initialized to the current browser location
    */
  @JSImport("cesium", "Resource.DEFAULT")
  @js.native
  val DEFAULT: Resource = js.native
  
  /**
    * Creates a Resource from a URL and calls delete() on it.
    * @param options - A url or an object with the following properties
    * @param options.url - The url of the resource.
    * @param [options.data] - Data that is posted with the resource.
    * @param [options.queryParameters] - An object containing query parameters that will be sent when retrieving the resource.
    * @param [options.templateValues] - Key/Value pairs that are used to replace template values (eg. {x}).
    * @param [options.headers = {}] - Additional HTTP headers that will be sent.
    * @param [options.proxy] - A proxy to be used when loading the resource.
    * @param [options.retryCallback] - The Function to call when a request for this resource fails. If it returns true, the request will be retried.
    * @param [options.retryAttempts = 0] - The number of times the retryCallback should be called before giving up.
    * @param [options.request] - A Request object that will be used. Intended for internal use only.
    * @param [options.responseType] - The type of response.  This controls the type of item returned.
    * @param [options.overrideMimeType] - Overrides the MIME type returned by the server.
    * @returns a promise that will resolve to the requested data when loaded. Returns undefined if <code>request.throttle</code> is true and the request does not have high enough priority.
    */
  inline def delete(options: Data): js.UndefOr[js.Promise[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("delete")(options.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Promise[Any]]]
  
  /**
    * Creates a Resource from a URL and calls fetch() on it.
    * @param options - A url or an object with the following properties
    * @param options.url - The url of the resource.
    * @param [options.queryParameters] - An object containing query parameters that will be sent when retrieving the resource.
    * @param [options.templateValues] - Key/Value pairs that are used to replace template values (eg. {x}).
    * @param [options.headers = {}] - Additional HTTP headers that will be sent.
    * @param [options.proxy] - A proxy to be used when loading the resource.
    * @param [options.retryCallback] - The Function to call when a request for this resource fails. If it returns true, the request will be retried.
    * @param [options.retryAttempts = 0] - The number of times the retryCallback should be called before giving up.
    * @param [options.request] - A Request object that will be used. Intended for internal use only.
    * @param [options.responseType] - The type of response.  This controls the type of item returned.
    * @param [options.overrideMimeType] - Overrides the MIME type returned by the server.
    * @returns a promise that will resolve to the requested data when loaded. Returns undefined if <code>request.throttle</code> is true and the request does not have high enough priority.
    */
  inline def fetch(options: QueryParameters): js.UndefOr[js.Promise[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fetch")(options.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Promise[Any]]]
  
  /**
    * Creates a Resource and calls fetchArrayBuffer() on it.
    * @param options - A url or an object with the following properties
    * @param options.url - The url of the resource.
    * @param [options.queryParameters] - An object containing query parameters that will be sent when retrieving the resource.
    * @param [options.templateValues] - Key/Value pairs that are used to replace template values (eg. {x}).
    * @param [options.headers = {}] - Additional HTTP headers that will be sent.
    * @param [options.proxy] - A proxy to be used when loading the resource.
    * @param [options.retryCallback] - The Function to call when a request for this resource fails. If it returns true, the request will be retried.
    * @param [options.retryAttempts = 0] - The number of times the retryCallback should be called before giving up.
    * @param [options.request] - A Request object that will be used. Intended for internal use only.
    * @returns a promise that will resolve to the requested data when loaded. Returns undefined if <code>request.throttle</code> is true and the request does not have high enough priority.
    */
  inline def fetchArrayBuffer(options: typings.cesium.anon.Proxy): js.UndefOr[js.Promise[js.typedarray.ArrayBuffer]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fetchArrayBuffer")(options.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Promise[js.typedarray.ArrayBuffer]]]
  
  /**
    * Creates a Resource and calls fetchBlob() on it.
    * @param options - A url or an object with the following properties
    * @param options.url - The url of the resource.
    * @param [options.queryParameters] - An object containing query parameters that will be sent when retrieving the resource.
    * @param [options.templateValues] - Key/Value pairs that are used to replace template values (eg. {x}).
    * @param [options.headers = {}] - Additional HTTP headers that will be sent.
    * @param [options.proxy] - A proxy to be used when loading the resource.
    * @param [options.retryCallback] - The Function to call when a request for this resource fails. If it returns true, the request will be retried.
    * @param [options.retryAttempts = 0] - The number of times the retryCallback should be called before giving up.
    * @param [options.request] - A Request object that will be used. Intended for internal use only.
    * @returns a promise that will resolve to the requested data when loaded. Returns undefined if <code>request.throttle</code> is true and the request does not have high enough priority.
    */
  inline def fetchBlob(options: typings.cesium.anon.Proxy): js.UndefOr[js.Promise[Blob]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fetchBlob")(options.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Promise[Blob]]]
  
  /**
    * Creates a Resource and calls fetchImage() on it.
    * @param options - A url or an object with the following properties
    * @param options.url - The url of the resource.
    * @param [options.queryParameters] - An object containing query parameters that will be sent when retrieving the resource.
    * @param [options.templateValues] - Key/Value pairs that are used to replace template values (eg. {x}).
    * @param [options.headers = {}] - Additional HTTP headers that will be sent.
    * @param [options.proxy] - A proxy to be used when loading the resource.
    * @param [options.flipY = false] - Whether to vertically flip the image during fetch and decode. Only applies when requesting an image and the browser supports <code>createImageBitmap</code>.
    * @param [options.retryCallback] - The Function to call when a request for this resource fails. If it returns true, the request will be retried.
    * @param [options.retryAttempts = 0] - The number of times the retryCallback should be called before giving up.
    * @param [options.request] - A Request object that will be used. Intended for internal use only.
    * @param [options.preferBlob = false] - If true, we will load the image via a blob.
    * @param [options.preferImageBitmap = false] - If true, image will be decoded during fetch and an <code>ImageBitmap</code> is returned.
    * @param [options.skipColorSpaceConversion = false] - If true, any custom gamma or color profiles in the image will be ignored. Only applies when requesting an image and the browser supports <code>createImageBitmap</code>.
    * @returns a promise that will resolve to the requested data when loaded. Returns undefined if <code>request.throttle</code> is true and the request does not have high enough priority.
    */
  inline def fetchImage(options: PreferBlob): js.UndefOr[js.Promise[ImageBitmap | HTMLImageElement]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fetchImage")(options.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Promise[ImageBitmap | HTMLImageElement]]]
  
  /**
    * Creates a Resource and calls fetchJson() on it.
    * @param options - A url or an object with the following properties
    * @param options.url - The url of the resource.
    * @param [options.queryParameters] - An object containing query parameters that will be sent when retrieving the resource.
    * @param [options.templateValues] - Key/Value pairs that are used to replace template values (eg. {x}).
    * @param [options.headers = {}] - Additional HTTP headers that will be sent.
    * @param [options.proxy] - A proxy to be used when loading the resource.
    * @param [options.retryCallback] - The Function to call when a request for this resource fails. If it returns true, the request will be retried.
    * @param [options.retryAttempts = 0] - The number of times the retryCallback should be called before giving up.
    * @param [options.request] - A Request object that will be used. Intended for internal use only.
    * @returns a promise that will resolve to the requested data when loaded. Returns undefined if <code>request.throttle</code> is true and the request does not have high enough priority.
    */
  inline def fetchJson(options: typings.cesium.anon.Proxy): js.UndefOr[js.Promise[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fetchJson")(options.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Promise[Any]]]
  
  /**
    * Creates a Resource from a URL and calls fetchJsonp() on it.
    * @param options - A url or an object with the following properties
    * @param options.url - The url of the resource.
    * @param [options.queryParameters] - An object containing query parameters that will be sent when retrieving the resource.
    * @param [options.templateValues] - Key/Value pairs that are used to replace template values (eg. {x}).
    * @param [options.headers = {}] - Additional HTTP headers that will be sent.
    * @param [options.proxy] - A proxy to be used when loading the resource.
    * @param [options.retryCallback] - The Function to call when a request for this resource fails. If it returns true, the request will be retried.
    * @param [options.retryAttempts = 0] - The number of times the retryCallback should be called before giving up.
    * @param [options.request] - A Request object that will be used. Intended for internal use only.
    * @param [options.callbackParameterName = 'callback'] - The callback parameter name that the server expects.
    * @returns a promise that will resolve to the requested data when loaded. Returns undefined if <code>request.throttle</code> is true and the request does not have high enough priority.
    */
  inline def fetchJsonp(options: CallbackParameterName): js.UndefOr[js.Promise[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fetchJsonp")(options.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Promise[Any]]]
  
  /**
    * Creates a Resource and calls fetchText() on it.
    * @param options - A url or an object with the following properties
    * @param options.url - The url of the resource.
    * @param [options.queryParameters] - An object containing query parameters that will be sent when retrieving the resource.
    * @param [options.templateValues] - Key/Value pairs that are used to replace template values (eg. {x}).
    * @param [options.headers = {}] - Additional HTTP headers that will be sent.
    * @param [options.proxy] - A proxy to be used when loading the resource.
    * @param [options.retryCallback] - The Function to call when a request for this resource fails. If it returns true, the request will be retried.
    * @param [options.retryAttempts = 0] - The number of times the retryCallback should be called before giving up.
    * @param [options.request] - A Request object that will be used. Intended for internal use only.
    * @returns a promise that will resolve to the requested data when loaded. Returns undefined if <code>request.throttle</code> is true and the request does not have high enough priority.
    */
  inline def fetchText(options: typings.cesium.anon.Proxy): js.UndefOr[js.Promise[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fetchText")(options.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Promise[String]]]
  
  /**
    * Creates a Resource and calls fetchXML() on it.
    * @param options - A url or an object with the following properties
    * @param options.url - The url of the resource.
    * @param [options.queryParameters] - An object containing query parameters that will be sent when retrieving the resource.
    * @param [options.templateValues] - Key/Value pairs that are used to replace template values (eg. {x}).
    * @param [options.headers = {}] - Additional HTTP headers that will be sent.
    * @param [options.proxy] - A proxy to be used when loading the resource.
    * @param [options.retryCallback] - The Function to call when a request for this resource fails. If it returns true, the request will be retried.
    * @param [options.retryAttempts = 0] - The number of times the retryCallback should be called before giving up.
    * @param [options.request] - A Request object that will be used. Intended for internal use only.
    * @returns a promise that will resolve to the requested data when loaded. Returns undefined if <code>request.throttle</code> is true and the request does not have high enough priority.
    */
  inline def fetchXML(options: typings.cesium.anon.Proxy): js.UndefOr[js.Promise[XMLDocument]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fetchXML")(options.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Promise[XMLDocument]]]
  
  /**
    * Creates a Resource from a URL and calls head() on it.
    * @param options - A url or an object with the following properties
    * @param options.url - The url of the resource.
    * @param [options.queryParameters] - An object containing query parameters that will be sent when retrieving the resource.
    * @param [options.templateValues] - Key/Value pairs that are used to replace template values (eg. {x}).
    * @param [options.headers = {}] - Additional HTTP headers that will be sent.
    * @param [options.proxy] - A proxy to be used when loading the resource.
    * @param [options.retryCallback] - The Function to call when a request for this resource fails. If it returns true, the request will be retried.
    * @param [options.retryAttempts = 0] - The number of times the retryCallback should be called before giving up.
    * @param [options.request] - A Request object that will be used. Intended for internal use only.
    * @param [options.responseType] - The type of response.  This controls the type of item returned.
    * @param [options.overrideMimeType] - Overrides the MIME type returned by the server.
    * @returns a promise that will resolve to the requested data when loaded. Returns undefined if <code>request.throttle</code> is true and the request does not have high enough priority.
    */
  inline def head(options: QueryParameters): js.UndefOr[js.Promise[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("head")(options.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Promise[Any]]]
  
  /**
    * Returns true if blobs are supported.
    */
  @JSImport("cesium", "Resource.isBlobSupported")
  @js.native
  val isBlobSupported: Boolean = js.native
  
  /**
    * Creates a Resource from a URL and calls options() on it.
    * @param options - A url or an object with the following properties
    * @param options.url - The url of the resource.
    * @param [options.queryParameters] - An object containing query parameters that will be sent when retrieving the resource.
    * @param [options.templateValues] - Key/Value pairs that are used to replace template values (eg. {x}).
    * @param [options.headers = {}] - Additional HTTP headers that will be sent.
    * @param [options.proxy] - A proxy to be used when loading the resource.
    * @param [options.retryCallback] - The Function to call when a request for this resource fails. If it returns true, the request will be retried.
    * @param [options.retryAttempts = 0] - The number of times the retryCallback should be called before giving up.
    * @param [options.request] - A Request object that will be used. Intended for internal use only.
    * @param [options.responseType] - The type of response.  This controls the type of item returned.
    * @param [options.overrideMimeType] - Overrides the MIME type returned by the server.
    * @returns a promise that will resolve to the requested data when loaded. Returns undefined if <code>request.throttle</code> is true and the request does not have high enough priority.
    */
  inline def options(options: QueryParameters): js.UndefOr[js.Promise[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("options")(options.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Promise[Any]]]
  
  /**
    * Creates a Resource from a URL and calls patch() on it.
    * @param options - A url or an object with the following properties
    * @param options.url - The url of the resource.
    * @param options.data - Data that is posted with the resource.
    * @param [options.queryParameters] - An object containing query parameters that will be sent when retrieving the resource.
    * @param [options.templateValues] - Key/Value pairs that are used to replace template values (eg. {x}).
    * @param [options.headers = {}] - Additional HTTP headers that will be sent.
    * @param [options.proxy] - A proxy to be used when loading the resource.
    * @param [options.retryCallback] - The Function to call when a request for this resource fails. If it returns true, the request will be retried.
    * @param [options.retryAttempts = 0] - The number of times the retryCallback should be called before giving up.
    * @param [options.request] - A Request object that will be used. Intended for internal use only.
    * @param [options.responseType] - The type of response.  This controls the type of item returned.
    * @param [options.overrideMimeType] - Overrides the MIME type returned by the server.
    * @returns a promise that will resolve to the requested data when loaded. Returns undefined if <code>request.throttle</code> is true and the request does not have high enough priority.
    */
  inline def patch(options: typings.cesium.anon.Request): js.UndefOr[js.Promise[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("patch")(options.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Promise[Any]]]
  
  /**
    * Creates a Resource from a URL and calls post() on it.
    * @param options - A url or an object with the following properties
    * @param options.url - The url of the resource.
    * @param options.data - Data that is posted with the resource.
    * @param [options.queryParameters] - An object containing query parameters that will be sent when retrieving the resource.
    * @param [options.templateValues] - Key/Value pairs that are used to replace template values (eg. {x}).
    * @param [options.headers = {}] - Additional HTTP headers that will be sent.
    * @param [options.proxy] - A proxy to be used when loading the resource.
    * @param [options.retryCallback] - The Function to call when a request for this resource fails. If it returns true, the request will be retried.
    * @param [options.retryAttempts = 0] - The number of times the retryCallback should be called before giving up.
    * @param [options.request] - A Request object that will be used. Intended for internal use only.
    * @param [options.responseType] - The type of response.  This controls the type of item returned.
    * @param [options.overrideMimeType] - Overrides the MIME type returned by the server.
    * @returns a promise that will resolve to the requested data when loaded. Returns undefined if <code>request.throttle</code> is true and the request does not have high enough priority.
    */
  inline def post(options: typings.cesium.anon.Request): js.UndefOr[js.Promise[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("post")(options.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Promise[Any]]]
  
  /**
    * Creates a Resource from a URL and calls put() on it.
    * @param options - A url or an object with the following properties
    * @param options.url - The url of the resource.
    * @param options.data - Data that is posted with the resource.
    * @param [options.queryParameters] - An object containing query parameters that will be sent when retrieving the resource.
    * @param [options.templateValues] - Key/Value pairs that are used to replace template values (eg. {x}).
    * @param [options.headers = {}] - Additional HTTP headers that will be sent.
    * @param [options.proxy] - A proxy to be used when loading the resource.
    * @param [options.retryCallback] - The Function to call when a request for this resource fails. If it returns true, the request will be retried.
    * @param [options.retryAttempts = 0] - The number of times the retryCallback should be called before giving up.
    * @param [options.request] - A Request object that will be used. Intended for internal use only.
    * @param [options.responseType] - The type of response.  This controls the type of item returned.
    * @param [options.overrideMimeType] - Overrides the MIME type returned by the server.
    * @returns a promise that will resolve to the requested data when loaded. Returns undefined if <code>request.throttle</code> is true and the request does not have high enough priority.
    */
  inline def put(options: typings.cesium.anon.Request): js.UndefOr[js.Promise[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("put")(options.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Promise[Any]]]
  
  /**
    * Initialization options for the Resource constructor
    * @property url - The url of the resource.
    * @property [queryParameters] - An object containing query parameters that will be sent when retrieving the resource.
    * @property [templateValues] - Key/Value pairs that are used to replace template values (eg. {x}).
    * @property [headers = {}] - Additional HTTP headers that will be sent.
    * @property [proxy] - A proxy to be used when loading the resource.
    * @property [retryCallback] - The Function to call when a request for this resource fails. If it returns true, the request will be retried.
    * @property [retryAttempts = 0] - The number of times the retryCallback should be called before giving up.
    * @property [request] - A Request object that will be used. Intended for internal use only.
    */
  trait ConstructorOptions extends StObject {
    
    var headers: js.UndefOr[Any] = js.undefined
    
    var proxy: js.UndefOr[Proxy] = js.undefined
    
    var queryParameters: js.UndefOr[Any] = js.undefined
    
    var request: js.UndefOr[Request] = js.undefined
    
    var retryAttempts: js.UndefOr[Double] = js.undefined
    
    var retryCallback: js.UndefOr[RetryCallback] = js.undefined
    
    var templateValues: js.UndefOr[Any] = js.undefined
    
    var url: String
  }
  object ConstructorOptions {
    
    inline def apply(url: String): ConstructorOptions = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConstructorOptions]
    }
    
    extension [Self <: ConstructorOptions](x: Self) {
      
      inline def setHeaders(value: Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setProxy(value: Proxy): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
      
      inline def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
      
      inline def setQueryParameters(value: Any): Self = StObject.set(x, "queryParameters", value.asInstanceOf[js.Any])
      
      inline def setQueryParametersUndefined: Self = StObject.set(x, "queryParameters", js.undefined)
      
      inline def setRequest(value: Request): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
      
      inline def setRetryAttempts(value: Double): Self = StObject.set(x, "retryAttempts", value.asInstanceOf[js.Any])
      
      inline def setRetryAttemptsUndefined: Self = StObject.set(x, "retryAttempts", js.undefined)
      
      inline def setRetryCallback(
        value: (/* resource */ js.UndefOr[Resource], /* error */ js.UndefOr[js.Error]) => Boolean | js.Promise[Boolean]
      ): Self = StObject.set(x, "retryCallback", js.Any.fromFunction2(value))
      
      inline def setRetryCallbackUndefined: Self = StObject.set(x, "retryCallback", js.undefined)
      
      inline def setTemplateValues(value: Any): Self = StObject.set(x, "templateValues", value.asInstanceOf[js.Any])
      
      inline def setTemplateValuesUndefined: Self = StObject.set(x, "templateValues", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * A function that returns the value of the property.
    * @param [resource] - The resource that failed to load.
    * @param [error] - The error that occurred during the loading of the resource.
    */
  type RetryCallback = js.Function2[
    /* resource */ js.UndefOr[Resource], 
    /* error */ js.UndefOr[js.Error], 
    Boolean | js.Promise[Boolean]
  ]
}
