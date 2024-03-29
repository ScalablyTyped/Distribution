package typings.babylonjs.materialsTexturesIndexMod

import typings.babylonjs.sceneMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Materials/Textures/index", "RefractionTexture")
@js.native
open class RefractionTexture protected ()
  extends typings.babylonjs.materialsTexturesRefractionTextureMod.RefractionTexture {
  /**
    * Creates a refraction texture used by refraction channel of the standard material.
    * It is like a mirror but to see through a material.
    * @see https://doc.babylonjs.com/features/featuresDeepDive/materials/using/reflectionTexture#refraction
    * @param name Define the texture name
    * @param size Define the size of the underlying texture
    * @param scene Define the scene the refraction belongs to
    * @param generateMipMaps Define if we need to generate mips level for the refraction
    */
  def this(name: String, size: Double) = this()
  def this(name: String, size: Double, scene: Scene) = this()
  def this(name: String, size: Double, scene: Unit, generateMipMaps: Boolean) = this()
  def this(name: String, size: Double, scene: Scene, generateMipMaps: Boolean) = this()
}
