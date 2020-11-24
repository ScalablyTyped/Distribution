package typings.babylonjs

import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.textureDomeMod.TextureDome
import typings.babylonjs.videoTextureMod.VideoTexture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Helpers/videoDome", JSImport.Namespace)
@js.native
object videoDomeMod extends js.Object {
  
  @js.native
  class VideoDome () extends TextureDome[VideoTexture] {
    
    /* protected */ def _initTexture(urlsOrElement: HTMLVideoElement, scene: Scene, options: js.Any): VideoTexture = js.native
    
    /**
      * Get the video mode of this dome
      */
    def videoMode: Double = js.native
    /**
      * Set the video mode of this dome.
      * @see textureMode
      */
    def videoMode_=(value: Double): Unit = js.native
    
    /**
      * Get the video texture associated with this video dome
      */
    def videoTexture: VideoTexture = js.native
  }
  /* static members */
  @js.native
  object VideoDome extends js.Object {
    
    /**
      * Define the video source as a Monoscopic panoramic 360 video.
      */
    val MODE_MONOSCOPIC: Double = js.native
    
    /**
      * Define the video source as a Stereoscopic Side by Side panoramic 360 video.
      */
    val MODE_SIDEBYSIDE: Double = js.native
    
    /**
      * Define the video source as a Stereoscopic TopBottom/OverUnder panoramic 360 video.
      */
    val MODE_TOPBOTTOM: Double = js.native
  }
}
