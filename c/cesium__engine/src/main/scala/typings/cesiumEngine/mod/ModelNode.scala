package typings.cesiumEngine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@cesium/engine", "ModelNode")
@js.native
open class ModelNode () extends StObject {
  
  /**
    * The index of the node in the glTF.
    */
  val id: Double = js.native
  
  /**
    * The node's 4x4 matrix transform from its local coordinates to
    * its parent's. Setting the matrix to undefined will restore the
    * node's original transform, and allow the node to be animated by
    * any animations in the model again.
    * <p>
    * For changes to take effect, this property must be assigned to;
    * setting individual elements of the matrix will not work.
    * </p>
    */
  var matrix: Matrix4 = js.native
  
  /**
    * The value of the <code>name</code> property of this node.
    */
  val name: String = js.native
  
  /**
    * Gets the node's original 4x4 matrix transform from its local
    * coordinates to its parent's, without any node transformations
    * or articulations applied.
    */
  var originalMatrix: Matrix4 = js.native
  
  /**
    * Determines if this node and its children will be shown.
    */
  var show: Boolean = js.native
}
