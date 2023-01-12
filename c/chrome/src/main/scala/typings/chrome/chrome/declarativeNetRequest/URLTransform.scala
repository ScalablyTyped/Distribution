package typings.chrome.chrome.declarativeNetRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait URLTransform extends StObject {
  
  /** The new fragment for the request.
    * Should be either empty, in which case the existing fragment is cleared; or should begin with '#'.
    */
  var fragment: js.UndefOr[String] = js.undefined
  
  /** The new host for the request. */
  var host: js.UndefOr[String] = js.undefined
  
  /** The new password for the request. */
  var password: js.UndefOr[String] = js.undefined
  
  /** The new path for the request.
    * If empty, the existing path is cleared.
    */
  var path: js.UndefOr[String] = js.undefined
  
  /** The new port for the request.
    * If empty, the existing port is cleared.
    */
  var port: js.UndefOr[String] = js.undefined
  
  /** The new query for the request.
    * Should be either empty, in which case the existing query is cleared; or should begin with '?'.
    */
  var query: js.UndefOr[String] = js.undefined
  
  /** Add, remove or replace query key-value pairs. */
  var queryTransform: js.UndefOr[QueryTransform] = js.undefined
  
  /** The new scheme for the request.
    * Allowed values are "http", "https", "ftp" and "chrome-extension".
    */
  var scheme: js.UndefOr[String] = js.undefined
  
  /** The new username for the request. */
  var username: js.UndefOr[String] = js.undefined
}
object URLTransform {
  
  inline def apply(): URLTransform = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[URLTransform]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: URLTransform] (val x: Self) extends AnyVal {
    
    inline def setFragment(value: String): Self = StObject.set(x, "fragment", value.asInstanceOf[js.Any])
    
    inline def setFragmentUndefined: Self = StObject.set(x, "fragment", js.undefined)
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setPort(value: String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryTransform(value: QueryTransform): Self = StObject.set(x, "queryTransform", value.asInstanceOf[js.Any])
    
    inline def setQueryTransformUndefined: Self = StObject.set(x, "queryTransform", js.undefined)
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setScheme(value: String): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
    
    inline def setSchemeUndefined: Self = StObject.set(x, "scheme", js.undefined)
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
