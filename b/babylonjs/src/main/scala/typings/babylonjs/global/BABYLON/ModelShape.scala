package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.ModelShape")
@js.native
class ModelShape protected ()
  extends typings.babylonjs.BABYLON.ModelShape {
  /**
    * Creates a ModelShape object. This is an internal simplified reference to a mesh used as for a model to replicate particles from by the SPS.
    * SPS internal tool, don't use it manually.
    * @hidden
    */
  def this(
    id: Double,
    shape: js.Array[typings.babylonjs.BABYLON.Vector3],
    indices: js.Array[Double],
    normals: js.Array[Double],
    colors: js.Array[Double],
    shapeUV: js.Array[Double],
    posFunction: Nullable[
        js.Function3[
          /* particle */ typings.babylonjs.BABYLON.SolidParticle, 
          /* i */ Double, 
          /* s */ Double, 
          Unit
        ]
      ],
    vtxFunction: Nullable[
        js.Function3[
          /* particle */ typings.babylonjs.BABYLON.SolidParticle, 
          /* vertex */ typings.babylonjs.BABYLON.Vector3, 
          /* i */ Double, 
          Unit
        ]
      ],
    material: Nullable[typings.babylonjs.BABYLON.Material]
  ) = this()
  /**
    * indices array of the model
    * @hidden
    */
  /* CompleteClass */
  override var _indices: js.Array[Double] = js.native
  /**
    * length of the shape in the model indices array (internal use)
    * @hidden
    */
  /* CompleteClass */
  override var _indicesLength: Double = js.native
  /**
    * Model material (internal use)
    * @hidden
    */
  /* CompleteClass */
  override var _material: Nullable[typings.babylonjs.BABYLON.Material] = js.native
  /**
    * normals array of the model
    * @hidden
    */
  /* CompleteClass */
  override var _normals: js.Array[Double] = js.native
  /**
    * Custom position function (internal use)
    * @hidden
    */
  /* CompleteClass */
  override var _positionFunction: Nullable[
    js.Function3[
      /* particle */ typings.babylonjs.BABYLON.SolidParticle, 
      /* i */ Double, 
      /* s */ Double, 
      Unit
    ]
  ] = js.native
  /**
    * flat array of model positions (internal use)
    * @hidden
    */
  /* CompleteClass */
  override var _shape: js.Array[typings.babylonjs.BABYLON.Vector3] = js.native
  /**
    * color array of the model
    * @hidden
    */
  /* CompleteClass */
  override var _shapeColors: js.Array[Double] = js.native
  /**
    * flat array of model UVs (internal use)
    * @hidden
    */
  /* CompleteClass */
  override var _shapeUV: js.Array[Double] = js.native
  /**
    * Custom vertex function (internal use)
    * @hidden
    */
  /* CompleteClass */
  override var _vertexFunction: Nullable[
    js.Function3[
      /* particle */ typings.babylonjs.BABYLON.SolidParticle, 
      /* vertex */ typings.babylonjs.BABYLON.Vector3, 
      /* i */ Double, 
      Unit
    ]
  ] = js.native
  /**
    * The shape id
    * @hidden
    */
  /* CompleteClass */
  override var shapeID: Double = js.native
}

