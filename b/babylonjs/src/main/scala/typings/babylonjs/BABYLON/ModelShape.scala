package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModelShape extends js.Object {
  /**
    * indices array of the model
    * @hidden
    */
  var _indices: js.Array[Double]
  /**
    * length of the shape in the model indices array (internal use)
    * @hidden
    */
  var _indicesLength: Double
  /**
    * Model material (internal use)
    * @hidden
    */
  var _material: Nullable[Material]
  /**
    * normals array of the model
    * @hidden
    */
  var _normals: js.Array[Double]
  /**
    * Custom position function (internal use)
    * @hidden
    */
  var _positionFunction: Nullable[js.Function3[/* particle */ SolidParticle, /* i */ Double, /* s */ Double, Unit]]
  /**
    * flat array of model positions (internal use)
    * @hidden
    */
  var _shape: js.Array[Vector3]
  /**
    * color array of the model
    * @hidden
    */
  var _shapeColors: js.Array[Double]
  /**
    * flat array of model UVs (internal use)
    * @hidden
    */
  var _shapeUV: js.Array[Double]
  /**
    * Custom vertex function (internal use)
    * @hidden
    */
  var _vertexFunction: Nullable[
    js.Function3[/* particle */ SolidParticle, /* vertex */ Vector3, /* i */ Double, Unit]
  ]
  /**
    * The shape id
    * @hidden
    */
  var shapeID: Double
}

object ModelShape {
  @scala.inline
  def apply(
    _indices: js.Array[Double],
    _indicesLength: Double,
    _normals: js.Array[Double],
    _shape: js.Array[Vector3],
    _shapeColors: js.Array[Double],
    _shapeUV: js.Array[Double],
    shapeID: Double,
    _material: Nullable[Material] = null,
    _positionFunction: (/* particle */ SolidParticle, /* i */ Double, /* s */ Double) => Unit = null,
    _vertexFunction: (/* particle */ SolidParticle, /* vertex */ Vector3, /* i */ Double) => Unit = null
  ): ModelShape = {
    val __obj = js.Dynamic.literal(_indices = _indices.asInstanceOf[js.Any], _indicesLength = _indicesLength.asInstanceOf[js.Any], _normals = _normals.asInstanceOf[js.Any], _shape = _shape.asInstanceOf[js.Any], _shapeColors = _shapeColors.asInstanceOf[js.Any], _shapeUV = _shapeUV.asInstanceOf[js.Any], shapeID = shapeID.asInstanceOf[js.Any], _material = _material.asInstanceOf[js.Any], _positionFunction = js.Any.fromFunction3(_positionFunction), _vertexFunction = js.Any.fromFunction3(_vertexFunction))
    __obj.asInstanceOf[ModelShape]
  }
}

