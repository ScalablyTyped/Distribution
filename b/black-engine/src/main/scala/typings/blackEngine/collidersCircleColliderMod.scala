package typings.blackEngine

import typings.blackEngine.collidersColliderMod.Collider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object collidersCircleColliderMod {
  
  @JSImport("black-engine/colliders/CircleCollider", "CircleCollider")
  @js.native
  open class CircleCollider protected () extends Collider {
    def this(x: Double, y: Double, radius: Double) = this()
    
    /* private */ var mCircle: Any = js.native
    
    /* private */ var mLocalCenter: Any = js.native
    
    /* private */ var mLocalMax: Any = js.native
    
    /* private */ var mLocalMin: Any = js.native
    
    /* private */ var mRadius: Any = js.native
    
    def refresh(transform: Any, position: Any): Unit = js.native
    
    def set(x: Double, y: Double, radius: Double): CircleCollider = js.native
  }
}
