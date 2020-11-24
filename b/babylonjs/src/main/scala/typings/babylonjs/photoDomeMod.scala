package typings.babylonjs

import typings.babylonjs.textureDomeMod.TextureDome
import typings.babylonjs.textureMod.Texture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Helpers/photoDome", JSImport.Namespace)
@js.native
object photoDomeMod extends js.Object {
  
  @js.native
  class PhotoDome () extends TextureDome[Texture] {
    
    /**
      * Gets the current video mode for the video. It can be:
      * * TextureDome.MODE_MONOSCOPIC : Define the texture source as a Monoscopic panoramic 360.
      * * TextureDome.MODE_TOPBOTTOM  : Define the texture source as a Stereoscopic TopBottom/OverUnder panoramic 360.
      * * TextureDome.MODE_SIDEBYSIDE : Define the texture source as a Stereoscopic Side by Side panoramic 360.
      */
    def imageMode: Double = js.native
    /**
      * Sets the current video mode for the video. It can be:
      * * TextureDome.MODE_MONOSCOPIC : Define the texture source as a Monoscopic panoramic 360.
      * * TextureDome.MODE_TOPBOTTOM  : Define the texture source as a Stereoscopic TopBottom/OverUnder panoramic 360.
      * * TextureDome.MODE_SIDEBYSIDE : Define the texture source as a Stereoscopic Side by Side panoramic 360.
      */
    def imageMode_=(value: Double): Unit = js.native
    
    /**
      * Gets or sets the texture being displayed on the sphere
      */
    def photoTexture: Texture = js.native
    /**
      * sets the texture being displayed on the sphere
      */
    def photoTexture_=(value: Texture): Unit = js.native
  }
  /* static members */
  @js.native
  object PhotoDome extends js.Object {
    
    /**
      * Define the image as a Monoscopic panoramic 360 image.
      */
    val MODE_MONOSCOPIC: Double = js.native
    
    /**
      * Define the image as a Stereoscopic Side by Side panoramic 360 image.
      */
    val MODE_SIDEBYSIDE: Double = js.native
    
    /**
      * Define the image as a Stereoscopic TopBottom/OverUnder panoramic 360 image.
      */
    val MODE_TOPBOTTOM: Double = js.native
  }
}
