package typings
package cordovaDashPluginDashMapsforgeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapsforgeCachePlugin extends js.Object {
  /**
    * Sets a flag to destroy the cache when the onDestroy method is called.
    * @param destroy If true, cache will be destroyed when the onDestroy method will be called.
    * @param success Success callback.
    * @param error Error callback
    */
  def destroyCacheOnExit(destroy: scala.Boolean): scala.Unit = js.native
  def destroyCacheOnExit(destroy: scala.Boolean, success: js.Function0[scala.Unit]): scala.Unit = js.native
  def destroyCacheOnExit(
    destroy: scala.Boolean,
    success: js.Function0[scala.Unit],
    error: js.Function1[/* message */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  /**
    * This method is the one that provides the tiles, generating them if their are not in the cache.
    * @param args Array in the following form: [double lat, double lng, byte zoom]
    * @param success Success callback. Gets the tile path.
    * @param error Error callback
    */
  def getTile(args: js.Array[_]): scala.Unit = js.native
  def getTile(args: js.Array[_], success: js.Function1[/* tilePath */ java.lang.String, scala.Unit]): scala.Unit = js.native
  def getTile(
    args: js.Array[_],
    success: js.Function1[/* tilePath */ java.lang.String, scala.Unit],
    error: js.Function1[/* message */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  /**
    * You should call this method before any other one, and provide it with the absolute map file path.
    * @param mapFilePath Absolute map file path.
    * @param success Success callback.
    * @param error Error callback
    */
  def initialize(mapFilePath: java.lang.String): scala.Unit = js.native
  def initialize(mapFilePath: java.lang.String, success: js.Function0[scala.Unit]): scala.Unit = js.native
  def initialize(
    mapFilePath: java.lang.String,
    success: js.Function0[scala.Unit],
    error: js.Function1[/* message */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Deletes the cache depending on the flag state.
    * @param success Success callback.
    * @param error Error callback
    */
  def onDestroy(): scala.Unit = js.native
  def onDestroy(success: js.Function0[scala.Unit]): scala.Unit = js.native
  def onDestroy(success: js.Function0[scala.Unit], error: js.Function1[/* message */ java.lang.String, scala.Unit]): scala.Unit = js.native
  /**
    * This method sets the size in megabytes that will remain always available in memory in order to avoid that the application uses all space available.
    * @param sizeInMB Size in megabytes that will remain always available in memory.
    * @param success Success callback.
    * @param error Error callback
    */
  def setCacheCleaningTrigger(sizeInMB: scala.Double): scala.Unit = js.native
  def setCacheCleaningTrigger(sizeInMB: scala.Double, success: js.Function0[scala.Unit]): scala.Unit = js.native
  def setCacheCleaningTrigger(
    sizeInMB: scala.Double,
    success: js.Function0[scala.Unit],
    error: js.Function1[/* message */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Enables or disables the cache. If disabled, the plugin will generate the tiles always from scratch. Cache is enabled by default.
    * @param enabled Cache enabled or disabled.
    * @param success Success callback.
    * @param error Error callback
    */
  def setCacheEnabled(enabled: scala.Boolean): scala.Unit = js.native
  def setCacheEnabled(enabled: scala.Boolean, success: js.Function0[scala.Unit]): scala.Unit = js.native
  def setCacheEnabled(
    enabled: scala.Boolean,
    success: js.Function0[scala.Unit],
    error: js.Function1[/* message */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Sets whether or not the cache should be placed in the internal memory or in the SD card.
    * By default it is placed in SD card, so devices with not too much memory have a better performance.
    * @param external Cache external or internal.
    * @param success Success callback.
    * @param error Error callback
    */
  def setExternalCache(external: scala.Boolean): scala.Unit = js.native
  def setExternalCache(external: scala.Boolean, success: js.Function0[scala.Unit]): scala.Unit = js.native
  def setExternalCache(
    external: scala.Boolean,
    success: js.Function0[scala.Unit],
    error: js.Function1[/* message */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Sets the map file to be used for rendering to the map specified by its absolute path.
    * @param absolutePath Absolute map file path.
    * @param success Success callback.
    * @param error Error callback
    */
  def setMapFile(absolutePath: java.lang.String): scala.Unit = js.native
  def setMapFile(absolutePath: java.lang.String, success: js.Function0[scala.Unit]): scala.Unit = js.native
  def setMapFile(
    absolutePath: java.lang.String,
    success: js.Function0[scala.Unit],
    error: js.Function1[/* message */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Sets the age for the generated images. This means that when the cache is being cleaned, all images younger than the specified value will be kept in the cache in order to avoid deleting images that are being used at the moment.
    * @param milliseconds Max cache age in milliseconds.
    * @param success Success callback.
    * @param error Error callback
    */
  def setMaxCacheAge(milliseconds: scala.Double): scala.Unit = js.native
  def setMaxCacheAge(milliseconds: scala.Double, success: js.Function0[scala.Unit]): scala.Unit = js.native
  def setMaxCacheAge(
    milliseconds: scala.Double,
    success: js.Function0[scala.Unit],
    error: js.Function1[/* message */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Sets the maximum size for the cache. This size must be specified in megabytes. If there is not that space available, the cache will fit the maximum size.
    * @param sizeInMB Max cache size in megabytes.
    * @param success Success callback.
    * @param error Error callback
    */
  def setMaxCacheSize(sizeInMB: scala.Double): scala.Unit = js.native
  def setMaxCacheSize(sizeInMB: scala.Double, success: js.Function0[scala.Unit]): scala.Unit = js.native
  def setMaxCacheSize(
    sizeInMB: scala.Double,
    success: js.Function0[scala.Unit],
    error: js.Function1[/* message */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
}

