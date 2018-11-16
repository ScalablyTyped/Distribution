package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * This represents a set of one or more post processes in Babylon.
     * A post process can be used to apply a shader to a texture after it is rendered.
     * @example https://doc.babylonjs.com/how_to/how_to_use_postprocessrenderpipeline
     */
@JSImport("babylonjs", "PostProcessRenderEffect")
@js.native
class PostProcessRenderEffect protected ()
  extends babylonjsLib.BABYLONNs.PostProcessRenderEffect {
  /**
           * Instantiates a post process render effect.
           * A post process can be used to apply a shader to a texture after it is rendered.
           * @param engine The engine the effect is tied to
           * @param name The name of the effect
           * @param getPostProcesses A function that returns a set of post processes which the effect will run in order to be run.
           * @param singleInstance False if this post process can be run on multiple cameras. (default: true)
           */
  def this(engine: babylonjsLib.BABYLONNs.Engine, name: java.lang.String, getPostProcesses: js.Function0[
      babylonjsLib.BABYLONNs.Nullable[
        babylonjsLib.BABYLONNs.PostProcess | js.Array[babylonjsLib.BABYLONNs.PostProcess]
      ]
    ]) = this()
  /**
           * Instantiates a post process render effect.
           * A post process can be used to apply a shader to a texture after it is rendered.
           * @param engine The engine the effect is tied to
           * @param name The name of the effect
           * @param getPostProcesses A function that returns a set of post processes which the effect will run in order to be run.
           * @param singleInstance False if this post process can be run on multiple cameras. (default: true)
           */
  def this(engine: babylonjsLib.BABYLONNs.Engine, name: java.lang.String, getPostProcesses: js.Function0[
      babylonjsLib.BABYLONNs.Nullable[
        babylonjsLib.BABYLONNs.PostProcess | js.Array[babylonjsLib.BABYLONNs.PostProcess]
      ]
    ], singleInstance: scala.Boolean) = this()
}

