package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FluidRenderingObjectCustomParticles
  extends StObject
     with FluidRenderingObject {
  
  /* private */ var _diffuseEffectWrapper: Any = js.native
  
  /* private */ var _numParticles: Any = js.native
  
  /* private */ var _vertexBuffers: Any = js.native
  
  /**
    * Add some new buffers
    * @param buffers List of buffers
    */
  def addBuffers(buffers: org.scalablytyped.runtime.StringDictionary[FloatArray]): Unit = js.native
  
  /**
    * Sets the number of particles in this object
    * @param num The number of particles to take into account
    */
  def setNumParticles(num: Double): Unit = js.native
}
