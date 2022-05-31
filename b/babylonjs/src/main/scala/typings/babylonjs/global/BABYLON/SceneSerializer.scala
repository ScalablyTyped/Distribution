package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.SceneSerializer")
@js.native
class SceneSerializer ()
  extends StObject
     with typings.babylonjs.BABYLON.SceneSerializer
/* static members */
object SceneSerializer {
  
  @JSGlobal("BABYLON.SceneSerializer")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Clear cache used by a previous serialization
    */
  inline def ClearCache(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ClearCache")().asInstanceOf[Unit]
  
  /**
    * Serialize a scene into a JSON compatible object
    * @param scene defines the scene to serialize
    * @returns a JSON compatible object
    */
  inline def Serialize(scene: typings.babylonjs.BABYLON.Scene): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("Serialize")(scene.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  /**
    * Serialize a mesh into a JSON compatible object
    * @param toSerialize defines the mesh to serialize
    * @param withParents defines if parents must be serialized as well
    * @param withChildren defines if children must be serialized as well
    * @returns a JSON compatible object
    */
  inline def SerializeMesh(toSerialize: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("SerializeMesh")(toSerialize.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  inline def SerializeMesh(toSerialize: js.Any, withParents: Boolean): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("SerializeMesh")(toSerialize.asInstanceOf[js.Any], withParents.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def SerializeMesh(toSerialize: js.Any, withParents: Boolean, withChildren: Boolean): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("SerializeMesh")(toSerialize.asInstanceOf[js.Any], withParents.asInstanceOf[js.Any], withChildren.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def SerializeMesh(toSerialize: js.Any, withParents: Unit, withChildren: Boolean): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("SerializeMesh")(toSerialize.asInstanceOf[js.Any], withParents.asInstanceOf[js.Any], withChildren.asInstanceOf[js.Any])).asInstanceOf[js.Any]
}
