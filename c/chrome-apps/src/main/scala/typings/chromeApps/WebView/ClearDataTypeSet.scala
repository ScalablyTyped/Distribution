package typings.chromeApps.WebView

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * WebView element from html
  */
/** A set of data types. Missing properties are interpreted as false. */
trait ClearDataTypeSet extends StObject {
  
  /** Websites' appcaches. */
  var appcache: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The browser's cache. Note: when removing data, this clears the entire cache; it is not limited to the range you specify.
    * @since Chrome 43.
    */
  var cache: js.UndefOr[Boolean] = js.undefined
  
  /** The partition's cookies. */
  var cookies: js.UndefOr[Boolean] = js.undefined
  
  /** Websites' filesystems. */
  var fileSystems: js.UndefOr[Boolean] = js.undefined
  
  /** Websites' IndexedDB data. */
  var indexedDB: js.UndefOr[Boolean] = js.undefined
  
  /** Websites' local storage data. */
  var localStorage: js.UndefOr[Boolean] = js.undefined
  
  /** The partition's persistent cookies. */
  var persistentCookies: js.UndefOr[Boolean] = js.undefined
  
  /** The partition's session cookies. */
  var sessionCookies: js.UndefOr[Boolean] = js.undefined
  
  /** Websites' WebSQL data. */
  var webSQL: js.UndefOr[Boolean] = js.undefined
}
object ClearDataTypeSet {
  
  inline def apply(): ClearDataTypeSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClearDataTypeSet]
  }
  
  extension [Self <: ClearDataTypeSet](x: Self) {
    
    inline def setAppcache(value: Boolean): Self = StObject.set(x, "appcache", value.asInstanceOf[js.Any])
    
    inline def setAppcacheUndefined: Self = StObject.set(x, "appcache", js.undefined)
    
    inline def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
    
    inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
    
    inline def setCookies(value: Boolean): Self = StObject.set(x, "cookies", value.asInstanceOf[js.Any])
    
    inline def setCookiesUndefined: Self = StObject.set(x, "cookies", js.undefined)
    
    inline def setFileSystems(value: Boolean): Self = StObject.set(x, "fileSystems", value.asInstanceOf[js.Any])
    
    inline def setFileSystemsUndefined: Self = StObject.set(x, "fileSystems", js.undefined)
    
    inline def setIndexedDB(value: Boolean): Self = StObject.set(x, "indexedDB", value.asInstanceOf[js.Any])
    
    inline def setIndexedDBUndefined: Self = StObject.set(x, "indexedDB", js.undefined)
    
    inline def setLocalStorage(value: Boolean): Self = StObject.set(x, "localStorage", value.asInstanceOf[js.Any])
    
    inline def setLocalStorageUndefined: Self = StObject.set(x, "localStorage", js.undefined)
    
    inline def setPersistentCookies(value: Boolean): Self = StObject.set(x, "persistentCookies", value.asInstanceOf[js.Any])
    
    inline def setPersistentCookiesUndefined: Self = StObject.set(x, "persistentCookies", js.undefined)
    
    inline def setSessionCookies(value: Boolean): Self = StObject.set(x, "sessionCookies", value.asInstanceOf[js.Any])
    
    inline def setSessionCookiesUndefined: Self = StObject.set(x, "sessionCookies", js.undefined)
    
    inline def setWebSQL(value: Boolean): Self = StObject.set(x, "webSQL", value.asInstanceOf[js.Any])
    
    inline def setWebSQLUndefined: Self = StObject.set(x, "webSQL", js.undefined)
  }
}
