package typings.bingmaps.Microsoft.Maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISettingsStyle extends StObject {
  
  /** A hex color value that all land is first flushed to before things are drawn on it. */
  var landColor: js.UndefOr[String] = js.undefined
  
  /** Specifies whether or not to draw elevation shading on the map. */
  var shadedReliefVisible: js.UndefOr[Boolean] = js.undefined
}
object ISettingsStyle {
  
  inline def apply(): ISettingsStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISettingsStyle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ISettingsStyle] (val x: Self) extends AnyVal {
    
    inline def setLandColor(value: String): Self = StObject.set(x, "landColor", value.asInstanceOf[js.Any])
    
    inline def setLandColorUndefined: Self = StObject.set(x, "landColor", js.undefined)
    
    inline def setShadedReliefVisible(value: Boolean): Self = StObject.set(x, "shadedReliefVisible", value.asInstanceOf[js.Any])
    
    inline def setShadedReliefVisibleUndefined: Self = StObject.set(x, "shadedReliefVisible", js.undefined)
  }
}
