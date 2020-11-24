package typings.babylonjs.sceneLoaderMod

import typings.babylonjs.abstractMeshMod.AbstractMesh
import typings.babylonjs.animationGroupMod.AnimationGroup
import typings.babylonjs.geometryMod.Geometry
import typings.babylonjs.iparticlesystemMod.IParticleSystem
import typings.babylonjs.lightMod.Light
import typings.babylonjs.skeletonMod.Skeleton
import typings.babylonjs.transformNodeMod.TransformNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISceneLoaderAsyncResult extends js.Object {
  
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
  implicit class ISceneLoaderAsyncResultOps[Self <: ISceneLoaderAsyncResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAnimationGroupsVarargs(value: AnimationGroup*): Self = this.set("animationGroups", js.Array(value :_*))
    
    @scala.inline
    def setAnimationGroups(value: js.Array[AnimationGroup]): Self = this.set("animationGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeometriesVarargs(value: Geometry*): Self = this.set("geometries", js.Array(value :_*))
    
    @scala.inline
    def setGeometries(value: js.Array[Geometry]): Self = this.set("geometries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLightsVarargs(value: Light*): Self = this.set("lights", js.Array(value :_*))
    
    @scala.inline
    def setLights(value: js.Array[Light]): Self = this.set("lights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeshesVarargs(value: AbstractMesh*): Self = this.set("meshes", js.Array(value :_*))
    
    @scala.inline
    def setMeshes(value: js.Array[AbstractMesh]): Self = this.set("meshes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParticleSystemsVarargs(value: IParticleSystem*): Self = this.set("particleSystems", js.Array(value :_*))
    
    @scala.inline
    def setParticleSystems(value: js.Array[IParticleSystem]): Self = this.set("particleSystems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkeletonsVarargs(value: Skeleton*): Self = this.set("skeletons", js.Array(value :_*))
    
    @scala.inline
    def setSkeletons(value: js.Array[Skeleton]): Self = this.set("skeletons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformNodesVarargs(value: TransformNode*): Self = this.set("transformNodes", js.Array(value :_*))
    
    @scala.inline
    def setTransformNodes(value: js.Array[TransformNode]): Self = this.set("transformNodes", value.asInstanceOf[js.Any])
  }
}
