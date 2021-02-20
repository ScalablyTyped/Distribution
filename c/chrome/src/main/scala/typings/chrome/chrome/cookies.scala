package typings.chrome.chrome

import typings.chrome.chrome.events.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// Cookies
////////////////////
/**
  * Use the chrome.cookies API to query and modify cookies, and to be notified when they change.
  * Availability: Since Chrome 6.
  * Permissions:  "cookies", host permissions
  */
object cookies {
  
  @js.native
  trait Cookie extends StObject {
    
    /** The domain of the cookie (e.g. "www.google.com", "example.com"). */
    var domain: String = js.native
    
    /** Optional. The expiration date of the cookie as the number of seconds since the UNIX epoch. Not provided for session cookies.  */
    var expirationDate: js.UndefOr[Double] = js.native
    
    /** True if the cookie is a host-only cookie (i.e. a request's host must exactly match the domain of the cookie). */
    var hostOnly: Boolean = js.native
    
    /** True if the cookie is marked as HttpOnly (i.e. the cookie is inaccessible to client-side scripts). */
    var httpOnly: Boolean = js.native
    
    /** The name of the cookie. */
    var name: String = js.native
    
    /** The path of the cookie. */
    var path: String = js.native
    
    /**
      * The cookie's same-site status (i.e. whether the cookie is sent with cross-site requests).
      * @since Chrome 51.
      */
    var sameSite: SameSiteStatus = js.native
    
    /** True if the cookie is marked as Secure (i.e. its scope is limited to secure channels, typically HTTPS). */
    var secure: Boolean = js.native
    
    /** True if the cookie is a session cookie, as opposed to a persistent cookie with an expiration date. */
    var session: Boolean = js.native
    
    /** The ID of the cookie store containing this cookie, as provided in getAllCookieStores(). */
    var storeId: String = js.native
    
    /** The value of the cookie. */
    var value: String = js.native
  }
  object Cookie {
    
    @scala.inline
    def apply(
      domain: String,
      hostOnly: Boolean,
      httpOnly: Boolean,
      name: String,
      path: String,
      sameSite: SameSiteStatus,
      secure: Boolean,
      session: Boolean,
      storeId: String,
      value: String
    ): Cookie = {
      val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], hostOnly = hostOnly.asInstanceOf[js.Any], httpOnly = httpOnly.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], sameSite = sameSite.asInstanceOf[js.Any], secure = secure.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any], storeId = storeId.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cookie]
    }
    
    @scala.inline
    implicit class CookieMutableBuilder[Self <: Cookie] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpirationDate(value: Double): Self = StObject.set(x, "expirationDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpirationDateUndefined: Self = StObject.set(x, "expirationDate", js.undefined)
      
      @scala.inline
      def setHostOnly(value: Boolean): Self = StObject.set(x, "hostOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpOnly(value: Boolean): Self = StObject.set(x, "httpOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSameSite(value: SameSiteStatus): Self = StObject.set(x, "sameSite", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSession(value: Boolean): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStoreId(value: String): Self = StObject.set(x, "storeId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CookieChangeInfo extends StObject {
    
    /**
      * Since Chrome 12.
      * The underlying reason behind the cookie's change.
      */
    var cause: String = js.native
    
    /** Information about the cookie that was set or removed. */
    var cookie: Cookie = js.native
    
    /** True if a cookie was removed. */
    var removed: Boolean = js.native
  }
  object CookieChangeInfo {
    
    @scala.inline
    def apply(cause: String, cookie: Cookie, removed: Boolean): CookieChangeInfo = {
      val __obj = js.Dynamic.literal(cause = cause.asInstanceOf[js.Any], cookie = cookie.asInstanceOf[js.Any], removed = removed.asInstanceOf[js.Any])
      __obj.asInstanceOf[CookieChangeInfo]
    }
    
    @scala.inline
    implicit class CookieChangeInfoMutableBuilder[Self <: CookieChangeInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCause(value: String): Self = StObject.set(x, "cause", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCookie(value: Cookie): Self = StObject.set(x, "cookie", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoved(value: Boolean): Self = StObject.set(x, "removed", value.asInstanceOf[js.Any])
    }
  }
  
  type CookieChangedEvent = Event[js.Function1[/* changeInfo */ CookieChangeInfo, Unit]]
  
  @js.native
  trait CookieStore extends StObject {
    
    /** The unique identifier for the cookie store. */
    var id: String = js.native
    
    /** Identifiers of all the browser tabs that share this cookie store. */
    var tabIds: js.Array[Double] = js.native
  }
  object CookieStore {
    
    @scala.inline
    def apply(id: String, tabIds: js.Array[Double]): CookieStore = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], tabIds = tabIds.asInstanceOf[js.Any])
      __obj.asInstanceOf[CookieStore]
    }
    
    @scala.inline
    implicit class CookieStoreMutableBuilder[Self <: CookieStore] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabIds(value: js.Array[Double]): Self = StObject.set(x, "tabIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabIdsVarargs(value: Double*): Self = StObject.set(x, "tabIds", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Details extends StObject {
    
    var name: String = js.native
    
    var storeId: js.UndefOr[String] = js.native
    
    var url: String = js.native
  }
  object Details {
    
    @scala.inline
    def apply(name: String, url: String): Details = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Details]
    }
    
    @scala.inline
    implicit class DetailsMutableBuilder[Self <: Details] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStoreId(value: String): Self = StObject.set(x, "storeId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStoreIdUndefined: Self = StObject.set(x, "storeId", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GetAllDetails extends StObject {
    
    /** Optional. Restricts the retrieved cookies to those whose domains match or are subdomains of this one.  */
    var domain: js.UndefOr[String] = js.native
    
    /** Optional. Filters the cookies by name.  */
    var name: js.UndefOr[String] = js.native
    
    /** Optional. Restricts the retrieved cookies to those whose path exactly matches this string.  */
    var path: js.UndefOr[String] = js.native
    
    /** Optional. Filters the cookies by their Secure property.  */
    var secure: js.UndefOr[Boolean] = js.native
    
    /** Optional. Filters out session vs. persistent cookies.  */
    var session: js.UndefOr[Boolean] = js.native
    
    /** Optional. The cookie store to retrieve cookies from. If omitted, the current execution context's cookie store will be used.  */
    var storeId: js.UndefOr[String] = js.native
    
    /** Optional. Restricts the retrieved cookies to those that would match the given URL.  */
    var url: js.UndefOr[String] = js.native
  }
  object GetAllDetails {
    
    @scala.inline
    def apply(): GetAllDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetAllDetails]
    }
    
    @scala.inline
    implicit class GetAllDetailsMutableBuilder[Self <: GetAllDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
      
      @scala.inline
      def setSession(value: Boolean): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
      
      @scala.inline
      def setStoreId(value: String): Self = StObject.set(x, "storeId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStoreIdUndefined: Self = StObject.set(x, "storeId", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.chrome.chromeStrings.unspecified
    - typings.chrome.chromeStrings.no_restriction
    - typings.chrome.chromeStrings.lax
    - typings.chrome.chromeStrings.strict
  */
  trait SameSiteStatus extends StObject
  object SameSiteStatus {
    
    @scala.inline
    def lax: typings.chrome.chromeStrings.lax = "lax".asInstanceOf[typings.chrome.chromeStrings.lax]
    
    @scala.inline
    def no_restriction: typings.chrome.chromeStrings.no_restriction = "no_restriction".asInstanceOf[typings.chrome.chromeStrings.no_restriction]
    
    @scala.inline
    def strict: typings.chrome.chromeStrings.strict = "strict".asInstanceOf[typings.chrome.chromeStrings.strict]
    
    @scala.inline
    def unspecified: typings.chrome.chromeStrings.unspecified = "unspecified".asInstanceOf[typings.chrome.chromeStrings.unspecified]
  }
  
  @js.native
  trait SetDetails extends StObject {
    
    /** Optional. The domain of the cookie. If omitted, the cookie becomes a host-only cookie.  */
    var domain: js.UndefOr[String] = js.native
    
    /** Optional. The expiration date of the cookie as the number of seconds since the UNIX epoch. If omitted, the cookie becomes a session cookie.  */
    var expirationDate: js.UndefOr[Double] = js.native
    
    /** Optional. Whether the cookie should be marked as HttpOnly. Defaults to false.  */
    var httpOnly: js.UndefOr[Boolean] = js.native
    
    /** Optional. The name of the cookie. Empty by default if omitted.  */
    var name: js.UndefOr[String] = js.native
    
    /** Optional. The path of the cookie. Defaults to the path portion of the url parameter.  */
    var path: js.UndefOr[String] = js.native
    
    /**
      * Optional. The cookie's same-site status. Defaults to "unspecified", i.e., if omitted, the cookie is set without specifying a SameSite attribute.
      * @since Chrome 51.
      */
    var sameSite: js.UndefOr[SameSiteStatus] = js.native
    
    /** Optional. Whether the cookie should be marked as Secure. Defaults to false.  */
    var secure: js.UndefOr[Boolean] = js.native
    
    /** Optional. The ID of the cookie store in which to set the cookie. By default, the cookie is set in the current execution context's cookie store.  */
    var storeId: js.UndefOr[String] = js.native
    
    /** The request-URI to associate with the setting of the cookie. This value can affect the default domain and path values of the created cookie. If host permissions for this URL are not specified in the manifest file, the API call will fail. */
    var url: String = js.native
    
    /** Optional. The value of the cookie. Empty by default if omitted.  */
    var value: js.UndefOr[String] = js.native
  }
  object SetDetails {
    
    @scala.inline
    def apply(url: String): SetDetails = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[SetDetails]
    }
    
    @scala.inline
    implicit class SetDetailsMutableBuilder[Self <: SetDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      @scala.inline
      def setExpirationDate(value: Double): Self = StObject.set(x, "expirationDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpirationDateUndefined: Self = StObject.set(x, "expirationDate", js.undefined)
      
      @scala.inline
      def setHttpOnly(value: Boolean): Self = StObject.set(x, "httpOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpOnlyUndefined: Self = StObject.set(x, "httpOnly", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setSameSite(value: SameSiteStatus): Self = StObject.set(x, "sameSite", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSameSiteUndefined: Self = StObject.set(x, "sameSite", js.undefined)
      
      @scala.inline
      def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
      
      @scala.inline
      def setStoreId(value: String): Self = StObject.set(x, "storeId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStoreIdUndefined: Self = StObject.set(x, "storeId", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
