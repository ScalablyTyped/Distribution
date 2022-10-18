package typings.babylonjs

import typings.babylonjs.mathsMathDotvectorMod.Vector2
import typings.babylonjs.mathsMathDotvectorMod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mathsMathDotvertexFormatMod {
  
  @JSImport("babylonjs/Maths/math.vertexFormat", "PositionNormalTextureVertex")
  @js.native
  /**
    * Creates a PositionNormalTextureVertex
    * @param position the position of the vertex (defaut: 0,0,0)
    * @param normal the normal of the vertex (defaut: 0,1,0)
    * @param uv the uv of the vertex (default: 0,0)
    */
  open class PositionNormalTextureVertex () extends StObject {
    def this(/** the position of the vertex (defaut: 0,0,0) */
    position: Vector3) = this()
    def this(
      /** the position of the vertex (defaut: 0,0,0) */
    position: Unit,
      /** the normal of the vertex (defaut: 0,1,0) */
    normal: Vector3
    ) = this()
    def this(
      /** the position of the vertex (defaut: 0,0,0) */
    position: Vector3,
      /** the normal of the vertex (defaut: 0,1,0) */
    normal: Vector3
    ) = this()
    def this(
      /** the position of the vertex (defaut: 0,0,0) */
    position: Unit,
      /** the normal of the vertex (defaut: 0,1,0) */
    normal: Unit,
      /** the uv of the vertex (default: 0,0) */
    uv: Vector2
    ) = this()
    def this(
      /** the position of the vertex (defaut: 0,0,0) */
    position: Unit,
      /** the normal of the vertex (defaut: 0,1,0) */
    normal: Vector3,
      /** the uv of the vertex (default: 0,0) */
    uv: Vector2
    ) = this()
    def this(
      /** the position of the vertex (defaut: 0,0,0) */
    position: Vector3,
      /** the normal of the vertex (defaut: 0,1,0) */
    normal: Unit,
      /** the uv of the vertex (default: 0,0) */
    uv: Vector2
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
  
  @JSImport("babylonjs/Maths/math.vertexFormat", "PositionNormalVertex")
  @js.native
  /**
    * Creates a PositionNormalVertex
    * @param position the position of the vertex (defaut: 0,0,0)
    * @param normal the normal of the vertex (defaut: 0,1,0)
    */
  open class PositionNormalVertex () extends StObject {
    def this(/** the position of the vertex (defaut: 0,0,0) */
    position: Vector3) = this()
    def this(
      /** the position of the vertex (defaut: 0,0,0) */
    position: Unit,
      /** the normal of the vertex (defaut: 0,1,0) */
    normal: Vector3
    ) = this()
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
