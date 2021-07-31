package typings.carbonComponentsReact

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ButtonHTMLAttributes
import typings.react.mod.FC
import typings.std.HTMLButtonElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object searchFilterButtonSearchFilterButtonMod extends Shortcut {
  
  /**
    * @deprecated
    */
  @JSImport("carbon-components-react/lib/components/SearchFilterButton/SearchFilterButton", JSImport.Default)
  @js.native
  val default: FC[SearchFilterButtonProps] = js.native
  
  trait SearchFilterButtonProps
    extends StObject
       with ButtonHTMLAttributes[HTMLButtonElement] {
    
    var iconDescription: js.UndefOr[String] = js.undefined
    
    var labelText: js.UndefOr[String] = js.undefined
  }
  object SearchFilterButtonProps {
    
    @scala.inline
    def apply(): SearchFilterButtonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SearchFilterButtonProps]
    }
    
    @scala.inline
    implicit class SearchFilterButtonPropsMutableBuilder[Self <: SearchFilterButtonProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIconDescription(value: String): Self = StObject.set(x, "iconDescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconDescriptionUndefined: Self = StObject.set(x, "iconDescription", js.undefined)
      
      @scala.inline
      def setLabelText(value: String): Self = StObject.set(x, "labelText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelTextUndefined: Self = StObject.set(x, "labelText", js.undefined)
    }
  }
  
  type _To = FC[SearchFilterButtonProps]
  
  /* This means you don't have to write `default`, but can instead just say `searchFilterButtonSearchFilterButtonMod.foo` */
  override def _to: FC[SearchFilterButtonProps] = default
}
