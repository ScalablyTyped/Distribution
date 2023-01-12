package typings.baseui

import typings.baseui.anon.ActiveDisabled
import typings.baseui.baseuiStrings.button
import typings.baseui.baseuiStrings.div
import typings.styletronReact.libTypesMod.StyletronComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableStyledComponentsMod {
  
  @JSImport("baseui/table/styled-components", "StyledAction")
  @js.native
  val StyledAction: StyletronComponent[button, js.Object] = js.native
  
  @JSImport("baseui/table/styled-components", "StyledBody")
  @js.native
  val StyledBody: StyletronComponent[div, HorizontalStyleProps] = js.native
  
  @JSImport("baseui/table/styled-components", "StyledCell")
  @js.native
  val StyledCell: StyletronComponent[div, CellStyledProps] = js.native
  
  @JSImport("baseui/table/styled-components", "StyledFilterButton")
  @js.native
  val StyledFilterButton: StyletronComponent[button, ActiveDisabled] = js.native
  
  @JSImport("baseui/table/styled-components", "StyledFilterContent")
  @js.native
  val StyledFilterContent: StyletronComponent[div, js.Object] = js.native
  
  @JSImport("baseui/table/styled-components", "StyledFilterFooter")
  @js.native
  val StyledFilterFooter: StyletronComponent[div, js.Object] = js.native
  
  @JSImport("baseui/table/styled-components", "StyledFilterHeading")
  @js.native
  val StyledFilterHeading: StyletronComponent[div, js.Object] = js.native
  
  @JSImport("baseui/table/styled-components", "StyledHead")
  @js.native
  val StyledHead: StyletronComponent[div, HorizontalStyleProps] = js.native
  
  @JSImport("baseui/table/styled-components", "StyledHeadCell")
  @js.native
  val StyledHeadCell: StyletronComponent[div, HorizontalStyleProps] = js.native
  
  @JSImport("baseui/table/styled-components", "StyledRow")
  @js.native
  val StyledRow: StyletronComponent[div, js.Object] = js.native
  
  @JSImport("baseui/table/styled-components", "StyledSortableLabel")
  @js.native
  val StyledSortableLabel: StyletronComponent[button, js.Object] = js.native
  
  @JSImport("baseui/table/styled-components", "StyledTable")
  @js.native
  val StyledTable: StyletronComponent[div, js.Object] = js.native
  
  trait CellStyledProps extends StObject {
    
    @JSName("$striped")
    var $striped: js.UndefOr[Boolean] = js.undefined
  }
  object CellStyledProps {
    
    inline def apply(): CellStyledProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CellStyledProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CellStyledProps] (val x: Self) extends AnyVal {
      
      inline def set$striped(value: Boolean): Self = StObject.set(x, "$striped", value.asInstanceOf[js.Any])
      
      inline def set$stripedUndefined: Self = StObject.set(x, "$striped", js.undefined)
    }
  }
  
  trait HorizontalStyleProps extends StObject {
    
    @JSName("$cursor")
    var $cursor: js.UndefOr[String] = js.undefined
    
    @JSName("$width")
    var $width: js.UndefOr[String] = js.undefined
  }
  object HorizontalStyleProps {
    
    inline def apply(): HorizontalStyleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HorizontalStyleProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HorizontalStyleProps] (val x: Self) extends AnyVal {
      
      inline def set$cursor(value: String): Self = StObject.set(x, "$cursor", value.asInstanceOf[js.Any])
      
      inline def set$cursorUndefined: Self = StObject.set(x, "$cursor", js.undefined)
      
      inline def set$width(value: String): Self = StObject.set(x, "$width", value.asInstanceOf[js.Any])
      
      inline def set$widthUndefined: Self = StObject.set(x, "$width", js.undefined)
    }
  }
}
