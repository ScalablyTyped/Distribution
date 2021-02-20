package typings.babylonjs.legacyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "GeometryBufferRenderer")
@js.native
class GeometryBufferRenderer protected ()
  extends typings.babylonjs.indexMod.GeometryBufferRenderer {
  /**
    * Creates a new G Buffer for the scene
    * @param scene The scene the buffer belongs to
    * @param ratio How big is the buffer related to the main canvas.
    */
  def this(scene: typings.babylonjs.sceneMod.Scene) = this()
  def this(scene: typings.babylonjs.sceneMod.Scene, ratio: Double) = this()
}
/* static members */
object GeometryBufferRenderer {
  
  /**
    * Constant used to retrieve the depth + normal texture index in the G-Buffer textures array
    * using getIndex(GeometryBufferRenderer.DEPTHNORMAL_TEXTURE_INDEX)
    */
  @JSImport("babylonjs/Legacy/legacy", "GeometryBufferRenderer.DEPTHNORMAL_TEXTURE_TYPE")
  @js.native
  val DEPTHNORMAL_TEXTURE_TYPE: Double = js.native
  
  /**
    * Constant used to retrieve the position texture index in the G-Buffer textures array
    * using getIndex(GeometryBufferRenderer.POSITION_TEXTURE_INDEX)
    */
  @JSImport("babylonjs/Legacy/legacy", "GeometryBufferRenderer.POSITION_TEXTURE_TYPE")
  @js.native
  val POSITION_TEXTURE_TYPE: Double = js.native
  
  /**
    * Constant used to retrieve the reflectivity texture index in the G-Buffer textures array
    * using the getIndex(GeometryBufferRenderer.REFLECTIVITY_TEXTURE_TYPE)
    */
  @JSImport("babylonjs/Legacy/legacy", "GeometryBufferRenderer.REFLECTIVITY_TEXTURE_TYPE")
  @js.native
  val REFLECTIVITY_TEXTURE_TYPE: Double = js.native
  
  /**
    * Constant used to retrieve the velocity texture index in the G-Buffer textures array
    * using getIndex(GeometryBufferRenderer.VELOCITY_TEXTURE_INDEX)
    */
  @JSImport("babylonjs/Legacy/legacy", "GeometryBufferRenderer.VELOCITY_TEXTURE_TYPE")
  @js.native
  val VELOCITY_TEXTURE_TYPE: Double = js.native
  
  /** @hidden */
  @JSImport("babylonjs/Legacy/legacy", "GeometryBufferRenderer._SceneComponentInitialization")
  @js.native
  def _SceneComponentInitialization(scene: typings.babylonjs.sceneMod.Scene): Unit = js.native
}
