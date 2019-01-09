package typings
package babylonjsLib.BABYLONNs

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
@JSGlobal("BABYLON.SolidParticleSystem")
@js.native
class SolidParticleSystem protected () extends IDisposable {
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
  def this(name: java.lang.String, scene: Scene) = this()
  def this(name: java.lang.String, scene: Scene, options: babylonjsLib.Anon_BSphereRadiusFactor) = this()
  var _addParticle: js.Any = js.native
  var _alwaysVisible: js.Any = js.native
  var _axisZ: js.Any = js.native
  /**
    * If the particle intersection must be computed only with the bounding sphere (no bounding box computation, so faster). (Internal use only)
    * @hidden
    */
  var _bSphereOnly: scala.Boolean = js.native
  /**
    * A number to multiply the boundind sphere radius by in order to reduce it for instance. (Internal use only)
    * @hidden
    */
  var _bSphereRadiusFactor: scala.Double = js.native
  var _camDir: js.Any = js.native
  var _camInvertedPosition: js.Any = js.native
  var _cam_axisX: js.Any = js.native
  var _cam_axisY: js.Any = js.native
  var _cam_axisZ: js.Any = js.native
  var _camera: js.Any = js.native
  var _color: js.Any = js.native
  var _colors: js.Any = js.native
  var _colors32: js.Any = js.native
  var _computeBoundingBox: js.Any = js.native
  var _computeParticleColor: js.Any = js.native
  var _computeParticleRotation: js.Any = js.native
  var _computeParticleTexture: js.Any = js.native
  var _computeParticleVertex: js.Any = js.native
  var _copy: js.Any = js.native
  var _cosPitch: js.Any = js.native
  var _cosRoll: js.Any = js.native
  var _cosYaw: js.Any = js.native
  var _depthSort: js.Any = js.native
  var _depthSortFunction: js.Any = js.native
  var _depthSortParticles: js.Any = js.native
  var _fixedNormal32: js.Any = js.native
  var _halfpitch: js.Any = js.native
  var _halfroll: js.Any = js.native
  var _halfyaw: js.Any = js.native
  var _index: js.Any = js.native
  var _indices: js.Any = js.native
  var _indices32: js.Any = js.native
  var _invertMatrix: js.Any = js.native
  var _isVisibilityBoxLocked: js.Any = js.native
  var _maxBbox: js.Any = js.native
  var _maximum: js.Any = js.native
  var _meshBuilder: js.Any = js.native
  var _minBbox: js.Any = js.native
  var _minimum: js.Any = js.native
  var _mustUnrotateFixedNormals: js.Any = js.native
  var _needs32Bits: js.Any = js.native
  var _normal: js.Any = js.native
  var _normals: js.Any = js.native
  var _normals32: js.Any = js.native
  var _parent: js.Any = js.native
  var _particle: js.Any = js.native
  var _particleHasParent: js.Any = js.native
  var _particlesIntersect: js.Any = js.native
  var _pickable: js.Any = js.native
  var _pitch: js.Any = js.native
  var _pivotBackTranslation: js.Any = js.native
  var _posToShape: js.Any = js.native
  var _positions: js.Any = js.native
  var _positions32: js.Any = js.native
  var _quaternion: js.Any = js.native
  var _quaternionRotationYPR: js.Any = js.native
  var _quaternionToRotationMatrix: js.Any = js.native
  var _rebuildParticle: js.Any = js.native
  var _resetCopy: js.Any = js.native
  var _roll: js.Any = js.native
  var _rotMatrix: js.Any = js.native
  var _rotated: js.Any = js.native
  var _scaledPivot: js.Any = js.native
  var _scene: js.Any = js.native
  var _shape: js.Any = js.native
  var _shapeCounter: js.Any = js.native
  var _shapeUV: js.Any = js.native
  var _sinPitch: js.Any = js.native
  var _sinRoll: js.Any = js.native
  var _sinYaw: js.Any = js.native
  var _unrotateFixedNormals: js.Any = js.native
  var _updatable: js.Any = js.native
  var _uvs: js.Any = js.native
  var _uvs32: js.Any = js.native
  var _uvsToShapeUV: js.Any = js.native
  var _vertex: js.Any = js.native
  var _yaw: js.Any = js.native
  /**
    * If the particles must ever face the camera (default false). Useful for planar particles.
    */
  var billboard: scala.Boolean = js.native
  /**
    * Tells to `setParticles()` to compute or not the mesh bounding box when computing the particle positions.
    */
  /**
    * Gets if `setParticles()` computes or not the mesh bounding box when computing the particle positions.
    */
  var computeBoundingBox: scala.Boolean = js.native
  /**
    * Tells to `setParticles()` to compute the particle colors or not.
    * Default value : true. The SPS is faster when it's set to false.
    * Note : the particle colors are stored values, so setting `computeParticleColor` to false will keep yet the last colors set.
    */
  /**
    * Gets if `setParticles()` computes the particle colors or not.
    * Default value : true. The SPS is faster when it's set to false.
    * Note : the particle colors are stored values, so setting `computeParticleColor` to false will keep yet the last colors set.
    */
  var computeParticleColor: scala.Boolean = js.native
  /**
    * Tells to `setParticles()` to compute the particle rotations or not.
    * Default value : true. The SPS is faster when it's set to false.
    * Note : the particle rotations aren't stored values, so setting `computeParticleRotation` to false will prevents the particle to rotate.
    */
  /**
    * Gets if `setParticles()` computes the particle rotations or not.
    * Default value : true. The SPS is faster when it's set to false.
    * Note : the particle rotations aren't stored values, so setting `computeParticleRotation` to false will prevents the particle to rotate.
    */
  var computeParticleRotation: scala.Boolean = js.native
  /**
    * Gets if `setParticles()` computes the particle textures or not.
    * Default value : true. The SPS is faster when it's set to false.
    * Note : the particle textures are stored values, so setting `computeParticleTexture` to false will keep yet the last colors set.
    */
  var computeParticleTexture: scala.Boolean = js.native
  /**
    * Tells to `setParticles()` to call the vertex function for each vertex of each particle, or not.
    * Default value : false. The SPS is faster when it's set to false.
    * Note : the particle custom vertex positions aren't stored values.
    */
  /**
    * Gets if `setParticles()` calls the vertex function for each vertex of each particle, or not.
    * Default value : false. The SPS is faster when it's set to false.
    * Note : the particle custom vertex positions aren't stored values.
    */
  var computeParticleVertex: scala.Boolean = js.native
  /**
    * This a counter ofr your own usage. It's not set by any SPS functions.
    */
  var counter: scala.Double = js.native
  /**
    * Tells to `setParticles()` to sort or not the distance between each particle and the camera.
    * Skipped when `enableDepthSort` is set to `false` (default) at construction time.
    * Default : `true`
    */
  /**
    * Gets if `setParticles()` sorts or not the distance between each particle and the camera.
    * Skipped when `enableDepthSort` is set to `false` (default) at construction time.
    * Default : `true`
    */
  var depthSortParticles: scala.Boolean = js.native
  /**
    * This array is populated when `enableDepthSort` is set to true.
    * Each element of this array is an instance of the class DepthSortedParticle.
    */
  var depthSortedParticles: js.Array[DepthSortedParticle] = js.native
  /**
    * Gets whether the SPS as always visible or not
    * doc : http://doc.babylonjs.com/overviews/Solid_Particle_System#sps-visibility
    */
  /**
    * Sets the SPS as always visible or not
    * doc : http://doc.babylonjs.com/overviews/Solid_Particle_System#sps-visibility
    */
  var isAlwaysVisible: scala.Boolean = js.native
  /**
    * Sets the SPS visibility box as locked or not. This enables/disables the underlying mesh bounding box updates.
    * doc : http://doc.babylonjs.com/overviews/Solid_Particle_System#sps-visibility
    */
  /**
    * Gets if the SPS visibility box as locked or not. This enables/disables the underlying mesh bounding box updates.
    * doc : http://doc.babylonjs.com/overviews/Solid_Particle_System#sps-visibility
    */
  var isVisibilityBoxLocked: scala.Boolean = js.native
  /**
    * The SPS mesh. It's a standard BJS Mesh, so all the methods from the Mesh class are avalaible.
    */
  var mesh: Mesh = js.native
  /**
    * The SPS name. This name is also given to the underlying mesh.
    */
  var name: java.lang.String = js.native
  /**
    * The SPS total number of particles. Read only. Use SPS.counter instead if you need to set your own value.
    */
  var nbParticles: scala.Double = js.native
  /**
    *  The SPS array of Solid Particle objects. Just access each particle as with any classic array.
    *  Example : var p = SPS.particles[i];
    */
  var particles: js.Array[SolidParticle] = js.native
  /**
    * This array is populated when the SPS is set as 'pickable'.
    * Each key of this array is a `faceId` value that you can get from a pickResult object.
    * Each element of this array is an object `{idx: int, faceId: int}`.
    * `idx` is the picked particle index in the `SPS.particles` array
    * `faceId` is the picked face index counted within this particle.
    * Please read : http://doc.babylonjs.com/overviews/Solid_Particle_System#pickable-particles
    */
  var pickedParticles: js.Array[babylonjsLib.Anon_FaceId] = js.native
  /**
    * Recompute normals when adding a shape
    */
  var recomputeNormals: scala.Boolean = js.native
  /**
    * This empty object is intended to store some SPS specific or temporary values in order to lower the Garbage Collector activity.
    * Please read : http://doc.babylonjs.com/overviews/Solid_Particle_System#garbage-collector-concerns
    */
  var vars: js.Any = js.native
  /**
    * Adds some particles to the SPS from the model shape. Returns the shape id.
    * Please read the doc : http://doc.babylonjs.com/overviews/Solid_Particle_System#create-an-immutable-sps
    * @param mesh is any Mesh object that will be used as a model for the solid particles.
    * @param nb (positive integer) the number of particles to be created from this model
    * @param options {positionFunction} is an optional javascript function to called for each particle on SPS creation.
    * {vertexFunction} is an optional javascript function to called for each vertex of each particle on SPS creation
    * @returns the number of shapes in the system
    */
  def addShape(mesh: Mesh, nb: scala.Double): scala.Double = js.native
  def addShape(mesh: Mesh, nb: scala.Double, options: babylonjsLib.Anon_PositionFunction): scala.Double = js.native
  /**
    * This will be called  by `setParticles()` after all the other treatments and just before the actual mesh update.
    * This will be passed three parameters.
    * This does nothing and may be overwritten by the user.
    * @param start the particle index in the particle array where to stop to iterate, same than the value passed to setParticle()
    * @param stop the particle index in the particle array where to stop to iterate, same than the value passed to setParticle()
    * @param update the boolean update value actually passed to setParticles()
    */
  def afterUpdateParticles(): scala.Unit = js.native
  def afterUpdateParticles(start: scala.Double): scala.Unit = js.native
  def afterUpdateParticles(start: scala.Double, stop: scala.Double): scala.Unit = js.native
  def afterUpdateParticles(start: scala.Double, stop: scala.Double, update: scala.Boolean): scala.Unit = js.native
  /**
    * This will be called before any other treatment by `setParticles()` and will be passed three parameters.
    * This does nothing and may be overwritten by the user.
    * @param start the particle index in the particle array where to stop to iterate, same than the value passed to setParticle()
    * @param stop the particle index in the particle array where to stop to iterate, same than the value passed to setParticle()
    * @param update the boolean update value actually passed to setParticles()
    */
  def beforeUpdateParticles(): scala.Unit = js.native
  def beforeUpdateParticles(start: scala.Double): scala.Unit = js.native
  def beforeUpdateParticles(start: scala.Double, stop: scala.Double): scala.Unit = js.native
  def beforeUpdateParticles(start: scala.Double, stop: scala.Double, update: scala.Boolean): scala.Unit = js.native
  /**
    * Builds the SPS underlying mesh. Returns a standard Mesh.
    * If no model shape was added to the SPS, the returned mesh is just a single triangular plane.
    * @returns the created mesh
    */
  def buildMesh(): Mesh = js.native
  /**
    * Digests the mesh and generates as many solid particles in the system as wanted. Returns the SPS.
    * These particles will have the same geometry than the mesh parts and will be positioned at the same localisation than the mesh original places.
    * Thus the particles generated from `digest()` have their property `position` set yet.
    * @param mesh ( Mesh ) is the mesh to be digested
    * @param options {facetNb} (optional integer, default 1) is the number of mesh facets per particle, this parameter is overriden by the parameter `number` if any
    * {delta} (optional integer, default 0) is the random extra number of facets per particle , each particle will have between `facetNb` and `facetNb + delta` facets
    * {number} (optional positive integer) is the wanted number of particles : each particle is built with `mesh_total_facets / number` facets
    * @returns the current SPS
    */
  def digest(mesh: Mesh): SolidParticleSystem = js.native
  def digest(mesh: Mesh, options: babylonjsLib.Anon_Delta): SolidParticleSystem = js.native
  /**
    * Releases all held resources
    */
  /* CompleteClass */
  override def dispose(): scala.Unit = js.native
  /**
    * This function does nothing. It may be overwritten to set all the particle first values.
    * The SPS doesn't call this function, you may have to call it by your own.
    * doc : http://doc.babylonjs.com/overviews/Solid_Particle_System#particle-management
    */
  def initParticles(): scala.Unit = js.native
  /**
    * Rebuilds the whole mesh and updates the VBO : custom positions and vertices are recomputed if needed.
    * @returns the SPS.
    */
  def rebuildMesh(): SolidParticleSystem = js.native
  /**
    * This function does nothing. It may be overwritten to recycle a particle.
    * The SPS doesn't call this function, you may have to call it by your own.
    * doc : http://doc.babylonjs.com/overviews/Solid_Particle_System#particle-management
    * @param particle The particle to recycle
    * @returns the recycled particle
    */
  def recycleParticle(particle: SolidParticle): SolidParticle = js.native
  /**
    * Visibilty helper : Recomputes the visible size according to the mesh bounding box
    * doc : http://doc.babylonjs.com/overviews/Solid_Particle_System#sps-visibility
    * @returns the SPS.
    */
  def refreshVisibleSize(): SolidParticleSystem = js.native
  /**
    *  Sets all the particles : this method actually really updates the mesh according to the particle positions, rotations, colors, textures, etc.
    *  This method calls `updateParticle()` for each particle of the SPS.
    *  For an animated SPS, it is usually called within the render loop.
    * @param start The particle index in the particle array where to start to compute the particle property values _(default 0)_
    * @param end The particle index in the particle array where to stop to compute the particle property values _(default nbParticle - 1)_
    * @param update If the mesh must be finally updated on this call after all the particle computations _(default true)_
    * @returns the SPS.
    */
  def setParticles(): SolidParticleSystem = js.native
  def setParticles(start: scala.Double): SolidParticleSystem = js.native
  def setParticles(start: scala.Double, end: scala.Double): SolidParticleSystem = js.native
  def setParticles(start: scala.Double, end: scala.Double, update: scala.Boolean): SolidParticleSystem = js.native
  /**
    * Visibility helper : Sets the size of a visibility box, this sets the underlying mesh bounding box.
    * @param size the size (float) of the visibility box
    * note : this doesn't lock the SPS mesh bounding box.
    * doc : http://doc.babylonjs.com/overviews/Solid_Particle_System#sps-visibility
    */
  def setVisibilityBox(size: scala.Double): scala.Unit = js.native
  /**
    * Updates a particle : this function should  be overwritten by the user.
    * It is called on each particle by `setParticles()`. This is the place to code each particle behavior.
    * doc : http://doc.babylonjs.com/overviews/Solid_Particle_System#particle-management
    * @example : just set a particle position or velocity and recycle conditions
    * @param particle The particle to update
    * @returns the updated particle
    */
  def updateParticle(particle: SolidParticle): SolidParticle = js.native
  /**
    * Updates a vertex of a particle : it can be overwritten by the user.
    * This will be called on each vertex particle by `setParticles()` if `computeParticleVertex` is set to true only.
    * @param particle the current particle
    * @param vertex the current index of the current particle
    * @param pt the index of the current vertex in the particle shape
    * doc : http://doc.babylonjs.com/overviews/Solid_Particle_System#update-each-particle-shape
    * @example : just set a vertex particle position
    * @returns the updated vertex
    */
  def updateParticleVertex(particle: SolidParticle, vertex: Vector3, pt: scala.Double): Vector3 = js.native
}

