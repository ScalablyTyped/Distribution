package typings.cesium

import typings.cesium.anon.CallbackParameterName
import typings.cesium.anon.Data
import typings.cesium.anon.PreferBlob
import typings.cesium.anon.Proxy
import typings.cesium.anon.QueryParameters
import typings.cesium.anon.Request
import typings.cesium.mod.Resource
import typings.cesium.mod.Resource.ConstructorOptions
import typings.std.Blob
import typings.std.HTMLImageElement
import typings.std.ImageBitmap
import typings.std.XMLDocument
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceCoreResourceMod {
  
  @JSImport("cesium/Source/Core/Resource", JSImport.Default)
  @js.native
  open class default protected () extends Resource {
    def this(options: String) = this()
    def this(options: ConstructorOptions) = this()
  }
  /* static members */
  object default {
    
    @JSImport("cesium/Source/Core/Resource", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * A resource instance initialized to the current browser location
      */
    @JSImport("cesium/Source/Core/Resource", "default.DEFAULT")
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
    inline def fetchArrayBuffer(options: Proxy): js.UndefOr[js.Promise[js.typedarray.ArrayBuffer]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fetchArrayBuffer")(options.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Promise[js.typedarray.ArrayBuffer]]]
    
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
    inline def fetchBlob(options: Proxy): js.UndefOr[js.Promise[Blob]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fetchBlob")(options.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Promise[Blob]]]
    
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
    inline def fetchJson(options: Proxy): js.UndefOr[js.Promise[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fetchJson")(options.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Promise[Any]]]
    
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
    inline def fetchText(options: Proxy): js.UndefOr[js.Promise[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fetchText")(options.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Promise[String]]]
    
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
    inline def fetchXML(options: Proxy): js.UndefOr[js.Promise[XMLDocument]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fetchXML")(options.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Promise[XMLDocument]]]
    
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
    @JSImport("cesium/Source/Core/Resource", "default.isBlobSupported")
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
    inline def patch(options: Request): js.UndefOr[js.Promise[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("patch")(options.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Promise[Any]]]
    
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
    inline def post(options: Request): js.UndefOr[js.Promise[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("post")(options.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Promise[Any]]]
    
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
    inline def put(options: Request): js.UndefOr[js.Promise[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("put")(options.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Promise[Any]]]
  }
}
