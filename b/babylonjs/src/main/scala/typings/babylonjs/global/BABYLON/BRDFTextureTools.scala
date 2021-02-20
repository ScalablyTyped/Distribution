package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.BRDFTextureTools")
@js.native
class BRDFTextureTools ()
  extends typings.babylonjs.BABYLON.BRDFTextureTools
/* static members */
object BRDFTextureTools {
  
  @JSGlobal("BABYLON.BRDFTextureTools")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Gets a default environment BRDF for MS-BRDF Height Correlated BRDF
    * @param scene defines the hosting scene
    * @returns the environment BRDF texture
    */
  @JSGlobal("BABYLON.BRDFTextureTools.GetEnvironmentBRDFTexture")
  @js.native
  def GetEnvironmentBRDFTexture(scene: typings.babylonjs.BABYLON.Scene): typings.babylonjs.BABYLON.BaseTexture = js.native
  
  @JSGlobal("BABYLON.BRDFTextureTools._environmentBRDFBase64Texture")
  @js.native
  def _environmentBRDFBase64Texture: js.Any = js.native
  @scala.inline
  def _environmentBRDFBase64Texture_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_environmentBRDFBase64Texture")(x.asInstanceOf[js.Any])
  
  /**
    * Prevents texture cache collision
    */
  @JSGlobal("BABYLON.BRDFTextureTools._instanceNumber")
  @js.native
  def _instanceNumber: js.Any = js.native
  @scala.inline
  def _instanceNumber_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_instanceNumber")(x.asInstanceOf[js.Any])
}
