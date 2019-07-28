package typings.bingmaps.MicrosoftNs.MapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Microsoft.Maps.AnimatedTileLayer")
@js.native
/**
  * @contstructor
  * @param options Options that define how to animate between the specified tile layers. 
  */
class AnimatedTileLayer () extends js.Object {
  def this(options: IAnimatedTileLayerOptions) = this()
  /**
    * Gets the frame rate of this animated tile layer.
    * @returns The frame rate of this animated tile layer.
    **/
  def getFrameRate(): Double = js.native
  /**
    * Gets the loading screen overlay when tiles are being fetched.
    * @returns The loading screen overlay when tiles are being fetched.
    **/
  def getLoadingScreen(): CustomOverlay = js.native
  /**
    * Gets the maximum total tile fetching time of this animated tile layer.
    * @returns The maximum total tile fetching time of this animated tile layer
    **/
  def getMaxTotalLoadTime(): Double = js.native
  /**
    * Gets the tile sources associated with this layer.
    * @returns The tile sources associated with this layer.
    **/
  def getTileSources(): js.Array[TileSource] = js.native
  /**
    * Gets the visibility of this animated tile layer.
    * @returns The visibility of this animated tile layer.
    **/
  def getVisible(): Boolean = js.native
  /** Pause the tile layer animation. **/
  def pause(): Unit = js.native
  /** Play the animation either from start or where it was paused. **/
  def play(): Unit = js.native
  /**
    * Sets the options for the animated tile layer.
    * @params Options that define how to animate between the specified tile layers.
    **/
  def setOptions(options: IAnimatedTileLayerOptions): Unit = js.native
  /** Stop the layer animation, hide layer, and reset frame to the beginning. **/
  def stop(): Unit = js.native
}

