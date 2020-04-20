package typings.babylonjs

import typings.babylonjs.materialMod.Material
import typings.babylonjs.mathVectorMod.Vector3
import typings.babylonjs.meshMod.Mesh
import typings.babylonjs.multiMaterialMod.MultiMaterial
import typings.babylonjs.sceneMod.IDisposable
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.solidParticleMod.DepthSortedParticle
import typings.babylonjs.solidParticleMod.SolidParticle
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Particles/solidParticleSystem", JSImport.Namespace)
@js.native
object solidParticleSystemMod extends js.Object {
  @js.native
  class SolidParticleSystem protected () extends IDisposable {
    /**
      * Creates a SPS (Solid Particle System) object.
      * @param name (String) is the SPS name, this will be the underlying mesh name.
      * @param scene (Scene) is the scene in which the SPS is added.
      * @param options defines the options of the sps e.g.
      * * updatable (optional boolean, default true) : if the SPS must be updatable or immutable.
      * * isPickable (optional boolean, default false) : if the solid particles must be pickable.
      * * enableDepthSort (optional boolean, default false) : if the solid particles must be sorted in the geometry according to their distance to the camera.
      * * useModelMaterial (optional boolean, defaut false) : if the model materials must be used to create the SPS multimaterial. This enables the multimaterial supports of the SPS.
      * * enableMultiMaterial (optional boolean, default false) : if the solid particles can be given different materials.
      * * expandable (optional boolean, default false) : if particles can still be added after the initial SPS mesh creation.
      * * particleIntersection (optional boolean, default false) : if the solid particle intersections must be computed.
      * * boundingSphereOnly (optional boolean, default false) : if the particle intersection must be computed only with the bounding sphere (no bounding box computation, so faster).
      * * bSphereRadiusFactor (optional float, default 1.0) : a number to multiply the boundind sphere radius by in order to reduce it for instance.
      * @example bSphereRadiusFactor = 1.0 / Math.sqrt(3.0) => the bounding sphere exactly matches a spherical mesh.
      */
    def this(name: String, scene: Scene) = this()
    def this(name: String, scene: Scene, options: AnonBSphereRadiusFactor) = this()
    /**
      * Adds a new particle object in the particles array
      * @param idx particle index in particles array
      * @param id particle id
      * @param idxpos positionIndex : the starting index of the particle vertices in the SPS "positions" array
      * @param idxind indiceIndex : he starting index of the particle indices in the SPS "indices" array
      * @param model particle ModelShape object
      * @param shapeId model shape identifier
      * @param idxInShape index of the particle in the current model
      * @param bInfo model bounding info object
      * @param storage target storage array, if any
      * @hidden
      */
    var _addParticle: js.Any = js.native
    var _alwaysVisible: js.Any = js.native
    var _autoUpdateSubMeshes: js.Any = js.native
    /**
      * If the particle intersection must be computed only with the bounding sphere (no bounding box computation, so faster). (Internal use only)
      * @hidden
      */
    var _bSphereOnly: Boolean = js.native
    /**
      * A number to multiply the boundind sphere radius by in order to reduce it for instance. (Internal use only)
      * @hidden
      */
    var _bSphereRadiusFactor: Double = js.native
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
    var _defaultMaterial: js.Any = js.native
    var _depthSort: js.Any = js.native
    var _depthSortFunction: js.Any = js.native
    var _depthSortParticles: js.Any = js.native
    var _expandable: js.Any = js.native
    /**
      * Returns an array with unique values of Materials from the passed array
      * @param array the material array to be checked and filtered
      * @hidden
      */
    var _filterUniqueMaterialId: js.Any = js.native
    var _fixedNormal32: js.Any = js.native
    var _idxOfId: js.Any = js.native
    var _index: js.Any = js.native
    var _indices: js.Any = js.native
    var _indices32: js.Any = js.native
    var _indicesByMaterial: js.Any = js.native
    /**
      * Creates a new particle and modifies the SPS mesh geometry :
      * - calls _meshBuilder() to increase the SPS mesh geometry step by step
      * - calls _addParticle() to populate the particle array
      * factorized code from addShape() and insertParticlesFromArray()
      * @param idx particle index in the particles array
      * @param i particle index in its shape
      * @param modelShape particle ModelShape object
      * @param shape shape vertex array
      * @param meshInd shape indices array
      * @param meshUV shape uv array
      * @param meshCol shape color array
      * @param meshNor shape normals array
      * @param bbInfo shape bounding info
      * @param storage target particle storage
      * @options addShape() passed options
      * @hidden
      */
    var _insertNewParticle: js.Any = js.native
    var _isNotBuilt: js.Any = js.native
    var _isVisibilityBoxLocked: js.Any = js.native
    var _lastParticleId: js.Any = js.native
    var _materialIndexes: js.Any = js.native
    var _materialIndexesById: js.Any = js.native
    var _materialSortFunction: js.Any = js.native
    var _materials: js.Any = js.native
    /**
      * Inserts the shape model geometry in the global SPS mesh by updating the positions, indices, normals, colors, uvs arrays
      * @param p the current index in the positions array to be updated
      * @param ind the current index in the indices array
      * @param shape a Vector3 array, the shape geometry
      * @param positions the positions array to be updated
      * @param meshInd the shape indices array
      * @param indices the indices array to be updated
      * @param meshUV the shape uv array
      * @param uvs the uv array to be updated
      * @param meshCol the shape color array
      * @param colors the color array to be updated
      * @param meshNor the shape normals array
      * @param normals the normals array to be updated
      * @param idx the particle index
      * @param idxInShape the particle index in its shape
      * @param options the addShape() method  passed options
      * @model the particle model
      * @hidden
      */
    var _meshBuilder: js.Any = js.native
    var _multimaterial: js.Any = js.native
    var _multimaterialEnabled: js.Any = js.native
    var _mustUnrotateFixedNormals: js.Any = js.native
    var _needs32Bits: js.Any = js.native
    var _normals: js.Any = js.native
    var _normals32: js.Any = js.native
    var _particlesIntersect: js.Any = js.native
    var _pickable: js.Any = js.native
    /**
      * Returns a shape Vector3 array from positions float array
      * @param positions float array
      * @returns a vector3 array
      * @hidden
      */
    var _posToShape: js.Any = js.native
    var _positions: js.Any = js.native
    var _positions32: js.Any = js.native
    /**
      * Rebuilds a particle back to its just built status : if needed, recomputes the custom positions and vertices
      * @hidden
      */
    var _rebuildParticle: js.Any = js.native
    /**
      * Resets the temporary working copy particle
      * @hidden
      */
    var _resetCopy: js.Any = js.native
    var _scene: js.Any = js.native
    /**
      * Sets a new Standard Material as _defaultMaterial if not already set.
      * @hidden
      */
    var _setDefaultMaterial: js.Any = js.native
    /**
      * Sets the material indexes by id materialIndexesById[id] = materialIndex
      * @hidden
      */
    var _setMaterialIndexesById: js.Any = js.native
    var _shapeCounter: js.Any = js.native
    /**
      * Sorts the solid particles by material when MultiMaterial is enabled.
      * Updates the indices32 array.
      * Updates the indicesByMaterial array.
      * Updates the mesh indices array.
      * @returns the SPS
      * @hidden
      */
    var _sortParticlesByMaterial: js.Any = js.native
    /**
      * Unrotate the fixed normals in case the mesh was built with pre-rotated particles, ex : use of positionFunction in addShape()
      * @hidden
      */
    var _unrotateFixedNormals: js.Any = js.native
    var _updatable: js.Any = js.native
    var _useModelMaterial: js.Any = js.native
    var _uvs: js.Any = js.native
    var _uvs32: js.Any = js.native
    /**
      * Returns a shapeUV array from a float uvs (array deep copy)
      * @param uvs as a float array
      * @returns a shapeUV array
      * @hidden
      */
    var _uvsToShapeUV: js.Any = js.native
    /**
      * If the particles must ever face the camera (default false). Useful for planar particles.
      */
    var billboard: Boolean = js.native
    /**
      * This a counter ofr your own usage. It's not set by any SPS functions.
      */
    var counter: Double = js.native
    /**
      * This array is populated when `enableDepthSort` is set to true.
      * Each element of this array is an instance of the class DepthSortedParticle.
      */
    var depthSortedParticles: js.Array[DepthSortedParticle] = js.native
    /**
      * The SPS mesh. It's a standard BJS Mesh, so all the methods from the Mesh class are avalaible.
      */
    var mesh: Mesh = js.native
    /**
      * The SPS name. This name is also given to the underlying mesh.
      */
    var name: String = js.native
    /**
      * The SPS total number of particles. Read only. Use SPS.counter instead if you need to set your own value.
      */
    var nbParticles: Double = js.native
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
      * Please read : http://doc.babylonjs.com/how_to/Solid_Particle_System#pickable-particles
      */
    var pickedParticles: js.Array[AnonFaceId] = js.native
    /**
      * Recompute normals when adding a shape
      */
    var recomputeNormals: Boolean = js.native
    /**
      * This empty object is intended to store some SPS specific or temporary values in order to lower the Garbage Collector activity.
      * Please read : http://doc.babylonjs.com/how_to/Solid_Particle_System#garbage-collector-concerns
      */
    var vars: js.Any = js.native
    /**
      * Adds some particles to the SPS from the model shape. Returns the shape id.
      * Please read the doc : http://doc.babylonjs.com/how_to/Solid_Particle_System#create-an-immutable-sps
      * @param mesh is any Mesh object that will be used as a model for the solid particles.
      * @param nb (positive integer) the number of particles to be created from this model
      * @param options {positionFunction} is an optional javascript function to called for each particle on SPS creation.
      * {vertexFunction} is an optional javascript function to called for each vertex of each particle on SPS creation
      * {storage} (optional existing array) is an array where the particles will be stored for a further use instead of being inserted in the SPS.
      * @returns the number of shapes in the system
      */
    def addShape(mesh: Mesh, nb: Double): Double = js.native
    def addShape(mesh: Mesh, nb: Double, options: AnonPositionFunction): Double = js.native
    /**
      * This will be called  by `setParticles()` after all the other treatments and just before the actual mesh update.
      * This will be passed three parameters.
      * This does nothing and may be overwritten by the user.
      * @param start the particle index in the particle array where to stop to iterate, same than the value passed to setParticle()
      * @param stop the particle index in the particle array where to stop to iterate, same than the value passed to setParticle()
      * @param update the boolean update value actually passed to setParticles()
      */
    def afterUpdateParticles(): Unit = js.native
    def afterUpdateParticles(start: Double): Unit = js.native
    def afterUpdateParticles(start: Double, stop: Double): Unit = js.native
    def afterUpdateParticles(start: Double, stop: Double, update: Boolean): Unit = js.native
    /**
      * If the subMeshes must be updated on the next call to setParticles()
      */
    def autoUpdateSubMeshes: Boolean = js.native
    def autoUpdateSubMeshes(`val`: Boolean): js.Any = js.native
    /**
      * This will be called before any other treatment by `setParticles()` and will be passed three parameters.
      * This does nothing and may be overwritten by the user.
      * @param start the particle index in the particle array where to stop to iterate, same than the value passed to setParticle()
      * @param stop the particle index in the particle array where to stop to iterate, same than the value passed to setParticle()
      * @param update the boolean update value actually passed to setParticles()
      */
    def beforeUpdateParticles(): Unit = js.native
    def beforeUpdateParticles(start: Double): Unit = js.native
    def beforeUpdateParticles(start: Double, stop: Double): Unit = js.native
    def beforeUpdateParticles(start: Double, stop: Double, update: Boolean): Unit = js.native
    /**
      * Builds the SPS underlying mesh. Returns a standard Mesh.
      * If no model shape was added to the SPS, the returned mesh is just a single triangular plane.
      * @returns the created mesh
      */
    def buildMesh(): Mesh = js.native
    /**
      * Gets if `setParticles()` computes or not the mesh bounding box when computing the particle positions.
      */
    def computeBoundingBox: Boolean = js.native
    /**
      * Tells to `setParticles()` to compute or not the mesh bounding box when computing the particle positions.
      */
    def computeBoundingBox(`val`: Boolean): js.Any = js.native
    /**
      * Gets if `setParticles()` computes the particle colors or not.
      * Default value : true. The SPS is faster when it's set to false.
      * Note : the particle colors are stored values, so setting `computeParticleColor` to false will keep yet the last colors set.
      */
    def computeParticleColor: Boolean = js.native
    /**
      * Tells to `setParticles()` to compute the particle colors or not.
      * Default value : true. The SPS is faster when it's set to false.
      * Note : the particle colors are stored values, so setting `computeParticleColor` to false will keep yet the last colors set.
      */
    def computeParticleColor(`val`: Boolean): js.Any = js.native
    /**
      * Gets if `setParticles()` computes the particle rotations or not.
      * Default value : true. The SPS is faster when it's set to false.
      * Note : the particle rotations aren't stored values, so setting `computeParticleRotation` to false will prevents the particle to rotate.
      */
    def computeParticleRotation: Boolean = js.native
    /**
      * Tells to `setParticles()` to compute the particle rotations or not.
      * Default value : true. The SPS is faster when it's set to false.
      * Note : the particle rotations aren't stored values, so setting `computeParticleRotation` to false will prevents the particle to rotate.
      */
    def computeParticleRotation(`val`: Boolean): js.Any = js.native
    /**
      * Gets if `setParticles()` computes the particle textures or not.
      * Default value : true. The SPS is faster when it's set to false.
      * Note : the particle textures are stored values, so setting `computeParticleTexture` to false will keep yet the last colors set.
      */
    def computeParticleTexture: Boolean = js.native
    def computeParticleTexture(`val`: Boolean): js.Any = js.native
    /**
      * Gets if `setParticles()` calls the vertex function for each vertex of each particle, or not.
      * Default value : false. The SPS is faster when it's set to false.
      * Note : the particle custom vertex positions aren't stored values.
      */
    def computeParticleVertex: Boolean = js.native
    /**
      * Tells to `setParticles()` to call the vertex function for each vertex of each particle, or not.
      * Default value : false. The SPS is faster when it's set to false.
      * Note : the particle custom vertex positions aren't stored values.
      */
    def computeParticleVertex(`val`: Boolean): js.Any = js.native
    /**
      * Computes the required SubMeshes according the materials assigned to the particles.
      * @returns the solid particle system.
      * Does nothing if called before the SPS mesh is built.
      */
    def computeSubMeshes(): SolidParticleSystem = js.native
    /**
      * Gets if `setParticles()` sorts or not the distance between each particle and the camera.
      * Skipped when `enableDepthSort` is set to `false` (default) at construction time.
      * Default : `true`
      */
    def depthSortParticles: Boolean = js.native
    /**
      * Tells to `setParticles()` to sort or not the distance between each particle and the camera.
      * Skipped when `enableDepthSort` is set to `false` (default) at construction time.
      * Default : `true`
      */
    def depthSortParticles(`val`: Boolean): js.Any = js.native
    /**
      * Digests the mesh and generates as many solid particles in the system as wanted. Returns the SPS.
      * These particles will have the same geometry than the mesh parts and will be positioned at the same localisation than the mesh original places.
      * Thus the particles generated from `digest()` have their property `position` set yet.
      * @param mesh ( Mesh ) is the mesh to be digested
      * @param options {facetNb} (optional integer, default 1) is the number of mesh facets per particle, this parameter is overriden by the parameter `number` if any
      * {delta} (optional integer, default 0) is the random extra number of facets per particle , each particle will have between `facetNb` and `facetNb + delta` facets
      * {number} (optional positive integer) is the wanted number of particles : each particle is built with `mesh_total_facets / number` facets
      * {storage} (optional existing array) is an array where the particles will be stored for a further use instead of being inserted in the SPS.
      * @returns the current SPS
      */
    def digest(mesh: Mesh): SolidParticleSystem = js.native
    def digest(mesh: Mesh, options: AnonDelta): SolidParticleSystem = js.native
    /**
      * Releases all held resources
      */
    /* CompleteClass */
    override def dispose(): Unit = js.native
    /**
      * Gets if the SPS is created as expandable at construction time.
      * Default : `false`
      */
    def expandable: Boolean = js.native
    /**
      * Returns a SolidParticle object from its identifier : particle.id
      * @param id (integer) the particle Id
      * @returns the searched particle or null if not found in the SPS.
      */
    def getParticleById(id: Double): Nullable[SolidParticle] = js.native
    /**
      * Returns a new array populated with the particles having the passed shapeId.
      * @param shapeId (integer) the shape identifier
      * @returns a new solid particle array
      */
    def getParticlesByShapeId(shapeId: Double): js.Array[SolidParticle] = js.native
    /**
      * Populates the passed array "ref" with the particles having the passed shapeId.
      * @param shapeId the shape identifier
      * @returns the SPS
      * @param ref
      */
    def getParticlesByShapeIdToRef(shapeId: Double, ref: js.Array[SolidParticle]): SolidParticleSystem = js.native
    /**
      * This function does nothing. It may be overwritten to set all the particle first values.
      * The SPS doesn't call this function, you may have to call it by your own.
      * doc : http://doc.babylonjs.com/how_to/Solid_Particle_System#particle-management
      */
    def initParticles(): Unit = js.native
    /**
      * Inserts some pre-created particles in the solid particle system so that they can be managed by setParticles().
      * @param solidParticleArray an array populated with Solid Particles objects
      * @returns the SPS
      */
    def insertParticlesFromArray(solidParticleArray: js.Array[SolidParticle]): SolidParticleSystem = js.native
    /**
      * Gets whether the SPS as always visible or not
      * doc : http://doc.babylonjs.com/how_to/Solid_Particle_System#sps-visibility
      */
    def isAlwaysVisible: Boolean = js.native
    /**
      * Sets the SPS as always visible or not
      * doc : http://doc.babylonjs.com/how_to/Solid_Particle_System#sps-visibility
      */
    def isAlwaysVisible(`val`: Boolean): js.Any = js.native
    /**
      * Gets if the SPS visibility box as locked or not. This enables/disables the underlying mesh bounding box updates.
      * doc : http://doc.babylonjs.com/how_to/Solid_Particle_System#sps-visibility
      */
    def isVisibilityBoxLocked: Boolean = js.native
    /**
      * Sets the SPS visibility box as locked or not. This enables/disables the underlying mesh bounding box updates.
      * doc : http://doc.babylonjs.com/how_to/Solid_Particle_System#sps-visibility
      */
    def isVisibilityBoxLocked(`val`: Boolean): js.Any = js.native
    /**
      * The SPS used material array.
      */
    def materials: js.Array[Material] = js.native
    /**
      * The SPS computed multimaterial object
      */
    def multimaterial: MultiMaterial = js.native
    def multimaterial(mm: MultiMaterial): js.Any = js.native
    /**
      * Gets if the SPS supports the Multi Materials
      */
    def multimaterialEnabled: Boolean = js.native
    /**
      * Rebuilds the whole mesh and updates the VBO : custom positions and vertices are recomputed if needed.
      * @param reset boolean, default false : if the particles must be reset at position and rotation zero, scaling 1, color white, initial UVs and not parented.
      * @returns the SPS.
      */
    def rebuildMesh(): SolidParticleSystem = js.native
    def rebuildMesh(reset: Boolean): SolidParticleSystem = js.native
    /**
      * This function does nothing. It may be overwritten to recycle a particle.
      * The SPS doesn't call this function, you may have to call it by your own.
      * doc : http://doc.babylonjs.com/how_to/Solid_Particle_System#particle-management
      * @param particle The particle to recycle
      * @returns the recycled particle
      */
    def recycleParticle(particle: SolidParticle): SolidParticle = js.native
    /**
      * Visibilty helper : Recomputes the visible size according to the mesh bounding box
      * doc : http://doc.babylonjs.com/how_to/Solid_Particle_System#sps-visibility
      * @returns the SPS.
      */
    def refreshVisibleSize(): SolidParticleSystem = js.native
    /** Removes the particles from the start-th to the end-th included from an expandable SPS (required).
      *  Returns an array with the removed particles.
      *  If the number of particles to remove is lower than zero or greater than the global remaining particle number, then an empty array is returned.
      *  The SPS can't be empty so at least one particle needs to remain in place.
      *  Under the hood, the VertexData array, so the VBO buffer, is recreated each call.
      * @param start index of the first particle to remove
      * @param end index of the last particle to remove (included)
      * @returns an array populated with the removed particles
      */
    def removeParticles(start: Double, end: Double): js.Array[SolidParticle] = js.native
    /**
      * Sets the SPS MultiMaterial from the passed materials.
      * Note : the passed array is internally copied and not used then by reference.
      * @param materials an array of material objects. This array indexes are the materialIndex values of the particles.
      */
    def setMultiMaterial(materials: js.Array[Material]): Unit = js.native
    /**
      *  Sets all the particles : this method actually really updates the mesh according to the particle positions, rotations, colors, textures, etc.
      *  This method calls `updateParticle()` for each particle of the SPS.
      *  For an animated SPS, it is usually called within the render loop.
      * This methods does nothing if called on a non updatable or not yet built SPS. Example : buildMesh() not called after having added or removed particles from an expandable SPS.
      * @param start The particle index in the particle array where to start to compute the particle property values _(default 0)_
      * @param end The particle index in the particle array where to stop to compute the particle property values _(default nbParticle - 1)_
      * @param update If the mesh must be finally updated on this call after all the particle computations _(default true)_
      * @returns the SPS.
      */
    def setParticles(): SolidParticleSystem = js.native
    def setParticles(start: Double): SolidParticleSystem = js.native
    def setParticles(start: Double, end: Double): SolidParticleSystem = js.native
    def setParticles(start: Double, end: Double, update: Boolean): SolidParticleSystem = js.native
    /**
      * Visibility helper : Sets the size of a visibility box, this sets the underlying mesh bounding box.
      * @param size the size (float) of the visibility box
      * note : this doesn't lock the SPS mesh bounding box.
      * doc : http://doc.babylonjs.com/how_to/Solid_Particle_System#sps-visibility
      */
    def setVisibilityBox(size: Double): Unit = js.native
    /**
      * Updates a particle : this function should  be overwritten by the user.
      * It is called on each particle by `setParticles()`. This is the place to code each particle behavior.
      * doc : http://doc.babylonjs.com/how_to/Solid_Particle_System#particle-management
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
      * doc : http://doc.babylonjs.com/how_to/Solid_Particle_System#update-each-particle-shape
      * @example : just set a vertex particle position
      * @returns the updated vertex
      */
    def updateParticleVertex(particle: SolidParticle, vertex: Vector3, pt: Double): Vector3 = js.native
    /**
      * Gets if the SPS uses the model materials for its own multimaterial.
      */
    def useModelMaterial: Boolean = js.native
  }
  
}

