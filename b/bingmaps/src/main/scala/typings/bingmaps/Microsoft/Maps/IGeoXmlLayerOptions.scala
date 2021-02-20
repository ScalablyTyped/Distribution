package typings.bingmaps.Microsoft.Maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IGeoXmlLayerOptions extends IGeoXmlReadOptions {
  
  /** A boolean indicating if the map should automatically upate the view when a data set is loaded. Default: true */
  var autoUpdateMapView: js.UndefOr[Boolean] = js.native
  
  /** Options used to customize how the default infobox renders. */
  var infoboxOptions: js.UndefOr[IInfoboxOptions] = js.native
  
  /** An optional name to identify the layer by. */
  var layerName: js.UndefOr[String] = js.native
  
  /** A boolean indicating if infoboxes should automatically appear when shapes clicked. Default: false */
  var suppressInfoboxes: js.UndefOr[Boolean] = js.native
  
  /** A boolean indicating if the layer is visible or not. Default: true */
  var visible: js.UndefOr[Boolean] = js.native
}
object IGeoXmlLayerOptions {
  
  @scala.inline
  def apply(): IGeoXmlLayerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGeoXmlLayerOptions]
  }
  
  @scala.inline
  implicit class IGeoXmlLayerOptionsMutableBuilder[Self <: IGeoXmlLayerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoUpdateMapView(value: Boolean): Self = StObject.set(x, "autoUpdateMapView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoUpdateMapViewUndefined: Self = StObject.set(x, "autoUpdateMapView", js.undefined)
    
    @scala.inline
    def setInfoboxOptions(value: IInfoboxOptions): Self = StObject.set(x, "infoboxOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoboxOptionsUndefined: Self = StObject.set(x, "infoboxOptions", js.undefined)
    
    @scala.inline
    def setLayerName(value: String): Self = StObject.set(x, "layerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayerNameUndefined: Self = StObject.set(x, "layerName", js.undefined)
    
    @scala.inline
    def setSuppressInfoboxes(value: Boolean): Self = StObject.set(x, "suppressInfoboxes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuppressInfoboxesUndefined: Self = StObject.set(x, "suppressInfoboxes", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
