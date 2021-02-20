package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CacheSettings extends StObject {
  
  /**
    * The HTTP methods that are processed and forwarded to the distribution's origin. You can specify the following options:    GET,HEAD - The distribution forwards the GET and HEAD methods.    GET,HEAD,OPTIONS - The distribution forwards the GET, HEAD, and OPTIONS methods.    GET,HEAD,OPTIONS,PUT,PATCH,POST,DELETE - The distribution forwards the GET, HEAD, OPTIONS, PUT, PATCH, POST, and DELETE methods.   If you specify the third option, you might need to restrict access to your distribution's origin so users can't perform operations that you don't want them to. For example, you might not want users to have permission to delete objects from your origin.
    */
  var allowedHTTPMethods: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The HTTP method responses that are cached by your distribution. You can specify the following options:    GET,HEAD - The distribution caches responses to the GET and HEAD methods.    GET,HEAD,OPTIONS - The distribution caches responses to the GET, HEAD, and OPTIONS methods.  
    */
  var cachedHTTPMethods: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The default amount of time that objects stay in the distribution's cache before the distribution forwards another request to the origin to determine whether the content has been updated.  The value specified applies only when the origin does not add HTTP headers such as Cache-Control max-age, Cache-Control s-maxage, and Expires to objects. 
    */
  var defaultTTL: js.UndefOr[long] = js.native
  
  /**
    * An object that describes the cookies that are forwarded to the origin. Your content is cached based on the cookies that are forwarded.
    */
  var forwardedCookies: js.UndefOr[CookieObject] = js.native
  
  /**
    * An object that describes the headers that are forwarded to the origin. Your content is cached based on the headers that are forwarded.
    */
  var forwardedHeaders: js.UndefOr[HeaderObject] = js.native
  
  /**
    * An object that describes the query strings that are forwarded to the origin. Your content is cached based on the query strings that are forwarded.
    */
  var forwardedQueryStrings: js.UndefOr[QueryStringObject] = js.native
  
  /**
    * The maximum amount of time that objects stay in the distribution's cache before the distribution forwards another request to the origin to determine whether the object has been updated. The value specified applies only when the origin adds HTTP headers such as Cache-Control max-age, Cache-Control s-maxage, and Expires to objects.
    */
  var maximumTTL: js.UndefOr[long] = js.native
  
  /**
    * The minimum amount of time that objects stay in the distribution's cache before the distribution forwards another request to the origin to determine whether the object has been updated. A value of 0 must be specified for minimumTTL if the distribution is configured to forward all headers to the origin.
    */
  var minimumTTL: js.UndefOr[long] = js.native
}
object CacheSettings {
  
  @scala.inline
  def apply(): CacheSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CacheSettings]
  }
  
  @scala.inline
  implicit class CacheSettingsMutableBuilder[Self <: CacheSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowedHTTPMethods(value: NonEmptyString): Self = StObject.set(x, "allowedHTTPMethods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedHTTPMethodsUndefined: Self = StObject.set(x, "allowedHTTPMethods", js.undefined)
    
    @scala.inline
    def setCachedHTTPMethods(value: NonEmptyString): Self = StObject.set(x, "cachedHTTPMethods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCachedHTTPMethodsUndefined: Self = StObject.set(x, "cachedHTTPMethods", js.undefined)
    
    @scala.inline
    def setDefaultTTL(value: long): Self = StObject.set(x, "defaultTTL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultTTLUndefined: Self = StObject.set(x, "defaultTTL", js.undefined)
    
    @scala.inline
    def setForwardedCookies(value: CookieObject): Self = StObject.set(x, "forwardedCookies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForwardedCookiesUndefined: Self = StObject.set(x, "forwardedCookies", js.undefined)
    
    @scala.inline
    def setForwardedHeaders(value: HeaderObject): Self = StObject.set(x, "forwardedHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForwardedHeadersUndefined: Self = StObject.set(x, "forwardedHeaders", js.undefined)
    
    @scala.inline
    def setForwardedQueryStrings(value: QueryStringObject): Self = StObject.set(x, "forwardedQueryStrings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForwardedQueryStringsUndefined: Self = StObject.set(x, "forwardedQueryStrings", js.undefined)
    
    @scala.inline
    def setMaximumTTL(value: long): Self = StObject.set(x, "maximumTTL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumTTLUndefined: Self = StObject.set(x, "maximumTTL", js.undefined)
    
    @scala.inline
    def setMinimumTTL(value: long): Self = StObject.set(x, "minimumTTL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumTTLUndefined: Self = StObject.set(x, "minimumTTL", js.undefined)
  }
}
