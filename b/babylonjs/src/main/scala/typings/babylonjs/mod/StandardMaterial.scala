package typings.babylonjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs", "StandardMaterial")
@js.native
class StandardMaterial protected ()
  extends typings.babylonjs.legacyMod.StandardMaterial {
  /**
    * Instantiates a new standard material.
    * This is the default material used in Babylon. It is the best trade off between quality
    * and performances.
    * @see http://doc.babylonjs.com/babylon101/materials
    * @param name Define the name of the material in the scene
    * @param scene Define the scene the material belong to
    */
  def this(name: String, scene: typings.babylonjs.sceneMod.Scene) = this()
}

/* static members */
@JSImport("babylonjs", "StandardMaterial")
@js.native
object StandardMaterial extends js.Object {
  /**
    * Are ambient textures enabled in the application.
    */
  def AmbientTextureEnabled(): Boolean = js.native
  def AmbientTextureEnabled(value: Boolean): js.Any = js.native
  /**
    * Are bump textures enabled in the application.
    */
  def BumpTextureEnabled(): Boolean = js.native
  def BumpTextureEnabled(value: Boolean): js.Any = js.native
  /**
    * Are color grading textures enabled in the application.
    */
  def ColorGradingTextureEnabled(): Boolean = js.native
  def ColorGradingTextureEnabled(value: Boolean): js.Any = js.native
  /**
    * Are diffuse textures enabled in the application.
    */
  def DiffuseTextureEnabled(): Boolean = js.native
  def DiffuseTextureEnabled(value: Boolean): js.Any = js.native
  /**
    * Are emissive textures enabled in the application.
    */
  def EmissiveTextureEnabled(): Boolean = js.native
  def EmissiveTextureEnabled(value: Boolean): js.Any = js.native
  /**
    * Are fresnels enabled in the application.
    */
  def FresnelEnabled(): Boolean = js.native
  def FresnelEnabled(value: Boolean): js.Any = js.native
  /**
    * Are lightmap textures enabled in the application.
    */
  def LightmapTextureEnabled(): Boolean = js.native
  def LightmapTextureEnabled(value: Boolean): js.Any = js.native
  /**
    * Are opacity textures enabled in the application.
    */
  def OpacityTextureEnabled(): Boolean = js.native
  def OpacityTextureEnabled(value: Boolean): js.Any = js.native
  /**
    * Creates a standard material from parsed material data
    * @param source defines the JSON representation of the material
    * @param scene defines the hosting scene
    * @param rootUrl defines the root URL to use to load textures and relative dependencies
    * @returns a new standard material
    */
  def Parse(source: js.Any, scene: typings.babylonjs.sceneMod.Scene, rootUrl: String): typings.babylonjs.standardMaterialMod.StandardMaterial = js.native
  /**
    * Are reflection textures enabled in the application.
    */
  def ReflectionTextureEnabled(): Boolean = js.native
  def ReflectionTextureEnabled(value: Boolean): js.Any = js.native
  /**
    * Are refraction textures enabled in the application.
    */
  def RefractionTextureEnabled(): Boolean = js.native
  def RefractionTextureEnabled(value: Boolean): js.Any = js.native
  /**
    * Are specular textures enabled in the application.
    */
  def SpecularTextureEnabled(): Boolean = js.native
  def SpecularTextureEnabled(value: Boolean): js.Any = js.native
}

