package typings.babylonjs.global.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.StandardMaterial")
@js.native
class StandardMaterial protected ()
  extends typings.babylonjs.BABYLON.StandardMaterial {
  /**
    * Instantiates a new standard material.
    * This is the default material used in Babylon. It is the best trade off between quality
    * and performances.
    * @see https://doc.babylonjs.com/babylon101/materials
    * @param name Define the name of the material in the scene
    * @param scene Define the scene the material belong to
    */
  def this(name: String, scene: typings.babylonjs.BABYLON.Scene) = this()
}
/* static members */
@JSGlobal("BABYLON.StandardMaterial")
@js.native
object StandardMaterial extends js.Object {
  
  /**
    * Are ambient textures enabled in the application.
    */
  def AmbientTextureEnabled: Boolean = js.native
  def AmbientTextureEnabled_=(value: Boolean): Unit = js.native
  
  /**
    * Are bump textures enabled in the application.
    */
  def BumpTextureEnabled: Boolean = js.native
  def BumpTextureEnabled_=(value: Boolean): Unit = js.native
  
  /**
    * Are color grading textures enabled in the application.
    */
  def ColorGradingTextureEnabled: Boolean = js.native
  def ColorGradingTextureEnabled_=(value: Boolean): Unit = js.native
  
  /**
    * Are detail textures enabled in the application.
    */
  def DetailTextureEnabled: Boolean = js.native
  def DetailTextureEnabled_=(value: Boolean): Unit = js.native
  
  /**
    * Are diffuse textures enabled in the application.
    */
  def DiffuseTextureEnabled: Boolean = js.native
  def DiffuseTextureEnabled_=(value: Boolean): Unit = js.native
  
  /**
    * Are emissive textures enabled in the application.
    */
  def EmissiveTextureEnabled: Boolean = js.native
  def EmissiveTextureEnabled_=(value: Boolean): Unit = js.native
  
  /**
    * Are fresnels enabled in the application.
    */
  def FresnelEnabled: Boolean = js.native
  def FresnelEnabled_=(value: Boolean): Unit = js.native
  
  /**
    * Are lightmap textures enabled in the application.
    */
  def LightmapTextureEnabled: Boolean = js.native
  def LightmapTextureEnabled_=(value: Boolean): Unit = js.native
  
  /**
    * Are opacity textures enabled in the application.
    */
  def OpacityTextureEnabled: Boolean = js.native
  def OpacityTextureEnabled_=(value: Boolean): Unit = js.native
  
  /**
    * Creates a standard material from parsed material data
    * @param source defines the JSON representation of the material
    * @param scene defines the hosting scene
    * @param rootUrl defines the root URL to use to load textures and relative dependencies
    * @returns a new standard material
    */
  def Parse(source: js.Any, scene: typings.babylonjs.BABYLON.Scene, rootUrl: String): typings.babylonjs.BABYLON.StandardMaterial = js.native
  
  /**
    * Are reflection textures enabled in the application.
    */
  def ReflectionTextureEnabled: Boolean = js.native
  def ReflectionTextureEnabled_=(value: Boolean): Unit = js.native
  
  /**
    * Are refraction textures enabled in the application.
    */
  def RefractionTextureEnabled: Boolean = js.native
  def RefractionTextureEnabled_=(value: Boolean): Unit = js.native
  
  /**
    * Are specular textures enabled in the application.
    */
  def SpecularTextureEnabled: Boolean = js.native
  def SpecularTextureEnabled_=(value: Boolean): Unit = js.native
}
