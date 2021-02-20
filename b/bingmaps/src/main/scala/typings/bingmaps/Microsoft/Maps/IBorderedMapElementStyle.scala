package typings.bingmaps.Microsoft.Maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBorderedMapElementStyle extends IMapElementStyle {
  
  /**
    * Secondary/casing line hex color of the border of a filled polygon.
    */
  var borderOutlineColor: js.UndefOr[String] = js.native
  
  /**
    * Primary line hex color of the border of a filled polygon.
    */
  var borderStrokeColor: js.UndefOr[String] = js.native
  
  /**
    * Specifies if a border is visible or not.
    */
  var borderVisible: js.UndefOr[Boolean] = js.native
}
object IBorderedMapElementStyle {
  
  @scala.inline
  def apply(): IBorderedMapElementStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBorderedMapElementStyle]
  }
  
  @scala.inline
  implicit class IBorderedMapElementStyleMutableBuilder[Self <: IBorderedMapElementStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBorderOutlineColor(value: String): Self = StObject.set(x, "borderOutlineColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderOutlineColorUndefined: Self = StObject.set(x, "borderOutlineColor", js.undefined)
    
    @scala.inline
    def setBorderStrokeColor(value: String): Self = StObject.set(x, "borderStrokeColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderStrokeColorUndefined: Self = StObject.set(x, "borderStrokeColor", js.undefined)
    
    @scala.inline
    def setBorderVisible(value: Boolean): Self = StObject.set(x, "borderVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderVisibleUndefined: Self = StObject.set(x, "borderVisible", js.undefined)
  }
}
