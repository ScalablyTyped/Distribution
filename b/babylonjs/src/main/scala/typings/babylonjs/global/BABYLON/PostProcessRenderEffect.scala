package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.PostProcessRenderEffect")
@js.native
class PostProcessRenderEffect protected ()
  extends typings.babylonjs.BABYLON.PostProcessRenderEffect {
  /**
    * Instantiates a post process render effect.
    * A post process can be used to apply a shader to a texture after it is rendered.
    * @param engine The engine the effect is tied to
    * @param name The name of the effect
    * @param getPostProcesses A function that returns a set of post processes which the effect will run in order to be run.
    * @param singleInstance False if this post process can be run on multiple cameras. (default: true)
    */
  def this(
    engine: typings.babylonjs.BABYLON.Engine,
    name: String,
    getPostProcesses: js.Function0[
        Nullable[
          typings.babylonjs.BABYLON.PostProcess | js.Array[typings.babylonjs.BABYLON.PostProcess]
        ]
      ]
  ) = this()
  def this(
    engine: typings.babylonjs.BABYLON.Engine,
    name: String,
    getPostProcesses: js.Function0[
        Nullable[
          typings.babylonjs.BABYLON.PostProcess | js.Array[typings.babylonjs.BABYLON.PostProcess]
        ]
      ],
    singleInstance: Boolean
  ) = this()
}
