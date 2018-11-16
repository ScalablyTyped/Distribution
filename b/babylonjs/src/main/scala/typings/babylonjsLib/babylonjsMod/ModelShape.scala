package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Represents the shape of the model used by one particle of a solid particle system.
     * SPS internal tool, don't use it manually.
     */
@JSImport("babylonjs", "ModelShape")
@js.native
class ModelShape protected ()
  extends babylonjsLib.BABYLONNs.ModelShape {
  /**
           * Creates a ModelShape object. This is an internal simplified reference to a mesh used as for a model to replicate particles from by the SPS.
           * SPS internal tool, don't use it manually.
           * @hidden
           */
  def this(id: scala.Double, shape: js.Array[babylonjsLib.BABYLONNs.Vector3], indicesLength: scala.Double, shapeUV: js.Array[scala.Double], posFunction: babylonjsLib.BABYLONNs.Nullable[
      js.Function3[
        /* particle */ babylonjsLib.BABYLONNs.SolidParticle, 
        /* i */ scala.Double, 
        /* s */ scala.Double, 
        scala.Unit
      ]
    ], vtxFunction: babylonjsLib.BABYLONNs.Nullable[
      js.Function3[
        /* particle */ babylonjsLib.BABYLONNs.SolidParticle, 
        /* vertex */ babylonjsLib.BABYLONNs.Vector3, 
        /* i */ scala.Double, 
        scala.Unit
      ]
    ]) = this()
}

