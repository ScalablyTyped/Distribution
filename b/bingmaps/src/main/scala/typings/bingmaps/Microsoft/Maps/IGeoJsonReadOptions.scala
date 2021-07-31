package typings.bingmaps.Microsoft.Maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IGeoJsonReadOptions extends StObject {
  
  /** 
    * If the GeoJSON file is hosted on a different domain, and CORS is not enabled, but does support JSONP,
    * you will need to specify the name of JSONP URL parameter that can be used to download the file across different domains.
    */
  var jsonpQueryParam: js.UndefOr[String] = js.undefined
  
  /** An optional name to identify the layer by. */
  var layerName: js.UndefOr[String] = js.undefined
  
  /** The styles to apply to shapes that don't have a defined style in the XML. */
  var style: js.UndefOr[IStylesOptions] = js.undefined
}
object IGeoJsonReadOptions {
  
  @scala.inline
  def apply(): IGeoJsonReadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGeoJsonReadOptions]
  }
  
  @scala.inline
  implicit class IGeoJsonReadOptionsMutableBuilder[Self <: IGeoJsonReadOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJsonpQueryParam(value: String): Self = StObject.set(x, "jsonpQueryParam", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJsonpQueryParamUndefined: Self = StObject.set(x, "jsonpQueryParam", js.undefined)
    
    @scala.inline
    def setLayerName(value: String): Self = StObject.set(x, "layerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayerNameUndefined: Self = StObject.set(x, "layerName", js.undefined)
    
    @scala.inline
    def setStyle(value: IStylesOptions): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
