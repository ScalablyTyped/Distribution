package typings.bingmaps.Microsoft.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnimatedTileLayer extends js.Object {
  
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
  implicit class AnimatedTileLayerOps[Self <: AnimatedTileLayer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetFrameRate(value: () => Double): Self = this.set("getFrameRate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLoadingScreen(value: () => CustomOverlay): Self = this.set("getLoadingScreen", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMaxTotalLoadTime(value: () => Double): Self = this.set("getMaxTotalLoadTime", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTileSources(value: () => js.Array[TileSource]): Self = this.set("getTileSources", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetVisible(value: () => Boolean): Self = this.set("getVisible", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPause(value: () => Unit): Self = this.set("pause", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPlay(value: () => Unit): Self = this.set("play", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetOptions(value: IAnimatedTileLayerOptions => Unit): Self = this.set("setOptions", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStop(value: () => Unit): Self = this.set("stop", js.Any.fromFunction0(value))
  }
}
