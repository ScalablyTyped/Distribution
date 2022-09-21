package typings.baseui

import typings.baseui.anon.StyledPropsitemanyundefin
import typings.baseui.baseuiStrings.a
import typings.baseui.baseuiStrings.compact
import typings.baseui.baseuiStrings.default_
import typings.baseui.baseuiStrings.div
import typings.baseui.baseuiStrings.h6
import typings.baseui.baseuiStrings.img
import typings.baseui.baseuiStrings.li_
import typings.baseui.baseuiStrings.p
import typings.baseui.baseuiStrings.ul
import typings.styletronReact.typesMod.StyletronComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object menuStyledComponentsMod {
  
  @JSImport("baseui/menu/styled-components", "StyledEmptyState")
  @js.native
  val StyledEmptyState: StyletronComponent[li_, StyledProps] = js.native
  
  @JSImport("baseui/menu/styled-components", "StyledList")
  @js.native
  val StyledList: StyletronComponent[ul, StyledProps] = js.native
  
  @JSImport("baseui/menu/styled-components", "StyledListItem")
  @js.native
  val StyledListItem: StyletronComponent[li_, StyledPropsitemanyundefin] = js.native
  
  @JSImport("baseui/menu/styled-components", "StyledListItemAnchor")
  @js.native
  val StyledListItemAnchor: StyletronComponent[a, StyledProps] = js.native
  
  @JSImport("baseui/menu/styled-components", "StyledListItemElement")
  @js.native
  val StyledListItemElement: StyletronComponent[li_, StyledProps] = js.native
  
  @JSImport("baseui/menu/styled-components", "StyledListItemProfile")
  @js.native
  val StyledListItemProfile: StyletronComponent[li_, StyledProps] = js.native
  
  @JSImport("baseui/menu/styled-components", "StyledMenuDivider")
  @js.native
  val StyledMenuDivider: StyletronComponent[li_, StyledProps] = js.native
  
  @JSImport("baseui/menu/styled-components", "StyledOptgroupHeader")
  @js.native
  val StyledOptgroupHeader: StyletronComponent[li_, js.Object] = js.native
  
  @JSImport("baseui/menu/styled-components", "StyledProfileBody")
  @js.native
  val StyledProfileBody: StyletronComponent[p, StyledProps] = js.native
  
  @JSImport("baseui/menu/styled-components", "StyledProfileImg")
  @js.native
  val StyledProfileImg: StyletronComponent[img, js.Object] = js.native
  
  @JSImport("baseui/menu/styled-components", "StyledProfileImgContainer")
  @js.native
  val StyledProfileImgContainer: StyletronComponent[div, js.Object] = js.native
  
  @JSImport("baseui/menu/styled-components", "StyledProfileLabelsContainer")
  @js.native
  val StyledProfileLabelsContainer: StyletronComponent[div, StyledProps] = js.native
  
  @JSImport("baseui/menu/styled-components", "StyledProfileSubtitle")
  @js.native
  val StyledProfileSubtitle: StyletronComponent[p, StyledProps] = js.native
  
  @JSImport("baseui/menu/styled-components", "StyledProfileTitle")
  @js.native
  val StyledProfileTitle: StyletronComponent[h6, StyledProps] = js.native
  
  trait StyledProps extends StObject {
    
    @JSName("$disabled")
    var $disabled: js.UndefOr[Boolean] = js.undefined
    
    @JSName("$isFocusVisible")
    var $isFocusVisible: js.UndefOr[Boolean] = js.undefined
    
    @JSName("$isFocused")
    var $isFocused: js.UndefOr[Boolean] = js.undefined
    
    @JSName("$isHighlighted")
    var $isHighlighted: js.UndefOr[Boolean] = js.undefined
    
    @JSName("$size")
    var $size: js.UndefOr[default_ | compact] = js.undefined
  }
  object StyledProps {
    
    inline def apply(): StyledProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StyledProps]
    }
    
    extension [Self <: StyledProps](x: Self) {
      
      inline def set$disabled(value: Boolean): Self = StObject.set(x, "$disabled", value.asInstanceOf[js.Any])
      
      inline def set$disabledUndefined: Self = StObject.set(x, "$disabled", js.undefined)
      
      inline def set$isFocusVisible(value: Boolean): Self = StObject.set(x, "$isFocusVisible", value.asInstanceOf[js.Any])
      
      inline def set$isFocusVisibleUndefined: Self = StObject.set(x, "$isFocusVisible", js.undefined)
      
      inline def set$isFocused(value: Boolean): Self = StObject.set(x, "$isFocused", value.asInstanceOf[js.Any])
      
      inline def set$isFocusedUndefined: Self = StObject.set(x, "$isFocused", js.undefined)
      
      inline def set$isHighlighted(value: Boolean): Self = StObject.set(x, "$isHighlighted", value.asInstanceOf[js.Any])
      
      inline def set$isHighlightedUndefined: Self = StObject.set(x, "$isHighlighted", js.undefined)
      
      inline def set$size(value: default_ | compact): Self = StObject.set(x, "$size", value.asInstanceOf[js.Any])
      
      inline def set$sizeUndefined: Self = StObject.set(x, "$size", js.undefined)
    }
  }
}
