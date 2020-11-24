package typings.babylonjs.global.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.PhotoDome")
@js.native
class PhotoDome ()
  extends typings.babylonjs.BABYLON.PhotoDome
/* static members */
@JSGlobal("BABYLON.PhotoDome")
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
