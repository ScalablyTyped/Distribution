package typings.bingmaps.Microsoft.Maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IGeoXmlLayerOptions
  extends StObject
     with IGeoXmlReadOptions {
  
  /** A boolean indicating if the map should automatically upate the view when a data set is loaded. Default: true */
  var autoUpdateMapView: js.UndefOr[Boolean] = js.undefined
  
  /** Options used to customize how the default infobox renders. */
  var infoboxOptions: js.UndefOr[IInfoboxOptions] = js.undefined
  
  /** An optional name to identify the layer by. */
  var layerName: js.UndefOr[String] = js.undefined
  
  /** A boolean indicating if infoboxes should automatically appear when shapes clicked. Default: false */
  var suppressInfoboxes: js.UndefOr[Boolean] = js.undefined
  
  /** A boolean indicating if the layer is visible or not. Default: true */
  var visible: js.UndefOr[Boolean] = js.undefined
}
object IGeoXmlLayerOptions {
  
  inline def apply(): IGeoXmlLayerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGeoXmlLayerOptions]
  }
  
  extension [Self <: IGeoXmlLayerOptions](x: Self) {
    
    inline def setAutoUpdateMapView(value: Boolean): Self = StObject.set(x, "autoUpdateMapView", value.asInstanceOf[js.Any])
    
    inline def setAutoUpdateMapViewUndefined: Self = StObject.set(x, "autoUpdateMapView", js.undefined)
    
    inline def setInfoboxOptions(value: IInfoboxOptions): Self = StObject.set(x, "infoboxOptions", value.asInstanceOf[js.Any])
    
    inline def setInfoboxOptionsUndefined: Self = StObject.set(x, "infoboxOptions", js.undefined)
    
    inline def setLayerName(value: String): Self = StObject.set(x, "layerName", value.asInstanceOf[js.Any])
    
    inline def setLayerNameUndefined: Self = StObject.set(x, "layerName", js.undefined)
    
    inline def setSuppressInfoboxes(value: Boolean): Self = StObject.set(x, "suppressInfoboxes", value.asInstanceOf[js.Any])
    
    inline def setSuppressInfoboxesUndefined: Self = StObject.set(x, "suppressInfoboxes", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
