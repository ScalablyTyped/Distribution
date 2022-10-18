package typings.babylonjs.anon

import typings.babylonjs.XRHandedness
import typings.babylonjs.meshesAbstractMeshMod.AbstractMesh
import typings.babylonjs.meshesInstancedMeshMod.InstancedMesh
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnablePhysics extends StObject {
  
  /**
    * Should each instance have its own physics impostor
    */
  var enablePhysics: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Should the meshes created be invisible (defaults to false).
    */
  var invisible: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Should the source mesh stay visible (defaults to false).
    */
  var keepOriginalVisible: js.UndefOr[Boolean] = js.undefined
  
  /**
    * This function will be called after a mesh was created for a specific joint.
    * Using this function you can either manipulate the instance or return a new mesh.
    * When returning a new mesh the instance created before will be disposed.
    * @param meshInstance An instance of the original joint mesh being used for the joint.
    * @param jointId The joint's index, see https://immersive-web.github.io/webxr-hand-input/#skeleton-joints-section for more info.
    * @param hand Which hand ("left", "right") the joint will be on.
    */
  var onHandJointMeshGenerated: js.UndefOr[
    js.Function3[
      /* meshInstance */ InstancedMesh, 
      /* jointId */ Double, 
      /* hand */ XRHandedness, 
      js.UndefOr[AbstractMesh]
    ]
  ] = js.undefined
  
  /**
    * If enabled, override default physics properties
    */
  var physicsProps: js.UndefOr[Restitution] = js.undefined
  
  /**
    * Scale factor for all joint meshes (defaults to 1)
    */
  var scaleFactor: js.UndefOr[Double] = js.undefined
  
  /**
    * A source mesh to be used to create instances. Defaults to an icosphere with two subdivisions and smooth lighting.
    * This mesh will be the source for all other (25) meshes.
    * It should have the general size of a single unit, as the instances will be scaled according to the provided radius.
    */
  var sourceMesh: js.UndefOr[typings.babylonjs.meshesMeshMod.Mesh] = js.undefined
}
object EnablePhysics {
  
  inline def apply(): EnablePhysics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnablePhysics]
  }
  
  extension [Self <: EnablePhysics](x: Self) {
    
    inline def setEnablePhysics(value: Boolean): Self = StObject.set(x, "enablePhysics", value.asInstanceOf[js.Any])
    
    inline def setEnablePhysicsUndefined: Self = StObject.set(x, "enablePhysics", js.undefined)
    
    inline def setInvisible(value: Boolean): Self = StObject.set(x, "invisible", value.asInstanceOf[js.Any])
    
    inline def setInvisibleUndefined: Self = StObject.set(x, "invisible", js.undefined)
    
    inline def setKeepOriginalVisible(value: Boolean): Self = StObject.set(x, "keepOriginalVisible", value.asInstanceOf[js.Any])
    
    inline def setKeepOriginalVisibleUndefined: Self = StObject.set(x, "keepOriginalVisible", js.undefined)
    
    inline def setOnHandJointMeshGenerated(
      value: (/* meshInstance */ InstancedMesh, /* jointId */ Double, /* hand */ XRHandedness) => js.UndefOr[AbstractMesh]
    ): Self = StObject.set(x, "onHandJointMeshGenerated", js.Any.fromFunction3(value))
    
    inline def setOnHandJointMeshGeneratedUndefined: Self = StObject.set(x, "onHandJointMeshGenerated", js.undefined)
    
    inline def setPhysicsProps(value: Restitution): Self = StObject.set(x, "physicsProps", value.asInstanceOf[js.Any])
    
    inline def setPhysicsPropsUndefined: Self = StObject.set(x, "physicsProps", js.undefined)
    
    inline def setScaleFactor(value: Double): Self = StObject.set(x, "scaleFactor", value.asInstanceOf[js.Any])
    
    inline def setScaleFactorUndefined: Self = StObject.set(x, "scaleFactor", js.undefined)
    
    inline def setSourceMesh(value: typings.babylonjs.meshesMeshMod.Mesh): Self = StObject.set(x, "sourceMesh", value.asInstanceOf[js.Any])
    
    inline def setSourceMeshUndefined: Self = StObject.set(x, "sourceMesh", js.undefined)
  }
}
