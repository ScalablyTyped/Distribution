package typings.blackEngine

import typings.blackEngine.componentMod.Component
import typings.blackEngine.matrixMod.Matrix
import typings.blackEngine.vectorMod.Vector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object colliderMod {
  
  @JSImport("black-engine/colliders/Collider", "Collider")
  @js.native
  open class Collider () extends Component {
    
    def containsPoint(point: Vector): Boolean = js.native
    
    /* private */ var mCenter: Any = js.native
    
    /* private */ var mChanged: Any = js.native
    
    /* private */ var mMax: Any = js.native
    
    /* private */ var mMin: Any = js.native
    
    def refresh(transform: Matrix, position: Vector): Unit = js.native
  }
}
