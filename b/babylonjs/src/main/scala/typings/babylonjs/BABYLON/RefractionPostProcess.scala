package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RefractionPostProcess
  extends StObject
     with PostProcess {
  
  /* private */ var _ownRefractionTexture: js.Any = js.native
  
  /* private */ var _refTexture: js.Any = js.native
  
  /** the base color of the refraction (used to taint the rendering) */
  var color: Color3 = js.native
  
  /** the coefficient of the base color (0 to remove base color tainting) */
  var colorLevel: Double = js.native
  
  /** simulated refraction depth */
  var depth: Double = js.native
  
  /**
    * Gets or sets the refraction texture
    * Please note that you are responsible for disposing the texture if you set it manually
    */
  def refractionTexture: Texture = js.native
  
  /** Gets the url used to load the refraction texture */
  var refractionTextureUrl: String = js.native
  
  def refractionTexture_=(value: Texture): Unit = js.native
}
