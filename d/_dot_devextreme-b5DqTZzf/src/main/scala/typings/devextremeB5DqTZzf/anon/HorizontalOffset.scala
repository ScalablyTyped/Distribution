package typings.devextremeB5DqTZzf.anon

import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.ellipsis
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.hide
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.none
import typings.devextremeB5DqTZzf.mod.DevExpress.viz.dxSankeyNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HorizontalOffset extends StObject {
  
  /**
    * Configures the labels&apos; borders.
    */
  var border: js.UndefOr[ColorVisible] = js.undefined
  
  /**
    * Customizes the labels&apos; texts.
    */
  var customizeText: js.UndefOr[js.Function1[/* itemInfo */ dxSankeyNode, String]] = js.undefined
  
  /**
    * Specifies the labels&apos; font properties.
    */
  var font: js.UndefOr[typings.devextremeB5DqTZzf.mod.DevExpress.viz.Font] = js.undefined
  
  /**
    * Moves the labels horizontally from their initial positions.
    */
  var horizontalOffset: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies how to arrange labels when there is insufficient space to display them all.
    */
  var overlappingBehavior: js.UndefOr[ellipsis | hide | none] = js.undefined
  
  /**
    * Configures the labels&apos; shadows.
    */
  var shadow: js.UndefOr[Blur] = js.undefined
  
  /**
    * Specifies whether to color labels in the nodes&apos; colors.
    */
  var useNodeColors: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Moves the labels vertically from their initial positions.
    */
  var verticalOffset: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies whether the labels are visible.
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}
object HorizontalOffset {
  
  inline def apply(): HorizontalOffset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HorizontalOffset]
  }
  
  extension [Self <: HorizontalOffset](x: Self) {
    
    inline def setBorder(value: ColorVisible): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    inline def setCustomizeText(value: /* itemInfo */ dxSankeyNode => String): Self = StObject.set(x, "customizeText", js.Any.fromFunction1(value))
    
    inline def setCustomizeTextUndefined: Self = StObject.set(x, "customizeText", js.undefined)
    
    inline def setFont(value: typings.devextremeB5DqTZzf.mod.DevExpress.viz.Font): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    inline def setHorizontalOffset(value: Double): Self = StObject.set(x, "horizontalOffset", value.asInstanceOf[js.Any])
    
    inline def setHorizontalOffsetUndefined: Self = StObject.set(x, "horizontalOffset", js.undefined)
    
    inline def setOverlappingBehavior(value: ellipsis | hide | none): Self = StObject.set(x, "overlappingBehavior", value.asInstanceOf[js.Any])
    
    inline def setOverlappingBehaviorUndefined: Self = StObject.set(x, "overlappingBehavior", js.undefined)
    
    inline def setShadow(value: Blur): Self = StObject.set(x, "shadow", value.asInstanceOf[js.Any])
    
    inline def setShadowUndefined: Self = StObject.set(x, "shadow", js.undefined)
    
    inline def setUseNodeColors(value: Boolean): Self = StObject.set(x, "useNodeColors", value.asInstanceOf[js.Any])
    
    inline def setUseNodeColorsUndefined: Self = StObject.set(x, "useNodeColors", js.undefined)
    
    inline def setVerticalOffset(value: Double): Self = StObject.set(x, "verticalOffset", value.asInstanceOf[js.Any])
    
    inline def setVerticalOffsetUndefined: Self = StObject.set(x, "verticalOffset", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
