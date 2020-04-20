package typings.babylonjs

import org.scalablytyped.runtime.TopLevel
import typings.babylonjs.cloudPointMod.CloudPoint
import typings.babylonjs.mathMod.Color4
import typings.babylonjs.meshMod.Mesh
import typings.babylonjs.sceneMod.IDisposable
import typings.babylonjs.sceneMod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Particles/pointsCloudSystem", JSImport.Namespace)
@js.native
object pointsCloudSystemMod extends js.Object {
  @js.native
  sealed trait PointColor extends js.Object
  
  @js.native
  class PointsCloudSystem protected () extends IDisposable {
    /**
      * Creates a PCS (Points Cloud System) object
      * @param name (String) is the PCS name, this will be the underlying mesh name
      * @param pointSize (number) is the size for each point
      * @param scene (Scene) is the scene in which the PCS is added
      * @param options defines the options of the PCS e.g.
      * * updatable (optional boolean, default true) : if the PCS must be updatable or immutable
      */
    def this(name: String, pointSize: Double, scene: Scene) = this()
    def this(name: String, pointSize: Double, scene: Scene, options: AnonUpdatableBoolean) = this()
    var _addParticle: js.Any = js.native
    var _alwaysVisible: js.Any = js.native
    /**
      * @hidden
      */
    var _buildMesh: js.Any = js.native
    var _calculateDensity: js.Any = js.native
    var _colorFromTexture: js.Any = js.native
    var _colors: js.Any = js.native
    var _colors32: js.Any = js.native
    var _computeBoundingBox: js.Any = js.native
    var _computeParticleColor: js.Any = js.native
    var _computeParticleRotation: js.Any = js.native
    var _computeParticleTexture: js.Any = js.native
    var _getColorIndicesForCoord: js.Any = js.native
    var _groupCounter: js.Any = js.native
    var _groups: js.Any = js.native
    var _indices: js.Any = js.native
    var _indices32: js.Any = js.native
    var _isReady: js.Any = js.native
    var _isVisibilityBoxLocked: js.Any = js.native
    var _normals: js.Any = js.native
    var _positions: js.Any = js.native
    var _positions32: js.Any = js.native
    var _promises: js.Any = js.native
    var _randomUnitVector: js.Any = js.native
    var _scene: js.Any = js.native
    var _setPointsColorOrUV: js.Any = js.native
    /**
      * @hidden
      */
    var _size: Double = js.native
    var _updatable: js.Any = js.native
    var _uvs: js.Any = js.native
    var _uvs32: js.Any = js.native
    /**
      * This a counter for your own usage. It's not set by any SPS functions.
      */
    var counter: Double = js.native
    /**
      * The PCS mesh. It's a standard BJS Mesh, so all the methods from the Mesh class are avalaible.
      */
    var mesh: Mesh = js.native
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
      * This empty object is intended to store some PCS specific or temporary values in order to lower the Garbage Collector activity.
      * Please read :
      */
    var vars: js.Any = js.native
    /**
      * Adds points to the PCS in random positions within a unit sphere
      * @param nb (positive integer) the number of particles to be created from this model
      * @param pointFunction is an optional javascript function to be called for each particle on PCS creation
      * @returns the number of groups in the system
      */
    def addPoints(nb: Double): Double = js.native
    def addPoints(nb: Double, pointFunction: js.Any): Double = js.native
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
    def addSurfacePoints(mesh: Mesh, nb: Double, colorWith: Double, color: Color4): Double = js.native
    def addSurfacePoints(mesh: Mesh, nb: Double, colorWith: Double, color: Color4, range: Double): Double = js.native
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
    def addVolumePoints(mesh: Mesh, nb: Double, colorWith: Double, color: Color4): Double = js.native
    def addVolumePoints(mesh: Mesh, nb: Double, colorWith: Double, color: Color4, range: Double): Double = js.native
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
    /**
      * Builds the PCS underlying mesh. Returns a standard Mesh.
      * If no points were added to the PCS, the returned mesh is just a single point.
      * @returns a promise for the created mesh
      */
    def buildMeshAsync(): js.Promise[Mesh] = js.native
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
      * Default value : false. The PCS is faster when it's set to false.
      * Note : the particle colors are stored values, so setting `computeParticleColor` to false will keep yet the last colors set.
      */
    def computeParticleColor: Boolean = js.native
    /**
      * Tells to `setParticles()` to compute the particle colors or not.
      * Default value : true. The PCS is faster when it's set to false.
      * Note : the particle colors are stored values, so setting `computeParticleColor` to false will keep yet the last colors set.
      */
    def computeParticleColor(`val`: Boolean): js.Any = js.native
    /**
      * Tells to `setParticles()` to compute the particle rotations or not
      * Default value : false. The PCS is faster when it's set to false
      * Note : particle rotations are only applied to parent particles
      * Note : the particle rotations aren't stored values, so setting `computeParticleRotation` to false will prevents the particle to rotate
      */
    def computeParticleRotation(`val`: Boolean): js.Any = js.native
    /**
      * Gets if `setParticles()` computes the particle textures or not.
      * Default value : false. The PCS is faster when it's set to false.
      * Note : the particle textures are stored values, so setting `computeParticleTexture` to false will keep yet the last colors set.
      */
    def computeParticleTexture: Boolean = js.native
    def computeParticleTexture(`val`: Boolean): js.Any = js.native
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
    def isAlwaysVisible(`val`: Boolean): js.Any = js.native
    /**
      * This function does nothing. It may be overwritten to recycle a particle
      * The PCS doesn't call this function, you can to call it
      * doc :
      * @param particle The particle to recycle
      * @returns the recycled particle
      */
    def recycleParticle(particle: CloudPoint): CloudPoint = js.native
    /**
      * Visibilty helper : Recomputes the visible size according to the mesh bounding box
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
  }
  
  @js.native
  object PointColor extends js.Object {
    /** color value */
    @js.native
    sealed trait Color extends PointColor
    
    /** random value */
    @js.native
    sealed trait Random extends PointColor
    
    /** stated value */
    @js.native
    sealed trait Stated extends PointColor
    
    /** uv value */
    @js.native
    sealed trait UV extends PointColor
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[PointColor with Double] = js.native
    /* 2 */ @js.native
    object Color extends TopLevel[Color with Double]
    
    /* 0 */ @js.native
    object Random extends TopLevel[Random with Double]
    
    /* 3 */ @js.native
    object Stated extends TopLevel[Stated with Double]
    
    /* 1 */ @js.native
    object UV extends TopLevel[UV with Double]
    
  }
  
}

