package typings.azureMsalBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iasyncmemorystorageMod {
  
  trait IAsyncStorage[T] extends StObject {
    
    /**
      * Returns true or false if the given key is present in the cache.
      * @param key
      */
    def containsKey(key: String): js.Promise[Boolean]
    
    /**
      * Get the item from the asynchronous storage object matching the given key.
      * @param key
      */
    def getItem(key: String): js.Promise[T | Null]
    
    /**
      * Get all the keys from the asynchronous storage object as an iterable array of strings.
      */
    def getKeys(): js.Promise[js.Array[String]]
    
    /**
      * Removes the item in the asynchronous storage object matching the given key.
      * @param key
      */
    def removeItem(key: String): js.Promise[Unit]
    
    /**
      * Sets the item in the asynchronous storage object with the given key.
      * @param key
      * @param value
      */
    def setItem(key: String, value: T): js.Promise[Unit]
  }
  object IAsyncStorage {
    
    inline def apply[T](
      containsKey: String => js.Promise[Boolean],
      getItem: String => js.Promise[T | Null],
      getKeys: () => js.Promise[js.Array[String]],
      removeItem: String => js.Promise[Unit],
      setItem: (String, T) => js.Promise[Unit]
    ): IAsyncStorage[T] = {
      val __obj = js.Dynamic.literal(containsKey = js.Any.fromFunction1(containsKey), getItem = js.Any.fromFunction1(getItem), getKeys = js.Any.fromFunction0(getKeys), removeItem = js.Any.fromFunction1(removeItem), setItem = js.Any.fromFunction2(setItem))
      __obj.asInstanceOf[IAsyncStorage[T]]
    }
    
    extension [Self <: IAsyncStorage[?], T](x: Self & IAsyncStorage[T]) {
      
      inline def setContainsKey(value: String => js.Promise[Boolean]): Self = StObject.set(x, "containsKey", js.Any.fromFunction1(value))
      
      inline def setGetItem(value: String => js.Promise[T | Null]): Self = StObject.set(x, "getItem", js.Any.fromFunction1(value))
      
      inline def setGetKeys(value: () => js.Promise[js.Array[String]]): Self = StObject.set(x, "getKeys", js.Any.fromFunction0(value))
      
      inline def setRemoveItem(value: String => js.Promise[Unit]): Self = StObject.set(x, "removeItem", js.Any.fromFunction1(value))
      
      inline def setSetItem(value: (String, T) => js.Promise[Unit]): Self = StObject.set(x, "setItem", js.Any.fromFunction2(value))
    }
  }
}
