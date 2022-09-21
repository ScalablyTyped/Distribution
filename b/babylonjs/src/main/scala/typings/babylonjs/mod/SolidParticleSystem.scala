package typings.babylonjs.mod

import typings.babylonjs.anon.AutoFixFaceOrientation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "SolidParticleSystem")
@js.native
open class SolidParticleSystem protected ()
  extends typings.babylonjs.legacyMod.SolidParticleSystem {
  /**
    * Creates a SPS (Solid Particle System) object.
    * @param name (String) is the SPS name, this will be the underlying mesh name.
    * @param scene (Scene) is the scene in which the SPS is added.
    * @param options defines the options of the sps e.g.
    * * updatable (optional boolean, default true) : if the SPS must be updatable or immutable.
    * * isPickable (optional boolean, default false) : if the solid particles must be pickable.
    * * enableDepthSort (optional boolean, default false) : if the solid particles must be sorted in the geometry according to their distance to the camera.
    * * useModelMaterial (optional boolean, default false) : if the model materials must be used to create the SPS multimaterial. This enables the multimaterial supports of the SPS.
    * * enableMultiMaterial (optional boolean, default false) : if the solid particles can be given different materials.
    * * expandable (optional boolean, default false) : if particles can still be added after the initial SPS mesh creation.
    * * particleIntersection (optional boolean, default false) : if the solid particle intersections must be computed.
    * * boundingSphereOnly (optional boolean, default false) : if the particle intersection must be computed only with the bounding sphere (no bounding box computation, so faster).
    * * bSphereRadiusFactor (optional float, default 1.0) : a number to multiply the bounding sphere radius by in order to reduce it for instance.
    * * computeBoundingBox (optional boolean, default false): if the bounding box of the entire SPS will be computed (for occlusion detection, for example). If it is false, the bounding box will be the bounding box of the first particle.
    * * autoFixFaceOrientation (optional boolean, default false): if the particle face orientations will be flipped for transformations that change orientation (scale (-1, 1, 1), for example)
    * @param options.updatable
    * @param options.isPickable
    * @param options.enableDepthSort
    * @param options.particleIntersection
    * @param options.boundingSphereOnly
    * @param options.bSphereRadiusFactor
    * @param options.expandable
    * @param options.useModelMaterial
    * @param options.enableMultiMaterial
    * @param options.computeBoundingBox
    * @param options.autoFixFaceOrientation
    * @example bSphereRadiusFactor = 1.0 / Math.sqrt(3.0) => the bounding sphere exactly matches a spherical mesh.
    */
  def this(name: String, scene: typings.babylonjs.sceneMod.Scene) = this()
  def this(name: String, scene: typings.babylonjs.sceneMod.Scene, options: AutoFixFaceOrientation) = this()
}
