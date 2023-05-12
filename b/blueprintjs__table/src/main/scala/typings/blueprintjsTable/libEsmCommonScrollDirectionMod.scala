package typings.blueprintjsTable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmCommonScrollDirectionMod {
  
  @js.native
  sealed trait ScrollDirection extends StObject
  @JSImport("@blueprintjs/table/lib/esm/common/scrollDirection", "ScrollDirection")
  @js.native
  object ScrollDirection extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ScrollDirection & String] = js.native
    
    @js.native
    sealed trait BOTTOM
      extends StObject
         with ScrollDirection
    /* "bottom" */ val BOTTOM: typings.blueprintjsTable.libEsmCommonScrollDirectionMod.ScrollDirection.BOTTOM & String = js.native
    
    @js.native
    sealed trait LEFT
      extends StObject
         with ScrollDirection
    /* "left" */ val LEFT: typings.blueprintjsTable.libEsmCommonScrollDirectionMod.ScrollDirection.LEFT & String = js.native
    
    @js.native
    sealed trait NONE
      extends StObject
         with ScrollDirection
    /* "none" */ val NONE: typings.blueprintjsTable.libEsmCommonScrollDirectionMod.ScrollDirection.NONE & String = js.native
    
    @js.native
    sealed trait RIGHT
      extends StObject
         with ScrollDirection
    /* "right" */ val RIGHT: typings.blueprintjsTable.libEsmCommonScrollDirectionMod.ScrollDirection.RIGHT & String = js.native
    
    @js.native
    sealed trait TOP
      extends StObject
         with ScrollDirection
    /* "top" */ val TOP: typings.blueprintjsTable.libEsmCommonScrollDirectionMod.ScrollDirection.TOP & String = js.native
  }
}
