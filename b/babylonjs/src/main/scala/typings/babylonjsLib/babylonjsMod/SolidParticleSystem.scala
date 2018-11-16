package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * The SPS is a single updatable mesh. The solid particles are simply separate parts or faces fo this big mesh.
     *As it is just a mesh, the SPS has all the same properties than any other BJS mesh : not more, not less. It can be scaled, rotated, translated, enlighted, textured, moved, etc.

     * The SPS is also a particle system. It provides some methods to manage the particles.
     * However it is behavior agnostic. This means it has no emitter, no particle physics, no particle recycler. You have to implement your own behavior.
     *
     * Full documentation here : http://doc.babylonjs.com/overviews/Solid_Particle_System
     */
@JSImport("babylonjs", "SolidParticleSystem")
@js.native
class SolidParticleSystem protected ()
  extends babylonjsLib.BABYLONNs.SolidParticleSystem {
  /**
           * Creates a SPS (Solid Particle System) object.
           * @param name (String) is the SPS name, this will be the underlying mesh name.
           * @param scene (Scene) is the scene in which the SPS is added.
           * @param updatable (optional boolean, default true) : if the SPS must be updatable or immutable.
           * @param isPickable (optional boolean, default false) : if the solid particles must be pickable.
           * @param enableDepthSort (optional boolean, default false) : if the solid particles must be sorted in the geometry according to their distance to the camera.
           * @param particleIntersection (optional boolean, default false) : if the solid particle intersections must be computed.
           * @param boundingSphereOnly (optional boolean, default false) : if the particle intersection must be computed only with the bounding sphere (no bounding box computation, so faster).
           * @param bSphereRadiusFactor (optional float, default 1.0) : a number to multiply the boundind sphere radius by in order to reduce it for instance.
           * @example bSphereRadiusFactor = 1.0 / Math.sqrt(3.0) => the bounding sphere exactly matches a spherical mesh.
           */
  def this(name: java.lang.String, scene: babylonjsLib.BABYLONNs.Scene) = this()
  /**
           * Creates a SPS (Solid Particle System) object.
           * @param name (String) is the SPS name, this will be the underlying mesh name.
           * @param scene (Scene) is the scene in which the SPS is added.
           * @param updatable (optional boolean, default true) : if the SPS must be updatable or immutable.
           * @param isPickable (optional boolean, default false) : if the solid particles must be pickable.
           * @param enableDepthSort (optional boolean, default false) : if the solid particles must be sorted in the geometry according to their distance to the camera.
           * @param particleIntersection (optional boolean, default false) : if the solid particle intersections must be computed.
           * @param boundingSphereOnly (optional boolean, default false) : if the particle intersection must be computed only with the bounding sphere (no bounding box computation, so faster).
           * @param bSphereRadiusFactor (optional float, default 1.0) : a number to multiply the boundind sphere radius by in order to reduce it for instance.
           * @example bSphereRadiusFactor = 1.0 / Math.sqrt(3.0) => the bounding sphere exactly matches a spherical mesh.
           */
  def this(name: java.lang.String, scene: babylonjsLib.BABYLONNs.Scene, options: babylonjsLib.Anon_BSphereRadiusFactor) = this()
}

