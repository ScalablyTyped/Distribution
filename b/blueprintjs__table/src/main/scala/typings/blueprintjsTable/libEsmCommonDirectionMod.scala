package typings.blueprintjsTable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmCommonDirectionMod {
  
  @js.native
  sealed trait Direction extends StObject
  @JSImport("@blueprintjs/table/lib/esm/common/direction", "Direction")
  @js.native
  object Direction extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Direction & String] = js.native
    
    @js.native
    sealed trait DOWN
      extends StObject
         with Direction
    /* "down" */ val DOWN: typings.blueprintjsTable.libEsmCommonDirectionMod.Direction.DOWN & String = js.native
    
    @js.native
    sealed trait LEFT
      extends StObject
         with Direction
    /* "left" */ val LEFT: typings.blueprintjsTable.libEsmCommonDirectionMod.Direction.LEFT & String = js.native
    
    @js.native
    sealed trait RIGHT
      extends StObject
         with Direction
    /* "right" */ val RIGHT: typings.blueprintjsTable.libEsmCommonDirectionMod.Direction.RIGHT & String = js.native
    
    @js.native
    sealed trait UP
      extends StObject
         with Direction
    /* "up" */ val UP: typings.blueprintjsTable.libEsmCommonDirectionMod.Direction.UP & String = js.native
  }
}
