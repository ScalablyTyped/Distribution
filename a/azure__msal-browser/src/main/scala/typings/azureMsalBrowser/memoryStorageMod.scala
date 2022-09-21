package typings.azureMsalBrowser

import typings.azureMsalBrowser.iwindowstorageMod.IWindowStorage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object memoryStorageMod {
  
  @JSImport("@azure/msal-browser/dist/cache/MemoryStorage", "MemoryStorage")
  @js.native
  open class MemoryStorage[T] ()
    extends StObject
       with IWindowStorage[T] {
    
    /* private */ var cache: Any = js.native
    
    def clear(): Unit = js.native
    
    /**
      * Returns true or false if the given key is present in the cache.
      * @param key
      */
    /* CompleteClass */
    override def containsKey(key: String): Boolean = js.native
    
    /**
      * Get the item from the window storage object matching the given key.
      * @param key
      */
    /* CompleteClass */
    override def getItem(key: String): T | Null = js.native
    
    /**
      * Get all the keys from the window storage object as an iterable array of strings.
      */
    /* CompleteClass */
    override def getKeys(): js.Array[String] = js.native
    
    /**
      * Removes the item in the window storage object matching the given key.
      * @param key
      */
    /* CompleteClass */
    override def removeItem(key: String): Unit = js.native
    
    /**
      * Sets the item in the window storage object with the given key.
      * @param key
      * @param value
      */
    /* CompleteClass */
    override def setItem(key: String, value: T): Unit = js.native
  }
}
