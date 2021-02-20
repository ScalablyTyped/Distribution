package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISceneLoaderAsyncResult extends StObject {
  
  /**
    * The array of loaded animation groups
    */
  val animationGroups: js.Array[AnimationGroup] = js.native
  
  /**
    * The array of loaded geometries
    */
  val geometries: js.Array[Geometry] = js.native
  
  /**
    * The array of loaded lights
    */
  val lights: js.Array[Light] = js.native
  
  /**
    * The array of loaded meshes
    */
  val meshes: js.Array[AbstractMesh] = js.native
  
  /**
    * The array of loaded particle systems
    */
  val particleSystems: js.Array[IParticleSystem] = js.native
  
  /**
    * The array of loaded skeletons
    */
  val skeletons: js.Array[Skeleton] = js.native
  
  /**
    * The array of loaded transform nodes
    */
  val transformNodes: js.Array[TransformNode] = js.native
}
object ISceneLoaderAsyncResult {
  
  @scala.inline
  def apply(
    animationGroups: js.Array[AnimationGroup],
    geometries: js.Array[Geometry],
    lights: js.Array[Light],
    meshes: js.Array[AbstractMesh],
    particleSystems: js.Array[IParticleSystem],
    skeletons: js.Array[Skeleton],
    transformNodes: js.Array[TransformNode]
  ): ISceneLoaderAsyncResult = {
    val __obj = js.Dynamic.literal(animationGroups = animationGroups.asInstanceOf[js.Any], geometries = geometries.asInstanceOf[js.Any], lights = lights.asInstanceOf[js.Any], meshes = meshes.asInstanceOf[js.Any], particleSystems = particleSystems.asInstanceOf[js.Any], skeletons = skeletons.asInstanceOf[js.Any], transformNodes = transformNodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISceneLoaderAsyncResult]
  }
  
  @scala.inline
  implicit class ISceneLoaderAsyncResultMutableBuilder[Self <: ISceneLoaderAsyncResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimationGroups(value: js.Array[AnimationGroup]): Self = StObject.set(x, "animationGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationGroupsVarargs(value: AnimationGroup*): Self = StObject.set(x, "animationGroups", js.Array(value :_*))
    
    @scala.inline
    def setGeometries(value: js.Array[Geometry]): Self = StObject.set(x, "geometries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeometriesVarargs(value: Geometry*): Self = StObject.set(x, "geometries", js.Array(value :_*))
    
    @scala.inline
    def setLights(value: js.Array[Light]): Self = StObject.set(x, "lights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLightsVarargs(value: Light*): Self = StObject.set(x, "lights", js.Array(value :_*))
    
    @scala.inline
    def setMeshes(value: js.Array[AbstractMesh]): Self = StObject.set(x, "meshes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeshesVarargs(value: AbstractMesh*): Self = StObject.set(x, "meshes", js.Array(value :_*))
    
    @scala.inline
    def setParticleSystems(value: js.Array[IParticleSystem]): Self = StObject.set(x, "particleSystems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParticleSystemsVarargs(value: IParticleSystem*): Self = StObject.set(x, "particleSystems", js.Array(value :_*))
    
    @scala.inline
    def setSkeletons(value: js.Array[Skeleton]): Self = StObject.set(x, "skeletons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkeletonsVarargs(value: Skeleton*): Self = StObject.set(x, "skeletons", js.Array(value :_*))
    
    @scala.inline
    def setTransformNodes(value: js.Array[TransformNode]): Self = StObject.set(x, "transformNodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformNodesVarargs(value: TransformNode*): Self = StObject.set(x, "transformNodes", js.Array(value :_*))
  }
}
