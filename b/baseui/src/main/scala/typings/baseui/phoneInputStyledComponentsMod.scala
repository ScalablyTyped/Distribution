package typings.baseui

import typings.baseui.anon.Disabled
import typings.baseui.anon.HeightStylePropsdisabledb
import typings.baseui.baseuiStrings.div
import typings.baseui.baseuiStrings.li_
import typings.baseui.baseuiStrings.span
import typings.baseui.baseuiStrings.ul
import typings.baseui.phoneInputTypesMod.Size
import typings.baseui.selectTypesMod.SharedStylePropsArg
import typings.styletronReact.typesMod.StyletronComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object phoneInputStyledComponentsMod {
  
  @JSImport("baseui/phone-input/styled-components", "StyledCountrySelectContainer")
  @js.native
  val StyledCountrySelectContainer: StyletronComponent[div, js.Object] = js.native
  
  @JSImport("baseui/phone-input/styled-components", "StyledCountrySelectDropdownContainer")
  @js.native
  val StyledCountrySelectDropdownContainer: StyletronComponent[ul, HeightStylePropsdisabledb] = js.native
  
  @JSImport("baseui/phone-input/styled-components", "StyledCountrySelectDropdownDialcodeColumn")
  @js.native
  val StyledCountrySelectDropdownDialcodeColumn: StyletronComponent[div, js.Object] = js.native
  
  @JSImport("baseui/phone-input/styled-components", "StyledCountrySelectDropdownFlagColumn")
  @js.native
  val StyledCountrySelectDropdownFlagColumn: StyletronComponent[div, js.Object] = js.native
  
  @JSImport("baseui/phone-input/styled-components", "StyledCountrySelectDropdownListItem")
  @js.native
  val StyledCountrySelectDropdownListItem: StyletronComponent[li_, Disabled] = js.native
  
  @JSImport("baseui/phone-input/styled-components", "StyledCountrySelectDropdownListItemElement")
  @js.native
  val StyledCountrySelectDropdownListItemElement: StyletronComponent[li_, Disabled] = js.native
  
  @JSImport("baseui/phone-input/styled-components", "StyledCountrySelectDropdownNameColumn")
  @js.native
  val StyledCountrySelectDropdownNameColumn: StyletronComponent[div, js.Object] = js.native
  
  @JSImport("baseui/phone-input/styled-components", "StyledDialCode")
  @js.native
  val StyledDialCode: StyletronComponent[div, js.Object] = js.native
  
  @JSImport("baseui/phone-input/styled-components", "StyledFlagContainer")
  @js.native
  val StyledFlagContainer: StyletronComponent[span, SizeStyleProps] = js.native
  
  @JSImport("baseui/phone-input/styled-components", "StyledPhoneInputRoot")
  @js.native
  val StyledPhoneInputRoot: StyletronComponent[div, js.Object] = js.native
  
  @JSImport("baseui/phone-input/styled-components", "StyledRoot")
  @js.native
  val StyledRoot: StyletronComponent[div, SizeStyleProps & SharedStylePropsArg] = js.native
  
  trait HeightStyleProps extends StObject {
    
    @JSName("$height")
    var $height: String
  }
  object HeightStyleProps {
    
    inline def apply($height: String): HeightStyleProps = {
      val __obj = js.Dynamic.literal($height = $height.asInstanceOf[js.Any])
      __obj.asInstanceOf[HeightStyleProps]
    }
    
    extension [Self <: HeightStyleProps](x: Self) {
      
      inline def set$height(value: String): Self = StObject.set(x, "$height", value.asInstanceOf[js.Any])
    }
  }
  
  trait SizeStyleProps extends StObject {
    
    @JSName("$size")
    var $size: js.UndefOr[Size] = js.undefined
  }
  object SizeStyleProps {
    
    inline def apply(): SizeStyleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SizeStyleProps]
    }
    
    extension [Self <: SizeStyleProps](x: Self) {
      
      inline def set$size(value: Size): Self = StObject.set(x, "$size", value.asInstanceOf[js.Any])
      
      inline def set$sizeUndefined: Self = StObject.set(x, "$size", js.undefined)
    }
  }
}
