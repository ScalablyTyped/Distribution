package typings.babylonjs.mod

import typings.babylonjs.typesMod.FloatArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "FluidRenderingObjectCustomParticles")
@js.native
open class FluidRenderingObjectCustomParticles protected ()
  extends typings.babylonjs.legacyLegacyMod.FluidRenderingObjectCustomParticles {
  /**
    * Creates a new instance of the class
    * @param scene The scene the particles should be rendered into
    * @param buffers The list of buffers (must contain at least one "position" buffer!). Note that you don't have to pass all (or any!) buffers at once in the constructor, you can use the addBuffers method to add more later.
    * @param numParticles Number of vertices to take into account from the buffers
    */
  def this(
    scene: typings.babylonjs.sceneMod.Scene,
    buffers: org.scalablytyped.runtime.StringDictionary[FloatArray],
    numParticles: Double
  ) = this()
}
