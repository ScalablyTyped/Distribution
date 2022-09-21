package typings.babylonjs.particlesIndexMod

import typings.babylonjs.iparticlesystemMod.IParticleSystem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object babylonjsMeshesMeshAugmentingMod {
  
  trait Mesh extends StObject {
    
    /**
      * Returns an array populated with IParticleSystem objects whose the mesh is the emitter
      * @returns an array of IParticleSystem
      */
    def getEmittedParticleSystems(): js.Array[IParticleSystem]
    
    /**
      * Returns an array populated with IParticleSystem objects whose the mesh or its children are the emitter
      * @returns an array of IParticleSystem
      */
    def getHierarchyEmittedParticleSystems(): js.Array[IParticleSystem]
  }
  object Mesh {
    
    inline def apply(
      getEmittedParticleSystems: () => js.Array[IParticleSystem],
      getHierarchyEmittedParticleSystems: () => js.Array[IParticleSystem]
    ): Mesh = {
      val __obj = js.Dynamic.literal(getEmittedParticleSystems = js.Any.fromFunction0(getEmittedParticleSystems), getHierarchyEmittedParticleSystems = js.Any.fromFunction0(getHierarchyEmittedParticleSystems))
      __obj.asInstanceOf[Mesh]
    }
    
    extension [Self <: Mesh](x: Self) {
      
      inline def setGetEmittedParticleSystems(value: () => js.Array[IParticleSystem]): Self = StObject.set(x, "getEmittedParticleSystems", js.Any.fromFunction0(value))
      
      inline def setGetHierarchyEmittedParticleSystems(value: () => js.Array[IParticleSystem]): Self = StObject.set(x, "getHierarchyEmittedParticleSystems", js.Any.fromFunction0(value))
    }
  }
}
