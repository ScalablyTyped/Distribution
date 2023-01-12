package typings.babylonjs

import typings.babylonjs.mathsMathMod.Vector3
import typings.babylonjs.meshesMeshMod.Mesh
import typings.babylonjs.meshesTransformNodeMod.TransformNode
import typings.babylonjs.sceneMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object navigationInavigationengineMod {
  
  trait IAgentParameters extends StObject {
    
    /**
      * Defines how close a collision element must be before it is considered for steering behaviors. [Limits: > 0]
      */
    var collisionQueryRange: Double
    
    /**
      * Agent height. [Limit: > 0]
      */
    var height: Double
    
    /**
      *  Maximum allowed acceleration. [Limit: >= 0]
      */
    var maxAcceleration: Double
    
    /**
      * Maximum allowed speed. [Limit: >= 0]
      */
    var maxSpeed: Double
    
    /**
      * The path visibility optimization range. [Limit: > 0]
      */
    var pathOptimizationRange: Double
    
    /**
      *  Agent radius. [Limit: >= 0]
      */
    var radius: Double
    
    /**
      * Observers will be notified when agent gets inside the virtual circle with this Radius around destination point.
      * Default is agent radius
      */
    var reachRadius: js.UndefOr[Double] = js.undefined
    
    /**
      * How aggressive the agent manager should be at avoiding collisions with this agent. [Limit: >= 0]
      */
    var separationWeight: Double
  }
  object IAgentParameters {
    
    inline def apply(
      collisionQueryRange: Double,
      height: Double,
      maxAcceleration: Double,
      maxSpeed: Double,
      pathOptimizationRange: Double,
      radius: Double,
      separationWeight: Double
    ): IAgentParameters = {
      val __obj = js.Dynamic.literal(collisionQueryRange = collisionQueryRange.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], maxAcceleration = maxAcceleration.asInstanceOf[js.Any], maxSpeed = maxSpeed.asInstanceOf[js.Any], pathOptimizationRange = pathOptimizationRange.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], separationWeight = separationWeight.asInstanceOf[js.Any])
      __obj.asInstanceOf[IAgentParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IAgentParameters] (val x: Self) extends AnyVal {
      
      inline def setCollisionQueryRange(value: Double): Self = StObject.set(x, "collisionQueryRange", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setMaxAcceleration(value: Double): Self = StObject.set(x, "maxAcceleration", value.asInstanceOf[js.Any])
      
      inline def setMaxSpeed(value: Double): Self = StObject.set(x, "maxSpeed", value.asInstanceOf[js.Any])
      
      inline def setPathOptimizationRange(value: Double): Self = StObject.set(x, "pathOptimizationRange", value.asInstanceOf[js.Any])
      
      inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      inline def setReachRadius(value: Double): Self = StObject.set(x, "reachRadius", value.asInstanceOf[js.Any])
      
      inline def setReachRadiusUndefined: Self = StObject.set(x, "reachRadius", js.undefined)
      
      inline def setSeparationWeight(value: Double): Self = StObject.set(x, "separationWeight", value.asInstanceOf[js.Any])
    }
  }
  
  trait ICrowd extends StObject {
    
    /**
      * Add a new agent to the crowd with the specified parameter a corresponding transformNode.
      * You can attach anything to that node. The node position is updated in the scene update tick.
      * @param pos world position that will be constrained by the navigation mesh
      * @param parameters agent parameters
      * @param transform hooked to the agent that will be update by the scene
      * @returns agent index
      */
    def addAgent(pos: Vector3, parameters: IAgentParameters, transform: TransformNode): Double
    
    /**
      * Asks a particular agent to go to a destination. That destination is constrained by the navigation mesh
      * @param index agent index returned by addAgent
      * @param destination targeted world position
      */
    def agentGoto(index: Double, destination: Vector3): Unit
    
    /**
      * Teleport the agent to a new position
      * @param index agent index returned by addAgent
      * @param destination targeted world position
      */
    def agentTeleport(index: Double, destination: Vector3): Unit
    
    /**
      * Release all resources
      */
    def dispose(): Unit
    
    /**
      * Gets the agent next target point on the path
      * @param index agent index returned by addAgent
      * @returns world space position
      */
    def getAgentNextTargetPath(index: Double): Vector3
    
    /**
      * Gets the agent next target point on the path
      * @param index agent index returned by addAgent
      * @param result output world space position
      */
    def getAgentNextTargetPathToRef(index: Double, result: Vector3): Unit
    
    /**
      * Returns the agent position in world space
      * @param index agent index returned by addAgent
      * @returns world space position
      */
    def getAgentPosition(index: Double): Vector3
    
    /**
      * Gets the agent position result in world space
      * @param index agent index returned by addAgent
      * @param result output world space position
      */
    def getAgentPositionToRef(index: Double, result: Vector3): Unit
    
    /**
      * Gets the agent state
      * @param index agent index returned by addAgent
      * @returns agent state
      */
    def getAgentState(index: Double): Double
    
    /**
      * Gets the agent velocity in world space
      * @param index agent index returned by addAgent
      * @returns world space velocity
      */
    def getAgentVelocity(index: Double): Vector3
    
    /**
      * Gets the agent velocity result in world space
      * @param index agent index returned by addAgent
      * @param result output world space velocity
      */
    def getAgentVelocityToRef(index: Double, result: Vector3): Unit
    
    /**
      * get the list of all agents attached to this crowd
      * @returns list of agent indices
      */
    def getAgents(): js.Array[Double]
    
    /**
      * Get the next corner points composing the path (max 4 points)
      * @param index agent index returned by addAgent
      * @returns array containing world position composing the path
      */
    def getCorners(index: Double): js.Array[Vector3]
    
    /**
      * Get the Bounding box extent specified by setDefaultQueryExtent
      * @returns the box extent values
      */
    def getDefaultQueryExtent(): Vector3
    
    /**
      * Get the Bounding box extent result specified by setDefaultQueryExtent
      * @param result output the box extent values
      */
    def getDefaultQueryExtentToRef(result: Vector3): Unit
    
    /**
      * returns true if the agent in over an off mesh link connection
      * @param index agent index returned by addAgent
      * @returns true if over an off mesh link connection
      */
    def overOffmeshConnection(index: Double): Boolean
    
    /**
      * remove a particular agent previously created
      * @param index agent index returned by addAgent
      */
    def removeAgent(index: Double): Unit
    
    /**
      * Set the Bounding box extent for doing spatial queries (getClosestPoint, getRandomPointAround, ...)
      * The queries will try to find a solution within those bounds
      * default is (1,1,1)
      * @param extent x,y,z value that define the extent around the queries point of reference
      */
    def setDefaultQueryExtent(extent: Vector3): Unit
    
    /**
      * Tick update done by the Scene. Agent position/velocity/acceleration is updated by this function
      * @param deltaTime in seconds
      */
    def update(deltaTime: Double): Unit
    
    /**
      * Update agent parameters
      * @param index agent index returned by addAgent
      * @param parameters agent parameters
      */
    def updateAgentParameters(index: Double, parameters: IAgentParameters): Unit
  }
  object ICrowd {
    
    inline def apply(
      addAgent: (Vector3, IAgentParameters, TransformNode) => Double,
      agentGoto: (Double, Vector3) => Unit,
      agentTeleport: (Double, Vector3) => Unit,
      dispose: () => Unit,
      getAgentNextTargetPath: Double => Vector3,
      getAgentNextTargetPathToRef: (Double, Vector3) => Unit,
      getAgentPosition: Double => Vector3,
      getAgentPositionToRef: (Double, Vector3) => Unit,
      getAgentState: Double => Double,
      getAgentVelocity: Double => Vector3,
      getAgentVelocityToRef: (Double, Vector3) => Unit,
      getAgents: () => js.Array[Double],
      getCorners: Double => js.Array[Vector3],
      getDefaultQueryExtent: () => Vector3,
      getDefaultQueryExtentToRef: Vector3 => Unit,
      overOffmeshConnection: Double => Boolean,
      removeAgent: Double => Unit,
      setDefaultQueryExtent: Vector3 => Unit,
      update: Double => Unit,
      updateAgentParameters: (Double, IAgentParameters) => Unit
    ): ICrowd = {
      val __obj = js.Dynamic.literal(addAgent = js.Any.fromFunction3(addAgent), agentGoto = js.Any.fromFunction2(agentGoto), agentTeleport = js.Any.fromFunction2(agentTeleport), dispose = js.Any.fromFunction0(dispose), getAgentNextTargetPath = js.Any.fromFunction1(getAgentNextTargetPath), getAgentNextTargetPathToRef = js.Any.fromFunction2(getAgentNextTargetPathToRef), getAgentPosition = js.Any.fromFunction1(getAgentPosition), getAgentPositionToRef = js.Any.fromFunction2(getAgentPositionToRef), getAgentState = js.Any.fromFunction1(getAgentState), getAgentVelocity = js.Any.fromFunction1(getAgentVelocity), getAgentVelocityToRef = js.Any.fromFunction2(getAgentVelocityToRef), getAgents = js.Any.fromFunction0(getAgents), getCorners = js.Any.fromFunction1(getCorners), getDefaultQueryExtent = js.Any.fromFunction0(getDefaultQueryExtent), getDefaultQueryExtentToRef = js.Any.fromFunction1(getDefaultQueryExtentToRef), overOffmeshConnection = js.Any.fromFunction1(overOffmeshConnection), removeAgent = js.Any.fromFunction1(removeAgent), setDefaultQueryExtent = js.Any.fromFunction1(setDefaultQueryExtent), update = js.Any.fromFunction1(update), updateAgentParameters = js.Any.fromFunction2(updateAgentParameters))
      __obj.asInstanceOf[ICrowd]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ICrowd] (val x: Self) extends AnyVal {
      
      inline def setAddAgent(value: (Vector3, IAgentParameters, TransformNode) => Double): Self = StObject.set(x, "addAgent", js.Any.fromFunction3(value))
      
      inline def setAgentGoto(value: (Double, Vector3) => Unit): Self = StObject.set(x, "agentGoto", js.Any.fromFunction2(value))
      
      inline def setAgentTeleport(value: (Double, Vector3) => Unit): Self = StObject.set(x, "agentTeleport", js.Any.fromFunction2(value))
      
      inline def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
      
      inline def setGetAgentNextTargetPath(value: Double => Vector3): Self = StObject.set(x, "getAgentNextTargetPath", js.Any.fromFunction1(value))
      
      inline def setGetAgentNextTargetPathToRef(value: (Double, Vector3) => Unit): Self = StObject.set(x, "getAgentNextTargetPathToRef", js.Any.fromFunction2(value))
      
      inline def setGetAgentPosition(value: Double => Vector3): Self = StObject.set(x, "getAgentPosition", js.Any.fromFunction1(value))
      
      inline def setGetAgentPositionToRef(value: (Double, Vector3) => Unit): Self = StObject.set(x, "getAgentPositionToRef", js.Any.fromFunction2(value))
      
      inline def setGetAgentState(value: Double => Double): Self = StObject.set(x, "getAgentState", js.Any.fromFunction1(value))
      
      inline def setGetAgentVelocity(value: Double => Vector3): Self = StObject.set(x, "getAgentVelocity", js.Any.fromFunction1(value))
      
      inline def setGetAgentVelocityToRef(value: (Double, Vector3) => Unit): Self = StObject.set(x, "getAgentVelocityToRef", js.Any.fromFunction2(value))
      
      inline def setGetAgents(value: () => js.Array[Double]): Self = StObject.set(x, "getAgents", js.Any.fromFunction0(value))
      
      inline def setGetCorners(value: Double => js.Array[Vector3]): Self = StObject.set(x, "getCorners", js.Any.fromFunction1(value))
      
      inline def setGetDefaultQueryExtent(value: () => Vector3): Self = StObject.set(x, "getDefaultQueryExtent", js.Any.fromFunction0(value))
      
      inline def setGetDefaultQueryExtentToRef(value: Vector3 => Unit): Self = StObject.set(x, "getDefaultQueryExtentToRef", js.Any.fromFunction1(value))
      
      inline def setOverOffmeshConnection(value: Double => Boolean): Self = StObject.set(x, "overOffmeshConnection", js.Any.fromFunction1(value))
      
      inline def setRemoveAgent(value: Double => Unit): Self = StObject.set(x, "removeAgent", js.Any.fromFunction1(value))
      
      inline def setSetDefaultQueryExtent(value: Vector3 => Unit): Self = StObject.set(x, "setDefaultQueryExtent", js.Any.fromFunction1(value))
      
      inline def setUpdate(value: Double => Unit): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
      
      inline def setUpdateAgentParameters(value: (Double, IAgentParameters) => Unit): Self = StObject.set(x, "updateAgentParameters", js.Any.fromFunction2(value))
    }
  }
  
  trait INavMeshParameters extends StObject {
    
    /**
      * The size of the non-navigable border around the heightfield.
      */
    var borderSize: js.UndefOr[Double] = js.undefined
    
    /**
      * The y-axis cell size to use for fields. [Limit: > 0] [Units: wu]
      */
    var ch: Double
    
    /**
      * The xz-plane cell size to use for fields. [Limit: > 0] [Units: wu]
      */
    var cs: Double
    
    /**
      * Sets the sampling distance to use when generating the detail mesh.
      * (For height detail only.) [Limits: 0 or >= 0.9] [Units: wu]
      */
    var detailSampleDist: Double
    
    /**
      * The maximum distance the detail mesh surface should deviate from heightfield
      * data. (For height detail only.) [Limit: >=0] [Units: wu]
      */
    var detailSampleMaxError: Double
    
    /**
      * The maximum allowed length for contour edges along the border of the mesh. [Limit: >=0] [Units: vx]
      */
    var maxEdgeLen: Double
    
    /**
      * The maximum distance a simplified contour's border edges should deviate
      * the original raw contour. [Limit: >=0] [Units: vx]
      */
    var maxSimplificationError: Double
    
    /**
      * The maximum number of vertices allowed for polygons generated during the
      * contour to polygon conversion process. [Limit: >= 3]
      */
    var maxVertsPerPoly: Double
    
    /**
      * Any regions with a span count smaller than this value will, if possible,
      * be merged with larger regions. [Limit: >=0] [Units: vx]
      */
    var mergeRegionArea: Double
    
    /**
      * The minimum number of cells allowed to form isolated island areas. [Limit: >=0] [Units: vx]
      */
    var minRegionArea: Double
    
    /**
      * If using obstacles, the navmesh must be subdivided internaly by tiles.
      * This member defines the tile cube side length in world units.
      * If no obstacles are needed, leave it undefined or 0.
      */
    var tileSize: js.UndefOr[Double] = js.undefined
    
    /**
      * Maximum ledge height that is considered to still be traversable. [Limit: >=0] [Units: vx]
      */
    var walkableClimb: Double
    
    /**
      * Minimum floor to 'ceiling' height that will still allow the floor area to
      * be considered walkable. [Limit: >= 3] [Units: vx]
      */
    var walkableHeight: Double
    
    /**
      * The distance to erode/shrink the walkable area of the heightfield away from
      * obstructions.  [Limit: >=0] [Units: vx]
      */
    var walkableRadius: Double
    
    /**
      * The maximum slope that is considered walkable. [Limits: 0 <= value < 90] [Units: Degrees]
      */
    var walkableSlopeAngle: Double
  }
  object INavMeshParameters {
    
    inline def apply(
      ch: Double,
      cs: Double,
      detailSampleDist: Double,
      detailSampleMaxError: Double,
      maxEdgeLen: Double,
      maxSimplificationError: Double,
      maxVertsPerPoly: Double,
      mergeRegionArea: Double,
      minRegionArea: Double,
      walkableClimb: Double,
      walkableHeight: Double,
      walkableRadius: Double,
      walkableSlopeAngle: Double
    ): INavMeshParameters = {
      val __obj = js.Dynamic.literal(ch = ch.asInstanceOf[js.Any], cs = cs.asInstanceOf[js.Any], detailSampleDist = detailSampleDist.asInstanceOf[js.Any], detailSampleMaxError = detailSampleMaxError.asInstanceOf[js.Any], maxEdgeLen = maxEdgeLen.asInstanceOf[js.Any], maxSimplificationError = maxSimplificationError.asInstanceOf[js.Any], maxVertsPerPoly = maxVertsPerPoly.asInstanceOf[js.Any], mergeRegionArea = mergeRegionArea.asInstanceOf[js.Any], minRegionArea = minRegionArea.asInstanceOf[js.Any], walkableClimb = walkableClimb.asInstanceOf[js.Any], walkableHeight = walkableHeight.asInstanceOf[js.Any], walkableRadius = walkableRadius.asInstanceOf[js.Any], walkableSlopeAngle = walkableSlopeAngle.asInstanceOf[js.Any])
      __obj.asInstanceOf[INavMeshParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: INavMeshParameters] (val x: Self) extends AnyVal {
      
      inline def setBorderSize(value: Double): Self = StObject.set(x, "borderSize", value.asInstanceOf[js.Any])
      
      inline def setBorderSizeUndefined: Self = StObject.set(x, "borderSize", js.undefined)
      
      inline def setCh(value: Double): Self = StObject.set(x, "ch", value.asInstanceOf[js.Any])
      
      inline def setCs(value: Double): Self = StObject.set(x, "cs", value.asInstanceOf[js.Any])
      
      inline def setDetailSampleDist(value: Double): Self = StObject.set(x, "detailSampleDist", value.asInstanceOf[js.Any])
      
      inline def setDetailSampleMaxError(value: Double): Self = StObject.set(x, "detailSampleMaxError", value.asInstanceOf[js.Any])
      
      inline def setMaxEdgeLen(value: Double): Self = StObject.set(x, "maxEdgeLen", value.asInstanceOf[js.Any])
      
      inline def setMaxSimplificationError(value: Double): Self = StObject.set(x, "maxSimplificationError", value.asInstanceOf[js.Any])
      
      inline def setMaxVertsPerPoly(value: Double): Self = StObject.set(x, "maxVertsPerPoly", value.asInstanceOf[js.Any])
      
      inline def setMergeRegionArea(value: Double): Self = StObject.set(x, "mergeRegionArea", value.asInstanceOf[js.Any])
      
      inline def setMinRegionArea(value: Double): Self = StObject.set(x, "minRegionArea", value.asInstanceOf[js.Any])
      
      inline def setTileSize(value: Double): Self = StObject.set(x, "tileSize", value.asInstanceOf[js.Any])
      
      inline def setTileSizeUndefined: Self = StObject.set(x, "tileSize", js.undefined)
      
      inline def setWalkableClimb(value: Double): Self = StObject.set(x, "walkableClimb", value.asInstanceOf[js.Any])
      
      inline def setWalkableHeight(value: Double): Self = StObject.set(x, "walkableHeight", value.asInstanceOf[js.Any])
      
      inline def setWalkableRadius(value: Double): Self = StObject.set(x, "walkableRadius", value.asInstanceOf[js.Any])
      
      inline def setWalkableSlopeAngle(value: Double): Self = StObject.set(x, "walkableSlopeAngle", value.asInstanceOf[js.Any])
    }
  }
  
  trait INavigationEnginePlugin extends StObject {
    
    /**
      * Creates an oriented box obstacle and add it to the navigation
      * @param position world position
      * @param extent box size
      * @param angle angle in radians of the box orientation on Y axis
      * @returns the obstacle freshly created
      */
    def addBoxObstacle(position: Vector3, extent: Vector3, angle: Double): IObstacle
    
    /**
      * Creates a cylinder obstacle and add it to the navigation
      * @param position world position
      * @param radius cylinder radius
      * @param height cylinder height
      * @returns the obstacle freshly created
      */
    def addCylinderObstacle(position: Vector3, radius: Double, height: Double): IObstacle
    
    /**
      * build the navmesh from a previously saved state using getNavmeshData
      * @param data the Uint8Array returned by getNavmeshData
      */
    def buildFromNavmeshData(data: js.typedarray.Uint8Array): Unit
    
    /**
      * Compute a navigation path from start to end. Returns an empty array if no path can be computed
      * @param start world position
      * @param end world position
      * @returns array containing world position composing the path
      */
    def computePath(start: Vector3, end: Vector3): js.Array[Vector3]
    
    /**
      * Create a new Crowd so you can add agents
      * @param maxAgents the maximum agent count in the crowd
      * @param maxAgentRadius the maximum radius an agent can have
      * @param scene to attach the crowd to
      * @returns the crowd you can add agents to
      */
    def createCrowd(maxAgents: Double, maxAgentRadius: Double, scene: Scene): ICrowd
    
    /**
      * Create a navigation mesh debug mesh
      * @param scene is where the mesh will be added
      * @returns debug display mesh
      */
    def createDebugNavMesh(scene: Scene): Mesh
    
    /**
      * Creates a navigation mesh
      * @param meshes array of all the geometry used to compute the navigation mesh
      * @param parameters bunch of parameters used to filter geometry
      */
    def createNavMesh(meshes: js.Array[Mesh], parameters: INavMeshParameters): Unit
    
    /**
      * Release all resources
      */
    def dispose(): Unit
    
    /**
      * Get a navigation mesh constrained position, closest to the parameter position
      * @param position world position
      * @returns the closest point to position constrained by the navigation mesh
      */
    def getClosestPoint(position: Vector3): Vector3
    
    /**
      * Get a navigation mesh constrained position, closest to the parameter position
      * @param position world position
      * @param result output the closest point to position constrained by the navigation mesh
      */
    def getClosestPointToRef(position: Vector3, result: Vector3): Unit
    
    /**
      * Get the Bounding box extent specified by setDefaultQueryExtent
      * @returns the box extent values
      */
    def getDefaultQueryExtent(): Vector3
    
    /**
      * Get the Bounding box extent result specified by setDefaultQueryExtent
      * @param result output the box extent values
      */
    def getDefaultQueryExtentToRef(result: Vector3): Unit
    
    /**
      * Get the maximum number of iterations per navigation tick update
      * @returns the maximum number of iterations
      */
    def getMaximumSubStepCount(): Double
    
    /**
      * returns the navmesh data that can be used later. The navmesh must be built before retrieving the data
      * @returns data the Uint8Array that can be saved and reused
      */
    def getNavmeshData(): js.typedarray.Uint8Array
    
    /**
      * Get a navigation mesh constrained position, within a particular radius
      * @param position world position
      * @param maxRadius the maximum distance to the constrained world position
      * @returns the closest point to position constrained by the navigation mesh
      */
    def getRandomPointAround(position: Vector3, maxRadius: Double): Vector3
    
    /**
      * Get a navigation mesh constrained position, within a particular radius
      * @param position world position
      * @param maxRadius the maximum distance to the constrained world position
      * @param result output the closest point to position constrained by the navigation mesh
      */
    def getRandomPointAroundToRef(position: Vector3, maxRadius: Double, result: Vector3): Unit
    
    /**
      * Get the time step of the navigation tick update.
      * @returns the current time step
      */
    def getTimeStep(): Double
    
    /**
      * If this plugin is supported
      * @returns true if plugin is supported
      */
    def isSupported(): Boolean
    
    /**
      * Compute the final position from a segment made of destination-position
      * @param position world position
      * @param destination world position
      * @returns the resulting point along the navmesh
      */
    def moveAlong(position: Vector3, destination: Vector3): Vector3
    
    /**
      * Compute the final position from a segment made of destination-position
      * @param position world position
      * @param destination world position
      * @param result output the resulting point along the navmesh
      */
    def moveAlongToRef(position: Vector3, destination: Vector3, result: Vector3): Unit
    
    /**
      * plugin name
      */
    var name: String
    
    /**
      * Removes an obstacle created by addCylinderObstacle or addBoxObstacle
      * @param obstacle obstacle to remove from the navigation
      */
    def removeObstacle(obstacle: IObstacle): Unit
    
    /**
      * Set the Bounding box extent for doing spatial queries (getClosestPoint, getRandomPointAround, ...)
      * The queries will try to find a solution within those bounds
      * default is (1,1,1)
      * @param extent x,y,z value that define the extent around the queries point of reference
      */
    def setDefaultQueryExtent(extent: Vector3): Unit
    
    /**
      * If delta time in navigation tick update is greater than the time step
      * a number of sub iterations are done. If more iterations are need to reach deltatime
      * they will be discarded.
      * A value of 0 will set to no maximum and update will use as many substeps as needed
      * @param newStepCount the maximum number of iterations
      */
    def setMaximumSubStepCount(newStepCount: Double): Unit
    
    /**
      * Set the time step of the navigation tick update.
      * Default is 1/60.
      * A value of 0 will disable fixed time update
      * @param newTimeStep the new timestep to apply to this world.
      */
    def setTimeStep(newTimeStep: Double): Unit
  }
  object INavigationEnginePlugin {
    
    inline def apply(
      addBoxObstacle: (Vector3, Vector3, Double) => IObstacle,
      addCylinderObstacle: (Vector3, Double, Double) => IObstacle,
      buildFromNavmeshData: js.typedarray.Uint8Array => Unit,
      computePath: (Vector3, Vector3) => js.Array[Vector3],
      createCrowd: (Double, Double, Scene) => ICrowd,
      createDebugNavMesh: Scene => Mesh,
      createNavMesh: (js.Array[Mesh], INavMeshParameters) => Unit,
      dispose: () => Unit,
      getClosestPoint: Vector3 => Vector3,
      getClosestPointToRef: (Vector3, Vector3) => Unit,
      getDefaultQueryExtent: () => Vector3,
      getDefaultQueryExtentToRef: Vector3 => Unit,
      getMaximumSubStepCount: () => Double,
      getNavmeshData: () => js.typedarray.Uint8Array,
      getRandomPointAround: (Vector3, Double) => Vector3,
      getRandomPointAroundToRef: (Vector3, Double, Vector3) => Unit,
      getTimeStep: () => Double,
      isSupported: () => Boolean,
      moveAlong: (Vector3, Vector3) => Vector3,
      moveAlongToRef: (Vector3, Vector3, Vector3) => Unit,
      name: String,
      removeObstacle: IObstacle => Unit,
      setDefaultQueryExtent: Vector3 => Unit,
      setMaximumSubStepCount: Double => Unit,
      setTimeStep: Double => Unit
    ): INavigationEnginePlugin = {
      val __obj = js.Dynamic.literal(addBoxObstacle = js.Any.fromFunction3(addBoxObstacle), addCylinderObstacle = js.Any.fromFunction3(addCylinderObstacle), buildFromNavmeshData = js.Any.fromFunction1(buildFromNavmeshData), computePath = js.Any.fromFunction2(computePath), createCrowd = js.Any.fromFunction3(createCrowd), createDebugNavMesh = js.Any.fromFunction1(createDebugNavMesh), createNavMesh = js.Any.fromFunction2(createNavMesh), dispose = js.Any.fromFunction0(dispose), getClosestPoint = js.Any.fromFunction1(getClosestPoint), getClosestPointToRef = js.Any.fromFunction2(getClosestPointToRef), getDefaultQueryExtent = js.Any.fromFunction0(getDefaultQueryExtent), getDefaultQueryExtentToRef = js.Any.fromFunction1(getDefaultQueryExtentToRef), getMaximumSubStepCount = js.Any.fromFunction0(getMaximumSubStepCount), getNavmeshData = js.Any.fromFunction0(getNavmeshData), getRandomPointAround = js.Any.fromFunction2(getRandomPointAround), getRandomPointAroundToRef = js.Any.fromFunction3(getRandomPointAroundToRef), getTimeStep = js.Any.fromFunction0(getTimeStep), isSupported = js.Any.fromFunction0(isSupported), moveAlong = js.Any.fromFunction2(moveAlong), moveAlongToRef = js.Any.fromFunction3(moveAlongToRef), name = name.asInstanceOf[js.Any], removeObstacle = js.Any.fromFunction1(removeObstacle), setDefaultQueryExtent = js.Any.fromFunction1(setDefaultQueryExtent), setMaximumSubStepCount = js.Any.fromFunction1(setMaximumSubStepCount), setTimeStep = js.Any.fromFunction1(setTimeStep))
      __obj.asInstanceOf[INavigationEnginePlugin]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: INavigationEnginePlugin] (val x: Self) extends AnyVal {
      
      inline def setAddBoxObstacle(value: (Vector3, Vector3, Double) => IObstacle): Self = StObject.set(x, "addBoxObstacle", js.Any.fromFunction3(value))
      
      inline def setAddCylinderObstacle(value: (Vector3, Double, Double) => IObstacle): Self = StObject.set(x, "addCylinderObstacle", js.Any.fromFunction3(value))
      
      inline def setBuildFromNavmeshData(value: js.typedarray.Uint8Array => Unit): Self = StObject.set(x, "buildFromNavmeshData", js.Any.fromFunction1(value))
      
      inline def setComputePath(value: (Vector3, Vector3) => js.Array[Vector3]): Self = StObject.set(x, "computePath", js.Any.fromFunction2(value))
      
      inline def setCreateCrowd(value: (Double, Double, Scene) => ICrowd): Self = StObject.set(x, "createCrowd", js.Any.fromFunction3(value))
      
      inline def setCreateDebugNavMesh(value: Scene => Mesh): Self = StObject.set(x, "createDebugNavMesh", js.Any.fromFunction1(value))
      
      inline def setCreateNavMesh(value: (js.Array[Mesh], INavMeshParameters) => Unit): Self = StObject.set(x, "createNavMesh", js.Any.fromFunction2(value))
      
      inline def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
      
      inline def setGetClosestPoint(value: Vector3 => Vector3): Self = StObject.set(x, "getClosestPoint", js.Any.fromFunction1(value))
      
      inline def setGetClosestPointToRef(value: (Vector3, Vector3) => Unit): Self = StObject.set(x, "getClosestPointToRef", js.Any.fromFunction2(value))
      
      inline def setGetDefaultQueryExtent(value: () => Vector3): Self = StObject.set(x, "getDefaultQueryExtent", js.Any.fromFunction0(value))
      
      inline def setGetDefaultQueryExtentToRef(value: Vector3 => Unit): Self = StObject.set(x, "getDefaultQueryExtentToRef", js.Any.fromFunction1(value))
      
      inline def setGetMaximumSubStepCount(value: () => Double): Self = StObject.set(x, "getMaximumSubStepCount", js.Any.fromFunction0(value))
      
      inline def setGetNavmeshData(value: () => js.typedarray.Uint8Array): Self = StObject.set(x, "getNavmeshData", js.Any.fromFunction0(value))
      
      inline def setGetRandomPointAround(value: (Vector3, Double) => Vector3): Self = StObject.set(x, "getRandomPointAround", js.Any.fromFunction2(value))
      
      inline def setGetRandomPointAroundToRef(value: (Vector3, Double, Vector3) => Unit): Self = StObject.set(x, "getRandomPointAroundToRef", js.Any.fromFunction3(value))
      
      inline def setGetTimeStep(value: () => Double): Self = StObject.set(x, "getTimeStep", js.Any.fromFunction0(value))
      
      inline def setIsSupported(value: () => Boolean): Self = StObject.set(x, "isSupported", js.Any.fromFunction0(value))
      
      inline def setMoveAlong(value: (Vector3, Vector3) => Vector3): Self = StObject.set(x, "moveAlong", js.Any.fromFunction2(value))
      
      inline def setMoveAlongToRef(value: (Vector3, Vector3, Vector3) => Unit): Self = StObject.set(x, "moveAlongToRef", js.Any.fromFunction3(value))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setRemoveObstacle(value: IObstacle => Unit): Self = StObject.set(x, "removeObstacle", js.Any.fromFunction1(value))
      
      inline def setSetDefaultQueryExtent(value: Vector3 => Unit): Self = StObject.set(x, "setDefaultQueryExtent", js.Any.fromFunction1(value))
      
      inline def setSetMaximumSubStepCount(value: Double => Unit): Self = StObject.set(x, "setMaximumSubStepCount", js.Any.fromFunction1(value))
      
      inline def setSetTimeStep(value: Double => Unit): Self = StObject.set(x, "setTimeStep", js.Any.fromFunction1(value))
    }
  }
  
  trait IObstacle extends StObject
}
