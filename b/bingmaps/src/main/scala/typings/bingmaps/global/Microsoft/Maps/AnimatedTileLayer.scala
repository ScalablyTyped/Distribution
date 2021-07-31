package typings.bingmaps.global.Microsoft.Maps

import typings.bingmaps.Microsoft.Maps.IAnimatedTileLayerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Microsoft.Maps.AnimatedTileLayer")
@js.native
/**
  * @contstructor
  * @param options Options that define how to animate between the specified tile layers. 
  */
class AnimatedTileLayer ()
  extends StObject
     with typings.bingmaps.Microsoft.Maps.AnimatedTileLayer {
  def this(options: IAnimatedTileLayerOptions) = this()
  
  /**
    * Gets the frame rate of this animated tile layer.
    * @returns The frame rate of this animated tile layer.
    **/
  /* CompleteClass */
  override def getFrameRate(): Double = js.native
  
  /**
    * Gets the loading screen overlay when tiles are being fetched.
    * @returns The loading screen overlay when tiles are being fetched.
    **/
  /* CompleteClass */
  override def getLoadingScreen(): typings.bingmaps.Microsoft.Maps.CustomOverlay = js.native
  
  /**
    * Gets the maximum total tile fetching time of this animated tile layer.
    * @returns The maximum total tile fetching time of this animated tile layer
    **/
  /* CompleteClass */
  override def getMaxTotalLoadTime(): Double = js.native
  
  /**
    * Gets the tile sources associated with this layer.
    * @returns The tile sources associated with this layer.
    **/
  /* CompleteClass */
  override def getTileSources(): js.Array[typings.bingmaps.Microsoft.Maps.TileSource] = js.native
  
  /**
    * Gets the visibility of this animated tile layer.
    * @returns The visibility of this animated tile layer.
    **/
  /* CompleteClass */
  override def getVisible(): Boolean = js.native
  
  /** Pause the tile layer animation. **/
  /* CompleteClass */
  override def pause(): Unit = js.native
  
  /** Play the animation either from start or where it was paused. **/
  /* CompleteClass */
  override def play(): Unit = js.native
  
  /**
    * Sets the options for the animated tile layer.
    * @params Options that define how to animate between the specified tile layers.
    **/
  /* CompleteClass */
  override def setOptions(options: IAnimatedTileLayerOptions): Unit = js.native
  
  /** Stop the layer animation, hide layer, and reset frame to the beginning. **/
  /* CompleteClass */
  override def stop(): Unit = js.native
}
