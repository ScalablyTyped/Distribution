package typings.babylonjs

import typings.babylonjs.anon.`0`
import typings.babylonjs.materialsMaterialMod.Material
import typings.babylonjs.mathsMathMod.Color4
import typings.babylonjs.meshesMeshMod.Mesh
import typings.babylonjs.particlesCloudPointMod.CloudPoint
import typings.babylonjs.sceneMod.IDisposable
import typings.babylonjs.sceneMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object particlesPointsCloudSystemMod {
  
  @js.native
  sealed trait PointColor extends StObject
  @JSImport("babylonjs/Particles/pointsCloudSystem", "PointColor")
  @js.native
  object PointColor extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[PointColor & Double] = js.native
    
    /** color value */
    @js.native
    sealed trait Color
      extends StObject
         with PointColor
    /* 2 */ val Color: typings.babylonjs.particlesPointsCloudSystemMod.PointColor.Color & Double = js.native
    
    /** random value */
    @js.native
    sealed trait Random
      extends StObject
         with PointColor
    /* 0 */ val Random: typings.babylonjs.particlesPointsCloudSystemMod.PointColor.Random & Double = js.native
    
    /** stated value */
    @js.native
    sealed trait Stated
      extends StObject
         with PointColor
    /* 3 */ val Stated: typings.babylonjs.particlesPointsCloudSystemMod.PointColor.Stated & Double = js.native
    
    /** uv value */
    @js.native
    sealed trait UV
      extends StObject
         with PointColor
    /* 1 */ val UV: typings.babylonjs.particlesPointsCloudSystemMod.PointColor.UV & Double = js.native
  }
  
  @JSImport("babylonjs/Particles/pointsCloudSystem", "PointsCloudSystem")
  @js.native
  open class PointsCloudSystem protected ()
    extends StObject
       with IDisposable {
    /**
      * Creates a PCS (Points Cloud System) object
      * @param name (String) is the PCS name, this will be the underlying mesh name
      * @param pointSize (number) is the size for each point. Has no effect on a WebGPU engine.
      * @param scene (Scene) is the scene in which the PCS is added
      * @param options defines the options of the PCS e.g.
      * * updatable (optional boolean, default true) : if the PCS must be updatable or immutable
      * @param options.updatable
      */
    def this(name: String, pointSize: Double, scene: Scene) = this()
    def this(name: String, pointSize: Double, scene: Scene, options: `0`) = this()
    
    /* private */ var _addParticle: Any = js.native
    
    /* private */ var _alwaysVisible: Any = js.native
    
    /**
      * @internal
      */
    /* private */ var _buildMesh: Any = js.native
    
    /* private */ var _calculateDensity: Any = js.native
    
    /* private */ var _colorFromTexture: Any = js.native
    
    /* private */ var _colors: Any = js.native
    
    /* private */ var _colors32: Any = js.native
    
    /* private */ var _computeBoundingBox: Any = js.native
    
    /* private */ var _computeParticleColor: Any = js.native
    
    /* private */ var _computeParticleRotation: Any = js.native
    
    /* private */ var _computeParticleTexture: Any = js.native
    
    /* private */ var _getColorIndicesForCoord: Any = js.native
    
    /* private */ var _groupCounter: Any = js.native
    
    /* private */ var _groups: Any = js.native
    
    /* private */ var _indices: Any = js.native
    
    /* private */ var _indices32: Any = js.native
    
    /* private */ var _isReady: Any = js.native
    
    /* private */ var _isVisibilityBoxLocked: Any = js.native
    
    /* private */ var _normals: Any = js.native
    
    /* private */ var _positions: Any = js.native
    
    /* private */ var _positions32: Any = js.native
    
    /* private */ var _promises: Any = js.native
    
    /* private */ var _randomUnitVector: Any = js.native
    
    /* private */ var _scene: Any = js.native
    
    /* private */ var _setPointsColorOrUV: Any = js.native
    
    /**
      * @internal
      */
    var _size: Double = js.native
    
    /* private */ var _updatable: Any = js.native
    
    /* private */ var _uvs: Any = js.native
    
    /* private */ var _uvs32: Any = js.native
    
    /**
      * Adds points to the PCS in random positions within a unit sphere
      * @param nb (positive integer) the number of particles to be created from this model
      * @param pointFunction is an optional javascript function to be called for each particle on PCS creation
      * @returns the number of groups in the system
      */
    def addPoints(nb: Double): Double = js.native
    def addPoints(nb: Double, pointFunction: Any): Double = js.native
    
    /**
      * Adds points to the PCS from the surface of the model shape
      * @param mesh is any Mesh object that will be used as a surface model for the points
      * @param nb (positive integer) the number of particles to be created from this model
      * @param colorWith determines whether a point is colored using color (default), uv, random, stated or none (invisible)
      * @param color (color4) to be used when colorWith is stated or color (number) when used to specify texture position
      * @param range (number from 0 to 1) to determine the variation in shape and tone for a stated color
      * @returns the number of groups in the system
      */
    def addSurfacePoints(mesh: Mesh, nb: Double): Double = js.native
    def addSurfacePoints(mesh: Mesh, nb: Double, colorWith: Double): Double = js.native
    def addSurfacePoints(mesh: Mesh, nb: Double, colorWith: Double, color: Double): Double = js.native
    def addSurfacePoints(mesh: Mesh, nb: Double, colorWith: Double, color: Double, range: Double): Double = js.native
    def addSurfacePoints(mesh: Mesh, nb: Double, colorWith: Double, color: Unit, range: Double): Double = js.native
    def addSurfacePoints(mesh: Mesh, nb: Double, colorWith: Double, color: Color4): Double = js.native
    def addSurfacePoints(mesh: Mesh, nb: Double, colorWith: Double, color: Color4, range: Double): Double = js.native
    def addSurfacePoints(mesh: Mesh, nb: Double, colorWith: Unit, color: Double): Double = js.native
    def addSurfacePoints(mesh: Mesh, nb: Double, colorWith: Unit, color: Double, range: Double): Double = js.native
    def addSurfacePoints(mesh: Mesh, nb: Double, colorWith: Unit, color: Unit, range: Double): Double = js.native
    def addSurfacePoints(mesh: Mesh, nb: Double, colorWith: Unit, color: Color4): Double = js.native
    def addSurfacePoints(mesh: Mesh, nb: Double, colorWith: Unit, color: Color4, range: Double): Double = js.native
    
    /**
      * Adds points to the PCS inside the model shape
      * @param mesh is any Mesh object that will be used as a surface model for the points
      * @param nb (positive integer) the number of particles to be created from this model
      * @param colorWith determines whether a point is colored using color (default), uv, random, stated or none (invisible)
      * @param color (color4) to be used when colorWith is stated or color (number) when used to specify texture position
      * @param range (number from 0 to 1) to determine the variation in shape and tone for a stated color
      * @returns the number of groups in the system
      */
    def addVolumePoints(mesh: Mesh, nb: Double): Double = js.native
    def addVolumePoints(mesh: Mesh, nb: Double, colorWith: Double): Double = js.native
    def addVolumePoints(mesh: Mesh, nb: Double, colorWith: Double, color: Double): Double = js.native
    def addVolumePoints(mesh: Mesh, nb: Double, colorWith: Double, color: Double, range: Double): Double = js.native
    def addVolumePoints(mesh: Mesh, nb: Double, colorWith: Double, color: Unit, range: Double): Double = js.native
    def addVolumePoints(mesh: Mesh, nb: Double, colorWith: Double, color: Color4): Double = js.native
    def addVolumePoints(mesh: Mesh, nb: Double, colorWith: Double, color: Color4, range: Double): Double = js.native
    def addVolumePoints(mesh: Mesh, nb: Double, colorWith: Unit, color: Double): Double = js.native
    def addVolumePoints(mesh: Mesh, nb: Double, colorWith: Unit, color: Double, range: Double): Double = js.native
    def addVolumePoints(mesh: Mesh, nb: Double, colorWith: Unit, color: Unit, range: Double): Double = js.native
    def addVolumePoints(mesh: Mesh, nb: Double, colorWith: Unit, color: Color4): Double = js.native
    def addVolumePoints(mesh: Mesh, nb: Double, colorWith: Unit, color: Color4, range: Double): Double = js.native
    
    /**
      * This will be called  by `setParticles()` after all the other treatments and just before the actual mesh update.
      * This will be passed three parameters.
      * This does nothing and may be overwritten by the user.
      * @param start the particle index in the particle array where to start to iterate, same than the value passed to setParticle()
      * @param stop the particle index in the particle array where to stop to iterate, same than the value passed to setParticle()
      * @param update the boolean update value actually passed to setParticles()
      */
    def afterUpdateParticles(): Unit = js.native
    def afterUpdateParticles(start: Double): Unit = js.native
    def afterUpdateParticles(start: Double, stop: Double): Unit = js.native
    def afterUpdateParticles(start: Double, stop: Double, update: Boolean): Unit = js.native
    def afterUpdateParticles(start: Double, stop: Unit, update: Boolean): Unit = js.native
    def afterUpdateParticles(start: Unit, stop: Double): Unit = js.native
    def afterUpdateParticles(start: Unit, stop: Double, update: Boolean): Unit = js.native
    def afterUpdateParticles(start: Unit, stop: Unit, update: Boolean): Unit = js.native
    
    /**
      * This will be called before any other treatment by `setParticles()` and will be passed three parameters.
      * This does nothing and may be overwritten by the user.
      * @param start the particle index in the particle array where to start to iterate, same than the value passed to setParticle()
      * @param stop the particle index in the particle array where to stop to iterate, same than the value passed to setParticle()
      * @param update the boolean update value actually passed to setParticles()
      */
    def beforeUpdateParticles(): Unit = js.native
    def beforeUpdateParticles(start: Double): Unit = js.native
    def beforeUpdateParticles(start: Double, stop: Double): Unit = js.native
    def beforeUpdateParticles(start: Double, stop: Double, update: Boolean): Unit = js.native
    def beforeUpdateParticles(start: Double, stop: Unit, update: Boolean): Unit = js.native
    def beforeUpdateParticles(start: Unit, stop: Double): Unit = js.native
    def beforeUpdateParticles(start: Unit, stop: Double, update: Boolean): Unit = js.native
    def beforeUpdateParticles(start: Unit, stop: Unit, update: Boolean): Unit = js.native
    
    /**
      * Builds the PCS underlying mesh. Returns a standard Mesh.
      * If no points were added to the PCS, the returned mesh is just a single point.
      * @param material The material to use to render the mesh. If not provided, will create a default one
      * @returns a promise for the created mesh
      */
    def buildMeshAsync(): js.Promise[Mesh] = js.native
    def buildMeshAsync(material: Material): js.Promise[Mesh] = js.native
    
    /**
      * Gets the particle colors computed by the Point Cloud System
      */
    def colors: js.typedarray.Float32Array = js.native
    
    /**
      * Gets if `setParticles()` computes or not the mesh bounding box when computing the particle positions.
      */
    def computeBoundingBox: Boolean = js.native
    /**
      * Tells to `setParticles()` to compute or not the mesh bounding box when computing the particle positions.
      */
    def computeBoundingBox_=(`val`: Boolean): Unit = js.native
    
    /**
      * Gets if `setParticles()` computes the particle colors or not.
      * Default value : false. The PCS is faster when it's set to false.
      * Note : the particle colors are stored values, so setting `computeParticleColor` to false will keep yet the last colors set.
      */
    def computeParticleColor: Boolean = js.native
    /**
      * Tells to `setParticles()` to compute the particle colors or not.
      * Default value : true. The PCS is faster when it's set to false.
      * Note : the particle colors are stored values, so setting `computeParticleColor` to false will keep yet the last colors set.
      */
    def computeParticleColor_=(`val`: Boolean): Unit = js.native
    
    /**
      * Tells to `setParticles()` to compute the particle rotations or not
      * Default value : false. The PCS is faster when it's set to false
      * Note : particle rotations are only applied to parent particles
      * Note : the particle rotations aren't stored values, so setting `computeParticleRotation` to false will prevents the particle to rotate
      */
    def computeParticleRotation_=(`val`: Boolean): Unit = js.native
    
    /**
      * Gets if `setParticles()` computes the particle textures or not.
      * Default value : false. The PCS is faster when it's set to false.
      * Note : the particle textures are stored values, so setting `computeParticleTexture` to false will keep yet the last colors set.
      */
    def computeParticleTexture: Boolean = js.native
    def computeParticleTexture_=(`val`: Boolean): Unit = js.native
    
    /**
      * This a counter for your own usage. It's not set by any SPS functions.
      */
    var counter: Double = js.native
    
    /**
      * Releases all held resources
      */
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /**
      * This function does nothing. It may be overwritten to set all the particle first values.
      * The PCS doesn't call this function, you may have to call it by your own.
      * doc :
      */
    def initParticles(): Unit = js.native
    
    /**
      * Gets whether the PCS is always visible or not
      * doc :
      */
    def isAlwaysVisible: Boolean = js.native
    /**
      * Sets the PCS as always visible or not
      * doc :
      */
    def isAlwaysVisible_=(`val`: Boolean): Unit = js.native
    
    /**
      * The PCS mesh. It's a standard BJS Mesh, so all the methods from the Mesh class are available.
      */
    var mesh: js.UndefOr[Mesh] = js.native
    
    /**
      * The PCS name. This name is also given to the underlying mesh.
      */
    var name: String = js.native
    
    /**
      * The PCS total number of particles. Read only. Use PCS.counter instead if you need to set your own value.
      */
    var nbParticles: Double = js.native
    
    /**
      *  The PCS array of cloud point objects. Just access each particle as with any classic array.
      *  Example : var p = SPS.particles[i];
      */
    var particles: js.Array[CloudPoint] = js.native
    
    /**
      * Gets the particle positions computed by the Point Cloud System
      */
    def positions: js.typedarray.Float32Array = js.native
    
    /**
      * This function does nothing. It may be overwritten to recycle a particle
      * The PCS doesn't call this function, you can to call it
      * doc :
      * @param particle The particle to recycle
      * @returns the recycled particle
      */
    def recycleParticle(particle: CloudPoint): CloudPoint = js.native
    
    /**
      * Visibility helper : Recomputes the visible size according to the mesh bounding box
      * doc :
      * @returns the PCS.
      */
    def refreshVisibleSize(): PointsCloudSystem = js.native
    
    /**
      *  Sets all the particles : this method actually really updates the mesh according to the particle positions, rotations, colors, textures, etc.
      *  This method calls `updateParticle()` for each particle of the SPS.
      *  For an animated SPS, it is usually called within the render loop.
      * @param start The particle index in the particle array where to start to compute the particle property values _(default 0)_
      * @param end The particle index in the particle array where to stop to compute the particle property values _(default nbParticle - 1)_
      * @param update If the mesh must be finally updated on this call after all the particle computations _(default true)_
      * @returns the PCS.
      */
    def setParticles(): PointsCloudSystem = js.native
    def setParticles(start: Double): PointsCloudSystem = js.native
    def setParticles(start: Double, end: Double): PointsCloudSystem = js.native
    def setParticles(start: Double, end: Double, update: Boolean): PointsCloudSystem = js.native
    def setParticles(start: Double, end: Unit, update: Boolean): PointsCloudSystem = js.native
    def setParticles(start: Unit, end: Double): PointsCloudSystem = js.native
    def setParticles(start: Unit, end: Double, update: Boolean): PointsCloudSystem = js.native
    def setParticles(start: Unit, end: Unit, update: Boolean): PointsCloudSystem = js.native
    
    /**
      * Visibility helper : Sets the size of a visibility box, this sets the underlying mesh bounding box.
      * @param size the size (float) of the visibility box
      * note : this doesn't lock the PCS mesh bounding box.
      * doc :
      */
    def setVisibilityBox(size: Double): Unit = js.native
    
    /**
      * Updates a particle : this function should  be overwritten by the user.
      * It is called on each particle by `setParticles()`. This is the place to code each particle behavior.
      * doc :
      * @example : just set a particle position or velocity and recycle conditions
      * @param particle The particle to update
      * @returns the updated particle
      */
    def updateParticle(particle: CloudPoint): CloudPoint = js.native
    
    /**
      * Gets the particle uvs computed by the Point Cloud System
      */
    def uvs: js.typedarray.Float32Array = js.native
    
    /**
      * This empty object is intended to store some PCS specific or temporary values in order to lower the Garbage Collector activity.
      * Please read :
      */
    var vars: Any = js.native
  }
}
