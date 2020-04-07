package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.ModelShape")
@js.native
class ModelShape protected () extends js.Object {
  /**
    * Creates a ModelShape object. This is an internal simplified reference to a mesh used as for a model to replicate particles from by the SPS.
    * SPS internal tool, don't use it manually.
    * @hidden
    */
  def this(
    id: Double,
    shape: js.Array[Vector3],
    indices: js.Array[Double],
    normals: js.Array[Double],
    colors: js.Array[Double],
    shapeUV: js.Array[Double],
    posFunction: Nullable[js.Function3[/* particle */ SolidParticle, /* i */ Double, /* s */ Double, Unit]],
    vtxFunction: Nullable[
        js.Function3[/* particle */ SolidParticle, /* vertex */ Vector3, /* i */ Double, Unit]
      ],
    material: Nullable[Material]
  ) = this()
  /**
    * indices array of the model
    * @hidden
    */
  var _indices: js.Array[Double] = js.native
  /**
    * length of the shape in the model indices array (internal use)
    * @hidden
    */
  var _indicesLength: Double = js.native
  /**
    * Model material (internal use)
    * @hidden
    */
  var _material: Nullable[Material] = js.native
  /**
    * normals array of the model
    * @hidden
    */
  var _normals: js.Array[Double] = js.native
  /**
    * Custom position function (internal use)
    * @hidden
    */
  var _positionFunction: Nullable[js.Function3[/* particle */ SolidParticle, /* i */ Double, /* s */ Double, Unit]] = js.native
  /**
    * flat array of model positions (internal use)
    * @hidden
    */
  var _shape: js.Array[Vector3] = js.native
  /**
    * color array of the model
    * @hidden
    */
  var _shapeColors: js.Array[Double] = js.native
  /**
    * flat array of model UVs (internal use)
    * @hidden
    */
  var _shapeUV: js.Array[Double] = js.native
  /**
    * Custom vertex function (internal use)
    * @hidden
    */
  var _vertexFunction: Nullable[
    js.Function3[/* particle */ SolidParticle, /* vertex */ Vector3, /* i */ Double, Unit]
  ] = js.native
  /**
    * The shape id
    * @hidden
    */
  var shapeID: Double = js.native
}

