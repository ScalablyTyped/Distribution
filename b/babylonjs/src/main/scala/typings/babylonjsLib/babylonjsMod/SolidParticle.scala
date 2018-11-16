package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Represents one particle of a solid particle system.
     */
@JSImport("babylonjs", "SolidParticle")
@js.native
class SolidParticle protected ()
  extends babylonjsLib.BABYLONNs.SolidParticle {
  /**
           * Creates a Solid Particle object.
           * Don't create particles manually, use instead the Solid Particle System internal tools like _addParticle()
           * @param particleIndex (integer) is the particle index in the Solid Particle System pool. It's also the particle identifier.
           * @param positionIndex (integer) is the starting index of the particle vertices in the SPS "positions" array.
           * @param indiceIndex (integer) is the starting index of the particle indices in the SPS "indices" array.
           * @param model (ModelShape) is a reference to the model shape on what the particle is designed.
           * @param shapeId (integer) is the model shape identifier in the SPS.
           * @param idxInShape (integer) is the index of the particle in the current model (ex: the 10th box of addShape(box, 30))
           * @param modelBoundingInfo is the reference to the model BoundingInfo used for intersection computations.
           */
  def this(particleIndex: scala.Double, positionIndex: scala.Double, indiceIndex: scala.Double, model: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.ModelShape], shapeId: scala.Double, idxInShape: scala.Double, sps: babylonjsLib.BABYLONNs.SolidParticleSystem) = this()
  /**
           * Creates a Solid Particle object.
           * Don't create particles manually, use instead the Solid Particle System internal tools like _addParticle()
           * @param particleIndex (integer) is the particle index in the Solid Particle System pool. It's also the particle identifier.
           * @param positionIndex (integer) is the starting index of the particle vertices in the SPS "positions" array.
           * @param indiceIndex (integer) is the starting index of the particle indices in the SPS "indices" array.
           * @param model (ModelShape) is a reference to the model shape on what the particle is designed.
           * @param shapeId (integer) is the model shape identifier in the SPS.
           * @param idxInShape (integer) is the index of the particle in the current model (ex: the 10th box of addShape(box, 30))
           * @param modelBoundingInfo is the reference to the model BoundingInfo used for intersection computations.
           */
  def this(particleIndex: scala.Double, positionIndex: scala.Double, indiceIndex: scala.Double, model: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.ModelShape], shapeId: scala.Double, idxInShape: scala.Double, sps: babylonjsLib.BABYLONNs.SolidParticleSystem, modelBoundingInfo: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.BoundingInfo]) = this()
}

