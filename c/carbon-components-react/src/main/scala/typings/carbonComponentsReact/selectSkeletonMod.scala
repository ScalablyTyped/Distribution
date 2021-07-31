package typings.carbonComponentsReact

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.HTMLAttributes
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectSkeletonMod extends Shortcut {
  
  @JSImport("carbon-components-react/lib/components/Select/Select.Skeleton", JSImport.Default)
  @js.native
  val default: FC[SelectSkeletonProps] = js.native
  
  trait SelectSkeletonProps
    extends StObject
       with HTMLAttributes[HTMLDivElement] {
    
    var hideLabel: js.UndefOr[Boolean] = js.undefined
  }
  object SelectSkeletonProps {
    
    @scala.inline
    def apply(): SelectSkeletonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SelectSkeletonProps]
    }
    
    @scala.inline
    implicit class SelectSkeletonPropsMutableBuilder[Self <: SelectSkeletonProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHideLabel(value: Boolean): Self = StObject.set(x, "hideLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideLabelUndefined: Self = StObject.set(x, "hideLabel", js.undefined)
    }
  }
  
  type _To = FC[SelectSkeletonProps]
  
  /* This means you don't have to write `default`, but can instead just say `selectSkeletonMod.foo` */
  override def _to: FC[SelectSkeletonProps] = default
}
