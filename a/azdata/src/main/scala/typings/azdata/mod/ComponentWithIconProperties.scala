package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentWithIconProperties
  extends StObject
     with ComponentProperties {
  
  /**
    * The height of the icon
    */
  var iconHeight: js.UndefOr[Double | String] = js.undefined
  
  /**
    * The path for the icon with optional dark-theme away alternative
    */
  var iconPath: js.UndefOr[IconPath] = js.undefined
  
  /**
    * The width of the icon
    */
  var iconWidth: js.UndefOr[Double | String] = js.undefined
  
  /**
    * The title for the icon. This title will show when hovered over
    */
  var title: js.UndefOr[String] = js.undefined
}
object ComponentWithIconProperties {
  
  inline def apply(): ComponentWithIconProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComponentWithIconProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ComponentWithIconProperties] (val x: Self) extends AnyVal {
    
    inline def setIconHeight(value: Double | String): Self = StObject.set(x, "iconHeight", value.asInstanceOf[js.Any])
    
    inline def setIconHeightUndefined: Self = StObject.set(x, "iconHeight", js.undefined)
    
    inline def setIconPath(value: IconPath): Self = StObject.set(x, "iconPath", value.asInstanceOf[js.Any])
    
    inline def setIconPathUndefined: Self = StObject.set(x, "iconPath", js.undefined)
    
    inline def setIconWidth(value: Double | String): Self = StObject.set(x, "iconWidth", value.asInstanceOf[js.Any])
    
    inline def setIconWidthUndefined: Self = StObject.set(x, "iconWidth", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
