package typings.babylonjs.renderPipelineIndexMod

import typings.babylonjs.engineMod.Engine
import typings.babylonjs.postProcessMod.PostProcess
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/PostProcesses/RenderPipeline/index", "PostProcessRenderEffect")
@js.native
class PostProcessRenderEffect protected ()
  extends typings.babylonjs.postProcessRenderEffectMod.PostProcessRenderEffect {
  /**
    * Instantiates a post process render effect.
    * A post process can be used to apply a shader to a texture after it is rendered.
    * @param engine The engine the effect is tied to
    * @param name The name of the effect
    * @param getPostProcesses A function that returns a set of post processes which the effect will run in order to be run.
    * @param singleInstance False if this post process can be run on multiple cameras. (default: true)
    */
  def this(
    engine: Engine,
    name: String,
    getPostProcesses: js.Function0[Nullable[PostProcess | js.Array[PostProcess]]]
  ) = this()
  def this(
    engine: Engine,
    name: String,
    getPostProcesses: js.Function0[Nullable[PostProcess | js.Array[PostProcess]]],
    singleInstance: Boolean
  ) = this()
}

