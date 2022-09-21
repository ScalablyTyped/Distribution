package typings.babylonjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "SceneSerializer")
@js.native
open class SceneSerializer ()
  extends typings.babylonjs.legacyMod.SceneSerializer
/* static members */
object SceneSerializer {
  
  @JSImport("babylonjs", "SceneSerializer")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Clear cache used by a previous serialization
    */
  inline def ClearCache(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ClearCache")().asInstanceOf[Unit]
  
  /**
    * Serialize a scene into a JSON compatible object
    * Note that if the current engine does not support synchronous texture reading (like WebGPU), you should use SerializeAsync instead
    * as else you may not retrieve the proper base64 encoded texture data (when using the Texture.ForceSerializeBuffers flag)
    * @param scene defines the scene to serialize
    * @returns a JSON compatible object
    */
  inline def Serialize(scene: typings.babylonjs.sceneMod.Scene): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("Serialize")(scene.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  /**
    * Serialize a scene into a JSON compatible object
    * @param scene defines the scene to serialize
    * @returns a JSON promise compatible object
    */
  inline def SerializeAsync(scene: typings.babylonjs.sceneMod.Scene): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("SerializeAsync")(scene.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  
  /**
    * Serialize a mesh into a JSON compatible object
    * @param toSerialize defines the mesh to serialize
    * @param withParents defines if parents must be serialized as well
    * @param withChildren defines if children must be serialized as well
    * @returns a JSON compatible object
    */
  inline def SerializeMesh(toSerialize: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("SerializeMesh")(toSerialize.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def SerializeMesh(toSerialize: Any, withParents: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("SerializeMesh")(toSerialize.asInstanceOf[js.Any], withParents.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def SerializeMesh(toSerialize: Any, withParents: Boolean, withChildren: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("SerializeMesh")(toSerialize.asInstanceOf[js.Any], withParents.asInstanceOf[js.Any], withChildren.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def SerializeMesh(toSerialize: Any, withParents: Unit, withChildren: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("SerializeMesh")(toSerialize.asInstanceOf[js.Any], withParents.asInstanceOf[js.Any], withChildren.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  @JSImport("babylonjs", "SceneSerializer._CollectPromises")
  @js.native
  def _CollectPromises: Any = js.native
  inline def _CollectPromises_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_CollectPromises")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs", "SceneSerializer._Serialize")
  @js.native
  def _Serialize: Any = js.native
  inline def _Serialize_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_Serialize")(x.asInstanceOf[js.Any])
}
