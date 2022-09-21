package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimatedImage
  extends StObject
     with EmbindObject[AnimatedImage] {
  
  /**
    * Returns the length of the current frame in ms.
    */
  def currentFrameDuration(): Double
  
  /**
    * Decodes the next frame. Returns the length of that new frame in ms.
    * Returns -1 when the animation is on the last frame.
    */
  def decodeNextFrame(): Double
  
  /**
    * Return the total number of frames in the animation.
    */
  def getFrameCount(): Double
  
  /**
    * Return the repetition count for this animation.
    */
  def getRepetitionCount(): Double
  
  /**
    * Returns the possibly scaled height of the image.
    */
  def height(): Double
  
  /**
    * Returns a still image of the current frame or null if there is no current frame.
    */
  def makeImageAtCurrentFrame(): Image | Null
  
  /**
    * Reset the animation to the beginning.
    */
  def reset(): Unit
  
  /**
    * Returns the possibly scaled width of the image.
    */
  def width(): Double
}
object AnimatedImage {
  
  inline def apply(
    currentFrameDuration: () => Double,
    decodeNextFrame: () => Double,
    delete: () => Unit,
    deleteLater: () => Unit,
    getFrameCount: () => Double,
    getRepetitionCount: () => Double,
    height: () => Double,
    isAliasOf: Any => Boolean,
    isDeleted: () => Boolean,
    makeImageAtCurrentFrame: () => Image | Null,
    reset: () => Unit,
    width: () => Double
  ): AnimatedImage = {
    val __obj = js.Dynamic.literal(currentFrameDuration = js.Any.fromFunction0(currentFrameDuration), decodeNextFrame = js.Any.fromFunction0(decodeNextFrame), delete = js.Any.fromFunction0(delete), deleteLater = js.Any.fromFunction0(deleteLater), getFrameCount = js.Any.fromFunction0(getFrameCount), getRepetitionCount = js.Any.fromFunction0(getRepetitionCount), height = js.Any.fromFunction0(height), isAliasOf = js.Any.fromFunction1(isAliasOf), isDeleted = js.Any.fromFunction0(isDeleted), makeImageAtCurrentFrame = js.Any.fromFunction0(makeImageAtCurrentFrame), reset = js.Any.fromFunction0(reset), width = js.Any.fromFunction0(width))
    __obj.asInstanceOf[AnimatedImage]
  }
  
  extension [Self <: AnimatedImage](x: Self) {
    
    inline def setCurrentFrameDuration(value: () => Double): Self = StObject.set(x, "currentFrameDuration", js.Any.fromFunction0(value))
    
    inline def setDecodeNextFrame(value: () => Double): Self = StObject.set(x, "decodeNextFrame", js.Any.fromFunction0(value))
    
    inline def setGetFrameCount(value: () => Double): Self = StObject.set(x, "getFrameCount", js.Any.fromFunction0(value))
    
    inline def setGetRepetitionCount(value: () => Double): Self = StObject.set(x, "getRepetitionCount", js.Any.fromFunction0(value))
    
    inline def setHeight(value: () => Double): Self = StObject.set(x, "height", js.Any.fromFunction0(value))
    
    inline def setMakeImageAtCurrentFrame(value: () => Image | Null): Self = StObject.set(x, "makeImageAtCurrentFrame", js.Any.fromFunction0(value))
    
    inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
    
    inline def setWidth(value: () => Double): Self = StObject.set(x, "width", js.Any.fromFunction0(value))
  }
}
