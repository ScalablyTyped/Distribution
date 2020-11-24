package typings.babylonjs.anon

import typings.babylonjs.BABYLON.InstancedMesh
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnablePhysics extends js.Object {
  
  /**
    * Should the default hand mesh be disabled. In this case, the spheres will be visible (unless set invisible).
    */
  var disableDefaultHandMesh: js.UndefOr[Boolean] = js.native
  
  /**
    * Should each instance have its own physics impostor
    */
  var enablePhysics: js.UndefOr[Boolean] = js.native
  
  /**
    * a rigged hand-mesh that will be updated according to the XRHand data provided. This will override the default hand mesh
    */
  var handMeshes: js.UndefOr[LeftRight] = js.native
  
  /**
    * Should the meshes created be invisible (defaults to false)
    */
  var invisible: js.UndefOr[Boolean] = js.native
  
  /**
    * Should the source mesh stay visible. Defaults to false
    */
  var keepOriginalVisible: js.UndefOr[Boolean] = js.native
  
  /**
    * This function will be called after a mesh was created for a specific joint.
    * Using this function you can either manipulate the instance or return a new mesh.
    * When returning a new mesh the instance created before will be disposed
    */
  var onHandJointMeshGenerated: js.UndefOr[
    js.Function3[
      /* meshInstance */ InstancedMesh, 
      /* jointId */ Double, 
      /* controllerId */ String, 
      js.UndefOr[typings.babylonjs.BABYLON.Mesh]
    ]
  ] = js.native
  
  /**
    * If enabled, override default physics properties
    */
  var physicsProps: js.UndefOr[Restitution] = js.native
  
  /**
    * If a hand mesh was provided, this array will define what axis will update which node. This will override the default hand mesh
    */
  var rigMapping: js.UndefOr[Right] = js.native
  
  /**
    * Scale factor for all instances (defaults to 2)
    */
  var scaleFactor: js.UndefOr[Double] = js.native
  
  /**
    * A source mesh to be used to create instances. Defaults to a sphere.
    * This mesh will be the source for all other (25) meshes.
    * It should have the general size of a single unit, as the instances will be scaled according to the provided radius
    */
  var sourceMesh: js.UndefOr[typings.babylonjs.BABYLON.Mesh] = js.native
}
object EnablePhysics {
  
  @scala.inline
  def apply(): EnablePhysics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnablePhysics]
  }
  
  @scala.inline
  implicit class EnablePhysicsOps[Self <: EnablePhysics] (val x: Self) extends AnyVal {
    
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
    def setDisableDefaultHandMesh(value: Boolean): Self = this.set("disableDefaultHandMesh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableDefaultHandMesh: Self = this.set("disableDefaultHandMesh", js.undefined)
    
    @scala.inline
    def setEnablePhysics(value: Boolean): Self = this.set("enablePhysics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnablePhysics: Self = this.set("enablePhysics", js.undefined)
    
    @scala.inline
    def setHandMeshes(value: LeftRight): Self = this.set("handMeshes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHandMeshes: Self = this.set("handMeshes", js.undefined)
    
    @scala.inline
    def setInvisible(value: Boolean): Self = this.set("invisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvisible: Self = this.set("invisible", js.undefined)
    
    @scala.inline
    def setKeepOriginalVisible(value: Boolean): Self = this.set("keepOriginalVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeepOriginalVisible: Self = this.set("keepOriginalVisible", js.undefined)
    
    @scala.inline
    def setOnHandJointMeshGenerated(
      value: (/* meshInstance */ InstancedMesh, /* jointId */ Double, /* controllerId */ String) => js.UndefOr[typings.babylonjs.BABYLON.Mesh]
    ): Self = this.set("onHandJointMeshGenerated", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnHandJointMeshGenerated: Self = this.set("onHandJointMeshGenerated", js.undefined)
    
    @scala.inline
    def setPhysicsProps(value: Restitution): Self = this.set("physicsProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhysicsProps: Self = this.set("physicsProps", js.undefined)
    
    @scala.inline
    def setRigMapping(value: Right): Self = this.set("rigMapping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRigMapping: Self = this.set("rigMapping", js.undefined)
    
    @scala.inline
    def setScaleFactor(value: Double): Self = this.set("scaleFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScaleFactor: Self = this.set("scaleFactor", js.undefined)
    
    @scala.inline
    def setSourceMesh(value: typings.babylonjs.BABYLON.Mesh): Self = this.set("sourceMesh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceMesh: Self = this.set("sourceMesh", js.undefined)
  }
}
