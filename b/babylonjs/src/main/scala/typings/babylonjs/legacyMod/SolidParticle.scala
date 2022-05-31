package typings.babylonjs.legacyMod

import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "SolidParticle")
@js.native
class SolidParticle protected ()
  extends typings.babylonjs.indexMod.SolidParticle {
  /**
    * Creates a Solid Particle object.
    * Don't create particles manually, use instead the Solid Particle System internal tools like _addParticle()
    * @param particleIndex (integer) is the particle index in the Solid Particle System pool.
    * @param particleId (integer) is the particle identifier. Unless some particles are removed from the SPS, it's the same value than the particle idx.
    * @param positionIndex (integer) is the starting index of the particle vertices in the SPS "positions" array.
    * @param indiceIndex (integer) is the starting index of the particle indices in the SPS "indices" array.
    * @param model (ModelShape) is a reference to the model shape on what the particle is designed.
    * @param shapeId (integer) is the model shape identifier in the SPS.
    * @param idxInShape (integer) is the index of the particle in the current model (ex: the 10th box of addShape(box, 30))
    * @param sps defines the sps it is associated to
    * @param modelBoundingInfo is the reference to the model BoundingInfo used for intersection computations.
    * @param materialIndex is the particle material identifier (integer) when the MultiMaterials are enabled in the SPS.
    */
  def this(
    particleIndex: Double,
    particleId: Double,
    positionIndex: Double,
    indiceIndex: Double,
    model: Nullable[typings.babylonjs.solidParticleMod.ModelShape],
    shapeId: Double,
    idxInShape: Double,
    sps: typings.babylonjs.solidParticleSystemMod.SolidParticleSystem
  ) = this()
  def this(
    particleIndex: Double,
    particleId: Double,
    positionIndex: Double,
    indiceIndex: Double,
    model: Nullable[typings.babylonjs.solidParticleMod.ModelShape],
    shapeId: Double,
    idxInShape: Double,
    sps: typings.babylonjs.solidParticleSystemMod.SolidParticleSystem,
    modelBoundingInfo: Nullable[typings.babylonjs.boundingInfoMod.BoundingInfo]
  ) = this()
  def this(
    particleIndex: Double,
    particleId: Double,
    positionIndex: Double,
    indiceIndex: Double,
    model: Nullable[typings.babylonjs.solidParticleMod.ModelShape],
    shapeId: Double,
    idxInShape: Double,
    sps: typings.babylonjs.solidParticleSystemMod.SolidParticleSystem,
    modelBoundingInfo: Unit,
    materialIndex: Nullable[Double]
  ) = this()
  def this(
    particleIndex: Double,
    particleId: Double,
    positionIndex: Double,
    indiceIndex: Double,
    model: Nullable[typings.babylonjs.solidParticleMod.ModelShape],
    shapeId: Double,
    idxInShape: Double,
    sps: typings.babylonjs.solidParticleSystemMod.SolidParticleSystem,
    modelBoundingInfo: Nullable[typings.babylonjs.boundingInfoMod.BoundingInfo],
    materialIndex: Nullable[Double]
  ) = this()
}
