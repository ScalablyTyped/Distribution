package typings.carbonComponentsReact

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.HTMLAttributes
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textInputSkeletonMod extends Shortcut {
  
  @JSImport("carbon-components-react/lib/components/TextInput/TextInput.Skeleton", JSImport.Default)
  @js.native
  val default: FC[TextInputSkeletonProps] = js.native
  
  trait TextInputSkeletonProps
    extends StObject
       with HTMLAttributes[HTMLDivElement] {
    
    var hideLabel: js.UndefOr[Boolean] = js.undefined
  }
  object TextInputSkeletonProps {
    
    inline def apply(): TextInputSkeletonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextInputSkeletonProps]
    }
    
    extension [Self <: TextInputSkeletonProps](x: Self) {
      
      inline def setHideLabel(value: Boolean): Self = StObject.set(x, "hideLabel", value.asInstanceOf[js.Any])
      
      inline def setHideLabelUndefined: Self = StObject.set(x, "hideLabel", js.undefined)
    }
  }
  
  type _To = FC[TextInputSkeletonProps]
  
  /* This means you don't have to write `default`, but can instead just say `textInputSkeletonMod.foo` */
  override def _to: FC[TextInputSkeletonProps] = default
}
