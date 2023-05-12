package typings.babylonjs.renderingIndexMod

import org.scalablytyped.runtime.StringDictionary
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.FloatArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Rendering/index", "FluidRenderingObjectCustomParticles")
@js.native
open class FluidRenderingObjectCustomParticles protected ()
  extends typings.babylonjs.renderingFluidRendererIndexMod.FluidRenderingObjectCustomParticles {
  /**
    * Creates a new instance of the class
    * @param scene The scene the particles should be rendered into
    * @param buffers The list of buffers (must contain at least one "position" buffer!). Note that you don't have to pass all (or any!) buffers at once in the constructor, you can use the addBuffers method to add more later.
    * @param numParticles Number of vertices to take into account from the buffers
    */
  def this(scene: Scene, buffers: StringDictionary[FloatArray], numParticles: Double) = this()
}
