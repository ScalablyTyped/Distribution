package typings.vegaLite8ozrbXDH

import typings.vegaLite8ozrbXDH.splitDTsMod.Split
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.height
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.width
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentDDotTsMod {
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/compile/layoutsize/component.d.ts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getSizeTypeFromLayoutSizeType(layoutSizeType: LayoutSizeType): width | height = ^.asInstanceOf[js.Dynamic].applyDynamic("getSizeTypeFromLayoutSizeType")(layoutSizeType.asInstanceOf[js.Any]).asInstanceOf[width | height]
  
  /* Rewritten from type alias, can be one of: 
    - scala.Double
    - typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.container
    - typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.step
    - typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.merged
  */
  type LayoutSize = _LayoutSize | Double
  
  type LayoutSizeComponent = Split[LayoutSizeIndex]
  
  trait LayoutSizeIndex extends StObject {
    
    var childHeight: js.UndefOr[LayoutSize] = js.undefined
    
    var childWidth: js.UndefOr[LayoutSize] = js.undefined
    
    var height: js.UndefOr[LayoutSize] = js.undefined
    
    var width: js.UndefOr[LayoutSize] = js.undefined
  }
  object LayoutSizeIndex {
    
    inline def apply(): LayoutSizeIndex = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayoutSizeIndex]
    }
    
    extension [Self <: LayoutSizeIndex](x: Self) {
      
      inline def setChildHeight(value: LayoutSize): Self = StObject.set(x, "childHeight", value.asInstanceOf[js.Any])
      
      inline def setChildHeightUndefined: Self = StObject.set(x, "childHeight", js.undefined)
      
      inline def setChildWidth(value: LayoutSize): Self = StObject.set(x, "childWidth", value.asInstanceOf[js.Any])
      
      inline def setChildWidthUndefined: Self = StObject.set(x, "childWidth", js.undefined)
      
      inline def setHeight(value: LayoutSize): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setWidth(value: LayoutSize): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.width
    - typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.childWidth
    - typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.height
    - typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.childHeight
  */
  trait LayoutSizeType extends StObject
  
  trait _LayoutSize extends StObject
}
