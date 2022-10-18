package typings.azureMsalNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCacheDistributedIcacheclientMod {
  
  trait ICacheClient extends StObject {
    
    /**
      * Retrieve the value from the cache
      *
      * @param key string
      * @returns Promise<string>
      */
    def get(key: String): js.Promise[String]
    
    /**
      * Save the required value using the provided key to cache
      *
      * @param key string
      * @param value string
      * @returns Promise<string>
      */
    def set(key: String, value: String): js.Promise[String]
  }
  object ICacheClient {
    
    inline def apply(get: String => js.Promise[String], set: (String, String) => js.Promise[String]): ICacheClient = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), set = js.Any.fromFunction2(set))
      __obj.asInstanceOf[ICacheClient]
    }
    
    extension [Self <: ICacheClient](x: Self) {
      
      inline def setGet(value: String => js.Promise[String]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setSet(value: (String, String) => js.Promise[String]): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
    }
  }
}
