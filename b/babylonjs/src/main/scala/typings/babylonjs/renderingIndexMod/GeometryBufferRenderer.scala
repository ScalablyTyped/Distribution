package typings.babylonjs.renderingIndexMod

import typings.babylonjs.sceneMod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Rendering/index", "GeometryBufferRenderer")
@js.native
class GeometryBufferRenderer protected ()
  extends typings.babylonjs.geometryBufferRendererMod.GeometryBufferRenderer {
  /**
    * Creates a new G Buffer for the scene
    * @param scene The scene the buffer belongs to
    * @param ratio How big is the buffer related to the main canvas.
    */
  def this(scene: Scene) = this()
  def this(scene: Scene, ratio: Double) = this()
}

/* static members */
@JSImport("babylonjs/Rendering/index", "GeometryBufferRenderer")
@js.native
object GeometryBufferRenderer extends js.Object {
  /**
    * Constant used to retrieve the position texture index in the G-Buffer textures array
    * using getIndex(GeometryBufferRenderer.POSITION_TEXTURE_INDEX)
    */
  val POSITION_TEXTURE_TYPE: Double = js.native
  /**
    * Constant used to retrieve the reflectivity texture index in the G-Buffer textures array
    * using the getIndex(GeometryBufferRenderer.REFLECTIVITY_TEXTURE_TYPE)
    */
  val REFLECTIVITY_TEXTURE_TYPE: Double = js.native
  /**
    * Constant used to retrieve the velocity texture index in the G-Buffer textures array
    * using getIndex(GeometryBufferRenderer.VELOCITY_TEXTURE_INDEX)
    */
  val VELOCITY_TEXTURE_TYPE: Double = js.native
  /** @hidden */
  def _SceneComponentInitialization(scene: Scene): Unit = js.native
}

