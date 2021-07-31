package typings.carbonComponentsReact

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.HTMLAttributes
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object numberInputSkeletonMod extends Shortcut {
  
  @JSImport("carbon-components-react/lib/components/NumberInput/NumberInput.Skeleton", JSImport.Default)
  @js.native
  val default: FC[NumberInputSkeletonProps] = js.native
  
  trait NumberInputSkeletonProps
    extends StObject
       with HTMLAttributes[HTMLDivElement] {
    
    var hideLabel: js.UndefOr[Boolean] = js.undefined
  }
  object NumberInputSkeletonProps {
    
    @scala.inline
    def apply(): NumberInputSkeletonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NumberInputSkeletonProps]
    }
    
    @scala.inline
    implicit class NumberInputSkeletonPropsMutableBuilder[Self <: NumberInputSkeletonProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHideLabel(value: Boolean): Self = StObject.set(x, "hideLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideLabelUndefined: Self = StObject.set(x, "hideLabel", js.undefined)
    }
  }
  
  type _To = FC[NumberInputSkeletonProps]
  
  /* This means you don't have to write `default`, but can instead just say `numberInputSkeletonMod.foo` */
  override def _to: FC[NumberInputSkeletonProps] = default
}
