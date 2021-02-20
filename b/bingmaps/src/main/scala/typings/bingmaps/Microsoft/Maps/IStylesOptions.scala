package typings.bingmaps.Microsoft.Maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IStylesOptions extends StObject {
  
  /** Sets the options for all polygons. */
  var polygonOptions: js.UndefOr[IPolygonOptions] = js.native
  
  /** Sets the options for all polylines. */
  var polylineOptions: js.UndefOr[IPolylineOptions] = js.native
  
  /** Sets the options for all pushpins. */
  var pushpinOptions: js.UndefOr[IPushpinOptions] = js.native
}
object IStylesOptions {
  
  @scala.inline
  def apply(): IStylesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IStylesOptions]
  }
  
  @scala.inline
  implicit class IStylesOptionsMutableBuilder[Self <: IStylesOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPolygonOptions(value: IPolygonOptions): Self = StObject.set(x, "polygonOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolygonOptionsUndefined: Self = StObject.set(x, "polygonOptions", js.undefined)
    
    @scala.inline
    def setPolylineOptions(value: IPolylineOptions): Self = StObject.set(x, "polylineOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolylineOptionsUndefined: Self = StObject.set(x, "polylineOptions", js.undefined)
    
    @scala.inline
    def setPushpinOptions(value: IPushpinOptions): Self = StObject.set(x, "pushpinOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPushpinOptionsUndefined: Self = StObject.set(x, "pushpinOptions", js.undefined)
  }
}
