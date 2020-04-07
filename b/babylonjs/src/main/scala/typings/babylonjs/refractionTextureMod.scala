package typings.babylonjs

import typings.babylonjs.mathPlaneMod.Plane
import typings.babylonjs.renderTargetTextureMod.RenderTargetTexture
import typings.babylonjs.sceneMod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Materials/Textures/refractionTexture", JSImport.Namespace)
@js.native
object refractionTextureMod extends js.Object {
  @js.native
  class RefractionTexture protected () extends RenderTargetTexture {
    /**
      * Creates a refraction texture used by refraction channel of the standard material.
      * It is like a mirror but to see through a material.
      * @see https://doc.babylonjs.com/how_to/reflect#refraction
      * @param name Define the texture name
      * @param size Define the size of the underlying texture
      * @param scene Define the scene the refraction belongs to
      * @param generateMipMaps Define if we need to generate mips level for the refraction
      */
    def this(name: String, size: Double, scene: Scene) = this()
    def this(name: String, size: Double, scene: Scene, generateMipMaps: Boolean) = this()
    /**
      * Define how deep under the surface we should see.
      */
    var depth: Double = js.native
    /**
      * Define the reflection plane we want to use. The refractionPlane is usually set to the constructed refractor.
      * It is possible to directly set the refractionPlane by directly using a Plane(a, b, c, d) where a, b and c give the plane normal vector (a, b, c) and d is a scalar displacement from the refractionPlane to the origin. However in all but the very simplest of situations it is more straight forward to set it to the refractor as stated in the doc.
      * @see https://doc.babylonjs.com/how_to/reflect#refraction
      */
    var refractionPlane: Plane = js.native
  }
  
}

