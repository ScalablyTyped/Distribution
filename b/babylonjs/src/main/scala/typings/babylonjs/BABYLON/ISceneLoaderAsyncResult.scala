package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISceneLoaderAsyncResult extends StObject {
  
  /**
    * The array of loaded animation groups
    */
  val animationGroups: js.Array[AnimationGroup]
  
  /**
    * The array of loaded geometries
    */
  val geometries: js.Array[Geometry]
  
  /**
    * The array of loaded lights
    */
  val lights: js.Array[Light]
  
  /**
    * The array of loaded meshes
    */
  val meshes: js.Array[AbstractMesh]
  
  /**
    * The array of loaded particle systems
    */
  val particleSystems: js.Array[IParticleSystem]
  
  /**
    * The array of loaded skeletons
    */
  val skeletons: js.Array[Skeleton]
  
  /**
    * The array of loaded transform nodes
    */
  val transformNodes: js.Array[TransformNode]
}
object ISceneLoaderAsyncResult {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: ISceneLoaderAsyncResult] (val x: Self) extends AnyVal {
    
    inline def setAnimationGroups(value: js.Array[AnimationGroup]): Self = StObject.set(x, "animationGroups", value.asInstanceOf[js.Any])
    
    inline def setAnimationGroupsVarargs(value: AnimationGroup*): Self = StObject.set(x, "animationGroups", js.Array(value*))
    
    inline def setGeometries(value: js.Array[Geometry]): Self = StObject.set(x, "geometries", value.asInstanceOf[js.Any])
    
    inline def setGeometriesVarargs(value: Geometry*): Self = StObject.set(x, "geometries", js.Array(value*))
    
    inline def setLights(value: js.Array[Light]): Self = StObject.set(x, "lights", value.asInstanceOf[js.Any])
    
    inline def setLightsVarargs(value: Light*): Self = StObject.set(x, "lights", js.Array(value*))
    
    inline def setMeshes(value: js.Array[AbstractMesh]): Self = StObject.set(x, "meshes", value.asInstanceOf[js.Any])
    
    inline def setMeshesVarargs(value: AbstractMesh*): Self = StObject.set(x, "meshes", js.Array(value*))
    
    inline def setParticleSystems(value: js.Array[IParticleSystem]): Self = StObject.set(x, "particleSystems", value.asInstanceOf[js.Any])
    
    inline def setParticleSystemsVarargs(value: IParticleSystem*): Self = StObject.set(x, "particleSystems", js.Array(value*))
    
    inline def setSkeletons(value: js.Array[Skeleton]): Self = StObject.set(x, "skeletons", value.asInstanceOf[js.Any])
    
    inline def setSkeletonsVarargs(value: Skeleton*): Self = StObject.set(x, "skeletons", js.Array(value*))
    
    inline def setTransformNodes(value: js.Array[TransformNode]): Self = StObject.set(x, "transformNodes", value.asInstanceOf[js.Any])
    
    inline def setTransformNodesVarargs(value: TransformNode*): Self = StObject.set(x, "transformNodes", js.Array(value*))
  }
}
