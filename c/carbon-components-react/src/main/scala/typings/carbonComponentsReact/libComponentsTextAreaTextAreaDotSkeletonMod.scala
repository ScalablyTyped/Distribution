package typings.carbonComponentsReact

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.HTMLAttributes
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsTextAreaTextAreaDotSkeletonMod extends Shortcut {
  
  @JSImport("carbon-components-react/lib/components/TextArea/TextArea.Skeleton", JSImport.Default)
  @js.native
  val default: FC[TextAreaSkeletonProps] = js.native
  
  trait TextAreaSkeletonProps
    extends StObject
       with HTMLAttributes[HTMLDivElement] {
    
    var hideLabel: js.UndefOr[Boolean] = js.undefined
  }
  object TextAreaSkeletonProps {
    
    inline def apply(): TextAreaSkeletonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextAreaSkeletonProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TextAreaSkeletonProps] (val x: Self) extends AnyVal {
      
      inline def setHideLabel(value: Boolean): Self = StObject.set(x, "hideLabel", value.asInstanceOf[js.Any])
      
      inline def setHideLabelUndefined: Self = StObject.set(x, "hideLabel", js.undefined)
    }
  }
  
  type _To = FC[TextAreaSkeletonProps]
  
  /* This means you don't have to write `default`, but can instead just say `libComponentsTextAreaTextAreaDotSkeletonMod.foo` */
  override def _to: FC[TextAreaSkeletonProps] = default
}
