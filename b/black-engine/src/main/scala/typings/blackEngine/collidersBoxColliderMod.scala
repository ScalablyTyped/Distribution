package typings.blackEngine

import typings.blackEngine.collidersColliderMod.Collider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object collidersBoxColliderMod {
  
  @JSImport("black-engine/colliders/BoxCollider", "BoxCollider")
  @js.native
  open class BoxCollider protected () extends Collider {
    def this(x: Double, y: Double, width: Double, height: Double) = this()
    
    /* private */ var mLocalCenter: Any = js.native
    
    /* private */ var mLocalMax: Any = js.native
    
    /* private */ var mLocalMin: Any = js.native
    
    /* private */ var mNormals: Any = js.native
    
    /* private */ var mRect: Any = js.native
    
    /* private */ var mVertices: Any = js.native
    
    def refresh(transform: Any, position: Any): Unit = js.native
    
    def set(x: Double, y: Double, width: Double, height: Double): BoxCollider = js.native
  }
}
