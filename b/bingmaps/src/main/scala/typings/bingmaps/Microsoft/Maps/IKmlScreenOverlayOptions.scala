package typings.bingmaps.Microsoft.Maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IKmlScreenOverlayOptions extends StObject {
  
  /** A boolean indicating if the screen overlay can be displayed above or beow the navigaiton bar. Default: false */
  var belowNavigationBar: js.UndefOr[Boolean] = js.undefined
  
  /** The visibility of the screen overlay. Default: true */
  var visible: js.UndefOr[Boolean] = js.undefined
}
object IKmlScreenOverlayOptions {
  
  inline def apply(): IKmlScreenOverlayOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IKmlScreenOverlayOptions]
  }
  
  extension [Self <: IKmlScreenOverlayOptions](x: Self) {
    
    inline def setBelowNavigationBar(value: Boolean): Self = StObject.set(x, "belowNavigationBar", value.asInstanceOf[js.Any])
    
    inline def setBelowNavigationBarUndefined: Self = StObject.set(x, "belowNavigationBar", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
