package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PhotoDome
  extends StObject
     with TextureDome[Texture] {
  
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
