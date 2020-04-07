package typings.babylonjs

import typings.babylonjs.mathVectorMod.Vector2
import typings.babylonjs.mathVectorMod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Maths/math.vertexFormat", JSImport.Namespace)
@js.native
object mathVertexFormatMod extends js.Object {
  @js.native
  /**
    * Creates a PositionNormalTextureVertex
    * @param position the position of the vertex (defaut: 0,0,0)
    * @param normal the normal of the vertex (defaut: 0,1,0)
    * @param uv the uv of the vertex (default: 0,0)
    */
  class PositionNormalTextureVertex () extends js.Object {
    def this(/** the position of the vertex (defaut: 0,0,0) */
    position: Vector3) = this()
    def this(
      /** the position of the vertex (defaut: 0,0,0) */
    position: Vector3,
      /** the normal of the vertex (defaut: 0,1,0) */
    normal: Vector3
    ) = this()
    def this(
      /** the position of the vertex (defaut: 0,0,0) */
    position: Vector3,
      /** the normal of the vertex (defaut: 0,1,0) */
    normal: Vector3,
      /** the uv of the vertex (default: 0,0) */
    uv: Vector2
    ) = this()
    /** the normal of the vertex (defaut: 0,1,0) */
    var normal: Vector3 = js.native
    /** the position of the vertex (defaut: 0,0,0) */
    var position: Vector3 = js.native
    /** the uv of the vertex (default: 0,0) */
    var uv: Vector2 = js.native
  }
  
  @js.native
  /**
    * Creates a PositionNormalVertex
    * @param position the position of the vertex (defaut: 0,0,0)
    * @param normal the normal of the vertex (defaut: 0,1,0)
    */
  class PositionNormalVertex () extends js.Object {
    def this(/** the position of the vertex (defaut: 0,0,0) */
    position: Vector3) = this()
    def this(
      /** the position of the vertex (defaut: 0,0,0) */
    position: Vector3,
      /** the normal of the vertex (defaut: 0,1,0) */
    normal: Vector3
    ) = this()
    /** the normal of the vertex (defaut: 0,1,0) */
    var normal: Vector3 = js.native
    /** the position of the vertex (defaut: 0,0,0) */
    var position: Vector3 = js.native
  }
  
}

