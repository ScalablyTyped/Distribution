package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * A TransformNode is an object that is not rendered but can be used as a center of transformation. This can decrease memory usage and increase rendering speed compared to using an empty mesh as a parent and is less complicated than using a pivot matrix.
     * @see https://doc.babylonjs.com/how_to/transformnode
     */
@JSImport("babylonjs", "TransformNode")
@js.native
class TransformNode protected ()
  extends babylonjsLib.BABYLONNs.TransformNode {
  def this(name: java.lang.String) = this()
  def this(name: java.lang.String, scene: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Scene]) = this()
  def this(name: java.lang.String, scene: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Scene], isPure: scala.Boolean) = this()
}

/**
     * A TransformNode is an object that is not rendered but can be used as a center of transformation. This can decrease memory usage and increase rendering speed compared to using an empty mesh as a parent and is less complicated than using a pivot matrix.
     * @see https://doc.babylonjs.com/how_to/transformnode
     */
@JSImport("babylonjs", "TransformNode")
@js.native
object TransformNode extends js.Object {
  /**
           * Object will rotate to face the camera
           */
  var BILLBOARDMODE_ALL: scala.Double = js.native
  /**
           * Object will not rotate to face the camera
           */
  var BILLBOARDMODE_NONE: scala.Double = js.native
  /**
           * Object will rotate to face the camera but only on the x axis
           */
  var BILLBOARDMODE_X: scala.Double = js.native
  /**
           * Object will rotate to face the camera but only on the y axis
           */
  var BILLBOARDMODE_Y: scala.Double = js.native
  /**
           * Object will rotate to face the camera but only on the z axis
           */
  var BILLBOARDMODE_Z: scala.Double = js.native
  var _lookAtVectorCache: js.Any = js.native
  var _rotationAxisCache: js.Any = js.native
  /**
           * Returns a new TransformNode object parsed from the source provided.
           * @param parsedTransformNode is the source.
           * @param scene the scne the object belongs to
           * @param rootUrl is a string, it's the root URL to prefix the `delayLoadingFile` property with
           * @returns a new TransformNode object parsed from the source provided.
           */
  def Parse(parsedTransformNode: js.Any, scene: babylonjsLib.BABYLONNs.Scene, rootUrl: java.lang.String): babylonjsLib.BABYLONNs.TransformNode = js.native
}

