package typings.azureMsalBrowser

import typings.azureMsalBrowser.iwindowstorageMod.IWindowStorage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object browserStorageMod {
  
  @JSImport("@azure/msal-browser/dist/cache/BrowserStorage", "BrowserStorage")
  @js.native
  open class BrowserStorage protected ()
    extends StObject
       with IWindowStorage[String] {
    def this(cacheLocation: String) = this()
    
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
    override def getItem(key: String): String | Null = js.native
    
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
    override def setItem(key: String, value: String): Unit = js.native
    
    /* private */ var validateWindowStorage: Any = js.native
    
    /* private */ var windowStorage: Any = js.native
  }
}
