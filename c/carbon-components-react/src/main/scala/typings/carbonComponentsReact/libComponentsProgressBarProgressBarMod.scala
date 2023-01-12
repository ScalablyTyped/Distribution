package typings.carbonComponentsReact

import org.scalablytyped.runtime.Shortcut
import typings.carbonComponentsReact.carbonComponentsReactStrings.big
import typings.carbonComponentsReact.carbonComponentsReactStrings.small
import typings.react.mod.FC
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsProgressBarProgressBarMod extends Shortcut {
  
  @JSImport("carbon-components-react/lib/components/ProgressBar/ProgressBar", JSImport.Default)
  @js.native
  val default: FC[ProgressBarProps] = js.native
  
  trait ProgressBarProps extends StObject {
    
    var className: js.UndefOr[String | Null] = js.undefined
    
    var helperText: js.UndefOr[ReactNode] = js.undefined
    
    var hideLabel: js.UndefOr[Boolean | Null] = js.undefined
    
    var label: String
    
    var max: js.UndefOr[Double | Null] = js.undefined
    
    var size: js.UndefOr[small | big] = js.undefined
    
    var value: js.UndefOr[Double | Null] = js.undefined
  }
  object ProgressBarProps {
    
    inline def apply(label: String): ProgressBarProps = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProgressBarProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ProgressBarProps] (val x: Self) extends AnyVal {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameNull: Self = StObject.set(x, "className", null)
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setHelperText(value: ReactNode): Self = StObject.set(x, "helperText", value.asInstanceOf[js.Any])
      
      inline def setHelperTextUndefined: Self = StObject.set(x, "helperText", js.undefined)
      
      inline def setHideLabel(value: Boolean): Self = StObject.set(x, "hideLabel", value.asInstanceOf[js.Any])
      
      inline def setHideLabelNull: Self = StObject.set(x, "hideLabel", null)
      
      inline def setHideLabelUndefined: Self = StObject.set(x, "hideLabel", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxNull: Self = StObject.set(x, "max", null)
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setSize(value: small | big): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type _To = FC[ProgressBarProps]
  
  /* This means you don't have to write `default`, but can instead just say `libComponentsProgressBarProgressBarMod.foo` */
  override def _to: FC[ProgressBarProps] = default
}
