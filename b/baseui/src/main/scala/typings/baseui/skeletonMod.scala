package typings.baseui

import typings.baseui.skeletonSkeletonMod.default
import typings.baseui.skeletonTypesMod.SkeletonProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object skeletonMod {
  
  @JSImport("baseui/skeleton", "Skeleton")
  @js.native
  open class Skeleton () extends default
  object Skeleton {
    
    @JSImport("baseui/skeleton", "Skeleton")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("baseui/skeleton", "Skeleton.defaultProps")
    @js.native
    def defaultProps: SkeletonProps = js.native
    inline def defaultProps_=(x: SkeletonProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  type SkeletonPropsT = SkeletonProps
}
