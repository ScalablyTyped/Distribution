package typings.babylonjs.particleSystemComponentMod.babylonjsMeshesMeshAugmentingMod

import typings.babylonjs.iparticlesystemMod.IParticleSystem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Mesh extends js.Object {
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
  @scala.inline
  def apply(
    getEmittedParticleSystems: () => js.Array[IParticleSystem],
    getHierarchyEmittedParticleSystems: () => js.Array[IParticleSystem]
  ): Mesh = {
    val __obj = js.Dynamic.literal(getEmittedParticleSystems = js.Any.fromFunction0(getEmittedParticleSystems), getHierarchyEmittedParticleSystems = js.Any.fromFunction0(getHierarchyEmittedParticleSystems))
  
    __obj.asInstanceOf[Mesh]
  }
}

