package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A directional light is defined by a direction (what a surprise!).
  * The light is emitted from everywhere in the specified direction, and has an infinite range.
  * An example of a directional light is when a distance planet is lit by the apparently parallel lines of light from its sun. Light in a downward direction will light the top of an object.
  * Documentation: https://doc.babylonjs.com/babylon101/lights
  */
@JSGlobal("BABYLON.DirectionalLight")
@js.native
class DirectionalLight protected () extends ShadowLight {
  /**
    * Creates a DirectionalLight object in the scene, oriented towards the passed direction (Vector3).
    * The directional light is emitted from everywhere in the given direction.
    * It can cast shadows.
    * Documentation : http://doc.babylonjs.com/tutorials/lights
    * @param name The friendly name of the light
    * @param direction The direction of the light
    * @param scene The scene the light belongs to
    */
  def this(name: java.lang.String, direction: Vector3, scene: Scene) = this()
  var _orthoBottom: js.Any = js.native
  var _orthoLeft: js.Any = js.native
  var _orthoRight: js.Any = js.native
  var _orthoTop: js.Any = js.native
  var _shadowFrustumSize: js.Any = js.native
  var _shadowOrthoScale: js.Any = js.native
  /**
    * Automatically compute the projection matrix to best fit (including all the casters)
    * on each frame.
    */
  var autoUpdateExtends: scala.Boolean = js.native
  /**
    * Fix frustum size for the shadow generation. This is disabled if the value is 0.
    */
  /**
    * Specifies a fix frustum size for the shadow generation.
    */
  var shadowFrustumSize: scala.Double = js.native
  /**
    * Gets the shadow projection scale against the optimal computed one.
    * 0.1 by default which means that the projection window is increase by 10% from the optimal size.
    * This does not impact in fixed frustum size (shadowFrustumSize being set)
    */
  /**
    * Sets the shadow projection scale against the optimal computed one.
    * 0.1 by default which means that the projection window is increase by 10% from the optimal size.
    * This does not impact in fixed frustum size (shadowFrustumSize being set)
    */
  var shadowOrthoScale: scala.Double = js.native
  /**
    * Sets the passed matrix "matrix" as auto extend projection matrix for the shadows cast by the light according to the passed view matrix.
    * Returns the DirectionalLight Shadow projection matrix.
    */
  /* protected */ def _setDefaultAutoExtendShadowProjectionMatrix(matrix: Matrix, viewMatrix: Matrix, renderList: js.Array[AbstractMesh]): scala.Unit = js.native
  /**
    * Sets the passed matrix "matrix" as fixed frustum projection matrix for the shadows cast by the light according to the passed view matrix.
    * Returns the DirectionalLight Shadow projection matrix.
    */
  /* protected */ def _setDefaultFixedFrustumShadowProjectionMatrix(matrix: Matrix, viewMatrix: Matrix): scala.Unit = js.native
}

