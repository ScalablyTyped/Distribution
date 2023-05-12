package typings.babylonjs

import org.scalablytyped.runtime.StringDictionary
import typings.babylonjs.renderingFluidRendererFluidRenderingObjectMod.FluidRenderingObject
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.FloatArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object renderingFluidRendererFluidRenderingObjectCustomParticlesMod {
  
  @JSImport("babylonjs/Rendering/fluidRenderer/fluidRenderingObjectCustomParticles", "FluidRenderingObjectCustomParticles")
  @js.native
  open class FluidRenderingObjectCustomParticles protected () extends FluidRenderingObject {
    /**
      * Creates a new instance of the class
      * @param scene The scene the particles should be rendered into
      * @param buffers The list of buffers (must contain at least one "position" buffer!). Note that you don't have to pass all (or any!) buffers at once in the constructor, you can use the addBuffers method to add more later.
      * @param numParticles Number of vertices to take into account from the buffers
      */
    def this(scene: Scene, buffers: StringDictionary[FloatArray], numParticles: Double) = this()
    
    /* private */ var _diffuseEffectWrapper: Any = js.native
    
    /* private */ var _numParticles: Any = js.native
    
    /* private */ var _vertexBuffers: Any = js.native
    
    /**
      * Add some new buffers
      * @param buffers List of buffers
      */
    def addBuffers(buffers: StringDictionary[FloatArray]): Unit = js.native
    
    /**
      * Sets the number of particles in this object
      * @param num The number of particles to take into account
      */
    def setNumParticles(num: Double): Unit = js.native
  }
}
