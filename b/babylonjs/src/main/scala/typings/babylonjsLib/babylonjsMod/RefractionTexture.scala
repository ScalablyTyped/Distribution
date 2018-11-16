package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Creates a refraction texture used by refraction channel of the standard material.
     * It is like a mirror but to see through a material.
     * @see https://doc.babylonjs.com/how_to/reflect#refraction
     */
@JSImport("babylonjs", "RefractionTexture")
@js.native
class RefractionTexture protected ()
  extends babylonjsLib.BABYLONNs.RefractionTexture {
  /**
           * Creates a refraction texture used by refraction channel of the standard material.
           * It is like a mirror but to see through a material.
           * @see https://doc.babylonjs.com/how_to/reflect#refraction
           * @param name Define the texture name
           * @param size Define the size of the underlying texture
           * @param scene Define the scene the refraction belongs to
           * @param generateMipMaps Define if we need to generate mips level for the refraction
           */
  def this(name: java.lang.String, size: scala.Double, scene: babylonjsLib.BABYLONNs.Scene) = this()
  /**
           * Creates a refraction texture used by refraction channel of the standard material.
           * It is like a mirror but to see through a material.
           * @see https://doc.babylonjs.com/how_to/reflect#refraction
           * @param name Define the texture name
           * @param size Define the size of the underlying texture
           * @param scene Define the scene the refraction belongs to
           * @param generateMipMaps Define if we need to generate mips level for the refraction
           */
  def this(name: java.lang.String, size: scala.Double, scene: babylonjsLib.BABYLONNs.Scene, generateMipMaps: scala.Boolean) = this()
}

