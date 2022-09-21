package typings.baseui

import typings.baseui.skeletonTypesMod.SkeletonProps
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object skeletonSkeletonMod {
  
  @JSImport("baseui/skeleton/skeleton", JSImport.Default)
  @js.native
  open class default () extends Skeleton
  object default {
    
    @JSImport("baseui/skeleton/skeleton", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("baseui/skeleton/skeleton", "default.defaultProps")
    @js.native
    def defaultProps: SkeletonProps = js.native
    inline def defaultProps_=(x: SkeletonProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Skeleton
    extends Component[SkeletonProps, js.Object, Any]
}
