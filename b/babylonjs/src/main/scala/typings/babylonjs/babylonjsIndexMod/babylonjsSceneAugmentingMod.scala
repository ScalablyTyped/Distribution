package typings.babylonjs.babylonjsIndexMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object babylonjsSceneAugmentingMod {
  
  trait Scene extends StObject {
    
    /** @hidden (Backing field) */
    var _simplificationQueue: typings.babylonjs.meshSimplificationMod.SimplificationQueue
    
    /**
      * Gets or sets the simplification queue attached to the scene
      * @see https://doc.babylonjs.com/how_to/in-browser_mesh_simplification
      */
    var simplificationQueue: typings.babylonjs.meshSimplificationMod.SimplificationQueue
  }
  object Scene {
    
    inline def apply(
      _simplificationQueue: typings.babylonjs.meshSimplificationMod.SimplificationQueue,
      simplificationQueue: typings.babylonjs.meshSimplificationMod.SimplificationQueue
    ): Scene = {
      val __obj = js.Dynamic.literal(_simplificationQueue = _simplificationQueue.asInstanceOf[js.Any], simplificationQueue = simplificationQueue.asInstanceOf[js.Any])
      __obj.asInstanceOf[Scene]
    }
    
    extension [Self <: Scene](x: Self) {
      
      inline def setSimplificationQueue(value: typings.babylonjs.meshSimplificationMod.SimplificationQueue): Self = StObject.set(x, "simplificationQueue", value.asInstanceOf[js.Any])
      
      inline def set_simplificationQueue(value: typings.babylonjs.meshSimplificationMod.SimplificationQueue): Self = StObject.set(x, "_simplificationQueue", value.asInstanceOf[js.Any])
    }
  }
}
