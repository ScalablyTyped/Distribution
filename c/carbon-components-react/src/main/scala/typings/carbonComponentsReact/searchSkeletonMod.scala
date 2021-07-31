package typings.carbonComponentsReact

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.HTMLAttributes
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object searchSkeletonMod extends Shortcut {
  
  @JSImport("carbon-components-react/lib/components/Search/Search.Skeleton", JSImport.Default)
  @js.native
  val default: FC[SearchSkeletonProps] = js.native
  
  trait SearchSkeletonProps
    extends StObject
       with HTMLAttributes[HTMLDivElement] {
    
    var small: js.UndefOr[Boolean] = js.undefined
  }
  object SearchSkeletonProps {
    
    @scala.inline
    def apply(): SearchSkeletonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SearchSkeletonProps]
    }
    
    @scala.inline
    implicit class SearchSkeletonPropsMutableBuilder[Self <: SearchSkeletonProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSmall(value: Boolean): Self = StObject.set(x, "small", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSmallUndefined: Self = StObject.set(x, "small", js.undefined)
    }
  }
  
  type _To = FC[SearchSkeletonProps]
  
  /* This means you don't have to write `default`, but can instead just say `searchSkeletonMod.foo` */
  override def _to: FC[SearchSkeletonProps] = default
}
