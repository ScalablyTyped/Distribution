package typings.carbonComponentsReact

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.HTMLAttributes
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsDatePickerDatePickerDotSkeletonMod extends Shortcut {
  
  @JSImport("carbon-components-react/lib/components/DatePicker/DatePicker.Skeleton", JSImport.Default)
  @js.native
  val default: FC[DatePickerSkeletonProps] = js.native
  
  trait DatePickerSkeletonProps
    extends StObject
       with HTMLAttributes[HTMLDivElement] {
    
    var range: js.UndefOr[Boolean] = js.undefined
  }
  object DatePickerSkeletonProps {
    
    inline def apply(): DatePickerSkeletonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DatePickerSkeletonProps]
    }
    
    extension [Self <: DatePickerSkeletonProps](x: Self) {
      
      inline def setRange(value: Boolean): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    }
  }
  
  type _To = FC[DatePickerSkeletonProps]
  
  /* This means you don't have to write `default`, but can instead just say `libComponentsDatePickerDatePickerDotSkeletonMod.foo` */
  override def _to: FC[DatePickerSkeletonProps] = default
}
