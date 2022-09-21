package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.ModelShape")
@js.native
open class ModelShape protected ()
  extends StObject
     with typings.babylonjs.BABYLON.ModelShape {
  /**
    * Creates a ModelShape object. This is an internal simplified reference to a mesh used as for a model to replicate particles from by the SPS.
    * SPS internal tool, don't use it manually.
    * @param id
    * @param shape
    * @param indices
    * @param normals
    * @param colors
    * @param shapeUV
    * @param posFunction
    * @param vtxFunction
    * @param material
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
}
