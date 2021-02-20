package typings.babylonjs.babylonjsIndexMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object babylonjsMeshesAbstractMeshAugmentingMod {
  
  @js.native
  trait AbstractMesh extends StObject {
    
    /**
      * Object used to store instanced buffers defined by user
      * @see https://doc.babylonjs.com/how_to/how_to_use_instances#custom-buffers
      */
    var instancedBuffers: StringDictionary[js.Any] = js.native
  }
  object AbstractMesh {
    
    @scala.inline
    def apply(instancedBuffers: StringDictionary[js.Any]): typings.babylonjs.babylonjsIndexMod.babylonjsMeshesAbstractMeshAugmentingMod.AbstractMesh = {
      val __obj = js.Dynamic.literal(instancedBuffers = instancedBuffers.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.babylonjs.babylonjsIndexMod.babylonjsMeshesAbstractMeshAugmentingMod.AbstractMesh]
    }
    
    @scala.inline
    implicit class AbstractMeshMutableBuilder[Self <: typings.babylonjs.babylonjsIndexMod.babylonjsMeshesAbstractMeshAugmentingMod.AbstractMesh] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInstancedBuffers(value: StringDictionary[js.Any]): Self = StObject.set(x, "instancedBuffers", value.asInstanceOf[js.Any])
    }
  }
}
