package typings.blueprintjsTable

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/table/lib/esm/common/direction", JSImport.Namespace)
@js.native
object directionMod extends js.Object {
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
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Direction with String] = js.native
    /* "down" */ @js.native
    object DOWN extends TopLevel[DOWN with String]
    
    /* "left" */ @js.native
    object LEFT extends TopLevel[LEFT with String]
    
    /* "right" */ @js.native
    object RIGHT extends TopLevel[RIGHT with String]
    
    /* "up" */ @js.native
    object UP extends TopLevel[UP with String]
    
  }
  
}

