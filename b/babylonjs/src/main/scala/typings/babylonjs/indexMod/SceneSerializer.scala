package typings.babylonjs.indexMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "SceneSerializer")
@js.native
class SceneSerializer ()
  extends typings.babylonjs.miscIndexMod.SceneSerializer
/* static members */
object SceneSerializer {
  
  @JSImport("babylonjs/index", "SceneSerializer")
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
  inline def Serialize(scene: typings.babylonjs.sceneMod.Scene): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("Serialize")(scene.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
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
