package typings.babylonjs.meshesIndexMod

import typings.babylonjs.materialsShaderMaterialMod.ShaderMaterial
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object babylonjsSceneAugmentingMod {
  
  trait Scene extends StObject {
    
    /** @internal */
    var _meshUVSpaceRendererShader: Nullable[ShaderMaterial]
    
    /** @internal (Backing field) */
    var _simplificationQueue: typings.babylonjs.meshesMeshSimplificationMod.SimplificationQueue
    
    /**
      * Gets or sets the simplification queue attached to the scene
      * @see https://doc.babylonjs.com/features/featuresDeepDive/mesh/simplifyingMeshes
      */
    var simplificationQueue: typings.babylonjs.meshesMeshSimplificationMod.SimplificationQueue
  }
  object Scene {
    
    inline def apply(
      _simplificationQueue: typings.babylonjs.meshesMeshSimplificationMod.SimplificationQueue,
      simplificationQueue: typings.babylonjs.meshesMeshSimplificationMod.SimplificationQueue
    ): Scene = {
      val __obj = js.Dynamic.literal(_simplificationQueue = _simplificationQueue.asInstanceOf[js.Any], simplificationQueue = simplificationQueue.asInstanceOf[js.Any], _meshUVSpaceRendererShader = null)
      __obj.asInstanceOf[Scene]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Scene] (val x: Self) extends AnyVal {
      
      inline def setSimplificationQueue(value: typings.babylonjs.meshesMeshSimplificationMod.SimplificationQueue): Self = StObject.set(x, "simplificationQueue", value.asInstanceOf[js.Any])
      
      inline def set_meshUVSpaceRendererShader(value: Nullable[ShaderMaterial]): Self = StObject.set(x, "_meshUVSpaceRendererShader", value.asInstanceOf[js.Any])
      
      inline def set_meshUVSpaceRendererShaderNull: Self = StObject.set(x, "_meshUVSpaceRendererShader", null)
      
      inline def set_simplificationQueue(value: typings.babylonjs.meshesMeshSimplificationMod.SimplificationQueue): Self = StObject.set(x, "_simplificationQueue", value.asInstanceOf[js.Any])
    }
  }
}
