package typings.bingmaps.Microsoft.Maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICustomOverlayOptions extends StObject {
  
  /**
    * Specifies if the custom overlay should be rendered above or below the label layer of the map. When above,
    * elements in the overlay can be clickable. Default: True
    *
    * This can only be set when creating the overlay.
    */
  var beneathLabels: js.UndefOr[Boolean] = js.native
}
object ICustomOverlayOptions {
  
  @scala.inline
  def apply(): ICustomOverlayOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICustomOverlayOptions]
  }
  
  @scala.inline
  implicit class ICustomOverlayOptionsMutableBuilder[Self <: ICustomOverlayOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBeneathLabels(value: Boolean): Self = StObject.set(x, "beneathLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeneathLabelsUndefined: Self = StObject.set(x, "beneathLabels", js.undefined)
  }
}
