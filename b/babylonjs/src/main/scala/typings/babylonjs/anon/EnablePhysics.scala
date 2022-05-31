package typings.babylonjs.anon

import typings.babylonjs.BABYLON.InstancedMesh
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnablePhysics extends StObject {
  
  /**
    * Should the default hand mesh be disabled. In this case, the spheres will be visible (unless set invisible).
    */
  var disableDefaultHandMesh: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Should each instance have its own physics impostor
    */
  var enablePhysics: js.UndefOr[Boolean] = js.undefined
  
  /**
    * a rigged hand-mesh that will be updated according to the XRHand data provided. This will override the default hand mesh
    */
  var handMeshes: js.UndefOr[LeftRight] = js.undefined
  
  /**
    * Should the meshes created be invisible (defaults to false)
    */
  var invisible: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Should the source mesh stay visible. Defaults to false
    */
  var keepOriginalVisible: js.UndefOr[Boolean] = js.undefined
  
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
  ] = js.undefined
  
  /**
    * If enabled, override default physics properties
    */
  var physicsProps: js.UndefOr[Restitution] = js.undefined
  
  /**
    * If a hand mesh was provided, this array will define what axis will update which node. This will override the default hand mesh
    */
  var rigMapping: js.UndefOr[Right] = js.undefined
  
  /**
    * Scale factor for all instances (defaults to 2)
    */
  var scaleFactor: js.UndefOr[Double] = js.undefined
  
  /**
    * A source mesh to be used to create instances. Defaults to a sphere.
    * This mesh will be the source for all other (25) meshes.
    * It should have the general size of a single unit, as the instances will be scaled according to the provided radius
    */
  var sourceMesh: js.UndefOr[typings.babylonjs.BABYLON.Mesh] = js.undefined
}
object EnablePhysics {
  
  inline def apply(): EnablePhysics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnablePhysics]
  }
  
  extension [Self <: EnablePhysics](x: Self) {
    
    inline def setDisableDefaultHandMesh(value: Boolean): Self = StObject.set(x, "disableDefaultHandMesh", value.asInstanceOf[js.Any])
    
    inline def setDisableDefaultHandMeshUndefined: Self = StObject.set(x, "disableDefaultHandMesh", js.undefined)
    
    inline def setEnablePhysics(value: Boolean): Self = StObject.set(x, "enablePhysics", value.asInstanceOf[js.Any])
    
    inline def setEnablePhysicsUndefined: Self = StObject.set(x, "enablePhysics", js.undefined)
    
    inline def setHandMeshes(value: LeftRight): Self = StObject.set(x, "handMeshes", value.asInstanceOf[js.Any])
    
    inline def setHandMeshesUndefined: Self = StObject.set(x, "handMeshes", js.undefined)
    
    inline def setInvisible(value: Boolean): Self = StObject.set(x, "invisible", value.asInstanceOf[js.Any])
    
    inline def setInvisibleUndefined: Self = StObject.set(x, "invisible", js.undefined)
    
    inline def setKeepOriginalVisible(value: Boolean): Self = StObject.set(x, "keepOriginalVisible", value.asInstanceOf[js.Any])
    
    inline def setKeepOriginalVisibleUndefined: Self = StObject.set(x, "keepOriginalVisible", js.undefined)
    
    inline def setOnHandJointMeshGenerated(
      value: (/* meshInstance */ InstancedMesh, /* jointId */ Double, /* controllerId */ String) => js.UndefOr[typings.babylonjs.BABYLON.Mesh]
    ): Self = StObject.set(x, "onHandJointMeshGenerated", js.Any.fromFunction3(value))
    
    inline def setOnHandJointMeshGeneratedUndefined: Self = StObject.set(x, "onHandJointMeshGenerated", js.undefined)
    
    inline def setPhysicsProps(value: Restitution): Self = StObject.set(x, "physicsProps", value.asInstanceOf[js.Any])
    
    inline def setPhysicsPropsUndefined: Self = StObject.set(x, "physicsProps", js.undefined)
    
    inline def setRigMapping(value: Right): Self = StObject.set(x, "rigMapping", value.asInstanceOf[js.Any])
    
    inline def setRigMappingUndefined: Self = StObject.set(x, "rigMapping", js.undefined)
    
    inline def setScaleFactor(value: Double): Self = StObject.set(x, "scaleFactor", value.asInstanceOf[js.Any])
    
    inline def setScaleFactorUndefined: Self = StObject.set(x, "scaleFactor", js.undefined)
    
    inline def setSourceMesh(value: typings.babylonjs.BABYLON.Mesh): Self = StObject.set(x, "sourceMesh", value.asInstanceOf[js.Any])
    
    inline def setSourceMeshUndefined: Self = StObject.set(x, "sourceMesh", js.undefined)
  }
}
