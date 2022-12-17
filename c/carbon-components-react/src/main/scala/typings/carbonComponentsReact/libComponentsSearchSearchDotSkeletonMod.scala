package typings.carbonComponentsReact

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.HTMLAttributes
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsSearchSearchDotSkeletonMod extends Shortcut {
  
  @JSImport("carbon-components-react/lib/components/Search/Search.Skeleton", JSImport.Default)
  @js.native
  val default: FC[SearchSkeletonProps] = js.native
  
  trait SearchSkeletonProps
    extends StObject
       with HTMLAttributes[HTMLDivElement] {
    
    var small: js.UndefOr[Boolean] = js.undefined
  }
  object SearchSkeletonProps {
    
    inline def apply(): SearchSkeletonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SearchSkeletonProps]
    }
    
    extension [Self <: SearchSkeletonProps](x: Self) {
      
      inline def setSmall(value: Boolean): Self = StObject.set(x, "small", value.asInstanceOf[js.Any])
      
      inline def setSmallUndefined: Self = StObject.set(x, "small", js.undefined)
    }
  }
  
  type _To = FC[SearchSkeletonProps]
  
  /* This means you don't have to write `default`, but can instead just say `libComponentsSearchSearchDotSkeletonMod.foo` */
  override def _to: FC[SearchSkeletonProps] = default
}
