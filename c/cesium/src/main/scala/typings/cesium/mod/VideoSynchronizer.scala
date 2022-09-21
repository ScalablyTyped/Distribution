package typings.cesium.mod

import typings.std.HTMLVideoElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "VideoSynchronizer")
@js.native
open class VideoSynchronizer () extends StObject {
  def this(options: typings.cesium.anon.Clock) = this()
  
  /**
    * Gets or sets the clock used to drive the video element.
    */
  var clock: Clock = js.native
  
  /**
    * Destroys and resources used by the object.  Once an object is destroyed, it should not be used.
    */
  def destroy(): Unit = js.native
  
  /**
    * Gets or sets the video element to synchronize.
    */
  var element: HTMLVideoElement = js.native
  
  /**
    * Gets or sets the simulation time that marks the start of the video.
    */
  var epoch: JulianDate = js.native
  
  /**
    * Returns true if this object was destroyed; otherwise, false.
    * @returns True if this object was destroyed; otherwise, false.
    */
  def isDestroyed(): Boolean = js.native
  
  /**
    * Gets or sets the amount of time in seconds the video's currentTime
    * and the clock's currentTime can diverge before a video seek is performed.
    * Lower values make the synchronization more accurate but video
    * performance might suffer.  Higher values provide better performance
    * but at the cost of accuracy.
    */
  var tolerance: Double = js.native
}
