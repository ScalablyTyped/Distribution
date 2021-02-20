package typings.blueprintjsTable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object directionMod {
  
  @js.native
  sealed trait Direction extends StObject
  @JSImport("@blueprintjs/table/lib/esm/common/direction", "Direction")
  @js.native
  object Direction extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Direction with String] = js.native
    
    @js.native
    sealed trait DOWN extends Direction
    /* "down" */ val DOWN: typings.blueprintjsTable.directionMod.Direction.DOWN with String = js.native
    
    @js.native
    sealed trait LEFT extends Direction
    /* "left" */ val LEFT: typings.blueprintjsTable.directionMod.Direction.LEFT with String = js.native
    
    @js.native
    sealed trait RIGHT extends Direction
    /* "right" */ val RIGHT: typings.blueprintjsTable.directionMod.Direction.RIGHT with String = js.native
    
    @js.native
    sealed trait UP extends Direction
    /* "up" */ val UP: typings.blueprintjsTable.directionMod.Direction.UP with String = js.native
  }
}
