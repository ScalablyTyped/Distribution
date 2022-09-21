package typings.cesium.mod

import typings.cesium.anon.ReloadFunction
import typings.std.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "TimeDynamicImagery")
@js.native
open class TimeDynamicImagery protected () extends StObject {
  def this(options: ReloadFunction) = this()
  
  /**
    * Checks if the next interval is approaching and will start preload the tile if necessary. Otherwise it will
    * just add the tile to a list to preload when we approach the next interval.
    * @param x - The tile X coordinate.
    * @param y - The tile Y coordinate.
    * @param level - The tile level.
    * @param [request] - The request object. Intended for internal use only.
    */
  def checkApproachingInterval(x: Double, y: Double, level: Double): Unit = js.native
  def checkApproachingInterval(x: Double, y: Double, level: Double, request: Request): Unit = js.native
  
  /**
    * Gets or sets a clock that is used to get keep the time used for time dynamic parameters.
    */
  var clock: Clock = js.native
  
  /**
    * Gets the current interval.
    */
  var currentInterval: TimeInterval = js.native
  
  /**
    * Gets the tile from the cache if its available.
    * @param x - The tile X coordinate.
    * @param y - The tile Y coordinate.
    * @param level - The tile level.
    * @param [request] - The request object. Intended for internal use only.
    * @returns A promise for the image that will resolve when the image is available, or
    *          undefined if the tile is not in the cache.
    */
  def getFromCache(x: Double, y: Double, level: Double): js.UndefOr[js.Promise[HTMLImageElement]] = js.native
  def getFromCache(x: Double, y: Double, level: Double, request: Request): js.UndefOr[js.Promise[HTMLImageElement]] = js.native
  
  /**
    * Gets or sets a time interval collection.
    */
  var times: TimeIntervalCollection = js.native
}
