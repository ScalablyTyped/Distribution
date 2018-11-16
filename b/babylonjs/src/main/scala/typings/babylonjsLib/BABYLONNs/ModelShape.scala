package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Represents the shape of the model used by one particle of a solid particle system.
     * SPS internal tool, don't use it manually.
     */
@JSGlobal("BABYLON.ModelShape")
@js.native
class ModelShape protected () extends js.Object {
  /**
           * Creates a ModelShape object. This is an internal simplified reference to a mesh used as for a model to replicate particles from by the SPS.
           * SPS internal tool, don't use it manually.
           * @hidden
           */
  def this(id: scala.Double, shape: js.Array[Vector3], indicesLength: scala.Double, shapeUV: js.Array[scala.Double], posFunction: Nullable[
      js.Function3[/* particle */ SolidParticle, /* i */ scala.Double, /* s */ scala.Double, scala.Unit]
    ], vtxFunction: Nullable[
      js.Function3[/* particle */ SolidParticle, /* vertex */ Vector3, /* i */ scala.Double, scala.Unit]
    ]) = this()
  /**
           * length of the shape in the model indices array (internal use)
           * @hidden
           */
  var _indicesLength: scala.Double = js.native
  /**
           * Custom position function (internal use)
           * @hidden
           */
  var _positionFunction: Nullable[
    js.Function3[/* particle */ SolidParticle, /* i */ scala.Double, /* s */ scala.Double, scala.Unit]
  ] = js.native
  /**
           * flat array of model positions (internal use)
           * @hidden
           */
  var _shape: js.Array[Vector3] = js.native
  /**
           * flat array of model UVs (internal use)
           * @hidden
           */
  var _shapeUV: js.Array[scala.Double] = js.native
  /**
           * Custom vertex function (internal use)
           * @hidden
           */
  var _vertexFunction: Nullable[
    js.Function3[/* particle */ SolidParticle, /* vertex */ Vector3, /* i */ scala.Double, scala.Unit]
  ] = js.native
  /**
           * The shape id
           * @hidden
           */
  var shapeID: scala.Double = js.native
}

