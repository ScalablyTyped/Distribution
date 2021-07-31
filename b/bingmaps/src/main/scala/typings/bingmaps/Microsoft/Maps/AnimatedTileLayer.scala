package typings.bingmaps.Microsoft.Maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimatedTileLayer extends StObject {
  
  /**
    * Gets the frame rate of this animated tile layer.
    * @returns The frame rate of this animated tile layer.
    **/
  def getFrameRate(): Double
  
  /**
    * Gets the loading screen overlay when tiles are being fetched.
    * @returns The loading screen overlay when tiles are being fetched.
    **/
  def getLoadingScreen(): CustomOverlay
  
  /**
    * Gets the maximum total tile fetching time of this animated tile layer.
    * @returns The maximum total tile fetching time of this animated tile layer
    **/
  def getMaxTotalLoadTime(): Double
  
  /**
    * Gets the tile sources associated with this layer.
    * @returns The tile sources associated with this layer.
    **/
  def getTileSources(): js.Array[TileSource]
  
  /**
    * Gets the visibility of this animated tile layer.
    * @returns The visibility of this animated tile layer.
    **/
  def getVisible(): Boolean
  
  /** Pause the tile layer animation. **/
  def pause(): Unit
  
  /** Play the animation either from start or where it was paused. **/
  def play(): Unit
  
  /**
    * Sets the options for the animated tile layer.
    * @params Options that define how to animate between the specified tile layers.
    **/
  def setOptions(options: IAnimatedTileLayerOptions): Unit
  
  /** Stop the layer animation, hide layer, and reset frame to the beginning. **/
  def stop(): Unit
}
object AnimatedTileLayer {
  
  @scala.inline
  def apply(
    getFrameRate: () => Double,
    getLoadingScreen: () => CustomOverlay,
    getMaxTotalLoadTime: () => Double,
    getTileSources: () => js.Array[TileSource],
    getVisible: () => Boolean,
    pause: () => Unit,
    play: () => Unit,
    setOptions: IAnimatedTileLayerOptions => Unit,
    stop: () => Unit
  ): AnimatedTileLayer = {
    val __obj = js.Dynamic.literal(getFrameRate = js.Any.fromFunction0(getFrameRate), getLoadingScreen = js.Any.fromFunction0(getLoadingScreen), getMaxTotalLoadTime = js.Any.fromFunction0(getMaxTotalLoadTime), getTileSources = js.Any.fromFunction0(getTileSources), getVisible = js.Any.fromFunction0(getVisible), pause = js.Any.fromFunction0(pause), play = js.Any.fromFunction0(play), setOptions = js.Any.fromFunction1(setOptions), stop = js.Any.fromFunction0(stop))
    __obj.asInstanceOf[AnimatedTileLayer]
  }
  
  @scala.inline
  implicit class AnimatedTileLayerMutableBuilder[Self <: AnimatedTileLayer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetFrameRate(value: () => Double): Self = StObject.set(x, "getFrameRate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLoadingScreen(value: () => CustomOverlay): Self = StObject.set(x, "getLoadingScreen", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMaxTotalLoadTime(value: () => Double): Self = StObject.set(x, "getMaxTotalLoadTime", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTileSources(value: () => js.Array[TileSource]): Self = StObject.set(x, "getTileSources", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetVisible(value: () => Boolean): Self = StObject.set(x, "getVisible", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPause(value: () => Unit): Self = StObject.set(x, "pause", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPlay(value: () => Unit): Self = StObject.set(x, "play", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetOptions(value: IAnimatedTileLayerOptions => Unit): Self = StObject.set(x, "setOptions", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
  }
}
