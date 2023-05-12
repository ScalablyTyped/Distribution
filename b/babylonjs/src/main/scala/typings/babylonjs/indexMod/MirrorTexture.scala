package typings.babylonjs.indexMod

import typings.babylonjs.anon.Height
import typings.babylonjs.anon.Ratio
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "MirrorTexture")
@js.native
open class MirrorTexture protected ()
  extends typings.babylonjs.materialsIndexMod.MirrorTexture {
  /**
    * Instantiates a Mirror Texture.
    * Mirror texture can be used to simulate the view from a mirror in a scene.
    * It will dynamically be rendered every frame to adapt to the camera point of view.
    * You can then easily use it as a reflectionTexture on a flat surface.
    * In case the surface is not a plane, please consider relying on reflection probes.
    * @see https://doc.babylonjs.com/features/featuresDeepDive/materials/using/reflectionTexture#mirrors
    * @param name
    * @param size
    * @param scene
    * @param generateMipMaps
    * @param type
    * @param samplingMode
    * @param generateDepthBuffer
    */
  def this(
    name: String,
    size: Double | Height | Ratio,
    scene: js.UndefOr[typings.babylonjs.sceneMod.Scene],
    generateMipMaps: js.UndefOr[Boolean],
    `type`: js.UndefOr[Double],
    samplingMode: js.UndefOr[Double],
    generateDepthBuffer: js.UndefOr[Boolean]
  ) = this()
}
