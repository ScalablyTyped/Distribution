package typings.atBlueprintjsTable

import typings.atBlueprintjsTable.libEsmCommonDirectionMod.Direction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/table/lib/esm/common/direction", JSImport.Namespace)
@js.native
object libEsmCommonDirectionMod extends js.Object {
  @js.native
  sealed trait Direction extends js.Object
  
  @js.native
  object Direction extends js.Object {
    @js.native
    sealed trait DOWN extends Direction
    
    @js.native
    sealed trait LEFT extends Direction
    
    @js.native
    sealed trait RIGHT extends Direction
    
    @js.native
    sealed trait UP extends Direction
    
    /* "down" */ val DOWN: typings.atBlueprintjsTable.libEsmCommonDirectionMod.Direction.DOWN with String = js.native
    /* "left" */ val LEFT: typings.atBlueprintjsTable.libEsmCommonDirectionMod.Direction.LEFT with String = js.native
    /* "right" */ val RIGHT: typings.atBlueprintjsTable.libEsmCommonDirectionMod.Direction.RIGHT with String = js.native
    /* "up" */ val UP: typings.atBlueprintjsTable.libEsmCommonDirectionMod.Direction.UP with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Direction with String] = js.native
  }
  
}

