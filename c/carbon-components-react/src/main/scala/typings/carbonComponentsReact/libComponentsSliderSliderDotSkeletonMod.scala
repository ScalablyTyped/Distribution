package typings.carbonComponentsReact

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.HTMLAttributes
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsSliderSliderDotSkeletonMod extends Shortcut {
  
  @JSImport("carbon-components-react/lib/components/Slider/Slider.Skeleton", JSImport.Default)
  @js.native
  val default: FC[SliderSkeletonProps] = js.native
  
  trait SliderSkeletonProps
    extends StObject
       with HTMLAttributes[HTMLDivElement] {
    
    var hideLabel: js.UndefOr[Boolean] = js.undefined
  }
  object SliderSkeletonProps {
    
    inline def apply(): SliderSkeletonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SliderSkeletonProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SliderSkeletonProps] (val x: Self) extends AnyVal {
      
      inline def setHideLabel(value: Boolean): Self = StObject.set(x, "hideLabel", value.asInstanceOf[js.Any])
      
      inline def setHideLabelUndefined: Self = StObject.set(x, "hideLabel", js.undefined)
    }
  }
  
  type _To = FC[SliderSkeletonProps]
  
  /* This means you don't have to write `default`, but can instead just say `libComponentsSliderSliderDotSkeletonMod.foo` */
  override def _to: FC[SliderSkeletonProps] = default
}
