package typings.babylonjs.legacyMod

import typings.babylonjs.AnonRatio
import typings.babylonjs.AnonWidth
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Legacy/legacy", "MirrorTexture")
@js.native
class MirrorTexture protected ()
  extends typings.babylonjs.indexMod.MirrorTexture {
  /**
    * Instantiates a Mirror Texture.
    * Mirror texture can be used to simulate the view from a mirror in a scene.
    * It will dynamically be rendered every frame to adapt to the camera point of view.
    * You can then easily use it as a reflectionTexture on a flat surface.
    * In case the surface is not a plane, please consider relying on reflection probes.
    * @see https://doc.babylonjs.com/how_to/reflect#mirrors
    * @param name
    * @param size
    * @param scene
    * @param generateMipMaps
    * @param type
    * @param samplingMode
    * @param generateDepthBuffer
    */
  def this(name: String, size: Double, scene: typings.babylonjs.sceneMod.Scene) = this()
  def this(name: String, size: AnonRatio, scene: typings.babylonjs.sceneMod.Scene) = this()
  def this(name: String, size: AnonWidth, scene: typings.babylonjs.sceneMod.Scene) = this()
  def this(name: String, size: Double, scene: typings.babylonjs.sceneMod.Scene, generateMipMaps: Boolean) = this()
  def this(name: String, size: AnonRatio, scene: typings.babylonjs.sceneMod.Scene, generateMipMaps: Boolean) = this()
  def this(name: String, size: AnonWidth, scene: typings.babylonjs.sceneMod.Scene, generateMipMaps: Boolean) = this()
  def this(
    name: String,
    size: Double,
    scene: typings.babylonjs.sceneMod.Scene,
    generateMipMaps: Boolean,
    `type`: Double
  ) = this()
  def this(
    name: String,
    size: AnonRatio,
    scene: typings.babylonjs.sceneMod.Scene,
    generateMipMaps: Boolean,
    `type`: Double
  ) = this()
  def this(
    name: String,
    size: AnonWidth,
    scene: typings.babylonjs.sceneMod.Scene,
    generateMipMaps: Boolean,
    `type`: Double
  ) = this()
  def this(
    name: String,
    size: Double,
    scene: typings.babylonjs.sceneMod.Scene,
    generateMipMaps: Boolean,
    `type`: Double,
    samplingMode: Double
  ) = this()
  def this(
    name: String,
    size: AnonRatio,
    scene: typings.babylonjs.sceneMod.Scene,
    generateMipMaps: Boolean,
    `type`: Double,
    samplingMode: Double
  ) = this()
  def this(
    name: String,
    size: AnonWidth,
    scene: typings.babylonjs.sceneMod.Scene,
    generateMipMaps: Boolean,
    `type`: Double,
    samplingMode: Double
  ) = this()
  def this(
    name: String,
    size: Double,
    scene: typings.babylonjs.sceneMod.Scene,
    generateMipMaps: Boolean,
    `type`: Double,
    samplingMode: Double,
    generateDepthBuffer: Boolean
  ) = this()
  def this(
    name: String,
    size: AnonRatio,
    scene: typings.babylonjs.sceneMod.Scene,
    generateMipMaps: Boolean,
    `type`: Double,
    samplingMode: Double,
    generateDepthBuffer: Boolean
  ) = this()
  def this(
    name: String,
    size: AnonWidth,
    scene: typings.babylonjs.sceneMod.Scene,
    generateMipMaps: Boolean,
    `type`: Double,
    samplingMode: Double,
    generateDepthBuffer: Boolean
  ) = this()
}

