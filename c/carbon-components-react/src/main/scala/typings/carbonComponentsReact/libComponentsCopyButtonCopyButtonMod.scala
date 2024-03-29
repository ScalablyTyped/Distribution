package typings.carbonComponentsReact

import org.scalablytyped.runtime.Shortcut
import typings.carbonComponentsReact.libComponentsCopyCopyMod.CopyProps
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsCopyButtonCopyButtonMod extends Shortcut {
  
  @JSImport("carbon-components-react/lib/components/CopyButton/CopyButton", JSImport.Default)
  @js.native
  val default: FC[CopyButtonProps] = js.native
  
  trait CopyButtonProps
    extends StObject
       with CopyProps {
    
    var iconDescription: js.UndefOr[String] = js.undefined
  }
  object CopyButtonProps {
    
    inline def apply(): CopyButtonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CopyButtonProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CopyButtonProps] (val x: Self) extends AnyVal {
      
      inline def setIconDescription(value: String): Self = StObject.set(x, "iconDescription", value.asInstanceOf[js.Any])
      
      inline def setIconDescriptionUndefined: Self = StObject.set(x, "iconDescription", js.undefined)
    }
  }
  
  type _To = FC[CopyButtonProps]
  
  /* This means you don't have to write `default`, but can instead just say `libComponentsCopyButtonCopyButtonMod.foo` */
  override def _to: FC[CopyButtonProps] = default
}
