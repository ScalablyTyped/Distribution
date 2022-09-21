package typings.c3.mod

import typings.c3.anon.Anchor
import typings.c3.anon.Onclick
import typings.c3.c3Strings.bottom
import typings.c3.c3Strings.inset
import typings.c3.c3Strings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LegendOptions extends StObject {
  
  /**
    * Defaults to `false`.
    */
  var equally: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Hide legend
    * If true given, all legend will be hidden. If string or array given, only the legend that has the id will be hidden.
    * Defaults to `false`.
    */
  var hide: js.UndefOr[Boolean | ArrayOrString] = js.undefined
  
  /**
    * Change inset legend attributes. Ignored unless `legend.position` is `"inset"`.
    */
  var inset: js.UndefOr[Anchor] = js.undefined
  
  var item: js.UndefOr[Onclick] = js.undefined
  
  /**
    * Padding between legend elements.
    * Defaults to `0`.
    */
  var padding: js.UndefOr[Double] = js.undefined
  
  /**
    * Change the position of legend.
    */
  var position: js.UndefOr[bottom | right | inset] = js.undefined
  
  /**
    * Show or hide legend.
    * Defaults to `true`.
    */
  var show: js.UndefOr[Boolean] = js.undefined
}
object LegendOptions {
  
  inline def apply(): LegendOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LegendOptions]
  }
  
  extension [Self <: LegendOptions](x: Self) {
    
    inline def setEqually(value: Boolean): Self = StObject.set(x, "equally", value.asInstanceOf[js.Any])
    
    inline def setEquallyUndefined: Self = StObject.set(x, "equally", js.undefined)
    
    inline def setHide(value: Boolean | ArrayOrString): Self = StObject.set(x, "hide", value.asInstanceOf[js.Any])
    
    inline def setHideUndefined: Self = StObject.set(x, "hide", js.undefined)
    
    inline def setHideVarargs(value: String*): Self = StObject.set(x, "hide", js.Array(value*))
    
    inline def setInset(value: Anchor): Self = StObject.set(x, "inset", value.asInstanceOf[js.Any])
    
    inline def setInsetUndefined: Self = StObject.set(x, "inset", js.undefined)
    
    inline def setItem(value: Onclick): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    inline def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setPosition(value: bottom | right | inset): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
  }
}
