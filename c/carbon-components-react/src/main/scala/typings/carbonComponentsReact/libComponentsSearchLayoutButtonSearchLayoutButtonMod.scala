package typings.carbonComponentsReact

import typings.carbonComponentsReact.anon.Format
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsSearchLayoutButtonSearchLayoutButtonMod {
  
  /**
    * @deprecated
    */
  @JSImport("carbon-components-react/lib/components/SearchLayoutButton/SearchLayoutButton", JSImport.Default)
  @js.native
  open class default ()
    extends Component[SearchLayoutButtonProps, js.Object, Any]
  
  /**
    * @deprecated
    */
  type SearchLayoutButton = Component[SearchLayoutButtonProps, js.Object, Any]
  
  /* Rewritten from type alias, can be one of: 
    - typings.carbonComponentsReact.carbonComponentsReactStrings.grid
    - typings.carbonComponentsReact.carbonComponentsReactStrings.list
  */
  trait SearchLayoutButtonFormat extends StObject
  object SearchLayoutButtonFormat {
    
    inline def grid: typings.carbonComponentsReact.carbonComponentsReactStrings.grid = "grid".asInstanceOf[typings.carbonComponentsReact.carbonComponentsReactStrings.grid]
    
    inline def list: typings.carbonComponentsReact.carbonComponentsReactStrings.list = "list".asInstanceOf[typings.carbonComponentsReact.carbonComponentsReactStrings.list]
  }
  
  trait SearchLayoutButtonProps extends StObject {
    
    var format: js.UndefOr[SearchLayoutButtonFormat] = js.undefined
    
    var iconDescriptionGrid: js.UndefOr[String] = js.undefined
    
    var iconDescriptionList: js.UndefOr[String] = js.undefined
    
    var labelText: js.UndefOr[String] = js.undefined
    
    var onChangeFormat: js.UndefOr[js.Function1[/* data */ Format, Unit]] = js.undefined
  }
  object SearchLayoutButtonProps {
    
    inline def apply(): SearchLayoutButtonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SearchLayoutButtonProps]
    }
    
    extension [Self <: SearchLayoutButtonProps](x: Self) {
      
      inline def setFormat(value: SearchLayoutButtonFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setIconDescriptionGrid(value: String): Self = StObject.set(x, "iconDescriptionGrid", value.asInstanceOf[js.Any])
      
      inline def setIconDescriptionGridUndefined: Self = StObject.set(x, "iconDescriptionGrid", js.undefined)
      
      inline def setIconDescriptionList(value: String): Self = StObject.set(x, "iconDescriptionList", value.asInstanceOf[js.Any])
      
      inline def setIconDescriptionListUndefined: Self = StObject.set(x, "iconDescriptionList", js.undefined)
      
      inline def setLabelText(value: String): Self = StObject.set(x, "labelText", value.asInstanceOf[js.Any])
      
      inline def setLabelTextUndefined: Self = StObject.set(x, "labelText", js.undefined)
      
      inline def setOnChangeFormat(value: /* data */ Format => Unit): Self = StObject.set(x, "onChangeFormat", js.Any.fromFunction1(value))
      
      inline def setOnChangeFormatUndefined: Self = StObject.set(x, "onChangeFormat", js.undefined)
    }
  }
}
