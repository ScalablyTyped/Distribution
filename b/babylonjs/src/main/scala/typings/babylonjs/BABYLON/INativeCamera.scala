package typings.babylonjs.BABYLON

import typings.babylonjs.HTMLVideoElement
import typings.std.MediaTrackConstraints
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait INativeCamera extends StObject {
  
  def createVideo(constraints: MediaTrackConstraints): Any
  
  def updateVideoTexture(texture: Nullable[InternalTexture], video: HTMLVideoElement, invertY: Boolean): Unit
}
object INativeCamera {
  
  inline def apply(
    createVideo: MediaTrackConstraints => Any,
    updateVideoTexture: (Nullable[InternalTexture], HTMLVideoElement, Boolean) => Unit
  ): INativeCamera = {
    val __obj = js.Dynamic.literal(createVideo = js.Any.fromFunction1(createVideo), updateVideoTexture = js.Any.fromFunction3(updateVideoTexture))
    __obj.asInstanceOf[INativeCamera]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: INativeCamera] (val x: Self) extends AnyVal {
    
    inline def setCreateVideo(value: MediaTrackConstraints => Any): Self = StObject.set(x, "createVideo", js.Any.fromFunction1(value))
    
    inline def setUpdateVideoTexture(value: (Nullable[InternalTexture], HTMLVideoElement, Boolean) => Unit): Self = StObject.set(x, "updateVideoTexture", js.Any.fromFunction3(value))
  }
}
