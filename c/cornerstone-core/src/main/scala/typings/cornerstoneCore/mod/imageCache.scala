package typings.cornerstoneCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imageCache {
  
  @JSImport("cornerstone-core", "imageCache")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("cornerstone-core", "imageCache.cachedImages")
  @js.native
  val cachedImages: js.Array[Any] = js.native
  
  /**
    * Updates the space than an image is using in the cache
    *
    * @param imageId Image ID
    * @param newCacheSize New image size
    */
  inline def changeImageIdCacheSize(imageId: String, newCacheSize: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("changeImageIdCacheSize")(imageId.asInstanceOf[js.Any], newCacheSize.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Gets the current state of the cache
    */
  inline def getCacheInfo(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getCacheInfo")().asInstanceOf[Unit]
  
  /**
    * Retuns the object that is loading a given imageId
    *
    * @param imageId Image ID
    */
  inline def getImageLoadObject(imageId: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getImageLoadObject")(imageId.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Removes all images from cache
    */
  inline def purgeCache(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("purgeCache")().asInstanceOf[Unit]
  
  /**
    * Puts a new image loader into the cache
    *
    * @param imageId ImageId of the image loader
    * @param imageLoadObject The object that is loading or loaded the image
    */
  inline def putImageLoadObject(imageId: String, imageLoadObject: ImageLoadObject): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("putImageLoadObject")(imageId.asInstanceOf[js.Any], imageLoadObject.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Removes the image loader associated with a given Id from the cache
    *
    * @param imageId Image ID
    */
  inline def removeImageLoadObject(imageId: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeImageLoadObject")(imageId.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Sets the maximum size of cache and purges cache contents if necessary.
    *
    * @param numBytes The maximun size that the cache should occupy.
    */
  inline def setMaximumSizeBytes(numBytes: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setMaximumSizeBytes")(numBytes.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait CacheInformation extends StObject {
    
    /**
      * Currently occupied space in the cache in bytes
      */
    var cacheSizeInBytes: Double
    
    /**
      * The maximum size of the cache in bytes
      */
    var maximumSizeInBytes: Double
    
    /**
      * Number of ImageLoaders in the cache
      */
    var numberOfImagesCached: Double
  }
  object CacheInformation {
    
    inline def apply(cacheSizeInBytes: Double, maximumSizeInBytes: Double, numberOfImagesCached: Double): CacheInformation = {
      val __obj = js.Dynamic.literal(cacheSizeInBytes = cacheSizeInBytes.asInstanceOf[js.Any], maximumSizeInBytes = maximumSizeInBytes.asInstanceOf[js.Any], numberOfImagesCached = numberOfImagesCached.asInstanceOf[js.Any])
      __obj.asInstanceOf[CacheInformation]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CacheInformation] (val x: Self) extends AnyVal {
      
      inline def setCacheSizeInBytes(value: Double): Self = StObject.set(x, "cacheSizeInBytes", value.asInstanceOf[js.Any])
      
      inline def setMaximumSizeInBytes(value: Double): Self = StObject.set(x, "maximumSizeInBytes", value.asInstanceOf[js.Any])
      
      inline def setNumberOfImagesCached(value: Double): Self = StObject.set(x, "numberOfImagesCached", value.asInstanceOf[js.Any])
    }
  }
}
